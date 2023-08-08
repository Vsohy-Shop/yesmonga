package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderRetrieveBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.C13924e;
import com.carrefour.fid.android.basket.domain.interactors.standard.StdRetrieveBasketUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.m0 */
public final class C13940m0 implements C10324h<BasketRetrieveBasketUseCase> {

    /* renamed from: a */
    public final Provider<AdditionalOrderRetrieveBasketUseCase> f34024a;

    /* renamed from: b */
    public final Provider<C13924e> f34025b;

    /* renamed from: c */
    public final Provider<StdRetrieveBasketUseCase> f34026c;

    public C13940m0(Provider<AdditionalOrderRetrieveBasketUseCase> provider, Provider<C13924e> provider2, Provider<StdRetrieveBasketUseCase> provider3) {
        this.f34024a = provider;
        this.f34025b = provider2;
        this.f34026c = provider3;
    }

    /* renamed from: a */
    public static C13940m0 m59103a(Provider<AdditionalOrderRetrieveBasketUseCase> provider, Provider<C13924e> provider2, Provider<StdRetrieveBasketUseCase> provider3) {
        return new C13940m0(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static BasketRetrieveBasketUseCase m59104c(AdditionalOrderRetrieveBasketUseCase additionalOrderRetrieveBasketUseCase, C13924e eVar, StdRetrieveBasketUseCase stdRetrieveBasketUseCase) {
        return new BasketRetrieveBasketUseCase(additionalOrderRetrieveBasketUseCase, eVar, stdRetrieveBasketUseCase);
    }

    /* renamed from: b */
    public BasketRetrieveBasketUseCase get() {
        return m59104c(this.f34024a.get(), this.f34025b.get(), this.f34026c.get());
    }
}
