package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.ya */
public final class C41713ya extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        C40843u.m166202l(hgVarArr);
        if (hgVarArr.length == 3) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(hgVarArr[0] instanceof C41599tg);
        String k = hgVarArr[0].mo135863k();
        C40843u.m166191a(g7Var.mo135411f(k));
        C41310hg<?> hgVar = hgVarArr[1];
        C40843u.m166202l(hgVar);
        C41503pg pgVar = hgVarArr[2];
        C40843u.m166191a(pgVar instanceof C41503pg);
        List<C41310hg<?>> k2 = pgVar.mo135719k();
        Iterator<C41310hg<?>> e = hgVar.mo135438e();
        while (e.hasNext()) {
            g7Var.mo135410e(k, e.next());
            C41431mg f = C41623ug.m168494f(g7Var, k2);
            if (f == C41431mg.f104797e) {
                return C41431mg.f104800h;
            }
            if (f.mo135643j()) {
                return f;
            }
        }
        return C41431mg.f104800h;
    }
}
