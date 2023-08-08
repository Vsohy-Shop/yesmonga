package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.gtm.wa */
public final class C41665wa extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        C40843u.m166191a(true);
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i < hgVarArr.length - 1) {
            String d = C41135a9.m167070d(hgVarArr[i]);
            C41431mg mgVar = hgVarArr[i + 1];
            if (!(mgVar instanceof C41431mg) || mgVar == C41431mg.f104799g || mgVar == C41431mg.f104800h) {
                hashMap.put(d, mgVar);
                i += 2;
            } else {
                throw new IllegalStateException("Illegal InternalType found in CreateObject.");
            }
        }
        return new C41527qg(hashMap);
    }
}
