package com.contentsquare.android.sdk;

/* renamed from: com.contentsquare.android.sdk.s1 */
public class C14693s1 {

    /* renamed from: a */
    public final C14453jf f36367a = new C14453jf("SessionAndScreenNumberState");

    /* renamed from: b */
    public boolean f36368b;

    /* renamed from: c */
    public long f36369c;

    /* renamed from: d */
    public long f36370d;

    /* renamed from: e */
    public long f36371e;

    /* renamed from: f */
    public long f36372f;

    /* renamed from: g */
    public final C14213b7 f36373g;

    /* renamed from: h */
    public final C14601of f36374h;

    /* renamed from: i */
    public boolean f36375i;

    /* renamed from: j */
    public boolean f36376j;

    public C14693s1(C14213b7 b7Var, C14601of ofVar) {
        this.f36373g = b7Var;
        this.f36374h = ofVar;
        mo36373e();
    }

    /* renamed from: a */
    public synchronized long mo36369a() {
        return this.f36370d;
    }

    /* renamed from: b */
    public synchronized long mo36370b() {
        return this.f36369c;
    }

    /* renamed from: c */
    public synchronized boolean mo36371c() {
        return this.f36376j;
    }

    /* renamed from: d */
    public synchronized boolean mo36372d() {
        return this.f36375i;
    }

    /* renamed from: e */
    public final void mo36373e() {
        this.f36369c = (long) this.f36373g.mo34670b(C14477k8.SESSION_ID, 1);
        this.f36370d = (long) this.f36374h.mo36126a();
        this.f36367a.mo35674c("Read mSessionNumber = %d and mScreenNumber = %d", Long.valueOf(this.f36369c), Long.valueOf(this.f36370d));
    }

    /* renamed from: f */
    public synchronized void mo36374f() {
        mo36373e();
        long j = this.f36371e;
        long j2 = this.f36369c;
        boolean z = false;
        this.f36375i = j != j2;
        long j3 = this.f36372f;
        long j4 = this.f36370d;
        if (j3 != j4) {
            z = true;
        }
        this.f36376j = z;
        this.f36371e = j2;
        this.f36372f = j4;
        this.f36368b = true;
    }
}
