package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.k9 */
public final class C41376k9 extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        C41310hg<?> hgVar;
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
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size && i < pgVar.mo135719k().size()) {
            if (pgVar.mo135722n(i)) {
                hgVar = kgVar.mo135582i().mo135005a(g7Var, k.get(i), new C41358jg(Double.valueOf((double) i)), pgVar);
                C40843u.m166208r(!C41623ug.m168497i(hgVar));
            } else {
                hgVar = null;
            }
            arrayList.add(hgVar);
            i++;
        }
        return new C41503pg(arrayList);
    }
}
