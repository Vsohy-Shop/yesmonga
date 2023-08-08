package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.m9 */
public final class C41424m9 extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        C40843u.m166202l(hgVarArr);
        int length = hgVarArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(hgVarArr[0] instanceof C41503pg);
        C41503pg pgVar = hgVarArr[0];
        int size = pgVar.mo135719k().size();
        pgVar.mo135721m((length + size) - 1);
        for (int i = 1; i < hgVarArr.length; i++) {
            pgVar.mo135720l(size, hgVarArr[i]);
            size++;
        }
        return new C41358jg(Double.valueOf((double) size));
    }
}
