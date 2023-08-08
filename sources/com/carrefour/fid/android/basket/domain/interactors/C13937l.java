package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.l */
public final class C13937l implements C10324h<BasketDetailsUseCase> {

    /* renamed from: a */
    public final Provider<BasketRepository> f34021a;

    public C13937l(Provider<BasketRepository> provider) {
        this.f34021a = provider;
    }

    /* renamed from: a */
    public static C13937l m59096a(Provider<BasketRepository> provider) {
        return new C13937l(provider);
    }

    /* renamed from: c */
    public static BasketDetailsUseCase m59097c(BasketRepository basketRepository) {
        return new BasketDetailsUseCase(basketRepository);
    }

    /* renamed from: b */
    public BasketDetailsUseCase get() {
        return m59097c(this.f34021a.get());
    }
}
