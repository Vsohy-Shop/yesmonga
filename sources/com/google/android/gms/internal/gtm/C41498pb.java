package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.pb */
public final class C41498pb extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        int i;
        C40843u.m166191a(true);
        if (hgVarArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        double b = C41135a9.m167068b(hgVarArr[0]);
        double b2 = C41135a9.m167068b(hgVarArr[1]);
        if (Double.isNaN(b) || Double.isNaN(b2)) {
            return new C41358jg(Double.valueOf(Double.NaN));
        }
        if (Double.isInfinite(b) || b2 == 0.0d) {
            return new C41358jg(Double.valueOf(Double.NaN));
        }
        if (!Double.isInfinite(b) && Double.isInfinite(b2)) {
            return new C41358jg(Double.valueOf(b));
        }
        if (b != 0.0d || i == 0 || Double.isInfinite(b2)) {
            return new C41358jg(Double.valueOf(b % b2));
        }
        return new C41358jg(Double.valueOf(b));
    }
}
