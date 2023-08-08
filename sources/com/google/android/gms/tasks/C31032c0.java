package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.c0 */
public final class C31032c0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31047k f74288a;

    /* renamed from: b */
    public final /* synthetic */ C31034d0 f74289b;

    public C31032c0(C31034d0 d0Var, C31047k kVar) {
        this.f74289b = d0Var;
        this.f74288a = kVar;
    }

    public final void run() {
        synchronized (this.f74289b.f74291b) {
            C31034d0 d0Var = this.f74289b;
            if (d0Var.f74292c != null) {
                d0Var.f74292c.onComplete(this.f74288a);
            }
        }
    }
}
