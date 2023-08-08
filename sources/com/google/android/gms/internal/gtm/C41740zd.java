package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.zd */
public final class C41740zd implements C41735z8 {

    /* renamed from: a */
    public final Context f105323a;

    /* renamed from: b */
    public final DisplayMetrics f105324b = new DisplayMetrics();

    public C41740zd(Context context) {
        this.f105323a = context;
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
        ((WindowManager) this.f105323a.getSystemService("window")).getDefaultDisplay().getMetrics(this.f105324b);
        return new C41599tg(this.f105324b.widthPixels + "x" + this.f105324b.heightPixels);
    }
}
