package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.l1 */
public abstract class C40584l1 {

    /* renamed from: a */
    public final C40579k1 f103479a;

    public C40584l1(C40579k1 k1Var) {
        this.f103479a = k1Var;
    }

    /* renamed from: a */
    public abstract void mo133980a();

    /* renamed from: b */
    public final void mo133981b(C40596n1 n1Var) {
        Lock b;
        n1Var.f103498n.lock();
        try {
            if (n1Var.f103508x != this.f103479a) {
                b = n1Var.f103498n;
            } else {
                mo133980a();
                b = n1Var.f103498n;
            }
            b.unlock();
        } catch (Throwable th) {
            n1Var.f103498n.unlock();
            throw th;
        }
    }
}
