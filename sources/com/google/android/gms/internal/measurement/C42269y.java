package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.y */
public final class C42269y {

    /* renamed from: a */
    public final Map f106541a = new HashMap();

    /* renamed from: b */
    public final C42048l0 f106542b = new C42048l0();

    public C42269y() {
        mo137478b(new C42235w());
        mo137478b(new C42286z());
        mo137478b(new C41850a0());
        mo137478b(new C41922e0());
        mo137478b(new C42012j0());
        mo137478b(new C42030k0());
        mo137478b(new C42066m0());
    }

    /* renamed from: a */
    public final C42133q mo137477a(C41909d5 d5Var, C42133q qVar) {
        C42252x xVar;
        C41928e6.m169805c(d5Var);
        if (!(qVar instanceof C42150r)) {
            return qVar;
        }
        C42150r rVar = (C42150r) qVar;
        ArrayList b = rVar.mo137245b();
        String a = rVar.mo137244a();
        if (this.f106541a.containsKey(a)) {
            xVar = (C42252x) this.f106541a.get(a);
        } else {
            xVar = this.f106542b;
        }
        return xVar.mo136495a(a, d5Var, b);
    }

    /* renamed from: b */
    public final void mo137478b(C42252x xVar) {
        for (zzbl g : xVar.f106488a) {
            this.f106541a.put(g.mo137535g().toString(), xVar);
        }
    }
}
