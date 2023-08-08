package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.ta */
public final class C41593ta extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z = true;
        C40843u.m166191a(true);
        if (hgVarArr.length != 1) {
            z = false;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(hgVarArr[0] instanceof C41503pg);
        for (C41310hg<?> c : hgVarArr[0].mo135719k()) {
            C41310hg<?> c2 = C41623ug.m168491c(g7Var, c);
            if ((c2 instanceof C41431mg) && (c2 == C41431mg.f104797e || c2 == C41431mg.f104798f || ((C41431mg) c2).mo135643j())) {
                return c2;
            }
        }
        return C41431mg.f104800h;
    }
}
