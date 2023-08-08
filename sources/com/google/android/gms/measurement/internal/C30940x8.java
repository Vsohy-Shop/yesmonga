package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.x8 */
public final class C30940x8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30779k3 f74093a;

    /* renamed from: b */
    public final /* synthetic */ C30683c9 f74094b;

    public C30940x8(C30683c9 c9Var, C30779k3 k3Var) {
        this.f74094b = c9Var;
        this.f74093a = k3Var;
    }

    public final void run() {
        synchronized (this.f74094b) {
            this.f74094b.f73267c = false;
            if (!this.f74094b.f73269e.mo87048z()) {
                this.f74094b.f73269e.f74136a.mo86903d().mo87493v().mo87463a("Connected to service");
                this.f74094b.f73269e.mo87046x(this.f74093a);
            }
        }
    }
}
