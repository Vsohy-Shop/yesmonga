package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.u6 */
public final class C30902u6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ long f73991a;

    /* renamed from: b */
    public final /* synthetic */ C30819n7 f73992b;

    public C30902u6(C30819n7 n7Var, long j) {
        this.f73992b = n7Var;
        this.f73991a = j;
    }

    public final void run() {
        this.f73992b.mo87339z(this.f73991a, true);
        this.f73992b.f74136a.mo87108L().mo87031S(new AtomicReference());
    }
}
