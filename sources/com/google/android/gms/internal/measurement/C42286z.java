package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z */
public final class C42286z extends C42252x {
    public C42286z() {
        this.f106488a.add(zzbl.EQUALS);
        this.f106488a.add(zzbl.GREATER_THAN);
        this.f106488a.add(zzbl.GREATER_THAN_EQUALS);
        this.f106488a.add(zzbl.IDENTITY_EQUALS);
        this.f106488a.add(zzbl.IDENTITY_NOT_EQUALS);
        this.f106488a.add(zzbl.LESS_THAN);
        this.f106488a.add(zzbl.LESS_THAN_EQUALS);
        this.f106488a.add(zzbl.NOT_EQUALS);
    }

    /* renamed from: c */
    public static boolean m171189c(C42133q qVar, C42133q qVar2) {
        if (qVar.getClass().equals(qVar2.getClass())) {
            if ((qVar instanceof C42218v) || (qVar instanceof C42099o)) {
                return true;
            }
            if (qVar instanceof C41993i) {
                if (Double.isNaN(qVar.mo136743j().doubleValue()) || Double.isNaN(qVar2.mo136743j().doubleValue()) || qVar.mo136743j().doubleValue() != qVar2.mo136743j().doubleValue()) {
                    return false;
                }
                return true;
            } else if (qVar instanceof C42201u) {
                return qVar.mo136744k().equals(qVar2.mo136744k());
            } else {
                if (qVar instanceof C41957g) {
                    return qVar.mo136738h().equals(qVar2.mo136738h());
                }
                if (qVar == qVar2) {
                    return true;
                }
                return false;
            }
        } else if (((qVar instanceof C42218v) || (qVar instanceof C42099o)) && ((qVar2 instanceof C42218v) || (qVar2 instanceof C42099o))) {
            return true;
        } else {
            boolean z = qVar instanceof C41993i;
            if (z && (qVar2 instanceof C42201u)) {
                return m171189c(qVar, new C41993i(qVar2.mo136743j()));
            }
            boolean z2 = qVar instanceof C42201u;
            if (z2 && (qVar2 instanceof C41993i)) {
                return m171189c(new C41993i(qVar.mo136743j()), qVar2);
            }
            if (qVar instanceof C41957g) {
                return m171189c(new C41993i(qVar.mo136743j()), qVar2);
            }
            if (qVar2 instanceof C41957g) {
                return m171189c(qVar, new C41993i(qVar2.mo136743j()));
            }
            if ((z2 || z) && (qVar2 instanceof C42065m)) {
                return m171189c(qVar, new C42201u(qVar2.mo136744k()));
            }
            if (!(qVar instanceof C42065m) || (!(qVar2 instanceof C42201u) && !(qVar2 instanceof C41993i))) {
                return false;
            }
            return m171189c(new C42201u(qVar.mo136744k()), qVar2);
        }
    }

    /* renamed from: d */
    public static boolean m171190d(C42133q qVar, C42133q qVar2) {
        int i;
        if (qVar instanceof C42065m) {
            qVar = new C42201u(qVar.mo136744k());
        }
        if (qVar2 instanceof C42065m) {
            qVar2 = new C42201u(qVar2.mo136744k());
        }
        if (!(qVar instanceof C42201u) || !(qVar2 instanceof C42201u)) {
            double doubleValue = qVar.mo136743j().doubleValue();
            double doubleValue2 = qVar2.mo136743j().doubleValue();
            if (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || ((doubleValue == 0.0d && doubleValue2 == 0.0d) || ((i == 0 && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0))) {
                return false;
            }
            return true;
        } else if (qVar.mo136744k().compareTo(qVar2.mo136744k()) < 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m171191e(C42133q qVar, C42133q qVar2) {
        if (qVar instanceof C42065m) {
            qVar = new C42201u(qVar.mo136744k());
        }
        if (qVar2 instanceof C42065m) {
            qVar2 = new C42201u(qVar2.mo136744k());
        }
        if (((!(qVar instanceof C42201u) || !(qVar2 instanceof C42201u)) && (Double.isNaN(qVar.mo136743j().doubleValue()) || Double.isNaN(qVar2.mo136743j().doubleValue()))) || m171190d(qVar2, qVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C42133q mo136495a(String str, C41909d5 d5Var, List list) {
        boolean z;
        boolean c;
        C41928e6.m169810h(C41928e6.m169807e(str).name(), 2, list);
        C42133q b = d5Var.mo136673b((C42133q) list.get(0));
        C42133q b2 = d5Var.mo136673b((C42133q) list.get(1));
        int ordinal = C41928e6.m169807e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                c = m171189c(b, b2);
            } else if (ordinal == 42) {
                z = m171190d(b, b2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        z = m171190d(b2, b);
                        break;
                    case 38:
                        z = m171191e(b2, b);
                        break;
                    case 39:
                        z = C41928e6.m169814l(b, b2);
                        break;
                    case 40:
                        c = C41928e6.m169814l(b, b2);
                        break;
                    default:
                        return super.mo137448b(str);
                }
            } else {
                z = m171191e(b, b2);
            }
            z = !c;
        } else {
            z = m171189c(b, b2);
        }
        if (z) {
            return C42133q.f106356M;
        }
        return C42133q.f106357N;
    }
}
