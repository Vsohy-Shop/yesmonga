package com.google.android.datatransport.cct.internal;

/* renamed from: com.google.android.datatransport.cct.internal.h */
public final class C40073h extends C40082m {

    /* renamed from: b */
    public final long f102274b;

    public C40073h(long j) {
        this.f102274b = j;
    }

    /* renamed from: c */
    public long mo132657c() {
        return this.f102274b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C40082m)) {
            return false;
        }
        if (this.f102274b == ((C40082m) obj).mo132657c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f102274b;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f102274b + "}";
    }
}
