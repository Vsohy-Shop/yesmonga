package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.tasks.t0 */
public final class C31066t0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31060q0 f74331a;

    /* renamed from: b */
    public final /* synthetic */ Callable f74332b;

    public C31066t0(C31060q0 q0Var, Callable callable) {
        this.f74331a = q0Var;
        this.f74332b = callable;
    }

    public final void run() {
        try {
            this.f74331a.mo87760z(this.f74332b.call());
        } catch (Exception e) {
            this.f74331a.mo87759y(e);
        } catch (Throwable th) {
            this.f74331a.mo87759y(new RuntimeException(th));
        }
    }
}
