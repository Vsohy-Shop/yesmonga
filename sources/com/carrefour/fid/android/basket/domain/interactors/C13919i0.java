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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.i0 */
public final class C13919i0 implements C10324h<BasketRemovePromoCodeUseCase> {

    /* renamed from: a */
    public final Provider<BasketRepository> f33951a;

    public C13919i0(Provider<BasketRepository> provider) {
        this.f33951a = provider;
    }

    /* renamed from: a */
    public static C13919i0 m59042a(Provider<BasketRepository> provider) {
        return new C13919i0(provider);
    }

    /* renamed from: c */
    public static BasketRemovePromoCodeUseCase m59043c(BasketRepository basketRepository) {
        return new BasketRemovePromoCodeUseCase(basketRepository);
    }

    /* renamed from: b */
    public BasketRemovePromoCodeUseCase get() {
        return m59043c(this.f33951a.get());
    }
}
