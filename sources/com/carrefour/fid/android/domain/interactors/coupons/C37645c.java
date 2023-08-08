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
/* renamed from: com.carrefour.fid.android.domain.interactors.coupons.c */
public final class C37645c implements C10324h<CouponsSetScanProductViewedUseCase> {

    /* renamed from: a */
    public final Provider<AppPreferencesStorage> f94471a;

    public C37645c(Provider<AppPreferencesStorage> provider) {
        this.f94471a = provider;
    }

    /* renamed from: a */
    public static C37645c m154340a(Provider<AppPreferencesStorage> provider) {
        return new C37645c(provider);
    }

    /* renamed from: c */
    public static CouponsSetScanProductViewedUseCase m154341c(AppPreferencesStorage appPreferencesStorage) {
        return new CouponsSetScanProductViewedUseCase(appPreferencesStorage);
    }

    /* renamed from: b */
    public CouponsSetScanProductViewedUseCase get() {
        return m154341c(this.f94471a.get());
    }
}
