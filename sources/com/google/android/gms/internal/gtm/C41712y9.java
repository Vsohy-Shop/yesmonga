package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.gtm.y9 */
public final class C41712y9 extends C41159b9 {
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
        C41503pg pgVar = hgVarArr[0];
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < hgVarArr.length; i++) {
            arrayList.add(hgVarArr[i]);
        }
        pgVar.mo135719k().addAll(0, arrayList);
        return new C41358jg(Double.valueOf((double) pgVar.mo135719k().size()));
    }
}
