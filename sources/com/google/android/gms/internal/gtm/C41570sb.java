package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.sb */
public final class C41570sb extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        C40843u.m166191a(true);
        int length = hgVarArr.length;
        int i = 0;
        if (length == 1) {
            z = true;
        } else if (length == 2) {
            z = true;
            length = 2;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(hgVarArr[0] instanceof C41599tg);
        String k = hgVarArr[0].mo135863k();
        if (length == 2) {
            i = (int) C41135a9.m167067a(hgVarArr[1]);
        }
        if (i < 0 || i >= k.length()) {
            return new C41599tg("");
        }
        return new C41599tg(String.valueOf(k.charAt(i)));
    }
}
