package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.lb */
public final class C41402lb implements C41735z8 {
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
        if (r2 <= 0) {
            z2 = false;
        }
        C40843u.m166191a(z2);
        for (C41599tg tgVar : hgVarArr) {
            C40843u.m166202l(tgVar);
            C40843u.m166191a(tgVar instanceof C41599tg);
            g7Var.mo135408c(tgVar.mo135863k(), C41431mg.f104800h);
        }
        return C41431mg.f104800h;
    }
}
