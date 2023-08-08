package com.google.android.gms.common.api.internal;

import androidx.annotation.C0348i1;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.z0 */
public abstract class C40656z0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40515a1 f103617a;

    public /* synthetic */ C40656z0(C40515a1 a1Var, C40651y0 y0Var) {
        this.f103617a = a1Var;
    }

    @C0348i1
    /* renamed from: a */
    public abstract void mo134023a();

    @C0348i1
    public final void run() {
        Lock z;
        this.f103617a.f103300b.lock();
        try {
            if (Thread.interrupted()) {
                z = this.f103617a.f103300b;
            } else {
                mo134023a();
                z = this.f103617a.f103300b;
            }
        } catch (RuntimeException e) {
            this.f103617a.f103299a.mo133999g(e);
            z = this.f103617a.f103300b;
        } catch (Throwable th) {
            this.f103617a.f103300b.unlock();
            throw th;
        }
        z.unlock();
    }
}
