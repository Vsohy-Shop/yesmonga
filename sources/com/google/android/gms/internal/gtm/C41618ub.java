package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.ub */
public final class C41618ub extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        double d;
        C40843u.m166191a(true);
        int length = hgVarArr.length;
        if (length == 2) {
            z = true;
        } else if (length == 3) {
            z = true;
            length = 3;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(hgVarArr[0] instanceof C41599tg);
        String k = hgVarArr[0].mo135863k();
        String d2 = C41135a9.m167070d(hgVarArr[1]);
        if (length < 3) {
            d = 0.0d;
        } else {
            d = C41135a9.m167067a(hgVarArr[2]);
        }
        return new C41358jg(Double.valueOf((double) k.indexOf(d2, (int) Math.min(Math.max(d, 0.0d), (double) k.length()))));
    }
}
