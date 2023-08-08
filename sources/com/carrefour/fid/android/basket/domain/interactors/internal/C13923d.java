package com.carrefour.fid.android.basket.domain.interactors.internal;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.internal.d */
public final class C13923d implements C10324h<FetchBasketUseCase> {

    /* renamed from: a */
    public final Provider<BasketRepository> f33990a;

    public C13923d(Provider<BasketRepository> provider) {
        this.f33990a = provider;
    }

    /* renamed from: a */
    public static C13923d m59060a(Provider<BasketRepository> provider) {
        return new C13923d(provider);
    }

    /* renamed from: c */
    public static FetchBasketUseCase m59061c(BasketRepository basketRepository) {
        return new FetchBasketUseCase(basketRepository);
    }

    /* renamed from: b */
    public FetchBasketUseCase get() {
        return m59061c(this.f33990a.get());
    }
}
