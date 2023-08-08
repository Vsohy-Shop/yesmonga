package com.google.android.play.core.internal;

import com.google.android.play.core.listener.C32110a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.play.core.internal.j */
public final class C32059j<StateT> {

    /* renamed from: a */
    public final Set<C32110a<StateT>> f78270a = new HashSet();

    /* renamed from: a */
    public final synchronized void mo92766a(C32110a<StateT> aVar) {
        this.f78270a.add(aVar);
    }

    /* renamed from: b */
    public final synchronized void mo92767b(C32110a<StateT> aVar) {
        this.f78270a.remove(aVar);
    }

    /* renamed from: c */
    public final synchronized void mo92768c(StateT statet) {
        for (C32110a<StateT> a : this.f78270a) {
            a.mo92474a(statet);
        }
    }
}
