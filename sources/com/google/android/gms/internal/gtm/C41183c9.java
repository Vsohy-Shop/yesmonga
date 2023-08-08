package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.gtm.c9 */
public final class C41183c9 extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        C40843u.m166202l(hgVarArr);
        if (hgVarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(hgVarArr[0] instanceof C41503pg);
        ArrayList arrayList = new ArrayList();
        for (C41310hg<?> add : hgVarArr[0].mo135719k()) {
            arrayList.add(add);
        }
        for (int i = 1; i < hgVarArr.length; i++) {
            C41503pg pgVar = hgVarArr[i];
            if (pgVar instanceof C41503pg) {
                for (C41310hg<?> add2 : pgVar.mo135719k()) {
                    arrayList.add(add2);
                }
            } else {
                arrayList.add(pgVar);
            }
        }
        return new C41503pg(arrayList);
    }
}
