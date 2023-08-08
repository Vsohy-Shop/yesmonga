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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.n0 */
public final class C13942n0 implements C10324h<BasketSetDeliveryTypeUseCase> {

    /* renamed from: a */
    public final Provider<BasketRepository> f34028a;

    public C13942n0(Provider<BasketRepository> provider) {
        this.f34028a = provider;
    }

    /* renamed from: a */
    public static C13942n0 m59109a(Provider<BasketRepository> provider) {
        return new C13942n0(provider);
    }

    /* renamed from: c */
    public static BasketSetDeliveryTypeUseCase m59110c(BasketRepository basketRepository) {
        return new BasketSetDeliveryTypeUseCase(basketRepository);
    }

    /* renamed from: b */
    public BasketSetDeliveryTypeUseCase get() {
        return m59110c(this.f34028a.get());
    }
}
