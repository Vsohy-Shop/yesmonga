package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.i0 */
public final class C31044i0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31047k f74303a;

    /* renamed from: b */
    public final /* synthetic */ C31046j0 f74304b;

    public C31044i0(C31046j0 j0Var, C31047k kVar) {
        this.f74304b = j0Var;
        this.f74303a = kVar;
    }

    public final void run() {
        try {
            C31047k a = this.f74304b.f74306b.mo87716a(this.f74303a.mo87734r());
            if (a == null) {
                this.f74304b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C31051m.f74313b;
            a.mo87728l(executor, this.f74304b);
            a.mo87725i(executor, this.f74304b);
            a.mo87719c(executor, this.f74304b);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f74304b.onFailure((Exception) e.getCause());
            } else {
                this.f74304b.onFailure(e);
            }
        } catch (CancellationException unused) {
            this.f74304b.onCanceled();
        } catch (Exception e2) {
            this.f74304b.onFailure(e2);
        }
    }
}
