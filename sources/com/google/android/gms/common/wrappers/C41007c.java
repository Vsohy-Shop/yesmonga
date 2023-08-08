package com.google.android.gms.common.wrappers;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.C0359n0;
import androidx.core.util.C17994n;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.util.C40996v;

@C40473a
/* renamed from: com.google.android.gms.common.wrappers.c */
public class C41007c {
    @C0359n0

    /* renamed from: a */
    public final Context f104269a;

    public C41007c(@C0359n0 Context context) {
        this.f104269a = context;
    }

    @C40473a
    /* renamed from: a */
    public int mo134779a(@C0359n0 String str) {
        return this.f104269a.checkCallingOrSelfPermission(str);
    }

    @C40473a
    /* renamed from: b */
    public int mo134780b(@C0359n0 String str, @C0359n0 String str2) {
        return this.f104269a.getPackageManager().checkPermission(str, str2);
    }

    @C40473a
    @C0359n0
    /* renamed from: c */
    public ApplicationInfo mo134781c(@C0359n0 String str, int i) throws PackageManager.NameNotFoundException {
        return this.f104269a.getPackageManager().getApplicationInfo(str, i);
    }

    @C40473a
    @C0359n0
    /* renamed from: d */
    public CharSequence mo134782d(@C0359n0 String str) throws PackageManager.NameNotFoundException {
        return this.f104269a.getPackageManager().getApplicationLabel(this.f104269a.getPackageManager().getApplicationInfo(str, 0));
    }

    @C40473a
    @C0359n0
    /* renamed from: e */
    public C17994n<CharSequence, Drawable> mo134783e(@C0359n0 String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.f104269a.getPackageManager().getApplicationInfo(str, 0);
        return C17994n.m81748a(this.f104269a.getPackageManager().getApplicationLabel(applicationInfo), this.f104269a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @C40473a
    @C0359n0
    /* renamed from: f */
    public PackageInfo mo134784f(@C0359n0 String str, int i) throws PackageManager.NameNotFoundException {
        return this.f104269a.getPackageManager().getPackageInfo(str, i);
    }

    @C40473a
    /* renamed from: g */
    public boolean mo134785g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C41005a.m166705a(this.f104269a);
        }
        if (!C40996v.m166689n() || (nameForUid = this.f104269a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f104269a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    /* renamed from: h */
    public final boolean mo134786h(int i, @C0359n0 String str) {
        if (C40996v.m166683h()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f104269a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f104269a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
