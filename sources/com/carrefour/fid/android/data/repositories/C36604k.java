package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.data.provider.headers.C36579u;
import com.carrefour.fid.android.data.service.C36635n;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.data.repositories.k */
public final class C36604k implements C10324h<GazStationRepository> {

    /* renamed from: a */
    public final Provider<C36579u> f90492a;

    /* renamed from: b */
    public final Provider<C36635n> f90493b;

    public C36604k(Provider<C36579u> provider, Provider<C36635n> provider2) {
        this.f90492a = provider;
        this.f90493b = provider2;
    }

    /* renamed from: a */
    public static C36604k m150192a(Provider<C36579u> provider, Provider<C36635n> provider2) {
        return new C36604k(provider, provider2);
    }

    /* renamed from: c */
    public static GazStationRepository m150193c(C36579u uVar, C36635n nVar) {
        return new GazStationRepository(uVar, nVar);
    }

    /* renamed from: b */
    public GazStationRepository get() {
        return m150193c(this.f90492a.get(), this.f90493b.get());
    }
}
