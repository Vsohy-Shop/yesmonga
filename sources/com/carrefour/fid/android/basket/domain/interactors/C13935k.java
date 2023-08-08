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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.k */
public final class C13935k implements C10324h<BasketDeleteYieldFeesForCurrentBasketUseCase> {

    /* renamed from: a */
    public final Provider<C37823k> f34017a;

    /* renamed from: b */
    public final Provider<BasketRepository> f34018b;

    /* renamed from: c */
    public final Provider<StdCheckBasketPermissionsUseCase> f34019c;

    public C13935k(Provider<C37823k> provider, Provider<BasketRepository> provider2, Provider<StdCheckBasketPermissionsUseCase> provider3) {
        this.f34017a = provider;
        this.f34018b = provider2;
        this.f34019c = provider3;
    }

    /* renamed from: a */
    public static C13935k m59093a(Provider<C37823k> provider, Provider<BasketRepository> provider2, Provider<StdCheckBasketPermissionsUseCase> provider3) {
        return new C13935k(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static BasketDeleteYieldFeesForCurrentBasketUseCase m59094c(C37823k kVar, BasketRepository basketRepository, StdCheckBasketPermissionsUseCase stdCheckBasketPermissionsUseCase) {
        return new BasketDeleteYieldFeesForCurrentBasketUseCase(kVar, basketRepository, stdCheckBasketPermissionsUseCase);
    }

    /* renamed from: b */
    public BasketDeleteYieldFeesForCurrentBasketUseCase get() {
        return m59094c(this.f34017a.get(), this.f34018b.get(), this.f34019c.get());
    }
}
