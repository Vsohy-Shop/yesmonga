package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.zc */
public final class C41739zc implements C41735z8 {

    /* renamed from: a */
    public final Context f105322a;

    public C41739zc(Context context) {
        this.f105322a = (Context) C40843u.m166202l(context);
    }

    /* renamed from: a */
    public final C41310hg<?> mo135005a(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        boolean z2 = true;
        if (hgVarArr != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        if (hgVarArr.length != 0) {
            z2 = false;
        }
        C40843u.m166191a(z2);
        try {
            return new C41599tg(this.f105322a.getPackageManager().getPackageInfo(this.f105322a.getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException e) {
            String packageName = this.f105322a.getPackageName();
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 25 + valueOf.length());
            sb.append("Package name ");
            sb.append(packageName);
            sb.append(" not found. ");
            sb.append(valueOf);
            C41493p6.m168149a(sb.toString());
            return C41431mg.f104800h;
        }
    }
}
