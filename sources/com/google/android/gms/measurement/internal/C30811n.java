package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n */
public final class C30811n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30667b6 f73758a;

    /* renamed from: b */
    public final /* synthetic */ C30823o f73759b;

    public C30811n(C30823o oVar, C30667b6 b6Var) {
        this.f73759b = oVar;
        this.f73758a = b6Var;
    }

    public final void run() {
        this.f73758a.mo86901b();
        if (C30673c.m123531a()) {
            this.f73758a.mo86904f().mo86950z(this);
            return;
        }
        boolean e = this.f73759b.mo87396e();
        this.f73759b.f73824c = 0;
        if (e) {
            this.f73759b.mo87340c();
        }
    }
}
