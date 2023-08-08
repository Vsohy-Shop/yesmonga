package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.internal.gtm.nb */
public final class C41450nb extends C41159b9 {
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
        C41431mg mgVar = hgVarArr[0];
        C41431mg mgVar2 = hgVarArr[1];
        if ((!(mgVar instanceof C41431mg) || mgVar == C41431mg.f104800h || mgVar == C41431mg.f104799g) && (!(mgVar2 instanceof C41431mg) || mgVar2 == C41431mg.f104800h || mgVar2 == C41431mg.f104799g)) {
            if ((mgVar instanceof C41527qg) || (mgVar instanceof C41503pg) || (mgVar instanceof C41383kg)) {
                mgVar = new C41599tg(C41135a9.m167070d(mgVar));
            }
            if ((mgVar2 instanceof C41527qg) || (mgVar2 instanceof C41503pg) || (mgVar2 instanceof C41383kg)) {
                mgVar2 = new C41599tg(C41135a9.m167070d(mgVar2));
            }
            if (!(mgVar instanceof C41599tg) && !(mgVar2 instanceof C41599tg)) {
                return new C41358jg(Double.valueOf(C41135a9.m167069c(mgVar, mgVar2)));
            }
            String valueOf = String.valueOf(C41135a9.m167070d(mgVar));
            String valueOf2 = String.valueOf(C41135a9.m167070d(mgVar2));
            if (valueOf2.length() != 0) {
                str = valueOf.concat(valueOf2);
            } else {
                str = new String(valueOf);
            }
            return new C41599tg(str);
        }
        throw new IllegalArgumentException("Illegal InternalType passed to Add.");
    }
}
