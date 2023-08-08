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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.x */
public final class C13966x implements C10324h<BasketItemDeleteUseCase> {

    /* renamed from: a */
    public final Provider<BasketRepository> f34094a;

    public C13966x(Provider<BasketRepository> provider) {
        this.f34094a = provider;
    }

    /* renamed from: a */
    public static C13966x m59176a(Provider<BasketRepository> provider) {
        return new C13966x(provider);
    }

    /* renamed from: c */
    public static BasketItemDeleteUseCase m59177c(BasketRepository basketRepository) {
        return new BasketItemDeleteUseCase(basketRepository);
    }

    /* renamed from: b */
    public BasketItemDeleteUseCase get() {
        return m59177c(this.f34094a.get());
    }
}
