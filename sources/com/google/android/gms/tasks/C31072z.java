package com.google.android.gms.tasks;

import androidx.annotation.C0359n0;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.z */
public final class C31072z<TResult, TContinuationResult> implements C31039g<TContinuationResult>, C31037f, C31033d, C31048k0 {

    /* renamed from: a */
    public final Executor f74349a;

    /* renamed from: b */
    public final C31031c f74350b;

    /* renamed from: c */
    public final C31060q0 f74351c;

    public C31072z(@C0359n0 Executor executor, @C0359n0 C31031c cVar, @C0359n0 C31060q0 q0Var) {
        this.f74349a = executor;
        this.f74350b = cVar;
        this.f74351c = q0Var;
    }

    /* renamed from: a */
    public final void mo82228a(TContinuationResult tcontinuationresult) {
        this.f74351c.mo87760z(tcontinuationresult);
    }

    /* renamed from: b */
    public final void mo87710b(@C0359n0 C31047k kVar) {
        this.f74349a.execute(new C31071y(this, kVar));
    }

    /* renamed from: d */
    public final void mo87711d() {
        throw new UnsupportedOperationException();
    }

    public final void onCanceled() {
        this.f74351c.mo87752A();
    }

    public final void onFailure(@C0359n0 Exception exc) {
        this.f74351c.mo87759y(exc);
    }
}
