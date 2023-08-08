package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.y */
public final class C31071y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31047k f74347a;

    /* renamed from: b */
    public final /* synthetic */ C31072z f74348b;

    public C31071y(C31072z zVar, C31047k kVar) {
        this.f74348b = zVar;
        this.f74347a = kVar;
    }

    public final void run() {
        try {
            C31047k kVar = (C31047k) this.f74348b.f74350b.mo85756a(this.f74347a);
            if (kVar == null) {
                this.f74348b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C31051m.f74313b;
            kVar.mo87728l(executor, this.f74348b);
            kVar.mo87725i(executor, this.f74348b);
            kVar.mo87719c(executor, this.f74348b);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f74348b.f74351c.mo87759y((Exception) e.getCause());
            } else {
                this.f74348b.f74351c.mo87759y(e);
            }
        } catch (Exception e2) {
            this.f74348b.f74351c.mo87759y(e2);
        }
    }
}
