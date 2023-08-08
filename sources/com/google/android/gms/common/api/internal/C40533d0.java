package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.C0344h1;
import androidx.annotation.C0353k0;
import java.util.ArrayList;
import java.util.List;

@C0344h1(otherwise = 2)
/* renamed from: com.google.android.gms.common.api.internal.d0 */
public final class C40533d0 extends LifecycleCallback {

    /* renamed from: b */
    public List f103338b = new ArrayList();

    public C40533d0(C40587m mVar) {
        super(mVar);
        this.f103291a.mo133930o("LifecycleObserverOnStop", this);
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ C40533d0 m164964m(Activity activity) {
        C40533d0 d0Var;
        synchronized (activity) {
            C40587m c = LifecycleCallback.m164865c(activity);
            d0Var = (C40533d0) c.mo133938x("LifecycleObserverOnStop", C40533d0.class);
            if (d0Var == null) {
                d0Var = new C40533d0(c);
            }
        }
        return d0Var;
    }

    @C0353k0
    /* renamed from: l */
    public final void mo87750l() {
        List<Runnable> list;
        synchronized (this) {
            list = this.f103338b;
            this.f103338b = new ArrayList();
        }
        for (Runnable run : list) {
            run.run();
        }
    }

    /* renamed from: o */
    public final synchronized void mo133864o(Runnable runnable) {
        this.f103338b.add(runnable);
    }
}
