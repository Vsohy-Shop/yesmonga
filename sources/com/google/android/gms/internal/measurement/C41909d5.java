package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.d5 */
public final class C41909d5 {

    /* renamed from: a */
    public final C41909d5 f106066a;

    /* renamed from: b */
    public final C42269y f106067b;

    /* renamed from: c */
    public final Map f106068c = new HashMap();

    /* renamed from: d */
    public final Map f106069d = new HashMap();

    public C41909d5(C41909d5 d5Var, C42269y yVar) {
        this.f106066a = d5Var;
        this.f106067b = yVar;
    }

    /* renamed from: a */
    public final C41909d5 mo136672a() {
        return new C41909d5(this, this.f106067b);
    }

    /* renamed from: b */
    public final C42133q mo136673b(C42133q qVar) {
        return this.f106067b.mo137477a(this, qVar);
    }

    /* renamed from: c */
    public final C42133q mo136674c(C41939f fVar) {
        C42133q qVar = C42133q.f106351H;
        Iterator Q = fVar.mo136730Q();
        while (Q.hasNext()) {
            qVar = this.f106067b.mo137477a(this, fVar.mo136727H(((Integer) Q.next()).intValue()));
            if (qVar instanceof C41975h) {
                break;
            }
        }
        return qVar;
    }

    /* renamed from: d */
    public final C42133q mo136675d(String str) {
        if (this.f106068c.containsKey(str)) {
            return (C42133q) this.f106068c.get(str);
        }
        C41909d5 d5Var = this.f106066a;
        if (d5Var != null) {
            return d5Var.mo136675d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", new Object[]{str}));
    }

    /* renamed from: e */
    public final void mo136676e(String str, C42133q qVar) {
        if (!this.f106069d.containsKey(str)) {
            if (qVar == null) {
                this.f106068c.remove(str);
            } else {
                this.f106068c.put(str, qVar);
            }
        }
    }

    /* renamed from: f */
    public final void mo136677f(String str, C42133q qVar) {
        mo136676e(str, qVar);
        this.f106069d.put(str, Boolean.TRUE);
    }

    /* renamed from: g */
    public final void mo136678g(String str, C42133q qVar) {
        C41909d5 d5Var;
        if (!this.f106068c.containsKey(str) && (d5Var = this.f106066a) != null && d5Var.mo136679h(str)) {
            this.f106066a.mo136678g(str, qVar);
        } else if (!this.f106069d.containsKey(str)) {
            if (qVar == null) {
                this.f106068c.remove(str);
            } else {
                this.f106068c.put(str, qVar);
            }
        }
    }

    /* renamed from: h */
    public final boolean mo136679h(String str) {
        if (this.f106068c.containsKey(str)) {
            return true;
        }
        C41909d5 d5Var = this.f106066a;
        if (d5Var != null) {
            return d5Var.mo136679h(str);
        }
        return false;
    }
}
