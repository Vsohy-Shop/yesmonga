package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.b */
public final class C41867b {

    /* renamed from: a */
    public String f106012a;

    /* renamed from: b */
    public final long f106013b;

    /* renamed from: c */
    public final Map f106014c;

    public C41867b(String str, long j, Map map) {
        this.f106012a = str;
        this.f106013b = j;
        HashMap hashMap = new HashMap();
        this.f106014c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    /* renamed from: a */
    public final long mo136586a() {
        return this.f106013b;
    }

    /* renamed from: b */
    public final C41867b clone() {
        return new C41867b(this.f106012a, this.f106013b, new HashMap(this.f106014c));
    }

    /* renamed from: c */
    public final Object mo136588c(String str) {
        if (this.f106014c.containsKey(str)) {
            return this.f106014c.get(str);
        }
        return null;
    }

    /* renamed from: d */
    public final String mo136590d() {
        return this.f106012a;
    }

    /* renamed from: e */
    public final Map mo136591e() {
        return this.f106014c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41867b)) {
            return false;
        }
        C41867b bVar = (C41867b) obj;
        if (this.f106013b == bVar.f106013b && this.f106012a.equals(bVar.f106012a)) {
            return this.f106014c.equals(bVar.f106014c);
        }
        return false;
    }

    /* renamed from: f */
    public final void mo136593f(String str) {
        this.f106012a = str;
    }

    /* renamed from: g */
    public final void mo136594g(String str, Object obj) {
        if (obj == null) {
            this.f106014c.remove(str);
        } else {
            this.f106014c.put(str, obj);
        }
    }

    public final int hashCode() {
        long j = this.f106013b;
        return (((this.f106012a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f106014c.hashCode();
    }

    public final String toString() {
        String str = this.f106012a;
        long j = this.f106013b;
        String obj = this.f106014c.toString();
        return "Event{name='" + str + "', timestamp=" + j + ", params=" + obj + "}";
    }
}
