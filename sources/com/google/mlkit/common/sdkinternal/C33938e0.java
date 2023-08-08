package com.google.mlkit.common.sdkinternal;

/* renamed from: com.google.mlkit.common.sdkinternal.e0 */
public final /* synthetic */ class C33938e0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C33971p f82357a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f82358b;

    public /* synthetic */ C33938e0(C33971p pVar, Runnable runnable) {
        this.f82357a = pVar;
        this.f82358b = runnable;
    }

    public final void run() {
        C33971p pVar = this.f82357a;
        Runnable runnable = this.f82358b;
        C33946i0 i0Var = new C33946i0(pVar, (C33944h0) null);
        try {
            runnable.run();
            i0Var.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
