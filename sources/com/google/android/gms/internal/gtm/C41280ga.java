package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.ga */
public final class C41280ga extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        C40843u.m166191a(true);
        boolean z2 = false;
        if (hgVarArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C41599tg tgVar = hgVarArr[0];
        C41599tg tgVar2 = hgVarArr[1];
        if ((tgVar instanceof C41527qg) || (tgVar instanceof C41503pg) || (tgVar instanceof C41383kg)) {
            tgVar = new C41599tg(C41135a9.m167070d(tgVar));
        }
        if ((tgVar2 instanceof C41527qg) || (tgVar2 instanceof C41503pg) || (tgVar2 instanceof C41383kg)) {
            tgVar2 = new C41599tg(C41135a9.m167070d(tgVar2));
        }
        if (((tgVar instanceof C41599tg) && (tgVar2 instanceof C41599tg)) || (!Double.isNaN(C41135a9.m167068b(tgVar)) && !Double.isNaN(C41135a9.m167068b(tgVar2)))) {
            z2 = !C41135a9.m167072f(tgVar2, tgVar);
        }
        return new C41334ig(Boolean.valueOf(z2));
    }
}
