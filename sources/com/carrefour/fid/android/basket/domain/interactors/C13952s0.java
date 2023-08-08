package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderUpdateBasketContentUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.C13924e;
import com.carrefour.fid.android.basket.domain.interactors.standard.StdUpdateBasketContentUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.s0 */
public final class C13952s0 implements C10324h<BasketUpdateBasketContentUseCase> {

    /* renamed from: a */
    public final Provider<C13924e> f34045a;

    /* renamed from: b */
    public final Provider<AdditionalOrderUpdateBasketContentUseCase> f34046b;

    /* renamed from: c */
    public final Provider<StdUpdateBasketContentUseCase> f34047c;

    public C13952s0(Provider<C13924e> provider, Provider<AdditionalOrderUpdateBasketContentUseCase> provider2, Provider<StdUpdateBasketContentUseCase> provider3) {
        this.f34045a = provider;
        this.f34046b = provider2;
        this.f34047c = provider3;
    }

    /* renamed from: a */
    public static C13952s0 m59135a(Provider<C13924e> provider, Provider<AdditionalOrderUpdateBasketContentUseCase> provider2, Provider<StdUpdateBasketContentUseCase> provider3) {
        return new C13952s0(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static BasketUpdateBasketContentUseCase m59136c(C13924e eVar, AdditionalOrderUpdateBasketContentUseCase additionalOrderUpdateBasketContentUseCase, StdUpdateBasketContentUseCase stdUpdateBasketContentUseCase) {
        return new BasketUpdateBasketContentUseCase(eVar, additionalOrderUpdateBasketContentUseCase, stdUpdateBasketContentUseCase);
    }

    /* renamed from: b */
    public BasketUpdateBasketContentUseCase get() {
        return m59136c(this.f34045a.get(), this.f34046b.get(), this.f34047c.get());
    }
}
