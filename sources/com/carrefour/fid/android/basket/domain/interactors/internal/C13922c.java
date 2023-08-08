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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.internal.c */
public final class C13922c implements C10324h<DeleteBasketUseCase> {

    /* renamed from: a */
    public final Provider<BasketRepository> f33989a;

    public C13922c(Provider<BasketRepository> provider) {
        this.f33989a = provider;
    }

    /* renamed from: a */
    public static C13922c m59057a(Provider<BasketRepository> provider) {
        return new C13922c(provider);
    }

    /* renamed from: c */
    public static DeleteBasketUseCase m59058c(BasketRepository basketRepository) {
        return new DeleteBasketUseCase(basketRepository);
    }

    /* renamed from: b */
    public DeleteBasketUseCase get() {
        return m59058c(this.f33989a.get());
    }
}
