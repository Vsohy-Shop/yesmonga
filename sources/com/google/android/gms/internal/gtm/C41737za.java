package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.za */
public final class C41737za implements C41735z8 {
    /* renamed from: a */
    public final C41310hg<?> mo135005a(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        boolean z2 = true;
        if (hgVarArr != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        if (hgVarArr.length != 1) {
            z2 = false;
        }
        C40843u.m166191a(z2);
        C40843u.m166191a(hgVarArr[0] instanceof C41599tg);
        C41310hg<?> b = g7Var.mo135407b(hgVarArr[0].mo135863k());
        if (b instanceof C41551rg) {
            throw new IllegalStateException("Illegal Statement type encountered in Get.");
        } else if (!(b instanceof C41431mg) || b == C41431mg.f104800h || b == C41431mg.f104799g) {
            return b;
        } else {
            throw new IllegalStateException("Illegal InternalType encountered in Get.");
        }
    }
}
