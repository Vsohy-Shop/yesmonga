package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z8 */
public final class C30964z8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30779k3 f74144a;

    /* renamed from: b */
    public final /* synthetic */ C30683c9 f74145b;

    public C30964z8(C30683c9 c9Var, C30779k3 k3Var) {
        this.f74145b = c9Var;
        this.f74144a = k3Var;
    }

    public final void run() {
        synchronized (this.f74145b) {
            this.f74145b.f73267c = false;
            if (!this.f74145b.f73269e.mo87048z()) {
                this.f74145b.f73269e.f74136a.mo86903d().mo87488q().mo87463a("Connected to remote service");
                this.f74145b.f73269e.mo87046x(this.f74144a);
            }
        }
    }
}
