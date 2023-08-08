package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.zb */
public final class C41738zb extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        double d;
        double d2;
        double d3;
        C41431mg mgVar;
        C40843u.m166191a(true);
        int length = hgVarArr.length;
        if (length <= 0 || length > 3) {
            z = false;
        } else {
            z = true;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(hgVarArr[0] instanceof C41599tg);
        String k = hgVarArr[0].mo135863k();
        if (length < 2) {
            d = 0.0d;
        } else {
            d = C41135a9.m167067a(hgVarArr[1]);
        }
        double length2 = (double) k.length();
        if (length == 3 && (mgVar = hgVarArr[2]) != C41431mg.f104800h) {
            length2 = C41135a9.m167067a(mgVar);
        }
        if (d < 0.0d) {
            d2 = Math.max(((double) k.length()) + d, 0.0d);
        } else {
            d2 = Math.min(d, (double) k.length());
        }
        int i = (int) d2;
        if (length2 < 0.0d) {
            d3 = Math.max(((double) k.length()) + length2, 0.0d);
        } else {
            d3 = Math.min(length2, (double) k.length());
        }
        return new C41599tg(k.substring(i, Math.max(0, ((int) d3) - i) + i));
    }
}
