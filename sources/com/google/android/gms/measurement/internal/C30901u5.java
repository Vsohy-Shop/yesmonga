package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.u5 */
public final class C30901u5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzli f73988a;

    /* renamed from: b */
    public final /* synthetic */ zzq f73989b;

    /* renamed from: c */
    public final /* synthetic */ C30949y5 f73990c;

    public C30901u5(C30949y5 y5Var, zzli zzli, zzq zzq) {
        this.f73990c = y5Var;
        this.f73988a = zzli;
        this.f73989b = zzq;
    }

    public final void run() {
        this.f73990c.f74111n.mo87367e();
        if (this.f73988a.mo87644M() == null) {
            this.f73990c.f74111n.mo87388u(this.f73988a.f74168b, this.f73989b);
        } else {
            this.f73990c.f74111n.mo87343B(this.f73988a, this.f73989b);
        }
    }
}
