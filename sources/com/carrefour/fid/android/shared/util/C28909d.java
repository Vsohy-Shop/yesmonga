package com.carrefour.fid.android.shared.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.extension.C36306e;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.net.C9851c;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.util.d */
public final class C28909d {

    /* renamed from: b */
    public static final int f70820b = 8;
    @C12579k

    /* renamed from: a */
    public final Context f70821a;

    @Inject
    public C28909d(@C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f70821a = context;
    }

    /* renamed from: a */
    public final PackageInfo mo84150a() {
        try {
            return this.f70821a.getPackageManager().getPackageInfo(this.f70821a.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @C12579k
    /* renamed from: b */
    public final String mo84151b() {
        PackageInfo a = mo84150a();
        String str = a != null ? a.versionName : null;
        String property = System.getProperty("http.agent");
        return "Carrefour/" + str + " " + property;
    }

    @C12579k
    /* renamed from: c */
    public final String mo84152c() {
        String str;
        String str2;
        Object obj = null;
        if (Build.VERSION.SDK_INT >= 28) {
            PackageInfo a = mo84150a();
            if (a != null) {
                str2 = a.versionName;
            } else {
                str2 = null;
            }
            PackageInfo a2 = mo84150a();
            if (a2 != null) {
                obj = Long.valueOf(a2.getLongVersionCode());
            }
            return C9851c.f26937h + str2 + C36306e.f89637a + obj + ")";
        }
        PackageInfo a3 = mo84150a();
        if (a3 != null) {
            str = a3.versionName;
        } else {
            str = null;
        }
        PackageInfo a4 = mo84150a();
        if (a4 != null) {
            obj = Integer.valueOf(a4.versionCode);
        }
        return C9851c.f26937h + str + C36306e.f89637a + obj + ")";
    }
}
