package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.g0 */
public final class C31040g0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31047k f74298a;

    /* renamed from: b */
    public final /* synthetic */ C31042h0 f74299b;

    public C31040g0(C31042h0 h0Var, C31047k kVar) {
        this.f74299b = h0Var;
        this.f74298a = kVar;
    }

    public final void run() {
        synchronized (this.f74299b.f74301b) {
            C31042h0 h0Var = this.f74299b;
            if (h0Var.f74302c != null) {
                h0Var.f74302c.mo82228a(this.f74298a.mo87734r());
            }
        }
    }
}
