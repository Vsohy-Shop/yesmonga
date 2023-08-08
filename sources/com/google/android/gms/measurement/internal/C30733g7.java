package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.g7 */
public final class C30733g7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f73460a;

    /* renamed from: b */
    public final /* synthetic */ C30819n7 f73461b;

    public C30733g7(C30819n7 n7Var, AtomicReference atomicReference) {
        this.f73461b = n7Var;
        this.f73460a = atomicReference;
    }

    public final void run() {
        synchronized (this.f73460a) {
            try {
                this.f73460a.set(Double.valueOf(this.f73461b.f74136a.mo87130z().mo87078k(this.f73461b.f74136a.mo87099B().mo87246s(), C30742h3.f73511Q)));
                this.f73460a.notify();
            } catch (Throwable th) {
                this.f73460a.notify();
                throw th;
            }
        }
    }
}
