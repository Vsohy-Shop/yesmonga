package com.google.android.gms.tasks;

import androidx.annotation.C0359n0;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.tasks.h0 */
public final class C31042h0 implements C31048k0 {

    /* renamed from: a */
    public final Executor f74300a;

    /* renamed from: b */
    public final Object f74301b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c */
    public C31039g f74302c;

    public C31042h0(@C0359n0 Executor executor, @C0359n0 C31039g gVar) {
        this.f74300a = executor;
        this.f74302c = gVar;
    }

    /* renamed from: b */
    public final void mo87710b(@C0359n0 C31047k kVar) {
        if (kVar.mo87738v()) {
            synchronized (this.f74301b) {
                if (this.f74302c != null) {
                    this.f74300a.execute(new C31040g0(this, kVar));
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo87711d() {
        synchronized (this.f74301b) {
            this.f74302c = null;
        }
    }
}
