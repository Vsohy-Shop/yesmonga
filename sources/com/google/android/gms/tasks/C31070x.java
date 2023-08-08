package com.google.android.gms.tasks;

import androidx.annotation.C0359n0;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.x */
public final class C31070x implements C31048k0 {

    /* renamed from: a */
    public final Executor f74344a;

    /* renamed from: b */
    public final C31031c f74345b;

    /* renamed from: c */
    public final C31060q0 f74346c;

    public C31070x(@C0359n0 Executor executor, @C0359n0 C31031c cVar, @C0359n0 C31060q0 q0Var) {
        this.f74344a = executor;
        this.f74345b = cVar;
        this.f74346c = q0Var;
    }

    /* renamed from: b */
    public final void mo87710b(@C0359n0 C31047k kVar) {
        this.f74344a.execute(new C31069w(this, kVar));
    }

    /* renamed from: d */
    public final void mo87711d() {
        throw new UnsupportedOperationException();
    }
}
