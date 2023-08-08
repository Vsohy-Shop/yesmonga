package androidx.recyclerview.widget;

import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1875h;
import androidx.collection.C1886l;
import androidx.core.util.C17997q;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.k0 */
public class C20172k0 {

    /* renamed from: c */
    public static final boolean f51956c = false;
    @C0344h1

    /* renamed from: a */
    public final C1886l<RecyclerView.C20061e0, C20173a> f51957a = new C1886l<>();
    @C0344h1

    /* renamed from: b */
    public final C1875h<RecyclerView.C20061e0> f51958b = new C1875h<>();

    /* renamed from: androidx.recyclerview.widget.k0$a */
    public static class C20173a {

        /* renamed from: d */
        public static final int f51959d = 1;

        /* renamed from: e */
        public static final int f51960e = 2;

        /* renamed from: f */
        public static final int f51961f = 4;

        /* renamed from: g */
        public static final int f51962g = 8;

        /* renamed from: h */
        public static final int f51963h = 3;

        /* renamed from: i */
        public static final int f51964i = 12;

        /* renamed from: j */
        public static final int f51965j = 14;

        /* renamed from: k */
        public static C17997q.C17998a<C20173a> f51966k = new C17997q.C17999b(20);

        /* renamed from: a */
        public int f51967a;
        @C0363p0

        /* renamed from: b */
        public RecyclerView.C20069l.C20073d f51968b;
        @C0363p0

        /* renamed from: c */
        public RecyclerView.C20069l.C20073d f51969c;

        /* renamed from: a */
        public static void m94342a() {
            do {
            } while (f51966k.mo52469b() != null);
        }

        /* renamed from: b */
        public static C20173a m94343b() {
            C20173a b = f51966k.mo52469b();
            if (b == null) {
                return new C20173a();
            }
            return b;
        }

