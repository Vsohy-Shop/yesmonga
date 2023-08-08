package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.core.motion.utils.C16717v;
import com.urbanairship.actions.ToastAction;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.m0 */
public final class C42066m0 extends C42252x {
    public C42066m0() {
        this.f106488a.add(zzbl.ASSIGN);
        this.f106488a.add(zzbl.CONST);
        this.f106488a.add(zzbl.CREATE_ARRAY);
        this.f106488a.add(zzbl.CREATE_OBJECT);
        this.f106488a.add(zzbl.EXPRESSION_LIST);
        this.f106488a.add(zzbl.GET);
        this.f106488a.add(zzbl.GET_INDEX);
        this.f106488a.add(zzbl.GET_PROPERTY);
        this.f106488a.add(zzbl.NULL);
        this.f106488a.add(zzbl.SET_PROPERTY);
        this.f106488a.add(zzbl.TYPEOF);
        this.f106488a.add(zzbl.UNDEFINED);
        this.f106488a.add(zzbl.VAR);
    }

    /* renamed from: a */
    public final C42133q mo136495a(String str, C41909d5 d5Var, List list) {
        String str2;
        zzbl zzbl = zzbl.ADD;
        int ordinal = C41928e6.m169807e(str).ordinal();
        int i = 0;
        if (ordinal == 3) {
            C41928e6.m169810h(zzbl.ASSIGN.name(), 2, list);
            C42133q b = d5Var.mo136673b((C42133q) list.get(0));
            if (!(b instanceof C42201u)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[]{b.getClass().getCanonicalName()}));
            } else if (d5Var.mo136679h(b.mo136744k())) {
                C42133q b2 = d5Var.mo136673b((C42133q) list.get(1));
                d5Var.mo136678g(b.mo136744k(), b2);
                return b2;
            } else {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[]{b.mo136744k()}));
            }
        } else if (ordinal == 14) {
            C41928e6.m169811i(zzbl.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                int i2 = 0;
                while (i2 < list.size() - 1) {
                    C42133q b3 = d5Var.mo136673b((C42133q) list.get(i2));
                    if (b3 instanceof C42201u) {
                        d5Var.mo136677f(b3.mo136744k(), d5Var.mo136673b((C42133q) list.get(i2 + 1)));
                        i2 += 2;
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[]{b3.getClass().getCanonicalName()}));
                    }
                }
                return C42133q.f106351H;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
        } else if (ordinal == 24) {
            C41928e6.m169811i(zzbl.EXPRESSION_LIST.name(), 1, list);
            C42133q qVar = C42133q.f106351H;
            while (i < list.size()) {
                qVar = d5Var.mo136673b((C42133q) list.get(i));
                if (!(qVar instanceof C41975h)) {
                    i++;
                } else {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
            }
            return qVar;
        } else if (ordinal == 33) {
            C41928e6.m169810h(zzbl.GET.name(), 1, list);
            C42133q b4 = d5Var.mo136673b((C42133q) list.get(0));
            if (b4 instanceof C42201u) {
                return d5Var.mo136675d(b4.mo136744k());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[]{b4.getClass().getCanonicalName()}));
        } else if (ordinal == 49) {
            C41928e6.m169810h(zzbl.NULL.name(), 0, list);
            return C42133q.f106352I;
        } else if (ordinal == 58) {
            C41928e6.m169810h(zzbl.SET_PROPERTY.name(), 3, list);
            C42133q b5 = d5Var.mo136673b((C42133q) list.get(0));
            C42133q b6 = d5Var.mo136673b((C42133q) list.get(1));
            C42133q b7 = d5Var.mo136673b((C42133q) list.get(2));
            if (b5 == C42133q.f106351H || b5 == C42133q.f106352I) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[]{b6.mo136744k(), b5.mo136744k()}));
            }
            if ((b5 instanceof C41939f) && (b6 instanceof C41993i)) {
                ((C41939f) b5).mo136737f0(b6.mo136743j().intValue(), b7);
            } else if (b5 instanceof C42065m) {
                ((C42065m) b5).mo136748w(b6.mo136744k(), b7);
            }
            return b7;
        } else if (ordinal != 17) {
            if (ordinal != 18) {
                if (ordinal == 35 || ordinal == 36) {
                    C41928e6.m169810h(zzbl.GET_PROPERTY.name(), 2, list);
                    C42133q b8 = d5Var.mo136673b((C42133q) list.get(0));
                    C42133q b9 = d5Var.mo136673b((C42133q) list.get(1));
                    if ((b8 instanceof C41939f) && C41928e6.m169813k(b9)) {
                        return ((C41939f) b8).mo136727H(b9.mo136743j().intValue());
                    }
                    if (b8 instanceof C42065m) {
                        return ((C42065m) b8).mo136728I0(b9.mo136744k());
                    }
                    if (b8 instanceof C42201u) {
                        if (ToastAction.f87498j.equals(b9.mo136744k())) {
                            return new C41993i(Double.valueOf((double) b8.mo136744k().length()));
                        }
                        if (C41928e6.m169813k(b9) && b9.mo136743j().doubleValue() < ((double) b8.mo136744k().length())) {
                            return new C42201u(String.valueOf(b8.mo136744k().charAt(b9.mo136743j().intValue())));
                        }
                    }
                    return C42133q.f106351H;
                }
                switch (ordinal) {
                    case 62:
                        C41928e6.m169810h(zzbl.TYPEOF.name(), 1, list);
                        C42133q b10 = d5Var.mo136673b((C42133q) list.get(0));
                        if (b10 instanceof C42218v) {
                            str2 = "undefined";
                        } else if (b10 instanceof C41957g) {
                            str2 = C16717v.C16719b.f42183f;
                        } else if (b10 instanceof C41993i) {
                            str2 = "number";
                        } else if (b10 instanceof C42201u) {
                            str2 = C16717v.C16719b.f42182e;
                        } else if (b10 instanceof C42116p) {
                            str2 = "function";
                        } else if ((b10 instanceof C42150r) || (b10 instanceof C41975h)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{b10}));
                        } else {
                            str2 = "object";
                        }
                        return new C42201u(str2);
                    case 63:
                        C41928e6.m169810h(zzbl.UNDEFINED.name(), 0, list);
                        return C42133q.f106351H;
                    case 64:
                        C41928e6.m169811i(zzbl.VAR.name(), 1, list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C42133q b11 = d5Var.mo136673b((C42133q) it.next());
                            if (b11 instanceof C42201u) {
                                d5Var.mo136676e(b11.mo136744k(), C42133q.f106351H);
                            } else {
                                throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[]{b11.getClass().getCanonicalName()}));
                            }
                        }
                        return C42133q.f106351H;
                    default:
                        return super.mo137448b(str);
                }
            } else if (list.isEmpty()) {
                return new C42082n();
            } else {
                if (list.size() % 2 == 0) {
                    C42082n nVar = new C42082n();
                    while (i < list.size() - 1) {
                        C42133q b12 = d5Var.mo136673b((C42133q) list.get(i));
                        C42133q b13 = d5Var.mo136673b((C42133q) list.get(i + 1));
                        if ((b12 instanceof C41975h) || (b13 instanceof C41975h)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        nVar.mo136748w(b12.mo136744k(), b13);
                        i += 2;
                    }
                    return nVar;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
            }
        } else if (list.isEmpty()) {
            return new C41939f();
        } else {
            C41939f fVar = new C41939f();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C42133q b14 = d5Var.mo136673b((C42133q) it2.next());
                if (!(b14 instanceof C41975h)) {
                    fVar.mo136737f0(i, b14);
                    i++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return fVar;
        }
    }
}
