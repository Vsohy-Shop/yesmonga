package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.y */
public final class C13967y implements C10324h<BasketItemQuantityUpdateUseCase> {

    /* renamed from: a */
    public final Provider<BasketRepository> f34095a;

    public C13967y(Provider<BasketRepository> provider) {
        this.f34095a = provider;
    }

    /* renamed from: a */
    public static C13967y m59179a(Provider<BasketRepository> provider) {
        return new C13967y(provider);
    }

    /* renamed from: c */
    public static BasketItemQuantityUpdateUseCase m59180c(BasketRepository basketRepository) {
        return new BasketItemQuantityUpdateUseCase(basketRepository);
    }

    /* renamed from: b */
    public BasketItemQuantityUpdateUseCase get() {
        return m59180c(this.f34095a.get());
    }
}
