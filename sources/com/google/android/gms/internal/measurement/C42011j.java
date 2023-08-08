package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.j */
public abstract class C42011j implements C42133q, C42065m {

    /* renamed from: a */
    public final String f106229a;

    /* renamed from: b */
    public final Map f106230b = new HashMap();

    public C42011j(String str) {
        this.f106229a = str;
    }

    /* renamed from: I0 */
    public final C42133q mo136728I0(String str) {
        if (this.f106230b.containsKey(str)) {
            return (C42133q) this.f106230b.get(str);
        }
        return C42133q.f106351H;
    }

    /* renamed from: a */
    public abstract C42133q mo136725a(C41909d5 d5Var, List list);

    /* renamed from: b */
    public final String mo137042b() {
        return this.f106229a;
    }

    /* renamed from: e */
    public C42133q mo136734e() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42011j)) {
            return false;
        }
        C42011j jVar = (C42011j) obj;
        String str = this.f106229a;
        if (str != null) {
            return str.equals(jVar.f106229a);
        }
        return false;
    }

    /* renamed from: h */
    public final Boolean mo136738h() {
        return Boolean.TRUE;
    }

    public final int hashCode() {
        String str = this.f106229a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* renamed from: i */
    public final C42133q mo136741i(String str, C41909d5 d5Var, List list) {
        if ("toString".equals(str)) {
            return new C42201u(this.f106229a);
        }
        return C42029k.m170426a(this, new C42201u(str), d5Var, list);
    }

    /* renamed from: j */
    public final Double mo136743j() {
        return Double.valueOf(Double.NaN);
    }

    /* renamed from: k */
    public final String mo136744k() {
        return this.f106229a;
    }

    /* renamed from: q */
    public final Iterator mo136745q() {
        return C42029k.m170427b(this.f106230b);
    }

    /* renamed from: r */
    public final boolean mo136746r(String str) {
        return this.f106230b.containsKey(str);
    }

    /* renamed from: w */
    public final void mo136748w(String str, C42133q qVar) {
        if (qVar == null) {
            this.f106230b.remove(str);
        } else {
            this.f106230b.put(str, qVar);
        }
    }
}
