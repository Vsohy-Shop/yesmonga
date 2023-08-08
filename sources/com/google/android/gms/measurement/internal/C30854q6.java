package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.q6 */
public final class C30854q6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ long f73875a;

    /* renamed from: b */
    public final /* synthetic */ C30819n7 f73876b;

    public C30854q6(C30819n7 n7Var, long j) {
        this.f73876b = n7Var;
        this.f73875a = j;
    }

    public final void run() {
        this.f73876b.f74136a.mo87103F().f73655k.mo87097b(this.f73875a);
        this.f73876b.f74136a.mo86903d().mo87488q().mo87464b("Session timeout duration set", Long.valueOf(this.f73875a));
    }
}
