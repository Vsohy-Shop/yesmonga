package com.carrefour.fid.android.domain.interactors.criteo;

import com.carrefour.fid.android.data.repositories.CriteoRepository;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.criteo.f */
public final class C37665f implements C10324h<GetCriteoBannerUseCase> {

    /* renamed from: a */
    public final Provider<CriteoRepository> f94521a;

    /* renamed from: b */
    public final Provider<C37807b> f94522b;

    public C37665f(Provider<CriteoRepository> provider, Provider<C37807b> provider2) {
        this.f94521a = provider;
        this.f94522b = provider2;
    }

    /* renamed from: a */
    public static C37665f m154408a(Provider<CriteoRepository> provider, Provider<C37807b> provider2) {
        return new C37665f(provider, provider2);
    }

    /* renamed from: c */
    public static GetCriteoBannerUseCase m154409c(CriteoRepository criteoRepository, C37807b bVar) {
        return new GetCriteoBannerUseCase(criteoRepository, bVar);
    }

    /* renamed from: b */
    public GetCriteoBannerUseCase get() {
        return m154409c(this.f94521a.get(), this.f94522b.get());
    }
}
