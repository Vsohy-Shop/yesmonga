package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.C40141g;
import com.google.android.datatransport.runtime.time.C40309a;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.o0 */
public final class C40286o0 implements C40141g<C40280n0> {

    /* renamed from: a */
    public final Provider<C40309a> f102631a;

    /* renamed from: b */
    public final Provider<C40309a> f102632b;

    /* renamed from: c */
    public final Provider<C40257e> f102633c;

    /* renamed from: d */
    public final Provider<C40298u0> f102634d;

    /* renamed from: e */
    public final Provider<String> f102635e;

    public C40286o0(Provider<C40309a> provider, Provider<C40309a> provider2, Provider<C40257e> provider3, Provider<C40298u0> provider4, Provider<String> provider5) {
        this.f102631a = provider;
        this.f102632b = provider2;
        this.f102633c = provider3;
        this.f102634d = provider4;
        this.f102635e = provider5;
    }

    /* renamed from: a */
    public static C40286o0 m163781a(Provider<C40309a> provider, Provider<C40309a> provider2, Provider<C40257e> provider3, Provider<C40298u0> provider4, Provider<String> provider5) {
        return new C40286o0(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C40280n0 m163782c(C40309a aVar, C40309a aVar2, Object obj, Object obj2, Provider<String> provider) {
        return new C40280n0(aVar, aVar2, (C40257e) obj, (C40298u0) obj2, provider);
    }

    /* renamed from: b */
    public C40280n0 get() {
        return m163782c(this.f102631a.get(), this.f102632b.get(), this.f102633c.get(), this.f102634d.get(), this.f102635e);
    }
}
