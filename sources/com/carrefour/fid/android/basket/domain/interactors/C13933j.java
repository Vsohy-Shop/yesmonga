package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.interactors.additionalorder.AdditionalOrderDeleteCurrentBasketUseCase;
import com.carrefour.fid.android.basket.domain.interactors.internal.C13924e;
import com.carrefour.fid.android.basket.domain.interactors.standard.StdBasketDeleteCurrentBasketUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.j */
public final class C13933j implements C10324h<BasketDeleteCurrentBasketUseCase> {

    /* renamed from: a */
    public final Provider<StdBasketDeleteCurrentBasketUseCase> f34012a;

    /* renamed from: b */
    public final Provider<AdditionalOrderDeleteCurrentBasketUseCase> f34013b;

    /* renamed from: c */
    public final Provider<C13924e> f34014c;

    public C13933j(Provider<StdBasketDeleteCurrentBasketUseCase> provider, Provider<AdditionalOrderDeleteCurrentBasketUseCase> provider2, Provider<C13924e> provider3) {
        this.f34012a = provider;
        this.f34013b = provider2;
        this.f34014c = provider3;
    }

    /* renamed from: a */
    public static C13933j m59087a(Provider<StdBasketDeleteCurrentBasketUseCase> provider, Provider<AdditionalOrderDeleteCurrentBasketUseCase> provider2, Provider<C13924e> provider3) {
        return new C13933j(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static BasketDeleteCurrentBasketUseCase m59088c(StdBasketDeleteCurrentBasketUseCase stdBasketDeleteCurrentBasketUseCase, AdditionalOrderDeleteCurrentBasketUseCase additionalOrderDeleteCurrentBasketUseCase, C13924e eVar) {
        return new BasketDeleteCurrentBasketUseCase(stdBasketDeleteCurrentBasketUseCase, additionalOrderDeleteCurrentBasketUseCase, eVar);
    }

    /* renamed from: b */
    public BasketDeleteCurrentBasketUseCase get() {
        return m59088c(this.f34012a.get(), this.f34013b.get(), this.f34014c.get());
    }
}
