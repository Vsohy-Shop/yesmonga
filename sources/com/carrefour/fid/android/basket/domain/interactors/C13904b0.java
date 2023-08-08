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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.b0 */
public final class C13904b0 implements C10324h<BasketObserveBasketByReferenceUseCase> {

    /* renamed from: a */
    public final Provider<BasketRepository> f33931a;

    public C13904b0(Provider<BasketRepository> provider) {
        this.f33931a = provider;
    }

    /* renamed from: a */
    public static C13904b0 m59005a(Provider<BasketRepository> provider) {
        return new C13904b0(provider);
    }

    /* renamed from: c */
    public static BasketObserveBasketByReferenceUseCase m59006c(BasketRepository basketRepository) {
        return new BasketObserveBasketByReferenceUseCase(basketRepository);
    }

    /* renamed from: b */
    public BasketObserveBasketByReferenceUseCase get() {
        return m59006c(this.f33931a.get());
    }
}
