package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.i1 */
public final class C40566i1 extends C40522b2 {

    /* renamed from: a */
    public final WeakReference f103421a;

    public C40566i1(C40572j1 j1Var) {
        this.f103421a = new WeakReference(j1Var);
    }

    /* renamed from: a */
    public final void mo133839a() {
        C40572j1 j1Var = (C40572j1) this.f103421a.get();
        if (j1Var != null) {
            C40572j1.m165151P(j1Var);
        }
    }
}
