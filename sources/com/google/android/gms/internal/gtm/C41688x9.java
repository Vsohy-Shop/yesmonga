package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.gtm.x9 */
public final class C41688x9 extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        int i;
        C40843u.m166202l(hgVarArr);
        if (hgVarArr.length >= 3) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(hgVarArr[0] instanceof C41503pg);
        C41503pg pgVar = hgVarArr[0];
        int a = (int) C41135a9.m167067a(hgVarArr[1]);
        if (a < 0) {
            i = Math.max(pgVar.mo135719k().size() + a, 0);
        } else {
            i = Math.min(a, pgVar.mo135719k().size());
        }
        int min = Math.min(Math.max((int) C41135a9.m167067a(hgVarArr[2]), 0), pgVar.mo135719k().size() - i) + i;
        ArrayList arrayList = new ArrayList(pgVar.mo135719k().subList(i, min));
        pgVar.mo135719k().subList(i, min).clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 3; i2 < hgVarArr.length; i2++) {
            arrayList2.add(hgVarArr[i2]);
        }
        pgVar.mo135719k().addAll(i, arrayList2);
        return new C41503pg(arrayList);
    }
}
