package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.oa */
public final class C41473oa implements C41735z8 {
    /* renamed from: a */
    public final C41310hg<?> mo135005a(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        boolean z2;
        C41310hg<?> hgVar;
        if (hgVarArr != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        if (hgVarArr.length == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        C40843u.m166191a(z2);
        if (C41135a9.m167073g(C41623ug.m168491c(g7Var, hgVarArr[0]))) {
            hgVar = C41623ug.m168491c(g7Var, hgVarArr[1]);
        } else {
            hgVar = C41623ug.m168491c(g7Var, hgVarArr[2]);
        }
        if (!(hgVar instanceof C41431mg) || hgVar == C41431mg.f104800h || hgVar == C41431mg.f104799g) {
            return hgVar;
        }
        throw new IllegalArgumentException("Illegal InternalType passed to Ternary.");
    }
}
