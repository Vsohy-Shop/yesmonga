package com.carrefour.fid.android.presentation.viewmodels.coupons.overlay;

import com.carrefour.fid.android.domain.interactors.basket.C37587n;
import com.carrefour.fid.android.domain.interactors.offer.C37716b;
import com.carrefour.fid.android.domain.interactors.product.list.GetOfferProductListUseCase;
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
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.g */
public final class C26316g implements C10324h<OverlayProductsBottomSheetViewModel> {

    /* renamed from: a */
    public final Provider<C37716b> f64325a;

    /* renamed from: b */
    public final Provider<GetOfferProductListUseCase> f64326b;

    /* renamed from: c */
    public final Provider<LoyaltyPreferencesStorage> f64327c;

    /* renamed from: d */
    public final Provider<C37807b> f64328d;

    /* renamed from: e */
    public final Provider<C37587n> f64329e;

    public C26316g(Provider<C37716b> provider, Provider<GetOfferProductListUseCase> provider2, Provider<LoyaltyPreferencesStorage> provider3, Provider<C37807b> provider4, Provider<C37587n> provider5) {
        this.f64325a = provider;
        this.f64326b = provider2;
        this.f64327c = provider3;
        this.f64328d = provider4;
        this.f64329e = provider5;
    }

    /* renamed from: a */
    public static C26316g m112361a(Provider<C37716b> provider, Provider<GetOfferProductListUseCase> provider2, Provider<LoyaltyPreferencesStorage> provider3, Provider<C37807b> provider4, Provider<C37587n> provider5) {
        return new C26316g(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static OverlayProductsBottomSheetViewModel m112362c(C37716b bVar, GetOfferProductListUseCase getOfferProductListUseCase, LoyaltyPreferencesStorage loyaltyPreferencesStorage, C37807b bVar2, C37587n nVar) {
        return new OverlayProductsBottomSheetViewModel(bVar, getOfferProductListUseCase, loyaltyPreferencesStorage, bVar2, nVar);
    }

    /* renamed from: b */
    public OverlayProductsBottomSheetViewModel get() {
        return m112362c(this.f64325a.get(), this.f64326b.get(), this.f64327c.get(), this.f64328d.get(), this.f64329e.get());
    }
}
