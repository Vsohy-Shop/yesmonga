package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.carrefour.fid.android.shared.constant.C28531e0;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.gtm.v4 */
public final class C41635v4 extends C41535r0 {

    /* renamed from: c */
    public String f105141c;

    /* renamed from: d */
    public String f105142d;

    /* renamed from: e */
    public boolean f105143e;

    /* renamed from: f */
    public int f105144f;

    /* renamed from: g */
    public boolean f105145g;

    /* renamed from: v */
    public boolean f105146v;

    public C41635v4(C41607u0 u0Var) {
        super(u0Var);
    }

    /* renamed from: W */
    public final void mo133294W() {
        ApplicationInfo applicationInfo;
        int i;
        int i2;
        Context G = mo135734G();
        try {
            applicationInfo = G.getPackageManager().getApplicationInfo(G.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            mo135763z("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            mo135762y("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null && (i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) > 0) {
            C41607u0 M = mo135739M();
            C41682x3 x3Var = (C41682x3) new C41536r1(M, new C41658w3(M)).mo135797T(i);
            if (x3Var != null) {
                mo135759v("Loading global XML config values");
                String str = x3Var.f105229a;
                if (str != null) {
                    this.f105142d = str;
                    mo135751n("XML config - app name", str);
                }
                String str2 = x3Var.f105230b;
                if (str2 != null) {
                    this.f105141c = str2;
                    mo135751n("XML config - app version", str2);
                }
                String str3 = x3Var.f105231c;
                boolean z = false;
                if (str3 != null) {
                    String lowerCase = str3.toLowerCase(Locale.US);
                    if ("verbose".equals(lowerCase)) {
                        i2 = 0;
                    } else if (C28531e0.f69094x.equals(lowerCase)) {
                        i2 = 1;
                    } else if ("warning".equals(lowerCase)) {
                        i2 = 2;
                    } else if ("error".equals(lowerCase)) {
                        i2 = 3;
                    } else {
                        i2 = -1;
                    }
                    if (i2 >= 0) {
                        mo135760w("XML config - log level", Integer.valueOf(i2));
                    }
                }
                int i3 = x3Var.f105232d;
                if (i3 >= 0) {
                    this.f105144f = i3;
                    this.f105143e = true;
                    mo135751n("XML config - dispatch period (sec)", Integer.valueOf(i3));
                }
                int i4 = x3Var.f105233e;
                if (i4 != -1) {
                    if (1 == i4) {
                        z = true;
                    }
                    this.f105146v = z;
                    this.f105145g = true;
                    mo135751n("XML config - dry run", Boolean.valueOf(z));
                }
            }
        }
    }

    /* renamed from: X */
    public final String mo135960X() {
        mo135794T();
        return this.f105142d;
    }

    /* renamed from: Z */
    public final String mo135961Z() {
        mo135794T();
        return this.f105141c;
    }

    /* renamed from: a0 */
    public final boolean mo135962a0() {
        mo135794T();
        return this.f105146v;
    }

    /* renamed from: b0 */
    public final boolean mo135963b0() {
        mo135794T();
        return this.f105145g;
    }

    /* renamed from: c0 */
    public final boolean mo135964c0() {
        mo135794T();
        return false;
    }
}
