package com.contentsquare.android.sdk;

/* renamed from: com.contentsquare.android.sdk.a0 */
public final class C14166a0 {

    /* renamed from: a */
    public final long f35031a;

    /* renamed from: b */
    public final long f35032b;

    public C14166a0(long j, long j2) {
        this.f35031a = j;
        this.f35032b = j2;
    }

    /* renamed from: a */
    public final long mo34477a() {
        return this.f35031a;
    }

    /* renamed from: b */
    public final long mo34478b() {
        return this.f35032b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14166a0)) {
            return false;
        }
        C14166a0 a0Var = (C14166a0) obj;
        return this.f35031a == a0Var.f35031a && this.f35032b == a0Var.f35032b;
    }

    public int hashCode() {
        return (Long.hashCode(this.f35031a) * 31) + Long.hashCode(this.f35032b);
    }

    public String toString() {
        long j = this.f35031a;
        long j2 = this.f35032b;
        return "PerceptualHash(alphaHash=" + j + ", colorHash=" + j2 + ")";
    }
}
