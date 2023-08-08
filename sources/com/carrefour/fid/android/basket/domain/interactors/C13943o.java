package com.carrefour.fid.android.basket.domain.interactors;

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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.o */
public final class C13943o implements C10324h<BasketGetBasketNumberUseCase> {

    /* renamed from: a */
    public final Provider<BasketRepository> f34029a;

    /* renamed from: b */
    public final Provider<C37823k> f34030b;

    public C13943o(Provider<BasketRepository> provider, Provider<C37823k> provider2) {
        this.f34029a = provider;
        this.f34030b = provider2;
    }

    /* renamed from: a */
    public static C13943o m59112a(Provider<BasketRepository> provider, Provider<C37823k> provider2) {
        return new C13943o(provider, provider2);
    }

    /* renamed from: c */
    public static BasketGetBasketNumberUseCase m59113c(BasketRepository basketRepository, C37823k kVar) {
        return new BasketGetBasketNumberUseCase(basketRepository, kVar);
    }

    /* renamed from: b */
    public BasketGetBasketNumberUseCase get() {
        return m59113c(this.f34029a.get(), this.f34030b.get());
    }
}
