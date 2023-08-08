package com.carrefour.fid.android.basket.domain.interactors.home;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.user.C37886i;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.home.a */
public final class C13917a implements C10324h<BasketAddOneMoreItemHomeDeliveryNalBasket> {

    /* renamed from: a */
    public final Provider<BasketRepository> f33948a;

    /* renamed from: b */
    public final Provider<C37886i> f33949b;

    public C13917a(Provider<BasketRepository> provider, Provider<C37886i> provider2) {
        this.f33948a = provider;
        this.f33949b = provider2;
    }

    /* renamed from: a */
    public static C13917a m59036a(Provider<BasketRepository> provider, Provider<C37886i> provider2) {
        return new C13917a(provider, provider2);
    }

    /* renamed from: c */
    public static BasketAddOneMoreItemHomeDeliveryNalBasket m59037c(BasketRepository basketRepository, C37886i iVar) {
        return new BasketAddOneMoreItemHomeDeliveryNalBasket(basketRepository, iVar);
    }

    /* renamed from: b */
    public BasketAddOneMoreItemHomeDeliveryNalBasket get() {
        return m59037c(this.f33948a.get(), this.f33949b.get());
    }
}
