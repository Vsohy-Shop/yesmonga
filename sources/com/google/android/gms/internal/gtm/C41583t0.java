package com.google.android.gms.internal.gtm;

import java.lang.Thread;

/* renamed from: com.google.android.gms.internal.gtm.t0 */
public final class C41583t0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final /* synthetic */ C41607u0 f104968a;

    public C41583t0(C41607u0 u0Var) {
        this.f104968a = u0Var;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        C41202d4 n = this.f104968a.mo135903n();
        if (n != null) {
            n.mo135755r("Job execution failed", th);
        }
    }
}
