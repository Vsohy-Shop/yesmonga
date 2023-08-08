package com.google.android.gms.tasks;

import androidx.annotation.C0359n0;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.j0 */
public final class C31046j0<TResult, TContinuationResult> implements C31039g<TContinuationResult>, C31037f, C31033d, C31048k0 {

    /* renamed from: a */
    public final Executor f74305a;

    /* renamed from: b */
    public final C31045j f74306b;

    /* renamed from: c */
    public final C31060q0 f74307c;

    public C31046j0(@C0359n0 Executor executor, @C0359n0 C31045j jVar, @C0359n0 C31060q0 q0Var) {
        this.f74305a = executor;
        this.f74306b = jVar;
        this.f74307c = q0Var;
    }

    /* renamed from: a */
    public final void mo82228a(TContinuationResult tcontinuationresult) {
        this.f74307c.mo87760z(tcontinuationresult);
    }

    /* renamed from: b */
    public final void mo87710b(@C0359n0 C31047k kVar) {
        this.f74305a.execute(new C31044i0(this, kVar));
    }

    /* renamed from: d */
    public final void mo87711d() {
        throw new UnsupportedOperationException();
    }

    public final void onCanceled() {
        this.f74307c.mo87752A();
    }

    public final void onFailure(@C0359n0 Exception exc) {
        this.f74307c.mo87759y(exc);
    }
}
