package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a8 */
public final class C30656a8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30903u7 f73225a;

    /* renamed from: b */
    public final /* synthetic */ long f73226b;

    /* renamed from: c */
    public final /* synthetic */ C30682c8 f73227c;

    public C30656a8(C30682c8 c8Var, C30903u7 u7Var, long j) {
        this.f73227c = c8Var;
        this.f73225a = u7Var;
        this.f73226b = j;
    }

    public final void run() {
        this.f73227c.mo86920p(this.f73225a, false, this.f73226b);
        C30682c8 c8Var = this.f73227c;
        c8Var.f73259e = null;
        c8Var.f74136a.mo87108L().mo87043u((C30903u7) null);
    }
}
