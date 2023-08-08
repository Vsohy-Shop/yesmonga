package androidx.camera.core.impl.utils;

import androidx.annotation.C0359n0;

/* renamed from: androidx.camera.core.impl.utils.h */
public final class C1564h {

    /* renamed from: a */
    public final long f4466a;

    /* renamed from: b */
    public final long f4467b;

    public C1564h(long j, long j2) {
        this.f4466a = j;
        this.f4467b = j2;
    }

    /* renamed from: a */
    public long mo5516a() {
        return this.f4467b;
    }

    /* renamed from: b */
    public long mo5517b() {
        return this.f4466a;
    }

    /* renamed from: c */
    public double mo5518c() {
        return ((double) this.f4466a) / ((double) this.f4467b);
    }

    @C0359n0
    public String toString() {
        return this.f4466a + "/" + this.f4467b;
    }

    public C1564h(double d) {
        this((long) (d * 10000.0d), 10000);
    }
}
