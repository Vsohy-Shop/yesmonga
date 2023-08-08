package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.ab */
public final class C41137ab implements C41735z8 {

    /* renamed from: a */
    public static C41205d7 f104435a;

    public C41137ab(C41205d7 d7Var) {
        f104435a = d7Var;
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
        if (hgVarArr.length != 1) {
            z2 = false;
        }
        C40843u.m166191a(z2);
        C40843u.m166191a(hgVarArr[0] instanceof C41599tg);
        return f104435a.mo135214c(hgVarArr[0].mo135863k());
    }
}
