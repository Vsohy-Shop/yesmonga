package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.e0 */
public final class C41922e0 extends C42252x {
    public C41922e0() {
        this.f106488a.add(zzbl.AND);
        this.f106488a.add(zzbl.NOT);
        this.f106488a.add(zzbl.OR);
    }

    /* renamed from: a */
    public final C42133q mo136495a(String str, C41909d5 d5Var, List list) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = C41928e6.m169807e(str).ordinal();
        if (ordinal == 1) {
            C41928e6.m169810h(zzbl.AND.name(), 2, list);
            C42133q b = d5Var.mo136673b((C42133q) list.get(0));
            if (!b.mo136738h().booleanValue()) {
                return b;
            }
            return d5Var.mo136673b((C42133q) list.get(1));
        } else if (ordinal == 47) {
            C41928e6.m169810h(zzbl.NOT.name(), 1, list);
            return new C41957g(Boolean.valueOf(!d5Var.mo136673b((C42133q) list.get(0)).mo136738h().booleanValue()));
        } else if (ordinal != 50) {
            return super.mo137448b(str);
        } else {
            C41928e6.m169810h(zzbl.OR.name(), 2, list);
            C42133q b2 = d5Var.mo136673b((C42133q) list.get(0));
            if (b2.mo136738h().booleanValue()) {
                return b2;
            }
            return d5Var.mo136673b((C42133q) list.get(1));
        }
    }
}
