package com.carrefour.fid.android.presentation.viewmodels.product.search;

import com.carrefour.fid.android.domain.interactors.offer.C37716b;
import com.carrefour.fid.android.domain.interactors.product.search.LoadSearchWithListAllResultsUseCase;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.h */
public final class C27274h implements C10324h<ProductSearchWithListAllResultsViewModel> {

    /* renamed from: a */
    public final Provider<C37716b> f66258a;

    /* renamed from: b */
    public final Provider<LoyaltyPreferencesStorage> f66259b;

    /* renamed from: c */
    public final Provider<LoadSearchWithListAllResultsUseCase> f66260c;

    /* renamed from: d */
    public final Provider<C37807b> f66261d;

    public C27274h(Provider<C37716b> provider, Provider<LoyaltyPreferencesStorage> provider2, Provider<LoadSearchWithListAllResultsUseCase> provider3, Provider<C37807b> provider4) {
        this.f66258a = provider;
        this.f66259b = provider2;
        this.f66260c = provider3;
        this.f66261d = provider4;
    }

    /* renamed from: a */
    public static C27274h m115089a(Provider<C37716b> provider, Provider<LoyaltyPreferencesStorage> provider2, Provider<LoadSearchWithListAllResultsUseCase> provider3, Provider<C37807b> provider4) {
        return new C27274h(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static ProductSearchWithListAllResultsViewModel m115090c(C37716b bVar, LoyaltyPreferencesStorage loyaltyPreferencesStorage, LoadSearchWithListAllResultsUseCase loadSearchWithListAllResultsUseCase, C37807b bVar2) {
        return new ProductSearchWithListAllResultsViewModel(bVar, loyaltyPreferencesStorage, loadSearchWithListAllResultsUseCase, bVar2);
    }

    /* renamed from: b */
    public ProductSearchWithListAllResultsViewModel get() {
        return m115090c(this.f66258a.get(), this.f66259b.get(), this.f66260c.get(), this.f66261d.get());
    }
}
