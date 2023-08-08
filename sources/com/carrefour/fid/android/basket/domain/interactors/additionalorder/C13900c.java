package com.carrefour.fid.android.basket.domain.interactors.additionalorder;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.additionalorder.c */
public final class C13900c implements C10324h<AdditionalOrderSynchronizeCurrentBasketUseCase> {

    /* renamed from: a */
    public final Provider<CheckAdditionalOrderPermissionUseCase> f33924a;

    /* renamed from: b */
    public final Provider<BasketRepository> f33925b;

    public C13900c(Provider<CheckAdditionalOrderPermissionUseCase> provider, Provider<BasketRepository> provider2) {
        this.f33924a = provider;
        this.f33925b = provider2;
    }

    /* renamed from: a */
    public static C13900c m58993a(Provider<CheckAdditionalOrderPermissionUseCase> provider, Provider<BasketRepository> provider2) {
        return new C13900c(provider, provider2);
    }

    /* renamed from: c */
    public static AdditionalOrderSynchronizeCurrentBasketUseCase m58994c(CheckAdditionalOrderPermissionUseCase checkAdditionalOrderPermissionUseCase, BasketRepository basketRepository) {
        return new AdditionalOrderSynchronizeCurrentBasketUseCase(checkAdditionalOrderPermissionUseCase, basketRepository);
    }

    /* renamed from: b */
    public AdditionalOrderSynchronizeCurrentBasketUseCase get() {
        return m58994c(this.f33924a.get(), this.f33925b.get());
    }
}
