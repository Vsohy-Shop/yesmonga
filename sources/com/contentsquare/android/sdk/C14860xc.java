package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14179aa;
import com.contentsquare.android.sdk.C14253cc;
import com.contentsquare.android.sdk.C14710sf;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.contentsquare.android.sdk.xc */
public final class C14860xc<T> implements C14398h8<T> {

    /* renamed from: a */
    public final C14218ba f36849a;

    /* renamed from: b */
    public final C14436j0<?, ?> f36850b;

    /* renamed from: c */
    public final boolean f36851c;

    /* renamed from: d */
    public final C14517m3<?> f36852d;

    public C14860xc(C14436j0<?, ?> j0Var, C14517m3<?> m3Var, C14218ba baVar) {
        this.f36850b = j0Var;
        this.f36851c = m3Var.mo35032h(baVar);
        this.f36852d = m3Var;
        this.f36849a = baVar;
    }

    /* renamed from: k */
    public static <T> C14860xc<T> m64015k(C14436j0<?, ?> j0Var, C14517m3<?> m3Var, C14218ba baVar) {
        return new C14860xc<>(j0Var, m3Var, baVar);
    }

    /* renamed from: a */
    public T mo35210a() {
        return this.f36849a.mo34700j().mo34701a();
    }

    /* renamed from: b */
    public final boolean mo35211b(T t) {
        return this.f36852d.mo35026b(t).mo34873v();
    }

    /* renamed from: c */
    public void mo35213c(T t, T t2) {
        C14646q9.m63161n(this.f36850b, t, t2);
        if (this.f36851c) {
            C14646q9.m63162o(this.f36852d, t, t2);
        }
    }

    /* renamed from: d */
    public int mo35215d(T t) {
        int j = mo36825j(this.f36850b, t) + 0;
        return this.f36851c ? j + this.f36852d.mo35026b(t).mo34868q() : j;
    }

    /* renamed from: e */
    public void mo35216e(T t) {
        this.f36850b.mo35581s(t);
        this.f36852d.mo35034j(t);
    }

    /* renamed from: f */
    public int mo35218f(T t) {
        int hashCode = this.f36850b.mo35573k(t).hashCode();
        return this.f36851c ? (hashCode * 53) + this.f36852d.mo35026b(t).hashCode() : hashCode;
    }

    /* renamed from: g */
    public void mo35219g(T t, C14782uf ufVar) {
        Iterator<Map.Entry<?, Object>> w = this.f36852d.mo35026b(t).mo34874w();
        while (w.hasNext()) {
            Map.Entry next = w.next();
            C14253cc.C14255b bVar = (C14253cc.C14255b) next.getKey();
            if (bVar.mo34878b() != C14710sf.C14717c.MESSAGE || bVar.mo34881p() || bVar.mo34879c()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            ufVar.mo35452s(bVar.mo34877a(), next instanceof C14179aa.C14181b ? ((C14179aa.C14181b) next).mo34530a().mo36398d() : next.getValue());
        }
        mo36827m(this.f36850b, t, ufVar);
    }

    /* renamed from: h */
    public boolean mo35220h(T t, T t2) {
        if (!this.f36850b.mo35573k(t).equals(this.f36850b.mo35573k(t2))) {
            return false;
        }
        if (this.f36851c) {
            return this.f36852d.mo35026b(t).equals(this.f36852d.mo35026b(t2));
        }
        return true;
    }

    /* renamed from: i */
    public void mo35221i(T t, C14475k6 k6Var, C14787v2 v2Var) {
        mo36826l(this.f36850b, this.f36852d, t, k6Var, v2Var);
    }

    /* renamed from: j */
    public final <UT, UB> int mo36825j(C14436j0<UT, UB> j0Var, T t) {
        return j0Var.mo35580r(j0Var.mo35573k(t));
    }

    /* renamed from: l */
    public final <UT, UB, ET extends C14253cc.C14255b<ET>> void mo36826l(C14436j0<UT, UB> j0Var, C14517m3<ET> m3Var, T t, C14475k6 k6Var, C14787v2 v2Var) {
        UB b = j0Var.mo35564b(t);
        C14253cc<ET> i = m3Var.mo35033i(t);
        do {
            try {
                if (k6Var.mo34585g1() == Integer.MAX_VALUE) {
                    j0Var.mo35576n(t, b);
                    return;
                }
            } finally {
                j0Var.mo35576n(t, b);
            }
        } while (mo36828n(k6Var, v2Var, m3Var, i, j0Var, b));
    }

    /* renamed from: m */
    public final <UT, UB> void mo36827m(C14436j0<UT, UB> j0Var, T t, C14782uf ufVar) {
        j0Var.mo35571i(j0Var.mo35573k(t), ufVar);
    }

    /* renamed from: n */
    public final <UT, UB, ET extends C14253cc.C14255b<ET>> boolean mo36828n(C14475k6 k6Var, C14787v2 v2Var, C14517m3<ET> m3Var, C14253cc<ET> ccVar, C14436j0<UT, UB> j0Var, UB ub) {
        int o = k6Var.mo34600o();
        if (o == C14710sf.f36404a) {
            Object obj = null;
            int i = 0;
            C14719t0 t0Var = null;
            while (k6Var.mo34585g1() != Integer.MAX_VALUE) {
                int o2 = k6Var.mo34600o();
                if (o2 == C14710sf.f36406c) {
                    i = k6Var.mo34582f();
                    obj = m3Var.mo35027c(v2Var, this.f36849a, i);
                } else if (o2 == C14710sf.f36407d) {
                    if (obj != null) {
                        m3Var.mo35029e(k6Var, obj, v2Var, ccVar);
                    } else {
                        t0Var = k6Var.mo34602p();
                    }
                } else if (!k6Var.mo34589i1()) {
                    break;
                }
            }
            if (k6Var.mo34600o() == C14710sf.f36405b) {
                if (t0Var != null) {
                    if (obj != null) {
                        m3Var.mo35030f(t0Var, obj, v2Var, ccVar);
                    } else {
                        j0Var.mo35568f(ub, i, t0Var);
                    }
                }
                return true;
            }
            throw C14394h5.m62025c();
        } else if (C14710sf.m63426c(o) != 2) {
            return k6Var.mo34589i1();
        } else {
            Object c = m3Var.mo35027c(v2Var, this.f36849a, C14710sf.m63424a(o));
            if (c == null) {
                return j0Var.mo35577o(ub, k6Var);
            }
            m3Var.mo35029e(k6Var, c, v2Var, ccVar);
            return true;
        }
    }
}
