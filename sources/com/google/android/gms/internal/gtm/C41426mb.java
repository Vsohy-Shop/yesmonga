package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.mb */
public final class C41426mb implements C41735z8 {
    /* renamed from: a */
    public final C41310hg<?> mo135005a(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        boolean z2;
        if (hgVarArr != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        if (hgVarArr.length == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        C40843u.m166191a(z2);
        C41310hg c = C41623ug.m168491c(g7Var, hgVarArr[3]);
        C40843u.m166191a(c instanceof C41503pg);
        List<C41310hg<?>> k = ((C41503pg) c).mo135719k();
        C41334ig igVar = hgVarArr[2];
        C40843u.m166191a(igVar instanceof C41334ig);
        if (igVar.mo135499i().booleanValue()) {
            C41431mg f = C41623ug.m168494f(g7Var, k);
            if (f == C41431mg.f104797e) {
                return C41431mg.f104800h;
            }
            if (f.mo135643j()) {
                return f;
            }
        }
        while (C41135a9.m167073g(C41623ug.m168491c(g7Var, hgVarArr[0]))) {
            C41431mg f2 = C41623ug.m168494f(g7Var, k);
            if (f2 == C41431mg.f104797e) {
                return C41431mg.f104800h;
            }
            if (f2.mo135643j()) {
                return f2;
            }
            C41623ug.m168491c(g7Var, hgVarArr[1]);
        }
        return C41431mg.f104800h;
    }
}
