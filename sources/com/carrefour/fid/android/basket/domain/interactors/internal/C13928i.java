package com.carrefour.fid.android.basket.domain.interactors.internal;

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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.internal.i */
public final class C13928i implements C10324h<InitializeBasketUseCase> {

    /* renamed from: a */
    public final Provider<BasketRepository> f33998a;

    /* renamed from: b */
    public final Provider<C37823k> f33999b;

    /* renamed from: c */
    public final Provider<HandleBasketExceptionUseCase> f34000c;

    public C13928i(Provider<BasketRepository> provider, Provider<C37823k> provider2, Provider<HandleBasketExceptionUseCase> provider3) {
        this.f33998a = provider;
        this.f33999b = provider2;
        this.f34000c = provider3;
    }

    /* renamed from: a */
    public static C13928i m59072a(Provider<BasketRepository> provider, Provider<C37823k> provider2, Provider<HandleBasketExceptionUseCase> provider3) {
        return new C13928i(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static InitializeBasketUseCase m59073c(BasketRepository basketRepository, C37823k kVar, HandleBasketExceptionUseCase handleBasketExceptionUseCase) {
        return new InitializeBasketUseCase(basketRepository, kVar, handleBasketExceptionUseCase);
    }

    /* renamed from: b */
    public InitializeBasketUseCase get() {
        return m59073c(this.f33998a.get(), this.f33999b.get(), this.f34000c.get());
    }
}