        /* renamed from: c */
        public static void m94344c(C20173a aVar) {
            aVar.f51967a = 0;
            aVar.f51968b = null;
            aVar.f51969c = null;
            f51966k.mo52468a(aVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.k0$b */
    public interface C20174b {
        /* renamed from: a */
        void mo59744a(RecyclerView.C20061e0 e0Var, @C0363p0 RecyclerView.C20069l.C20073d dVar, RecyclerView.C20069l.C20073d dVar2);

        /* renamed from: b */
        void mo59745b(RecyclerView.C20061e0 e0Var);

        /* renamed from: c */
        void mo59746c(RecyclerView.C20061e0 e0Var, @C0359n0 RecyclerView.C20069l.C20073d dVar, @C0363p0 RecyclerView.C20069l.C20073d dVar2);

        /* renamed from: d */
        void mo59747d(RecyclerView.C20061e0 e0Var, @C0359n0 RecyclerView.C20069l.C20073d dVar, @C0359n0 RecyclerView.C20069l.C20073d dVar2);
    }

    /* renamed from: a */
    public void mo60498a(RecyclerView.C20061e0 e0Var, RecyclerView.C20069l.C20073d dVar) {
        C20173a aVar = this.f51957a.get(e0Var);
        if (aVar == null) {
            aVar = C20173a.m94343b();
            this.f51957a.put(e0Var, aVar);
        }
        aVar.f51967a |= 2;
        aVar.f51968b = dVar;
    }

    /* renamed from: b */
    public void mo60499b(RecyclerView.C20061e0 e0Var) {
        C20173a aVar = this.f51957a.get(e0Var);
        if (aVar == null) {
            aVar = C20173a.m94343b();
            this.f51957a.put(e0Var, aVar);
        }
        aVar.f51967a |= 1;
    }

    /* renamed from: c */
    public void mo60500c(long j, RecyclerView.C20061e0 e0Var) {
        this.f51958b.mo6229t(j, e0Var);
    }

    /* renamed from: d */
    public void mo60501d(RecyclerView.C20061e0 e0Var, RecyclerView.C20069l.C20073d dVar) {
        C20173a aVar = this.f51957a.get(e0Var);
        if (aVar == null) {
            aVar = C20173a.m94343b();
            this.f51957a.put(e0Var, aVar);
        }
        aVar.f51969c = dVar;
        aVar.f51967a |= 8;
    }

    /* renamed from: e */
    public void mo60502e(RecyclerView.C20061e0 e0Var, RecyclerView.C20069l.C20073d dVar) {
        C20173a aVar = this.f51957a.get(e0Var);
        if (aVar == null) {
            aVar = C20173a.m94343b();
            this.f51957a.put(e0Var, aVar);
        }
        aVar.f51968b = dVar;
        aVar.f51967a |= 4;
    }

    /* renamed from: f */
    public void mo60503f() {
        this.f51957a.clear();
        this.f51958b.mo6216c();
    }

    /* renamed from: g */
    public RecyclerView.C20061e0 mo60504g(long j) {
        return this.f51958b.mo6223k(j);
    }

    /* renamed from: h */
    public boolean mo60505h(RecyclerView.C20061e0 e0Var) {
        C20173a aVar = this.f51957a.get(e0Var);
        if (aVar == null || (aVar.f51967a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public boolean mo60506i(RecyclerView.C20061e0 e0Var) {
        C20173a aVar = this.f51957a.get(e0Var);
        if (aVar == null || (aVar.f51967a & 4) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public void mo60507j() {
        C20173a.m94342a();
    }

    /* renamed from: k */
    public void mo60508k(RecyclerView.C20061e0 e0Var) {
        mo60513p(e0Var);
    }

    /* renamed from: l */
    public final RecyclerView.C20069l.C20073d mo60509l(RecyclerView.C20061e0 e0Var, int i) {
        C20173a o;
        RecyclerView.C20069l.C20073d dVar;
        int f = this.f51957a.mo6327f(e0Var);
        if (f >= 0 && (o = this.f51957a.mo6338o(f)) != null) {
            int i2 = o.f51967a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                o.f51967a = i3;
                if (i == 4) {
                    dVar = o.f51968b;
                } else if (i == 8) {
                    dVar = o.f51969c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f51957a.mo6336m(f);
                    C20173a.m94344c(o);
                }
                return dVar;
            }
        }
        return null;
    }

    @C0363p0
    /* renamed from: m */
    public RecyclerView.C20069l.C20073d mo60510m(RecyclerView.C20061e0 e0Var) {
        return mo60509l(e0Var, 8);
    }

    @C0363p0
    /* renamed from: n */
    public RecyclerView.C20069l.C20073d mo60511n(RecyclerView.C20061e0 e0Var) {
        return mo60509l(e0Var, 4);
    }

    /* renamed from: o */
    public void mo60512o(C20174b bVar) {
        for (int size = this.f51957a.size() - 1; size >= 0; size--) {
            RecyclerView.C20061e0 j = this.f51957a.mo6334j(size);
            C20173a m = this.f51957a.mo6336m(size);
            int i = m.f51967a;
            if ((i & 3) == 3) {
                bVar.mo59745b(j);
            } else if ((i & 1) != 0) {
                RecyclerView.C20069l.C20073d dVar = m.f51968b;
                if (dVar == null) {
                    bVar.mo59745b(j);
                } else {
                    bVar.mo59746c(j, dVar, m.f51969c);
                }
            } else if ((i & 14) == 14) {
                bVar.mo59744a(j, m.f51968b, m.f51969c);
            } else if ((i & 12) == 12) {
                bVar.mo59747d(j, m.f51968b, m.f51969c);
            } else if ((i & 4) != 0) {
                bVar.mo59746c(j, m.f51968b, (RecyclerView.C20069l.C20073d) null);
            } else if ((i & 8) != 0) {
                bVar.mo59744a(j, m.f51968b, m.f51969c);
            }
            C20173a.m94344c(m);
        }
    }

    /* renamed from: p */
    public void mo60513p(RecyclerView.C20061e0 e0Var) {
        C20173a aVar = this.f51957a.get(e0Var);
        if (aVar != null) {
            aVar.f51967a &= -2;
        }
    }

    /* renamed from: q */
    public void mo60514q(RecyclerView.C20061e0 e0Var) {
        int F = this.f51958b.mo6213F() - 1;
        while (true) {
            if (F < 0) {
                break;
            } else if (e0Var == this.f51958b.mo6214G(F)) {
                this.f51958b.mo6209B(F);
                break;
            } else {
                F--;
            }
        }
        C20173a remove = this.f51957a.remove(e0Var);
        if (remove != null) {
            C20173a.m94344c(remove);
        }
    }
}
