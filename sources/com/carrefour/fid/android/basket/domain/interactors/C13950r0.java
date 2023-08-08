package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.interactors.standard.StdCheckBasketPermissionsUseCase;
import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.r0 */
public final class C13950r0 implements C10324h<BasketUnBookSlotForCurrentBasketUseCase> {

    /* renamed from: a */
    public final Provider<StdCheckBasketPermissionsUseCase> f34042a;

    /* renamed from: b */
    public final Provider<BasketRepository> f34043b;

    public C13950r0(Provider<StdCheckBasketPermissionsUseCase> provider, Provider<BasketRepository> provider2) {
        this.f34042a = provider;
        this.f34043b = provider2;
    }

    /* renamed from: a */
    public static C13950r0 m59131a(Provider<StdCheckBasketPermissionsUseCase> provider, Provider<BasketRepository> provider2) {
        return new C13950r0(provider, provider2);
    }

    /* renamed from: c */
    public static BasketUnBookSlotForCurrentBasketUseCase m59132c(StdCheckBasketPermissionsUseCase stdCheckBasketPermissionsUseCase, BasketRepository basketRepository) {
        return new BasketUnBookSlotForCurrentBasketUseCase(stdCheckBasketPermissionsUseCase, basketRepository);
    }

    /* renamed from: b */
    public BasketUnBookSlotForCurrentBasketUseCase get() {
        return m59132c(this.f34042a.get(), this.f34043b.get());
    }
}
