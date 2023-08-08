package com.carrefour.fid.android.presentation.viewmodels.criteo;

import com.carrefour.fid.android.domain.interactors.criteo.C37672j;
import com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.criteo.a */
public final class C26331a implements C10324h<CriteoBannerViewModel> {

    /* renamed from: a */
    public final Provider<GetCriteoBannerUseCase> f64349a;

    /* renamed from: b */
    public final Provider<C37672j> f64350b;

    public C26331a(Provider<GetCriteoBannerUseCase> provider, Provider<C37672j> provider2) {
        this.f64349a = provider;
        this.f64350b = provider2;
    }

    /* renamed from: a */
    public static C26331a m112402a(Provider<GetCriteoBannerUseCase> provider, Provider<C37672j> provider2) {
        return new C26331a(provider, provider2);
    }

    /* renamed from: c */
    public static CriteoBannerViewModel m112403c(GetCriteoBannerUseCase getCriteoBannerUseCase, C37672j jVar) {
        return new CriteoBannerViewModel(getCriteoBannerUseCase, jVar);
    }

    /* renamed from: b */
    public CriteoBannerViewModel get() {
        return m112403c(this.f64349a.get(), this.f64350b.get());
    }
}
