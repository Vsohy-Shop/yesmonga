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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.internal.k */
public final class C13930k implements C10324h<RemoveOfferFromBasketUseCase> {

    /* renamed from: a */
    public final Provider<FetchBasketUseCase> f34003a;

    /* renamed from: b */
    public final Provider<HandleBasketExceptionUseCase> f34004b;

    /* renamed from: c */
    public final Provider<BasketRepository> f34005c;

    public C13930k(Provider<FetchBasketUseCase> provider, Provider<HandleBasketExceptionUseCase> provider2, Provider<BasketRepository> provider3) {
        this.f34003a = provider;
        this.f34004b = provider2;
        this.f34005c = provider3;
    }

    /* renamed from: a */
    public static C13930k m59078a(Provider<FetchBasketUseCase> provider, Provider<HandleBasketExceptionUseCase> provider2, Provider<BasketRepository> provider3) {
        return new C13930k(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static RemoveOfferFromBasketUseCase m59079c(FetchBasketUseCase fetchBasketUseCase, HandleBasketExceptionUseCase handleBasketExceptionUseCase, BasketRepository basketRepository) {
        return new RemoveOfferFromBasketUseCase(fetchBasketUseCase, handleBasketExceptionUseCase, basketRepository);
    }

    /* renamed from: b */
    public RemoveOfferFromBasketUseCase get() {
        return m59079c(this.f34003a.get(), this.f34004b.get(), this.f34005c.get());
    }
}
