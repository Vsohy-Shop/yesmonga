package com.google.firebase.perf.injection.modules;

import com.google.firebase.inject.C33058b;
import com.google.firebase.remoteconfig.C33584t;
import dagger.internal.C10324h;
import dagger.internal.C10335o;

/* renamed from: com.google.firebase.perf.injection.modules.e */
public final class C33342e implements C10324h<C33058b<C33584t>> {

    /* renamed from: a */
    public final C33338a f81031a;

    public C33342e(C33338a aVar) {
        this.f81031a = aVar;
    }

    /* renamed from: a */
    public static C33342e m134433a(C33338a aVar) {
        return new C33342e(aVar);
    }

    /* renamed from: c */
    public static C33058b<C33584t> m134434c(C33338a aVar) {
        return (C33058b) C10335o.m38551c(aVar.mo96418d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C33058b<C33584t> get() {
        return m134434c(this.f81031a);
    }
}
