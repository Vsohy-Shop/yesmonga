package com.google.firebase.perf.injection.modules;

import com.google.android.datatransport.C40087h;
import com.google.firebase.inject.C33058b;
import dagger.internal.C10324h;
import dagger.internal.C10335o;

/* renamed from: com.google.firebase.perf.injection.modules.h */
public final class C33345h implements C10324h<C33058b<C40087h>> {

    /* renamed from: a */
    public final C33338a f81034a;

    public C33345h(C33338a aVar) {
        this.f81034a = aVar;
    }

    /* renamed from: a */
    public static C33345h m134442a(C33338a aVar) {
        return new C33345h(aVar);
    }

    /* renamed from: c */
    public static C33058b<C40087h> m134443c(C33338a aVar) {
        return (C33058b) C10335o.m38551c(aVar.mo96421g(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C33058b<C40087h> get() {
        return m134443c(this.f81034a);
    }
}
