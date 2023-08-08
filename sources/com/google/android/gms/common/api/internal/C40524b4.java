package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.b4 */
public final class C40524b4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40541e0 f103324a;

    public C40524b4(C40541e0 e0Var) {
        this.f103324a = e0Var;
    }

    public final void run() {
        this.f103324a.f103358z.lock();
        try {
            C40541e0.m164987C(this.f103324a);
        } finally {
            this.f103324a.f103358z.unlock();
        }
    }
}
