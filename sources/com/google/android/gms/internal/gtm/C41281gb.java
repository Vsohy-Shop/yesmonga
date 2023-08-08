package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.gb */
public final class C41281gb extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        C41431mg mgVar;
        boolean z = true;
        C40843u.m166191a(true);
        int length = hgVarArr.length;
        if (length > 1) {
            z = false;
        }
        C40843u.m166191a(z);
        if (length <= 0) {
            mgVar = C41431mg.f104800h;
        } else {
            mgVar = hgVarArr[0];
        }
        return new C41431mg((C41310hg<?>) mgVar);
    }
}
