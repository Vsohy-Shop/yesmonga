package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.jb */
public final class C41353jb extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        boolean z2;
        C40843u.m166191a(true);
        if (hgVarArr.length == 3) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(hgVarArr[1] instanceof C41503pg);
        C40843u.m166191a(hgVarArr[2] instanceof C41503pg);
        C41310hg<?> hgVar = hgVarArr[0];
        List<C41310hg<?>> k = hgVarArr[1].mo135719k();
        List<C41310hg<?>> k2 = hgVarArr[2].mo135719k();
        if (k2.size() <= k.size() + 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C40843u.m166191a(z2);
        boolean z3 = false;
        for (int i = 0; i < k.size(); i++) {
            if (z3 || C41135a9.m167074h(hgVar, C41623ug.m168491c(g7Var, k.get(i)))) {
                C41310hg<?> c = C41623ug.m168491c(g7Var, k2.get(i));
                if (!(c instanceof C41431mg)) {
                    z3 = true;
                } else if (c == C41431mg.f104798f || ((C41431mg) c).mo135643j()) {
                    return c;
                } else {
                    if (c == C41431mg.f104797e) {
                        return C41431mg.f104800h;
                    }
                }
            }
        }
        if (k.size() < k2.size()) {
            C41310hg<?> c2 = C41623ug.m168491c(g7Var, k2.get(k2.size() - 1));
            if ((c2 instanceof C41431mg) && (c2 == C41431mg.f104798f || ((C41431mg) c2).mo135643j())) {
                return c2;
            }
        }
        return C41431mg.f104800h;
    }
}
