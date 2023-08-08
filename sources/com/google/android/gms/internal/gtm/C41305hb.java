package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import com.urbanairship.actions.ToastAction;

/* renamed from: com.google.android.gms.internal.gtm.hb */
public final class C41305hb extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        C40843u.m166191a(true);
        if (hgVarArr.length == 3) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C41527qg qgVar = hgVarArr[0];
        C41310hg<?> hgVar = hgVarArr[1];
        C41310hg<?> hgVar2 = hgVarArr[2];
        if (qgVar != C41431mg.f104799g) {
            z2 = true;
        } else {
            z2 = false;
        }
        C40843u.m166191a(z2);
        if (qgVar != C41431mg.f104800h) {
            z3 = true;
        } else {
            z3 = false;
        }
        C40843u.m166191a(z3);
        C40843u.m166191a(!C41623ug.m168497i(qgVar));
        C40843u.m166191a(!C41623ug.m168497i(hgVar));
        C40843u.m166191a(!C41623ug.m168497i(hgVar2));
        if (C41623ug.m168498j(qgVar)) {
            return hgVar2;
        }
        String d = C41135a9.m167070d(hgVar);
        if (qgVar instanceof C41527qg) {
            C41527qg qgVar2 = qgVar;
            if (!qgVar2.mo135787k()) {
                qgVar2.mo135439f(d, hgVar2);
            }
            return hgVar2;
        }
        if (qgVar instanceof C41503pg) {
            C41503pg pgVar = (C41503pg) qgVar;
            if (ToastAction.f87498j.equals(d)) {
                double b = C41135a9.m167068b(hgVar2);
                if (Double.isInfinite(b) || b != Math.floor(b)) {
                    z4 = false;
                }
                C40843u.m166191a(z4);
                pgVar.mo135721m((int) b);
                return hgVar2;
            }
            double b2 = C41135a9.m167068b(hgVar);
            if (!Double.isInfinite(b2) && b2 >= 0.0d) {
                int i = (int) b2;
                if (d.equals(Integer.toString(i))) {
                    pgVar.mo135720l(i, hgVar2);
                    return hgVar2;
                }
            }
        }
        qgVar.mo135439f(d, hgVar2);
        return hgVar2;
    }
}
