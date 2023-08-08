package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.ob */
public final class C41474ob extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        boolean z2;
        C40843u.m166191a(true);
        boolean z3 = false;
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
        if (Double.isInfinite(b) && Double.isInfinite(b2)) {
            return new C41358jg(Double.valueOf(Double.NaN));
        }
        if (((double) Double.compare(b, 0.0d)) < 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (((double) Double.compare(b2, 0.0d)) < 0.0d) {
            z3 = true;
        }
        boolean z4 = z2 ^ z3;
        double d = Double.POSITIVE_INFINITY;
        if (Double.isInfinite(b) && !Double.isInfinite(b2)) {
            if (true == z4) {
                d = Double.NEGATIVE_INFINITY;
            }
            return new C41358jg(Double.valueOf(d));
        } else if (!Double.isInfinite(b) && Double.isInfinite(b2)) {
            return new C41358jg(Double.valueOf(0.0d));
        } else {
            int i = (b > 0.0d ? 1 : (b == 0.0d ? 0 : -1));
            if (i == 0) {
                if (b2 == 0.0d) {
                    return new C41358jg(Double.valueOf(Double.NaN));
                }
                return new C41358jg(Double.valueOf(0.0d));
            } else if (Double.isInfinite(b) || i == 0 || b2 != 0.0d) {
                return new C41358jg(Double.valueOf(b / b2));
            } else {
                if (true == z4) {
                    d = Double.NEGATIVE_INFINITY;
                }
                return new C41358jg(Double.valueOf(d));
            }
        }
    }
}
