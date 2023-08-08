package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderSynchronizeCurrentBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.C13924e;
import com.carrefour.fid.android.basket.domain.interactors.standard.StdSynchronizeCurrentBasketUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.q0 */
public final class C13948q0 implements C10324h<BasketSynchronizeCurrentBasketUseCase> {

    /* renamed from: a */
    public final Provider<AdditionalOrderSynchronizeCurrentBasketUseCase> f34038a;

    /* renamed from: b */
    public final Provider<C13924e> f34039b;

    /* renamed from: c */
    public final Provider<StdSynchronizeCurrentBasketUseCase> f34040c;

    public C13948q0(Provider<AdditionalOrderSynchronizeCurrentBasketUseCase> provider, Provider<C13924e> provider2, Provider<StdSynchronizeCurrentBasketUseCase> provider3) {
        this.f34038a = provider;
        this.f34039b = provider2;
        this.f34040c = provider3;
    }

    /* renamed from: a */
    public static C13948q0 m59125a(Provider<AdditionalOrderSynchronizeCurrentBasketUseCase> provider, Provider<C13924e> provider2, Provider<StdSynchronizeCurrentBasketUseCase> provider3) {
        return new C13948q0(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static BasketSynchronizeCurrentBasketUseCase m59126c(AdditionalOrderSynchronizeCurrentBasketUseCase additionalOrderSynchronizeCurrentBasketUseCase, C13924e eVar, StdSynchronizeCurrentBasketUseCase stdSynchronizeCurrentBasketUseCase) {
        return new BasketSynchronizeCurrentBasketUseCase(additionalOrderSynchronizeCurrentBasketUseCase, eVar, stdSynchronizeCurrentBasketUseCase);
    }

    /* renamed from: b */
    public BasketSynchronizeCurrentBasketUseCase get() {
        return m59126c(this.f34038a.get(), this.f34039b.get(), this.f34040c.get());
    }
}
