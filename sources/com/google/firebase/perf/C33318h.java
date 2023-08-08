package com.google.firebase.perf;

import com.google.android.datatransport.C40087h;
import com.google.firebase.C33033f;
import com.google.firebase.inject.C33058b;
import com.google.firebase.installations.C33088k;
import com.google.firebase.perf.config.C33307a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.C33584t;
import dagger.internal.C10324h;
import javax.inject.Provider;

/* renamed from: com.google.firebase.perf.h */
public final class C33318h implements C10324h<C33314e> {

    /* renamed from: a */
    public final Provider<C33033f> f81006a;

    /* renamed from: b */
    public final Provider<C33058b<C33584t>> f81007b;

    /* renamed from: c */
    public final Provider<C33088k> f81008c;

    /* renamed from: d */
    public final Provider<C33058b<C40087h>> f81009d;

    /* renamed from: e */
    public final Provider<RemoteConfigManager> f81010e;

    /* renamed from: f */
    public final Provider<C33307a> f81011f;

    /* renamed from: g */
    public final Provider<SessionManager> f81012g;

    public C33318h(Provider<C33033f> provider, Provider<C33058b<C33584t>> provider2, Provider<C33088k> provider3, Provider<C33058b<C40087h>> provider4, Provider<RemoteConfigManager> provider5, Provider<C33307a> provider6, Provider<SessionManager> provider7) {
        this.f81006a = provider;
        this.f81007b = provider2;
        this.f81008c = provider3;
        this.f81009d = provider4;
        this.f81010e = provider5;
        this.f81011f = provider6;
        this.f81012g = provider7;
    }

    /* renamed from: a */
    public static C33318h m134408a(Provider<C33033f> provider, Provider<C33058b<C33584t>> provider2, Provider<C33088k> provider3, Provider<C33058b<C40087h>> provider4, Provider<RemoteConfigManager> provider5, Provider<C33307a> provider6, Provider<SessionManager> provider7) {
        return new C33318h(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    /* renamed from: c */
    public static C33314e m134409c(C33033f fVar, C33058b<C33584t> bVar, C33088k kVar, C33058b<C40087h> bVar2, RemoteConfigManager remoteConfigManager, C33307a aVar, SessionManager sessionManager) {
        return new C33314e(fVar, bVar, kVar, bVar2, remoteConfigManager, aVar, sessionManager);
    }

    /* renamed from: b */
    public C33314e get() {
        return m134409c(this.f81006a.get(), this.f81007b.get(), this.f81008c.get(), this.f81009d.get(), this.f81010e.get(), this.f81011f.get(), this.f81012g.get());
    }
}
