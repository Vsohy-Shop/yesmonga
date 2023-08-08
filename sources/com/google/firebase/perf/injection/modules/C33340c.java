package com.google.firebase.perf.injection.modules;

import com.google.firebase.C33033f;
import dagger.internal.C10324h;
import dagger.internal.C10335o;

/* renamed from: com.google.firebase.perf.injection.modules.c */
public final class C33340c implements C10324h<C33033f> {

    /* renamed from: a */
    public final C33338a f81029a;

    public C33340c(C33338a aVar) {
        this.f81029a = aVar;
    }

    /* renamed from: a */
    public static C33340c m134427a(C33338a aVar) {
        return new C33340c(aVar);
    }

    /* renamed from: c */
    public static C33033f m134428c(C33338a aVar) {
        return (C33033f) C10335o.m38551c(aVar.mo96416b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C33033f get() {
        return m134428c(this.f81029a);
    }
}
