package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExceptionUseCase;
import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.w */
public final class C13965w implements C10324h<BasketInitBasketUseCase> {

    /* renamed from: a */
    public final Provider<BasketRepository> f34092a;

    /* renamed from: b */
    public final Provider<HandleBasketExceptionUseCase> f34093b;

    public C13965w(Provider<BasketRepository> provider, Provider<HandleBasketExceptionUseCase> provider2) {
        this.f34092a = provider;
        this.f34093b = provider2;
    }

    /* renamed from: a */
    public static C13965w m59173a(Provider<BasketRepository> provider, Provider<HandleBasketExceptionUseCase> provider2) {
        return new C13965w(provider, provider2);
    }

    /* renamed from: c */
    public static BasketInitBasketUseCase m59174c(BasketRepository basketRepository, HandleBasketExceptionUseCase handleBasketExceptionUseCase) {
        return new BasketInitBasketUseCase(basketRepository, handleBasketExceptionUseCase);
    }

    /* renamed from: b */
    public BasketInitBasketUseCase get() {
        return m59174c(this.f34092a.get(), this.f34093b.get());
    }
}
