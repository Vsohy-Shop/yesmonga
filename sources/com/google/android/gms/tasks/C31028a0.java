package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.a0 */
public final class C31028a0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31030b0 f74283a;

    public C31028a0(C31030b0 b0Var) {
        this.f74283a = b0Var;
    }

    public final void run() {
        synchronized (this.f74283a.f74286b) {
            C31030b0 b0Var = this.f74283a;
            if (b0Var.f74287c != null) {
                b0Var.f74287c.onCanceled();
            }
        }
    }
}
