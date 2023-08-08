package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.session.SessionManager;
import dagger.internal.C10324h;
import dagger.internal.C10335o;

/* renamed from: com.google.firebase.perf.injection.modules.g */
public final class C33344g implements C10324h<SessionManager> {

    /* renamed from: a */
    public final C33338a f81033a;

    public C33344g(C33338a aVar) {
        this.f81033a = aVar;
    }

    /* renamed from: a */
    public static C33344g m134439a(C33338a aVar) {
        return new C33344g(aVar);
    }

    /* renamed from: c */
    public static SessionManager m134440c(C33338a aVar) {
        return (SessionManager) C10335o.m38551c(aVar.mo96420f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public SessionManager get() {
        return m134440c(this.f81033a);
    }
}
