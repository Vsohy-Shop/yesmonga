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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.c0 */
public final class C13906c0 implements C10324h<BasketObserveBasketItemQuantityToSellUseCase> {

    /* renamed from: a */
    public final Provider<BasketRepository> f33933a;

    public C13906c0(Provider<BasketRepository> provider) {
        this.f33933a = provider;
    }

    /* renamed from: a */
    public static C13906c0 m59011a(Provider<BasketRepository> provider) {
        return new C13906c0(provider);
    }

    /* renamed from: c */
    public static BasketObserveBasketItemQuantityToSellUseCase m59012c(BasketRepository basketRepository) {
        return new BasketObserveBasketItemQuantityToSellUseCase(basketRepository);
    }

    /* renamed from: b */
    public BasketObserveBasketItemQuantityToSellUseCase get() {
        return m59012c(this.f33933a.get());
    }
}
