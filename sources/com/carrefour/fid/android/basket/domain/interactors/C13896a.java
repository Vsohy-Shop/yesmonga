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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.a */
public final class C13896a implements C10324h<BasketAddPromoCodeUseCase> {

    /* renamed from: a */
    public final Provider<BasketRepository> f33910a;

    public C13896a(Provider<BasketRepository> provider) {
        this.f33910a = provider;
    }

    /* renamed from: a */
    public static C13896a m58980a(Provider<BasketRepository> provider) {
        return new C13896a(provider);
    }

    /* renamed from: c */
    public static BasketAddPromoCodeUseCase m58981c(BasketRepository basketRepository) {
        return new BasketAddPromoCodeUseCase(basketRepository);
    }

    /* renamed from: b */
    public BasketAddPromoCodeUseCase get() {
        return m58981c(this.f33910a.get());
    }
}
