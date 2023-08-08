package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.y6 */
public final class C30950y6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f74114a;

    /* renamed from: b */
    public final /* synthetic */ C30819n7 f74115b;

    public C30950y6(C30819n7 n7Var, AtomicReference atomicReference) {
        this.f74115b = n7Var;
        this.f74114a = atomicReference;
    }

    public final void run() {
        synchronized (this.f74114a) {
            try {
                this.f74114a.set(Boolean.valueOf(this.f74115b.f74136a.mo87130z().mo87070B(this.f74115b.f74136a.mo87099B().mo87246s(), C30742h3.f73507M)));
                this.f74114a.notify();
            } catch (Throwable th) {
                this.f74114a.notify();
                throw th;
            }
        }
    }
}
