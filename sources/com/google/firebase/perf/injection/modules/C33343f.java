package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.config.RemoteConfigManager;
import dagger.internal.C10324h;
import dagger.internal.C10335o;

/* renamed from: com.google.firebase.perf.injection.modules.f */
public final class C33343f implements C10324h<RemoteConfigManager> {

    /* renamed from: a */
    public final C33338a f81032a;

    public C33343f(C33338a aVar) {
        this.f81032a = aVar;
    }

    /* renamed from: a */
    public static C33343f m134436a(C33338a aVar) {
        return new C33343f(aVar);
    }

    /* renamed from: c */
    public static RemoteConfigManager m134437c(C33338a aVar) {
        return (RemoteConfigManager) C10335o.m38551c(aVar.mo96419e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public RemoteConfigManager get() {
        return m134437c(this.f81032a);
    }
}
