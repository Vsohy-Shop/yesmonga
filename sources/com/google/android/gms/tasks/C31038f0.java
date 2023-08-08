package com.google.android.gms.tasks;

import androidx.annotation.C0359n0;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.tasks.f0 */
public final class C31038f0 implements C31048k0 {

    /* renamed from: a */
    public final Executor f74295a;

    /* renamed from: b */
    public final Object f74296b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c */
    public C31037f f74297c;

    public C31038f0(@C0359n0 Executor executor, @C0359n0 C31037f fVar) {
        this.f74295a = executor;
        this.f74297c = fVar;
    }

    /* renamed from: b */
    public final void mo87710b(@C0359n0 C31047k kVar) {
        if (!kVar.mo87738v() && !kVar.mo87736t()) {
            synchronized (this.f74296b) {
                if (this.f74297c != null) {
                    this.f74295a.execute(new C31036e0(this, kVar));
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo87711d() {
        synchronized (this.f74296b) {
            this.f74297c = null;
        }
    }
}
