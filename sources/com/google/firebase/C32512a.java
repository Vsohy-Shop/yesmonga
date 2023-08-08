package com.google.firebase;

/* renamed from: com.google.firebase.a */
public final class C32512a extends C33277p {

    /* renamed from: a */
    public final long f78838a;

    /* renamed from: b */
    public final long f78839b;

    /* renamed from: c */
    public final long f78840c;

    public C32512a(long j, long j2, long j3) {
        this.f78838a = j;
        this.f78839b = j2;
        this.f78840c = j3;
    }

    /* renamed from: b */
    public long mo94598b() {
        return this.f78839b;
    }

    /* renamed from: c */
    public long mo94599c() {
        return this.f78838a;
    }

    /* renamed from: d */
    public long mo94600d() {
        return this.f78840c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C33277p)) {
            return false;
        }
        C33277p pVar = (C33277p) obj;
        if (this.f78838a == pVar.mo94599c() && this.f78839b == pVar.mo94598b() && this.f78840c == pVar.mo94600d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f78838a;
        long j2 = this.f78839b;
        long j3 = this.f78840c;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f78838a + ", elapsedRealtime=" + this.f78839b + ", uptimeMillis=" + this.f78840c + "}";
    }
}
