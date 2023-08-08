package com.google.android.gms.internal.measurement;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.pb */
public final class C42128pb implements Map.Entry, Comparable {

    /* renamed from: a */
    public final Comparable f106339a;

    /* renamed from: b */
    public Object f106340b;

    /* renamed from: c */
    public final /* synthetic */ C42230vb f106341c;

    public C42128pb(C42230vb vbVar, Comparable comparable, Object obj) {
        this.f106341c = vbVar;
        this.f106339a = comparable;
        this.f106340b = obj;
    }

    /* renamed from: q */
    public static final boolean m170720q(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f106339a.compareTo(((C42128pb) obj).f106339a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!m170720q(this.f106339a, entry.getKey()) || !m170720q(this.f106340b, entry.getValue())) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final Comparable mo137219g() {
        return this.f106339a;
    }

    public final /* synthetic */ Object getKey() {
        return this.f106339a;
    }

    public final Object getValue() {
        return this.f106340b;
    }

    public final int hashCode() {
        Comparable comparable = this.f106339a;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f106340b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f106341c.mo137387p();
        Object obj2 = this.f106340b;
        this.f106340b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f106339a);
        String valueOf2 = String.valueOf(this.f106340b);
        return valueOf + "=" + valueOf2;
    }
}
