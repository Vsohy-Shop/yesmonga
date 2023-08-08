package com.google.android.gms.tasks;

import androidx.annotation.C0359n0;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.tasks.b0 */
public final class C31030b0 implements C31048k0 {

    /* renamed from: a */
    public final Executor f74285a;

    /* renamed from: b */
    public final Object f74286b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c */
    public C31033d f74287c;

    public C31030b0(@C0359n0 Executor executor, @C0359n0 C31033d dVar) {
        this.f74285a = executor;
        this.f74287c = dVar;
    }

    /* renamed from: b */
    public final void mo87710b(@C0359n0 C31047k kVar) {
        if (kVar.mo87736t()) {
            synchronized (this.f74286b) {
                if (this.f74287c != null) {
                    this.f74285a.execute(new C31028a0(this));
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo87711d() {
        synchronized (this.f74286b) {
            this.f74287c = null;
        }
    }
}
