package com.google.android.gms.measurement.internal;

import androidx.annotation.C0348i1;

/* renamed from: com.google.android.gms.measurement.internal.q9 */
public final class C30857q9 {

    /* renamed from: a */
    public C30845p9 f73883a;

    /* renamed from: b */
    public final /* synthetic */ C30905u9 f73884b;

    public C30857q9(C30905u9 u9Var) {
        this.f73884b = u9Var;
    }

    @C0348i1
    /* renamed from: a */
    public final void mo87447a(long j) {
        this.f73883a = new C30845p9(this, this.f73884b.f74136a.mo86900a().mo134768a(), j);
        this.f73884b.f74004c.postDelayed(this.f73883a, 2000);
    }

    @C0348i1
    /* renamed from: b */
    public final void mo87448b() {
        this.f73884b.mo86866h();
        C30845p9 p9Var = this.f73883a;
        if (p9Var != null) {
            this.f73884b.f74004c.removeCallbacks(p9Var);
        }
        this.f73884b.f74136a.mo87103F().f73662r.mo87051a(false);
    }
}
