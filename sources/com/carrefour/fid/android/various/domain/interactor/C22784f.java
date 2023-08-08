package com.carrefour.fid.android.various.domain.interactor;

import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.various.domain.repository.C22798d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.various.domain.interactor.f */
public final class C22784f implements C10324h<ThirdPartyFetchRemoteConfigUseCase> {

    /* renamed from: a */
    public final Provider<C22798d> f58344a;

    /* renamed from: b */
    public final Provider<C37694a> f58345b;

    public C22784f(Provider<C22798d> provider, Provider<C37694a> provider2) {
        this.f58344a = provider;
        this.f58345b = provider2;
    }

    /* renamed from: a */
    public static C22784f m103021a(Provider<C22798d> provider, Provider<C37694a> provider2) {
        return new C22784f(provider, provider2);
    }

    /* renamed from: c */
    public static ThirdPartyFetchRemoteConfigUseCase m103022c(C22798d dVar, C37694a aVar) {
        return new ThirdPartyFetchRemoteConfigUseCase(dVar, aVar);
    }

    /* renamed from: b */
    public ThirdPartyFetchRemoteConfigUseCase get() {
        return m103022c(this.f58344a.get(), this.f58345b.get());
    }
}
