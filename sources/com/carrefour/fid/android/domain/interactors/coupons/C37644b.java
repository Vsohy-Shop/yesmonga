package com.carrefour.fid.android.domain.interactors.coupons;

import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.coupons.b */
public final class C37644b implements C10324h<CouponsIsScanProductOnBoardingUseCase> {

    /* renamed from: a */
    public final Provider<AppPreferencesStorage> f94470a;

    public C37644b(Provider<AppPreferencesStorage> provider) {
        this.f94470a = provider;
    }

    /* renamed from: a */
    public static C37644b m154337a(Provider<AppPreferencesStorage> provider) {
        return new C37644b(provider);
    }

    /* renamed from: c */
    public static CouponsIsScanProductOnBoardingUseCase m154338c(AppPreferencesStorage appPreferencesStorage) {
        return new CouponsIsScanProductOnBoardingUseCase(appPreferencesStorage);
    }

    /* renamed from: b */
    public CouponsIsScanProductOnBoardingUseCase get() {
        return m154338c(this.f94470a.get());
    }
}
