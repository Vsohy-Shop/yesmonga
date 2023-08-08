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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.internal.j */
public final class C13929j implements C10324h<InitializeNonFoodBasketUseCase> {

    /* renamed from: a */
    public final Provider<BasketRepository> f34001a;

    /* renamed from: b */
    public final Provider<HandleBasketExceptionUseCase> f34002b;

    public C13929j(Provider<BasketRepository> provider, Provider<HandleBasketExceptionUseCase> provider2) {
        this.f34001a = provider;
        this.f34002b = provider2;
    }

    /* renamed from: a */
    public static C13929j m59075a(Provider<BasketRepository> provider, Provider<HandleBasketExceptionUseCase> provider2) {
        return new C13929j(provider, provider2);
    }

    /* renamed from: c */
    public static InitializeNonFoodBasketUseCase m59076c(BasketRepository basketRepository, HandleBasketExceptionUseCase handleBasketExceptionUseCase) {
        return new InitializeNonFoodBasketUseCase(basketRepository, handleBasketExceptionUseCase);
    }

    /* renamed from: b */
    public InitializeNonFoodBasketUseCase get() {
        return m59076c(this.f34001a.get(), this.f34002b.get());
    }
}
