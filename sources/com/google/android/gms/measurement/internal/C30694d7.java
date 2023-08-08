package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.d7 */
public final class C30694d7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f73330a;

    /* renamed from: b */
    public final /* synthetic */ C30819n7 f73331b;

    public C30694d7(C30819n7 n7Var, AtomicReference atomicReference) {
        this.f73331b = n7Var;
        this.f73330a = atomicReference;
    }

    public final void run() {
        synchronized (this.f73330a) {
            try {
                this.f73330a.set(Long.valueOf(this.f73331b.f74136a.mo87130z().mo87085r(this.f73331b.f74136a.mo87099B().mo87246s(), C30742h3.f73509O)));
                this.f73330a.notify();
            } catch (Throwable th) {
                this.f73330a.notify();
                throw th;
            }
        }
    }
}
