package com.carrefour.fid.android.presentation.viewmodels.product.search;

import com.carrefour.fid.android.domain.interactors.offer.C37716b;
import com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.m */
public final class C27282m implements C10324h<ProductSearchWithListRecommendationResultsViewModel> {

    /* renamed from: a */
    public final Provider<C37716b> f66267a;

    /* renamed from: b */
    public final Provider<GetOfferProductListUseCase> f66268b;

    /* renamed from: c */
    public final Provider<LoyaltyPreferencesStorage> f66269c;

    public C27282m(Provider<C37716b> provider, Provider<GetOfferProductListUseCase> provider2, Provider<LoyaltyPreferencesStorage> provider3) {
        this.f66267a = provider;
        this.f66268b = provider2;
        this.f66269c = provider3;
    }

    /* renamed from: a */
    public static C27282m m115110a(Provider<C37716b> provider, Provider<GetOfferProductListUseCase> provider2, Provider<LoyaltyPreferencesStorage> provider3) {
        return new C27282m(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static ProductSearchWithListRecommendationResultsViewModel m115111c(C37716b bVar, GetOfferProductListUseCase getOfferProductListUseCase, LoyaltyPreferencesStorage loyaltyPreferencesStorage) {
        return new ProductSearchWithListRecommendationResultsViewModel(bVar, getOfferProductListUseCase, loyaltyPreferencesStorage);
    }

    /* renamed from: b */
    public ProductSearchWithListRecommendationResultsViewModel get() {
        return m115111c(this.f66267a.get(), this.f66268b.get(), this.f66269c.get());
    }
}
