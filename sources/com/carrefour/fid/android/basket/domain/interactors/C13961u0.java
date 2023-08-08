package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.interactors.standard.StdCheckBasketPermissionsUseCase;
import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.u0 */
public final class C13961u0 implements C10324h<BasketUpdateYieldFeesForCurrentBasketUseCase> {

    /* renamed from: a */
    public final Provider<C37823k> f34083a;

    /* renamed from: b */
    public final Provider<BasketRepository> f34084b;

    /* renamed from: c */
    public final Provider<StdCheckBasketPermissionsUseCase> f34085c;

    public C13961u0(Provider<C37823k> provider, Provider<BasketRepository> provider2, Provider<StdCheckBasketPermissionsUseCase> provider3) {
        this.f34083a = provider;
        this.f34084b = provider2;
        this.f34085c = provider3;
    }

    /* renamed from: a */
    public static C13961u0 m59163a(Provider<C37823k> provider, Provider<BasketRepository> provider2, Provider<StdCheckBasketPermissionsUseCase> provider3) {
        return new C13961u0(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static BasketUpdateYieldFeesForCurrentBasketUseCase m59164c(C37823k kVar, BasketRepository basketRepository, StdCheckBasketPermissionsUseCase stdCheckBasketPermissionsUseCase) {
        return new BasketUpdateYieldFeesForCurrentBasketUseCase(kVar, basketRepository, stdCheckBasketPermissionsUseCase);
    }

    /* renamed from: b */
    public BasketUpdateYieldFeesForCurrentBasketUseCase get() {
        return m59164c(this.f34083a.get(), this.f34084b.get(), this.f34085c.get());
    }
}
