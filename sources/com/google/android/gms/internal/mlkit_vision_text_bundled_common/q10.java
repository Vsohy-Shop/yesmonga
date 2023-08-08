package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Map;

public final class q10 implements Map.Entry, Comparable<q10> {

    /* renamed from: a */
    public final Comparable f71416a;

    /* renamed from: b */
    public Object f71417b;

    /* renamed from: c */
    public final /* synthetic */ C29245g f71418c;

    public q10(C29245g gVar, Comparable comparable, Object obj) {
        this.f71418c = gVar;
        this.f71416a = comparable;
        this.f71417b = obj;
    }

    /* renamed from: q */
    public static final boolean m120916q(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f71416a.compareTo(((q10) obj).f71416a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!m120916q(this.f71416a, entry.getKey()) || !m120916q(this.f71417b, entry.getValue())) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final Comparable mo84797g() {
        return this.f71416a;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f71416a;
    }

    public final Object getValue() {
        return this.f71417b;
    }

    public final int hashCode() {
        int i;
        Comparable comparable = this.f71416a;
        int i2 = 0;
        if (comparable == null) {
            i = 0;
        } else {
            i = comparable.hashCode();
        }
        Object obj = this.f71417b;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return i ^ i2;
    }

    public final Object setValue(Object obj) {
        this.f71418c.mo84630p();
        Object obj2 = this.f71417b;
        this.f71417b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f71416a);
        String valueOf2 = String.valueOf(this.f71417b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
