package com.carrefour.fid.android.domain.interactors.coupons;

import com.carrefour.fid.android.data.repositories.CouponsRepository;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.coupons.f */
public final class C37648f implements C10324h<GetCouponDetailsByEanUseCase> {

    /* renamed from: a */
    public final Provider<LoyaltyPreferencesStorage> f94478a;

    /* renamed from: b */
    public final Provider<CouponsRepository> f94479b;

    public C37648f(Provider<LoyaltyPreferencesStorage> provider, Provider<CouponsRepository> provider2) {
        this.f94478a = provider;
        this.f94479b = provider2;
    }

    /* renamed from: a */
    public static C37648f m154349a(Provider<LoyaltyPreferencesStorage> provider, Provider<CouponsRepository> provider2) {
        return new C37648f(provider, provider2);
    }

    /* renamed from: c */
    public static GetCouponDetailsByEanUseCase m154350c(LoyaltyPreferencesStorage loyaltyPreferencesStorage, CouponsRepository couponsRepository) {
        return new GetCouponDetailsByEanUseCase(loyaltyPreferencesStorage, couponsRepository);
    }

    /* renamed from: b */
    public GetCouponDetailsByEanUseCase get() {
        return m154350c(this.f94478a.get(), this.f94479b.get());
    }
}
