package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.ra */
public final class C41545ra extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        String str;
        C40843u.m166191a(true);
        if (hgVarArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C40843u.m166191a(hgVarArr[0] instanceof C41599tg);
        String k = hgVarArr[0].mo135863k();
        if (g7Var.mo135411f(k)) {
            g7Var.mo135410e(k, hgVarArr[1]);
            return hgVarArr[1];
        }
        String valueOf = String.valueOf(k);
        if (valueOf.length() != 0) {
            str = "Attempting to assign to undefined variable ".concat(valueOf);
        } else {
            str = new String("Attempting to assign to undefined variable ");
        }
        throw new IllegalStateException(str);
    }
}
