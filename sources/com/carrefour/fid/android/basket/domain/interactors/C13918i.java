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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.i */
public final class C13918i implements C10324h<BasketClearByReferenceUseCase> {

    /* renamed from: a */
    public final Provider<BasketRepository> f33950a;

    public C13918i(Provider<BasketRepository> provider) {
        this.f33950a = provider;
    }

    /* renamed from: a */
    public static C13918i m59039a(Provider<BasketRepository> provider) {
        return new C13918i(provider);
    }

    /* renamed from: c */
    public static BasketClearByReferenceUseCase m59040c(BasketRepository basketRepository) {
        return new BasketClearByReferenceUseCase(basketRepository);
    }

    /* renamed from: b */
    public BasketClearByReferenceUseCase get() {
        return m59040c(this.f33950a.get());
    }
}
