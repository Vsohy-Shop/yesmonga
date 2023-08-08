package com.google.firebase.perf.injection.modules;

import com.google.firebase.installations.C33088k;
import dagger.internal.C10324h;
import dagger.internal.C10335o;

/* renamed from: com.google.firebase.perf.injection.modules.d */
public final class C33341d implements C10324h<C33088k> {

    /* renamed from: a */
    public final C33338a f81030a;

    public C33341d(C33338a aVar) {
        this.f81030a = aVar;
    }

    /* renamed from: a */
    public static C33341d m134430a(C33338a aVar) {
        return new C33341d(aVar);
    }

    /* renamed from: c */
    public static C33088k m134431c(C33338a aVar) {
        return (C33088k) C10335o.m38551c(aVar.mo96417c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C33088k get() {
        return m134431c(this.f81030a);
    }
}
