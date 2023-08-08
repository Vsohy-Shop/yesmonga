package com.carrefour.fid.android.presentation.viewmodels.product.mixing;

import com.carrefour.fid.android.domain.interactors.additionalorder.C37540a;
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
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.mixing.c */
public final class C27227c implements C10324h<MixingProductsBottomSheetViewModel> {

    /* renamed from: a */
    public final Provider<C37716b> f66180a;

    /* renamed from: b */
    public final Provider<GetOfferProductListUseCase> f66181b;

    /* renamed from: c */
    public final Provider<LoyaltyPreferencesStorage> f66182c;

    /* renamed from: d */
    public final Provider<C37540a> f66183d;

    public C27227c(Provider<C37716b> provider, Provider<GetOfferProductListUseCase> provider2, Provider<LoyaltyPreferencesStorage> provider3, Provider<C37540a> provider4) {
        this.f66180a = provider;
        this.f66181b = provider2;
        this.f66182c = provider3;
        this.f66183d = provider4;
    }

    /* renamed from: a */
    public static C27227c m114953a(Provider<C37716b> provider, Provider<GetOfferProductListUseCase> provider2, Provider<LoyaltyPreferencesStorage> provider3, Provider<C37540a> provider4) {
        return new C27227c(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static MixingProductsBottomSheetViewModel m114954c(C37716b bVar, GetOfferProductListUseCase getOfferProductListUseCase, LoyaltyPreferencesStorage loyaltyPreferencesStorage, C37540a aVar) {
        return new MixingProductsBottomSheetViewModel(bVar, getOfferProductListUseCase, loyaltyPreferencesStorage, aVar);
    }

    /* renamed from: b */
    public MixingProductsBottomSheetViewModel get() {
        return m114954c(this.f66180a.get(), this.f66181b.get(), this.f66182c.get(), this.f66183d.get());
    }
}
