package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.gtm.fb */
public final class C41257fb implements C41735z8 {
    /* renamed from: a */
    public final C41310hg<?> mo135005a(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        if (hgVarArr != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        ArrayList arrayList = new ArrayList(r1);
        for (C41310hg<?> add : hgVarArr) {
            arrayList.add(add);
        }
        return new C41503pg(arrayList);
    }
}
