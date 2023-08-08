package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.la */
public final class C41401la implements C41735z8 {
    /* renamed from: a */
    public final C41310hg<?> mo135005a(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        boolean z2;
        if (hgVarArr != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        if (hgVarArr.length == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C40843u.m166191a(z2);
        C41310hg<?> c = C41623ug.m168491c(g7Var, hgVarArr[0]);
        if (C41135a9.m167073g(c)) {
            return c;
        }
        return C41623ug.m168491c(g7Var, hgVarArr[1]);
    }
}
