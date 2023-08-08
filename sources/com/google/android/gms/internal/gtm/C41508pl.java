package com.google.android.gms.internal.gtm;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.pl */
public final class C41508pl implements Map.Entry, Comparable<C41508pl> {

    /* renamed from: a */
    public final Comparable f104887a;

    /* renamed from: b */
    public Object f104888b;

    /* renamed from: c */
    public final /* synthetic */ C41652vl f104889c;

    public C41508pl(C41652vl vlVar, Comparable comparable, Object obj) {
        this.f104889c = vlVar;
        this.f104887a = comparable;
        this.f104888b = obj;
    }

    /* renamed from: q */
    public static final boolean m168196q(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f104887a.compareTo(((C41508pl) obj).f104887a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!m168196q(this.f104887a, entry.getKey()) || !m168196q(this.f104888b, entry.getValue())) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final Comparable mo135725g() {
        return this.f104887a;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f104887a;
    }

    public final Object getValue() {
        return this.f104888b;
    }

    public final int hashCode() {
        int i;
        Comparable comparable = this.f104887a;
        int i2 = 0;
        if (comparable == null) {
            i = 0;
        } else {
            i = comparable.hashCode();
        }
        Object obj = this.f104888b;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return i ^ i2;
    }

    public final Object setValue(Object obj) {
        this.f104889c.mo136002p();
        Object obj2 = this.f104888b;
        this.f104888b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104887a);
        String valueOf2 = String.valueOf(this.f104888b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
