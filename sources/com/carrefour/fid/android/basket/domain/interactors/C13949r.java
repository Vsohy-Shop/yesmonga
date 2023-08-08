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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.r */
public final class C13949r implements C10324h<BasketGetOfferCountInBasketUseCase> {

    /* renamed from: a */
    public final Provider<BasketRepository> f34041a;

    public C13949r(Provider<BasketRepository> provider) {
        this.f34041a = provider;
    }

    /* renamed from: a */
    public static C13949r m59128a(Provider<BasketRepository> provider) {
        return new C13949r(provider);
    }

    /* renamed from: c */
    public static BasketGetOfferCountInBasketUseCase m59129c(BasketRepository basketRepository) {
        return new BasketGetOfferCountInBasketUseCase(basketRepository);
    }

    /* renamed from: b */
    public BasketGetOfferCountInBasketUseCase get() {
        return m59129c(this.f34041a.get());
    }
}
