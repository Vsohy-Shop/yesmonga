package com.contentsquare.android.sdk;

/* renamed from: com.contentsquare.android.sdk.p1 */
public class C14604p1 {

    /* renamed from: a */
    public final long[] f36154a;

    /* renamed from: b */
    public final C14370g7 f36155b;

    /* renamed from: c */
    public int f36156c = 0;

    /* renamed from: d */
    public long f36157d;

    /* renamed from: e */
    public boolean f36158e;

    public C14604p1(C14370g7 g7Var, int i) {
        this.f36155b = g7Var;
        this.f36154a = new long[i];
    }

    /* renamed from: a */
    public void mo36129a() {
        this.f36156c = 0;
        this.f36158e = false;
    }

    /* renamed from: b */
    public long mo36130b() {
        if (!this.f36158e) {
            return -1;
        }
        long j = 0;
        for (long j2 : this.f36154a) {
            j += j2;
        }
        return j / ((long) this.f36154a.length);
    }

    /* renamed from: c */
    public void mo36131c() {
        this.f36157d = this.f36155b.mo35362a();
    }

    /* renamed from: d */
    public void mo36132d() {
        this.f36154a[this.f36156c] = this.f36155b.mo35362a() - this.f36157d;
        int i = this.f36156c + 1;
        this.f36156c = i;
        if (i >= this.f36154a.length) {
            this.f36156c = 0;
            this.f36158e = true;
        }
    }
}
