package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j0 */
public final class C42012j0 extends C42252x {
    public C42012j0() {
        this.f106488a.add(zzbl.FOR_IN);
        this.f106488a.add(zzbl.FOR_IN_CONST);
        this.f106488a.add(zzbl.FOR_IN_LET);
        this.f106488a.add(zzbl.FOR_LET);
        this.f106488a.add(zzbl.FOR_OF);
        this.f106488a.add(zzbl.FOR_OF_CONST);
        this.f106488a.add(zzbl.FOR_OF_LET);
        this.f106488a.add(zzbl.WHILE);
    }

    /* renamed from: c */
    public static C42133q m170332c(C41976h0 h0Var, Iterator it, C42133q qVar) {
        if (it != null) {
            while (it.hasNext()) {
                C42133q c = h0Var.mo136750a((C42133q) it.next()).mo136674c((C41939f) qVar);
                if (c instanceof C41975h) {
                    C41975h hVar = (C41975h) c;
                    if ("break".equals(hVar.mo136890b())) {
                        return C42133q.f106351H;
                    }
                    if ("return".equals(hVar.mo136890b())) {
                        return hVar;
                    }
                }
            }
        }
        return C42133q.f106351H;
    }

    /* renamed from: d */
    public static C42133q m170333d(C41976h0 h0Var, C42133q qVar, C42133q qVar2) {
        return m170332c(h0Var, qVar.mo136745q(), qVar2);
    }

    /* renamed from: e */
    public static C42133q m170334e(C41976h0 h0Var, C42133q qVar, C42133q qVar2) {
        if (qVar instanceof Iterable) {
            return m170332c(h0Var, ((Iterable) qVar).iterator(), qVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* renamed from: a */
    public final C42133q mo136495a(String str, C41909d5 d5Var, List list) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = C41928e6.m169807e(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    C41928e6.m169810h(zzbl.FOR_IN.name(), 3, list);
                    if (list.get(0) instanceof C42201u) {
                        return m170333d(new C41994i0(d5Var, ((C42133q) list.get(0)).mo136744k()), d5Var.mo136673b((C42133q) list.get(1)), d5Var.mo136673b((C42133q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    C41928e6.m169810h(zzbl.FOR_IN_CONST.name(), 3, list);
                    if (list.get(0) instanceof C42201u) {
                        return m170333d(new C41940f0(d5Var, ((C42133q) list.get(0)).mo136744k()), d5Var.mo136673b((C42133q) list.get(1)), d5Var.mo136673b((C42133q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    C41928e6.m169810h(zzbl.FOR_IN_LET.name(), 3, list);
                    if (list.get(0) instanceof C42201u) {
                        return m170333d(new C41958g0(d5Var, ((C42133q) list.get(0)).mo136744k()), d5Var.mo136673b((C42133q) list.get(1)), d5Var.mo136673b((C42133q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    C41928e6.m169810h(zzbl.FOR_LET.name(), 4, list);
                    C42133q b = d5Var.mo136673b((C42133q) list.get(0));
                    if (b instanceof C41939f) {
                        C41939f fVar = (C41939f) b;
                        C42133q qVar = (C42133q) list.get(1);
                        C42133q qVar2 = (C42133q) list.get(2);
                        C42133q b2 = d5Var.mo136673b((C42133q) list.get(3));
                        C41909d5 a = d5Var.mo136672a();
                        for (int i = 0; i < fVar.mo136726A(); i++) {
                            String k = fVar.mo136727H(i).mo136744k();
                            a.mo136678g(k, d5Var.mo136675d(k));
                        }
                        while (d5Var.mo136673b(qVar).mo136738h().booleanValue()) {
                            C42133q c = d5Var.mo136674c((C41939f) b2);
                            if (c instanceof C41975h) {
                                C41975h hVar = (C41975h) c;
                                if ("break".equals(hVar.mo136890b())) {
                                    return C42133q.f106351H;
                                }
                                if ("return".equals(hVar.mo136890b())) {
                                    return hVar;
                                }
                            }
                            C41909d5 a2 = d5Var.mo136672a();
                            for (int i2 = 0; i2 < fVar.mo136726A(); i2++) {
                                String k2 = fVar.mo136727H(i2).mo136744k();
                                a2.mo136678g(k2, a.mo136675d(k2));
                            }
                            a2.mo136673b(qVar2);
                            a = a2;
                        }
                        return C42133q.f106351H;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    C41928e6.m169810h(zzbl.FOR_OF.name(), 3, list);
                    if (list.get(0) instanceof C42201u) {
                        return m170334e(new C41994i0(d5Var, ((C42133q) list.get(0)).mo136744k()), d5Var.mo136673b((C42133q) list.get(1)), d5Var.mo136673b((C42133q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    C41928e6.m169810h(zzbl.FOR_OF_CONST.name(), 3, list);
                    if (list.get(0) instanceof C42201u) {
                        return m170334e(new C41940f0(d5Var, ((C42133q) list.get(0)).mo136744k()), d5Var.mo136673b((C42133q) list.get(1)), d5Var.mo136673b((C42133q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    C41928e6.m169810h(zzbl.FOR_OF_LET.name(), 3, list);
                    if (list.get(0) instanceof C42201u) {
                        return m170334e(new C41958g0(d5Var, ((C42133q) list.get(0)).mo136744k()), d5Var.mo136673b((C42133q) list.get(1)), d5Var.mo136673b((C42133q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    return super.mo137448b(str);
            }
        } else {
            C41928e6.m169810h(zzbl.WHILE.name(), 4, list);
            C42133q qVar3 = (C42133q) list.get(0);
            C42133q qVar4 = (C42133q) list.get(1);
            C42133q b3 = d5Var.mo136673b((C42133q) list.get(3));
            if (d5Var.mo136673b((C42133q) list.get(2)).mo136738h().booleanValue()) {
                C42133q c2 = d5Var.mo136674c((C41939f) b3);
                if (c2 instanceof C41975h) {
                    C41975h hVar2 = (C41975h) c2;
                    if ("break".equals(hVar2.mo136890b())) {
                        return C42133q.f106351H;
                    }
                    if ("return".equals(hVar2.mo136890b())) {
                        return hVar2;
                    }
                }
            }
            while (d5Var.mo136673b(qVar3).mo136738h().booleanValue()) {
                C42133q c3 = d5Var.mo136674c((C41939f) b3);
                if (c3 instanceof C41975h) {
                    C41975h hVar3 = (C41975h) c3;
                    if ("break".equals(hVar3.mo136890b())) {
                        return C42133q.f106351H;
                    }
                    if ("return".equals(hVar3.mo136890b())) {
                        return hVar3;
                    }
                }
                d5Var.mo136673b(qVar4);
            }
            return C42133q.f106351H;
        }
    }
}
