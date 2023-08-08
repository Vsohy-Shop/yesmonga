package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.xc */
public final class C41691xc implements C41735z8 {

    /* renamed from: a */
    public final Context f105239a;

    public C41691xc(Context context) {
        this.f105239a = context;
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
            PackageManager packageManager = this.f105239a.getPackageManager();
            return new C41599tg(packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f105239a.getPackageName(), 0)).toString());
        } catch (PackageManager.NameNotFoundException unused) {
            return new C41599tg("");
        }
    }
}
