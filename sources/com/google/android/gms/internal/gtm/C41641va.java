package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.gtm.va */
public final class C41641va extends C41159b9 {
    /* renamed from: b */
    public final C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        C40843u.m166191a(true);
        ArrayList arrayList = new ArrayList();
        for (C41431mg mgVar : hgVarArr) {
            if (!(mgVar instanceof C41431mg) || mgVar == C41431mg.f104800h || mgVar == C41431mg.f104799g) {
                z = true;
            } else {
                z = false;
            }
            C40843u.m166191a(z);
            arrayList.add(mgVar);
        }
        return new C41503pg(arrayList);
    }
}
