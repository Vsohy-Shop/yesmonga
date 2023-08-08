package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.t1 */
public final class C40626t1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40632u1 f103569a;

    public C40626t1(C40632u1 u1Var) {
        this.f103569a = u1Var;
    }

    public final void run() {
        C40637v1 v1Var = this.f103569a.f103584a;
        v1Var.f103590o.mo133672d(v1Var.f103590o.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
