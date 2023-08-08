package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.tb */
public final class C41594tb extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        C40843u.m166191a(true);
        if (hgVarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(hgVarArr[0] instanceof C41599tg);
        StringBuilder sb = new StringBuilder(hgVarArr[0].mo135863k());
        for (int i = 1; i < hgVarArr.length; i++) {
            sb.append(C41135a9.m167070d(hgVarArr[i]));
        }
        return new C41599tg(sb.toString());
    }
}
