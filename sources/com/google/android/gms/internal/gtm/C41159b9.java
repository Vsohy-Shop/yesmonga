package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.b9 */
public abstract class C41159b9 implements C41735z8 {
    /* renamed from: a */
    public final C41310hg<?> mo135005a(C41277g7 g7Var, C41310hg<?>... hgVarArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7 = true;
        C40843u.m166191a(true);
        if (hgVarArr != null) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        C41310hg<?>[] hgVarArr2 = new C41310hg[hgVarArr.length];
        for (int i = 0; i < hgVarArr.length; i++) {
            if (hgVarArr[i] != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C40843u.m166191a(z2);
            C41431mg mgVar = hgVarArr[i];
            C41431mg mgVar2 = C41431mg.f104797e;
            if (mgVar != mgVar2) {
                z3 = true;
            } else {
                z3 = false;
            }
            C40843u.m166191a(z3);
            C41431mg mgVar3 = hgVarArr[i];
            C41431mg mgVar4 = C41431mg.f104798f;
            if (mgVar3 != mgVar4) {
                z4 = true;
            } else {
                z4 = false;
            }
            C40843u.m166191a(z4);
            hgVarArr2[i] = C41623ug.m168491c(g7Var, hgVarArr[i]);
            C40843u.m166191a(true);
            if (hgVarArr2[i] != mgVar2) {
                z5 = true;
            } else {
                z5 = false;
            }
            C40843u.m166191a(z5);
            if (hgVarArr2[i] != mgVar4) {
                z6 = true;
            } else {
                z6 = false;
            }
            C40843u.m166191a(z6);
        }
        C41310hg<?> b = mo135004b(g7Var, hgVarArr2);
        if (b == null) {
            z7 = false;
        }
        C40843u.m166208r(z7);
        return b;
    }

    /* renamed from: b */
    public abstract C41310hg<?> mo135004b(C41277g7 g7Var, C41310hg<?>... hgVarArr);
}
