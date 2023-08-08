package com.carrefour.fid.android.domain.interactors.criteo;

import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.criteo.a */
public final class C37660a implements C10324h<CriteoGetCatalogCriteoBannerUseCase> {

    /* renamed from: a */
    public final Provider<GetCriteoBannerUseCase> f94511a;

    public C37660a(Provider<GetCriteoBannerUseCase> provider) {
        this.f94511a = provider;
    }

    /* renamed from: a */
    public static C37660a m154393a(Provider<GetCriteoBannerUseCase> provider) {
        return new C37660a(provider);
    }

    /* renamed from: c */
    public static CriteoGetCatalogCriteoBannerUseCase m154394c(GetCriteoBannerUseCase getCriteoBannerUseCase) {
        return new CriteoGetCatalogCriteoBannerUseCase(getCriteoBannerUseCase);
    }

    /* renamed from: b */
    public CriteoGetCatalogCriteoBannerUseCase get() {
        return m154394c(this.f94511a.get());
    }
}
