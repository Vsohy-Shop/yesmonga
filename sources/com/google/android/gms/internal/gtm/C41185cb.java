package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import com.urbanairship.actions.ToastAction;

/* renamed from: com.google.android.gms.internal.gtm.cb */
public final class C41185cb extends C41159b9 {

    /* renamed from: a */
    public static final C41185cb f104495a = new C41185cb();

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
        C41503pg pgVar = hgVarArr[0];
        C41310hg<?> hgVar = hgVarArr[1];
        C40843u.m166191a(!C41623ug.m168497i(pgVar));
        C40843u.m166191a(true ^ C41623ug.m168497i(hgVar));
        String d = C41135a9.m167070d(hgVar);
        if (pgVar instanceof C41503pg) {
            if (ToastAction.f87498j.equals(d)) {
                return new C41334ig(Boolean.TRUE);
            }
            double b = C41135a9.m167068b(hgVar);
            if (b == Math.floor(b)) {
                int i = (int) b;
                if (d.equals(Integer.toString(i)) && i >= 0 && i < pgVar.mo135719k().size()) {
                    return new C41334ig(Boolean.TRUE);
                }
            }
        } else if (pgVar instanceof C41599tg) {
            if (ToastAction.f87498j.equals(d)) {
                return new C41334ig(Boolean.TRUE);
            }
            double b2 = C41135a9.m167068b(hgVar);
            if (b2 == Math.floor(b2)) {
                int i2 = (int) b2;
                if (d.equals(Integer.toString(i2)) && i2 >= 0 && i2 < ((C41599tg) pgVar).mo135863k().length()) {
                    return new C41334ig(Boolean.TRUE);
                }
            }
            return new C41334ig(Boolean.FALSE);
        }
        return new C41334ig(Boolean.valueOf(pgVar.mo135441h(d)));
    }
}
