package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.t6 */
public final class C30890t6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f73963a;

    /* renamed from: b */
    public final /* synthetic */ boolean f73964b;

    /* renamed from: c */
    public final /* synthetic */ C30819n7 f73965c;

    public C30890t6(C30819n7 n7Var, AtomicReference atomicReference, boolean z) {
        this.f73965c = n7Var;
        this.f73963a = atomicReference;
        this.f73964b = z;
    }

    public final void run() {
        this.f73965c.f74136a.mo87108L().mo87034V(this.f73963a, this.f73964b);
    }
}
