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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.f */
public final class C13911f implements C10324h<BasketCheckNalBasketValidationUseCase> {

    /* renamed from: a */
    public final Provider<BasketRepository> f33938a;

    public C13911f(Provider<BasketRepository> provider) {
        this.f33938a = provider;
    }

    /* renamed from: a */
    public static C13911f m59022a(Provider<BasketRepository> provider) {
        return new C13911f(provider);
    }

    /* renamed from: c */
    public static BasketCheckNalBasketValidationUseCase m59023c(BasketRepository basketRepository) {
        return new BasketCheckNalBasketValidationUseCase(basketRepository);
    }

    /* renamed from: b */
    public BasketCheckNalBasketValidationUseCase get() {
        return m59023c(this.f33938a.get());
    }
}
