package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.o9 */
public final /* synthetic */ class C30833o9 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30845p9 f73835a;

    public /* synthetic */ C30833o9(C30845p9 p9Var) {
        this.f73835a = p9Var;
    }

    public final void run() {
        C30845p9 p9Var = this.f73835a;
        C30857q9 q9Var = p9Var.f73861c;
        long j = p9Var.f73859a;
        long j2 = p9Var.f73860b;
        q9Var.f73884b.mo86866h();
        q9Var.f73884b.f74136a.mo86903d().mo87488q().mo87463a("Application going to the background");
        q9Var.f73884b.f74136a.mo87103F().f73662r.mo87051a(true);
        Bundle bundle = new Bundle();
        if (!q9Var.f73884b.f74136a.mo87130z().mo87072D()) {
            q9Var.f73884b.f74006e.mo87472b(j2);
            q9Var.f73884b.f74006e.mo87474d(false, false, j2);
        }
        q9Var.f73884b.f74136a.mo87105I().mo87335v("auto", "_ab", j, bundle);
    }
}
