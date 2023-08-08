package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w */
public final class C42235w extends C42252x {
    public C42235w() {
        this.f106488a.add(zzbl.BITWISE_AND);
        this.f106488a.add(zzbl.BITWISE_LEFT_SHIFT);
        this.f106488a.add(zzbl.BITWISE_NOT);
        this.f106488a.add(zzbl.BITWISE_OR);
        this.f106488a.add(zzbl.BITWISE_RIGHT_SHIFT);
        this.f106488a.add(zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f106488a.add(zzbl.BITWISE_XOR);
    }

    /* renamed from: a */
    public final C42133q mo136495a(String str, C41909d5 d5Var, List list) {
        zzbl zzbl = zzbl.ADD;
        switch (C41928e6.m169807e(str).ordinal()) {
            case 4:
                C41928e6.m169810h(zzbl.BITWISE_AND.name(), 2, list);
                return new C41993i(Double.valueOf((double) (C41928e6.m169804b(d5Var.mo136673b((C42133q) list.get(0)).mo136743j().doubleValue()) & C41928e6.m169804b(d5Var.mo136673b((C42133q) list.get(1)).mo136743j().doubleValue()))));
            case 5:
                C41928e6.m169810h(zzbl.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C41993i(Double.valueOf((double) (C41928e6.m169804b(d5Var.mo136673b((C42133q) list.get(0)).mo136743j().doubleValue()) << ((int) (C41928e6.m169806d(d5Var.mo136673b((C42133q) list.get(1)).mo136743j().doubleValue()) & 31)))));
            case 6:
                C41928e6.m169810h(zzbl.BITWISE_NOT.name(), 1, list);
                return new C41993i(Double.valueOf((double) (~C41928e6.m169804b(d5Var.mo136673b((C42133q) list.get(0)).mo136743j().doubleValue()))));
            case 7:
                C41928e6.m169810h(zzbl.BITWISE_OR.name(), 2, list);
                return new C41993i(Double.valueOf((double) (C41928e6.m169804b(d5Var.mo136673b((C42133q) list.get(0)).mo136743j().doubleValue()) | C41928e6.m169804b(d5Var.mo136673b((C42133q) list.get(1)).mo136743j().doubleValue()))));
            case 8:
                C41928e6.m169810h(zzbl.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C41993i(Double.valueOf((double) (C41928e6.m169804b(d5Var.mo136673b((C42133q) list.get(0)).mo136743j().doubleValue()) >> ((int) (C41928e6.m169806d(d5Var.mo136673b((C42133q) list.get(1)).mo136743j().doubleValue()) & 31)))));
            case 9:
                C41928e6.m169810h(zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C41993i(Double.valueOf((double) (C41928e6.m169806d(d5Var.mo136673b((C42133q) list.get(0)).mo136743j().doubleValue()) >>> ((int) (C41928e6.m169806d(d5Var.mo136673b((C42133q) list.get(1)).mo136743j().doubleValue()) & 31)))));
            case 10:
                C41928e6.m169810h(zzbl.BITWISE_XOR.name(), 2, list);
                return new C41993i(Double.valueOf((double) (C41928e6.m169804b(d5Var.mo136673b((C42133q) list.get(0)).mo136743j().doubleValue()) ^ C41928e6.m169804b(d5Var.mo136673b((C42133q) list.get(1)).mo136743j().doubleValue()))));
            default:
                return super.mo137448b(str);
        }
    }
}
