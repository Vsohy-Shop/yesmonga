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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.internal.m */
public final class C13932m implements C10324h<UpdateBasketTypeUseCase> {

    /* renamed from: a */
    public final Provider<BasketRepository> f34011a;

    public C13932m(Provider<BasketRepository> provider) {
        this.f34011a = provider;
    }

    /* renamed from: a */
    public static C13932m m59084a(Provider<BasketRepository> provider) {
        return new C13932m(provider);
    }

    /* renamed from: c */
    public static UpdateBasketTypeUseCase m59085c(BasketRepository basketRepository) {
        return new UpdateBasketTypeUseCase(basketRepository);
    }

    /* renamed from: b */
    public UpdateBasketTypeUseCase get() {
        return m59085c(this.f34011a.get());
    }
}
