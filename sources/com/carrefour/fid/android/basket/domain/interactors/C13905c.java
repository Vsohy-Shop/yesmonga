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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.c */
public final class C13905c implements C10324h<BasketBookSlotForCurrentBasketUseCase> {

    /* renamed from: a */
    public final Provider<BasketRepository> f33932a;

    public C13905c(Provider<BasketRepository> provider) {
        this.f33932a = provider;
    }

    /* renamed from: a */
    public static C13905c m59008a(Provider<BasketRepository> provider) {
        return new C13905c(provider);
    }

    /* renamed from: c */
    public static BasketBookSlotForCurrentBasketUseCase m59009c(BasketRepository basketRepository) {
        return new BasketBookSlotForCurrentBasketUseCase(basketRepository);
    }

    /* renamed from: b */
    public BasketBookSlotForCurrentBasketUseCase get() {
        return m59009c(this.f33932a.get());
    }
}
