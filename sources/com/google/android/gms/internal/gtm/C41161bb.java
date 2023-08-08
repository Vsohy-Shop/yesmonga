package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import com.urbanairship.actions.ToastAction;

/* renamed from: com.google.android.gms.internal.gtm.bb */
public final class C41161bb extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        C41310hg<?> i;
        C40843u.m166191a(true);
        boolean z2 = false;
        if (hgVarArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C41503pg pgVar = hgVarArr[0];
        C41310hg<?> hgVar = hgVarArr[1];
        boolean z3 = pgVar instanceof C41599tg;
        if (z3 || !C41623ug.m168498j(pgVar)) {
            z2 = true;
        }
        C40843u.m166191a(z2);
        C40843u.m166191a(!C41623ug.m168497i(pgVar));
        C40843u.m166191a(true ^ C41623ug.m168497i(hgVar));
        String d = C41135a9.m167070d(hgVar);
        if (pgVar instanceof C41503pg) {
            C41503pg pgVar2 = pgVar;
            if (ToastAction.f87498j.equals(d)) {
                return new C41358jg(Double.valueOf((double) pgVar2.mo135719k().size()));
            }
            double b = C41135a9.m167068b(hgVar);
            if (b == Math.floor(b)) {
                int i2 = (int) b;
                if (d.equals(Integer.toString(i2)) && (i = pgVar2.mo135718i(i2)) != C41431mg.f104800h) {
                    return i;
                }
            }
        } else if (z3) {
            C41599tg tgVar = (C41599tg) pgVar;
            if (ToastAction.f87498j.equals(d)) {
                return new C41358jg(Double.valueOf((double) tgVar.mo135863k().length()));
            }
            double b2 = C41135a9.m167068b(hgVar);
            if (b2 == Math.floor(b2)) {
                int i3 = (int) b2;
                if (d.equals(Integer.toString(i3))) {
                    return tgVar.mo135862i(i3);
                }
            }
            return C41431mg.f104800h;
        }
        return pgVar.mo135435b(d);
    }
}
