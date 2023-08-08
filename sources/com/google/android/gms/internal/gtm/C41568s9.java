package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.s9 */
public final class C41568s9 extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        C40843u.m166202l(hgVarArr);
        if (hgVarArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(hgVarArr[0] instanceof C41503pg);
        C40843u.m166191a(hgVarArr[1] instanceof C41383kg);
        C41503pg pgVar = hgVarArr[0];
        C41383kg kgVar = hgVarArr[1];
        List<C41310hg<?>> k = pgVar.mo135719k();
        int size = k.size();
        boolean z2 = false;
        int i = 0;
        while (!z2 && i < size && i < pgVar.mo135719k().size()) {
            if (pgVar.mo135722n(i)) {
                z2 = C41135a9.m167073g(kgVar.mo135582i().mo135005a(g7Var, k.get(i), new C41358jg(Double.valueOf((double) i)), pgVar));
            }
            i++;
        }
        return new C41334ig(Boolean.valueOf(z2));
    }
}
