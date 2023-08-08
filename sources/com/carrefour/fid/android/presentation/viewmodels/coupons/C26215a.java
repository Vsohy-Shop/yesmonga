package com.carrefour.fid.android.presentation.viewmodels.coupons;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.a */
public final class C26215a implements C10324h<BarcodeViewModel> {

    /* renamed from: a */
    public final Provider<FetchCouponsUseCase> f64146a;

    /* renamed from: b */
    public final Provider<LoyaltyPreferencesStorage> f64147b;

    /* renamed from: c */
    public final Provider<C13783a> f64148c;

    public C26215a(Provider<FetchCouponsUseCase> provider, Provider<LoyaltyPreferencesStorage> provider2, Provider<C13783a> provider3) {
        this.f64146a = provider;
        this.f64147b = provider2;
        this.f64148c = provider3;
    }

    /* renamed from: a */
    public static C26215a m112086a(Provider<FetchCouponsUseCase> provider, Provider<LoyaltyPreferencesStorage> provider2, Provider<C13783a> provider3) {
        return new C26215a(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static BarcodeViewModel m112087c(FetchCouponsUseCase fetchCouponsUseCase, LoyaltyPreferencesStorage loyaltyPreferencesStorage, C13783a aVar) {
        return new BarcodeViewModel(fetchCouponsUseCase, loyaltyPreferencesStorage, aVar);
    }

    /* renamed from: b */
    public BarcodeViewModel get() {
        return m112087c(this.f64146a.get(), this.f64147b.get(), this.f64148c.get());
    }
}
