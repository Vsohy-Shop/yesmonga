package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.wd */
public final class C41668wd extends C41159b9 {

    /* renamed from: a */
    public static final C41358jg f105205a = new C41358jg(Double.valueOf(0.0d));

    /* renamed from: b */
    public static final C41358jg f105206b = new C41358jg(Double.valueOf(2.147483647E9d));

    /* renamed from: c */
    public static final boolean m168658c(C41310hg<?> hgVar) {
        return (hgVar instanceof C41358jg) && !Double.isNaN(((C41358jg) hgVar).mo135515i().doubleValue());
    }

    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        C41358jg jgVar;
        C41358jg jgVar2;
        C40843u.m166191a(true);
        int length = hgVarArr.length;
        if (length > 0) {
            jgVar = hgVarArr[0];
        } else {
            jgVar = f105205a;
        }
        if (length > 1) {
            jgVar2 = hgVarArr[1];
        } else {
            jgVar2 = f105206b;
        }
        double d = 2.147483647E9d;
        double d2 = 0.0d;
        if (m168658c(jgVar) && m168658c(jgVar2) && C41135a9.m167072f(jgVar, jgVar2)) {
            d2 = jgVar.mo135515i().doubleValue();
            d = jgVar2.mo135515i().doubleValue();
        }
        return new C41358jg(Double.valueOf((double) Math.round((Math.random() * (d - d2)) + d2)));
    }
}
