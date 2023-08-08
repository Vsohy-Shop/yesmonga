package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.config.C33307a;
import dagger.internal.C10324h;
import dagger.internal.C10335o;

/* renamed from: com.google.firebase.perf.injection.modules.b */
public final class C33339b implements C10324h<C33307a> {

    /* renamed from: a */
    public final C33338a f81028a;

    public C33339b(C33338a aVar) {
        this.f81028a = aVar;
    }

    /* renamed from: a */
    public static C33339b m134424a(C33338a aVar) {
        return new C33339b(aVar);
    }

    /* renamed from: c */
    public static C33307a m134425c(C33338a aVar) {
        return (C33307a) C10335o.m38551c(aVar.mo96415a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C33307a get() {
        return m134425c(this.f81028a);
    }
}
