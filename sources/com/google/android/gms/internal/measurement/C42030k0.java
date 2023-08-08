package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.k0 */
public final class C42030k0 extends C42252x {
    public C42030k0() {
        this.f106488a.add(zzbl.ADD);
        this.f106488a.add(zzbl.DIVIDE);
        this.f106488a.add(zzbl.MODULUS);
        this.f106488a.add(zzbl.MULTIPLY);
        this.f106488a.add(zzbl.NEGATE);
        this.f106488a.add(zzbl.POST_DECREMENT);
        this.f106488a.add(zzbl.POST_INCREMENT);
        this.f106488a.add(zzbl.PRE_DECREMENT);
        this.f106488a.add(zzbl.PRE_INCREMENT);
        this.f106488a.add(zzbl.SUBTRACT);
    }

    /* renamed from: a */
    public final C42133q mo136495a(String str, C41909d5 d5Var, List list) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = C41928e6.m169807e(str).ordinal();
        if (ordinal == 0) {
            C41928e6.m169810h(zzbl.name(), 2, list);
            C42133q b = d5Var.mo136673b((C42133q) list.get(0));
            C42133q b2 = d5Var.mo136673b((C42133q) list.get(1));
            if (!(b instanceof C42065m) && !(b instanceof C42201u) && !(b2 instanceof C42065m) && !(b2 instanceof C42201u)) {
                return new C41993i(Double.valueOf(b.mo136743j().doubleValue() + b2.mo136743j().doubleValue()));
            }
            return new C42201u(String.valueOf(b.mo136744k()).concat(String.valueOf(b2.mo136744k())));
        } else if (ordinal == 21) {
            C41928e6.m169810h(zzbl.DIVIDE.name(), 2, list);
            return new C41993i(Double.valueOf(d5Var.mo136673b((C42133q) list.get(0)).mo136743j().doubleValue() / d5Var.mo136673b((C42133q) list.get(1)).mo136743j().doubleValue()));
        } else if (ordinal == 59) {
            C41928e6.m169810h(zzbl.SUBTRACT.name(), 2, list);
            return new C41993i(Double.valueOf(d5Var.mo136673b((C42133q) list.get(0)).mo136743j().doubleValue() + new C41993i(Double.valueOf(-d5Var.mo136673b((C42133q) list.get(1)).mo136743j().doubleValue())).mo136743j().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            C41928e6.m169810h(str, 2, list);
            C42133q b3 = d5Var.mo136673b((C42133q) list.get(0));
            d5Var.mo136673b((C42133q) list.get(1));
            return b3;
        } else if (ordinal == 55 || ordinal == 56) {
            C41928e6.m169810h(str, 1, list);
            return d5Var.mo136673b((C42133q) list.get(0));
        } else {
            switch (ordinal) {
                case 44:
                    C41928e6.m169810h(zzbl.MODULUS.name(), 2, list);
                    return new C41993i(Double.valueOf(d5Var.mo136673b((C42133q) list.get(0)).mo136743j().doubleValue() % d5Var.mo136673b((C42133q) list.get(1)).mo136743j().doubleValue()));
                case 45:
                    C41928e6.m169810h(zzbl.MULTIPLY.name(), 2, list);
                    return new C41993i(Double.valueOf(d5Var.mo136673b((C42133q) list.get(0)).mo136743j().doubleValue() * d5Var.mo136673b((C42133q) list.get(1)).mo136743j().doubleValue()));
                case 46:
                    C41928e6.m169810h(zzbl.NEGATE.name(), 1, list);
                    return new C41993i(Double.valueOf(-d5Var.mo136673b((C42133q) list.get(0)).mo136743j().doubleValue()));
                default:
                    return super.mo137448b(str);
            }
        }
    }
}
