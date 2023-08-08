package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.interactors.internal.BasketCheckSelectedServiceAndBasketSynchronicityUseCase;
import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.p0 */
public final class C13946p0 implements C10324h<BasketSwitchFacilityServiceInBasketUseCase> {

    /* renamed from: a */
    public final Provider<BasketCheckSelectedServiceAndBasketSynchronicityUseCase> f34035a;

    /* renamed from: b */
    public final Provider<BasketRepository> f34036b;

    public C13946p0(Provider<BasketCheckSelectedServiceAndBasketSynchronicityUseCase> provider, Provider<BasketRepository> provider2) {
        this.f34035a = provider;
        this.f34036b = provider2;
    }

    /* renamed from: a */
    public static C13946p0 m59119a(Provider<BasketCheckSelectedServiceAndBasketSynchronicityUseCase> provider, Provider<BasketRepository> provider2) {
        return new C13946p0(provider, provider2);
    }

    /* renamed from: c */
    public static BasketSwitchFacilityServiceInBasketUseCase m59120c(BasketCheckSelectedServiceAndBasketSynchronicityUseCase basketCheckSelectedServiceAndBasketSynchronicityUseCase, BasketRepository basketRepository) {
        return new BasketSwitchFacilityServiceInBasketUseCase(basketCheckSelectedServiceAndBasketSynchronicityUseCase, basketRepository);
    }

    /* renamed from: b */
    public BasketSwitchFacilityServiceInBasketUseCase get() {
        return m59120c(this.f34035a.get(), this.f34036b.get());
    }
}
