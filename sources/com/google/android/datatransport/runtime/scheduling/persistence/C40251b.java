package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.C40190j;
import com.google.android.datatransport.runtime.C40203r;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.b */
public final class C40251b extends C40273k {

    /* renamed from: a */
    public final long f102585a;

    /* renamed from: b */
    public final C40203r f102586b;

    /* renamed from: c */
    public final C40190j f102587c;

    public C40251b(long j, C40203r rVar, C40190j jVar) {
        this.f102585a = j;
        if (rVar != null) {
            this.f102586b = rVar;
            if (jVar != null) {
                this.f102587c = jVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    /* renamed from: b */
    public C40190j mo132917b() {
        return this.f102587c;
    }

    /* renamed from: c */
    public long mo132918c() {
        return this.f102585a;
    }

    /* renamed from: d */
    public C40203r mo132919d() {
        return this.f102586b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C40273k)) {
            return false;
        }
        C40273k kVar = (C40273k) obj;
        if (this.f102585a != kVar.mo132918c() || !this.f102586b.equals(kVar.mo132919d()) || !this.f102587c.equals(kVar.mo132917b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f102585a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f102586b.hashCode()) * 1000003) ^ this.f102587c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f102585a + ", transportContext=" + this.f102586b + ", event=" + this.f102587c + "}";
    }
}
