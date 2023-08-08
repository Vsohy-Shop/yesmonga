package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.ie */
public abstract class C41332ie extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        C40843u.m166191a(true);
        if (hgVarArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        try {
            double b = C41135a9.m167068b(hgVarArr[0]);
            double b2 = C41135a9.m167068b(hgVarArr[1]);
            if (Double.isNaN(b) || Double.isNaN(b2)) {
                return new C41334ig(Boolean.FALSE);
            }
            return new C41334ig(Boolean.valueOf(mo135340c(b, b2)));
        } catch (IllegalArgumentException unused) {
            return new C41334ig(Boolean.FALSE);
        }
    }

    /* renamed from: c */
    public abstract boolean mo135340c(double d, double d2);
}
