package com.carrefour.fid.android.presentation.viewmodels.product.filter;

import com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.filter.c */
public final class C27179c implements C10324h<ProductListFiltersViewModel> {

    /* renamed from: a */
    public final Provider<LoyaltyPreferencesStorage> f66081a;

    /* renamed from: b */
    public final Provider<GetProductListUseCase> f66082b;

    public C27179c(Provider<LoyaltyPreferencesStorage> provider, Provider<GetProductListUseCase> provider2) {
        this.f66081a = provider;
        this.f66082b = provider2;
    }

    /* renamed from: a */
    public static C27179c m114786a(Provider<LoyaltyPreferencesStorage> provider, Provider<GetProductListUseCase> provider2) {
        return new C27179c(provider, provider2);
    }

    /* renamed from: c */
    public static ProductListFiltersViewModel m114787c(LoyaltyPreferencesStorage loyaltyPreferencesStorage, GetProductListUseCase getProductListUseCase) {
        return new ProductListFiltersViewModel(loyaltyPreferencesStorage, getProductListUseCase);
    }

    /* renamed from: b */
    public ProductListFiltersViewModel get() {
        return m114787c(this.f66081a.get(), this.f66082b.get());
    }
}
