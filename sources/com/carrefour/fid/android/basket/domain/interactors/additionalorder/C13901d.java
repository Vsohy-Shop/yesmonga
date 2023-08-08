package com.carrefour.fid.android.basket.domain.interactors.additionalorder;

import com.carrefour.fid.android.basket.domain.interactors.internal.RemoveOfferFromBasketUseCase;
import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.additionalorder.d */
public final class C13901d implements C10324h<AdditionalOrderUpdateBasketContentUseCase> {

    /* renamed from: a */
    public final Provider<CheckAdditionalOrderPermissionUseCase> f33926a;

    /* renamed from: b */
    public final Provider<BasketRepository> f33927b;

    /* renamed from: c */
    public final Provider<RemoveOfferFromBasketUseCase> f33928c;

    public C13901d(Provider<CheckAdditionalOrderPermissionUseCase> provider, Provider<BasketRepository> provider2, Provider<RemoveOfferFromBasketUseCase> provider3) {
        this.f33926a = provider;
        this.f33927b = provider2;
        this.f33928c = provider3;
    }

    /* renamed from: a */
    public static C13901d m58996a(Provider<CheckAdditionalOrderPermissionUseCase> provider, Provider<BasketRepository> provider2, Provider<RemoveOfferFromBasketUseCase> provider3) {
        return new C13901d(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static AdditionalOrderUpdateBasketContentUseCase m58997c(CheckAdditionalOrderPermissionUseCase checkAdditionalOrderPermissionUseCase, BasketRepository basketRepository, RemoveOfferFromBasketUseCase removeOfferFromBasketUseCase) {
        return new AdditionalOrderUpdateBasketContentUseCase(checkAdditionalOrderPermissionUseCase, basketRepository, removeOfferFromBasketUseCase);
    }

    /* renamed from: b */
    public AdditionalOrderUpdateBasketContentUseCase get() {
        return m58997c(this.f33926a.get(), this.f33927b.get(), this.f33928c.get());
    }
}
