package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.f7 */
public final class C30720f7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f73389a;

    /* renamed from: b */
    public final /* synthetic */ C30819n7 f73390b;

    public C30720f7(C30819n7 n7Var, AtomicReference atomicReference) {
        this.f73390b = n7Var;
        this.f73389a = atomicReference;
    }

    public final void run() {
        synchronized (this.f73389a) {
            try {
                this.f73389a.set(Integer.valueOf(this.f73390b.f74136a.mo87130z().mo87082o(this.f73390b.f74136a.mo87099B().mo87246s(), C30742h3.f73510P)));
                this.f73389a.notify();
            } catch (Throwable th) {
                this.f73389a.notify();
                throw th;
            }
        }
    }
}
