package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.wc */
public final class C41667wc implements C41735z8 {

    /* renamed from: a */
    public final Context f105204a;

    public C41667wc(Context context) {
        this.f105204a = context;
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
        return new C41599tg(this.f105204a.getPackageName());
    }
}
