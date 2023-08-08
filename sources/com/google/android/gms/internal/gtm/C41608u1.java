package com.google.android.gms.internal.gtm;

import android.os.Looper;

/* renamed from: com.google.android.gms.internal.gtm.u1 */
public final class C41608u1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C41632v1 f105044a;

    public C41608u1(C41632v1 v1Var) {
        this.f105044a = v1Var;
    }

    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f105044a.f105092a.mo135894d().mo133262i(this);
            return;
        }
        boolean h = this.f105044a.mo135958h();
        this.f105044a.f105094c = 0;
        if (h) {
            this.f105044a.mo135393a();
        }
    }
}
