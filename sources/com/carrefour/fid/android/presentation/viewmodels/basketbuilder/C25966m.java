package com.carrefour.fid.android.presentation.viewmodels.basketbuilder;

import com.carrefour.fid.android.domain.interactors.offer.C37716b;
import com.carrefour.fid.android.domain.interactors.product.recommended.LoadBasketBuilderUseCase;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.basketbuilder.m */
public final class C25966m implements C10324h<BasketBuilderRecommendedProductsViewModel> {

    /* renamed from: a */
    public final Provider<LoadBasketBuilderUseCase> f63493a;

    /* renamed from: b */
    public final Provider<C37716b> f63494b;

    /* renamed from: c */
    public final Provider<LoyaltyPreferencesStorage> f63495c;

    public C25966m(Provider<LoadBasketBuilderUseCase> provider, Provider<C37716b> provider2, Provider<LoyaltyPreferencesStorage> provider3) {
        this.f63493a = provider;
        this.f63494b = provider2;
        this.f63495c = provider3;
    }

    /* renamed from: a */
    public static C25966m m111151a(Provider<LoadBasketBuilderUseCase> provider, Provider<C37716b> provider2, Provider<LoyaltyPreferencesStorage> provider3) {
        return new C25966m(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static BasketBuilderRecommendedProductsViewModel m111152c(LoadBasketBuilderUseCase loadBasketBuilderUseCase, C37716b bVar, LoyaltyPreferencesStorage loyaltyPreferencesStorage) {
        return new BasketBuilderRecommendedProductsViewModel(loadBasketBuilderUseCase, bVar, loyaltyPreferencesStorage);
    }

    /* renamed from: b */
    public BasketBuilderRecommendedProductsViewModel get() {
        return m111152c(this.f63493a.get(), this.f63494b.get(), this.f63495c.get());
    }
}
