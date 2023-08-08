package com.carrefour.fid.android.domain.interactors.arsenal;

import com.carrefour.fid.android.data.repositories.ArsenalGameRepository;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.arsenal.c */
public final class C37550c implements C10324h<GetArsenalTopBannersUseCase> {

    /* renamed from: a */
    public final Provider<C37807b> f94310a;

    /* renamed from: b */
    public final Provider<ArsenalGameRepository> f94311b;

    public C37550c(Provider<C37807b> provider, Provider<ArsenalGameRepository> provider2) {
        this.f94310a = provider;
        this.f94311b = provider2;
    }

    /* renamed from: a */
    public static C37550c m154072a(Provider<C37807b> provider, Provider<ArsenalGameRepository> provider2) {
        return new C37550c(provider, provider2);
    }

    /* renamed from: c */
    public static GetArsenalTopBannersUseCase m154073c(C37807b bVar, ArsenalGameRepository arsenalGameRepository) {
        return new GetArsenalTopBannersUseCase(bVar, arsenalGameRepository);
    }

    /* renamed from: b */
    public GetArsenalTopBannersUseCase get() {
        return m154073c(this.f94310a.get(), this.f94311b.get());
    }
}
