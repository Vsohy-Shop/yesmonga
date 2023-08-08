package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.c7 */
public final class C30681c7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f73255a;

    /* renamed from: b */
    public final /* synthetic */ C30819n7 f73256b;

    public C30681c7(C30819n7 n7Var, AtomicReference atomicReference) {
        this.f73256b = n7Var;
        this.f73255a = atomicReference;
    }

    public final void run() {
        synchronized (this.f73255a) {
            try {
                this.f73255a.set(this.f73256b.f74136a.mo87130z().mo87091x(this.f73256b.f74136a.mo87099B().mo87246s(), C30742h3.f73508N));
                this.f73255a.notify();
            } catch (Throwable th) {
                this.f73255a.notify();
                throw th;
            }
        }
    }
}
