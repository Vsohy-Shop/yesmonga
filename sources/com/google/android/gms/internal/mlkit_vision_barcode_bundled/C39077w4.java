package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.w4 */
public final class C39077w4 implements Map.Entry, Comparable<C39077w4> {

    /* renamed from: a */
    public final Comparable f98956a;

    /* renamed from: b */
    public Object f98957b;

    /* renamed from: c */
    public final /* synthetic */ C38888c5 f98958c;

    public C39077w4(C38888c5 c5Var, Comparable comparable, Object obj) {
        this.f98958c = c5Var;
        this.f98956a = comparable;
        this.f98957b = obj;
    }

    /* renamed from: q */
    public static final boolean m160956q(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f98956a.compareTo(((C39077w4) obj).f98956a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!m160956q(this.f98956a, entry.getKey()) || !m160956q(this.f98957b, entry.getValue())) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final Comparable mo123117g() {
        return this.f98956a;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f98956a;
    }

    public final Object getValue() {
        return this.f98957b;
    }

    public final int hashCode() {
        int i;
        Comparable comparable = this.f98956a;
        int i2 = 0;
        if (comparable == null) {
            i = 0;
        } else {
            i = comparable.hashCode();
        }
        Object obj = this.f98957b;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return i ^ i2;
    }

    public final Object setValue(Object obj) {
        this.f98958c.mo122826p();
        Object obj2 = this.f98957b;
        this.f98957b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f98956a);
        String valueOf2 = String.valueOf(this.f98957b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
