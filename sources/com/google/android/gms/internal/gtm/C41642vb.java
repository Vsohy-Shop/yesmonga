package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.vb */
public final class C41642vb extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
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
        String d = C41135a9.m167070d(hgVarArr[1]);
        double d2 = Double.POSITIVE_INFINITY;
        if (length == 3 && !Double.isNaN(C41135a9.m167068b(hgVarArr[2]))) {
            d2 = C41135a9.m167067a(hgVarArr[2]);
        }
        return new C41358jg(Double.valueOf((double) k.lastIndexOf(d, (int) Math.min(Math.max(d2, 0.0d), (double) k.length()))));
    }
}
