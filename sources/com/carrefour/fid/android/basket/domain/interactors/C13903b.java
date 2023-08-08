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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.b */
public final class C13903b implements C10324h<BasketAddPromotionToCurrentBasketUseCase> {

    /* renamed from: a */
    public final Provider<BasketRepository> f33930a;

    public C13903b(Provider<BasketRepository> provider) {
        this.f33930a = provider;
    }

    /* renamed from: a */
    public static C13903b m59002a(Provider<BasketRepository> provider) {
        return new C13903b(provider);
    }

    /* renamed from: c */
    public static BasketAddPromotionToCurrentBasketUseCase m59003c(BasketRepository basketRepository) {
        return new BasketAddPromotionToCurrentBasketUseCase(basketRepository);
    }

    /* renamed from: b */
    public BasketAddPromotionToCurrentBasketUseCase get() {
        return m59003c(this.f33930a.get());
    }
}
