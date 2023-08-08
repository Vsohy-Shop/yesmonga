package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.bc */
public final class C41162bc extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        C41431mg mgVar;
        C41431mg mgVar2;
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
            mgVar = C41431mg.f104800h;
        } else {
            mgVar = hgVarArr[1];
        }
        int a = (int) C41135a9.m167067a(mgVar);
        int length2 = k.length();
        if (length == 3 && (mgVar2 = hgVarArr[2]) != C41431mg.f104800h) {
            length2 = (int) C41135a9.m167067a(C41623ug.m168491c(g7Var, mgVar2));
        }
        int min = Math.min(Math.max(a, 0), k.length());
        int min2 = Math.min(Math.max(length2, 0), k.length());
        return new C41599tg(k.substring(Math.min(min, min2), Math.max(min, min2)));
    }
}
