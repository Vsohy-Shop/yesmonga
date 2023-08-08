package com.google.android.gms.tasks;

import androidx.annotation.C0359n0;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.tasks.d0 */
public final class C31034d0 implements C31048k0 {

    /* renamed from: a */
    public final Executor f74290a;

    /* renamed from: b */
    public final Object f74291b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c */
    public C31035e f74292c;

    public C31034d0(@C0359n0 Executor executor, @C0359n0 C31035e eVar) {
        this.f74290a = executor;
        this.f74292c = eVar;
    }

    /* renamed from: b */
    public final void mo87710b(@C0359n0 C31047k kVar) {
        synchronized (this.f74291b) {
            if (this.f74292c != null) {
                this.f74290a.execute(new C31032c0(this, kVar));
            }
        }
    }

    /* renamed from: d */
    public final void mo87711d() {
        synchronized (this.f74291b) {
            this.f74292c = null;
        }
    }
}
