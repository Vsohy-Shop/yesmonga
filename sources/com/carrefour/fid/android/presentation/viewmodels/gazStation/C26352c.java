package com.carrefour.fid.android.presentation.viewmodels.gazStation;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.consent.C37631c;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.gazStation.c */
public final class C26352c implements C10324h<ServiceStationsLandingPageViewModel> {

    /* renamed from: a */
    public final Provider<C37631c> f64387a;

    /* renamed from: b */
    public final Provider<LoginRepository> f64388b;

    /* renamed from: c */
    public final Provider<LoyaltyPreferencesStorage> f64389c;

    public C26352c(Provider<C37631c> provider, Provider<LoginRepository> provider2, Provider<LoyaltyPreferencesStorage> provider3) {
        this.f64387a = provider;
        this.f64388b = provider2;
        this.f64389c = provider3;
    }

    /* renamed from: a */
    public static C26352c m112497a(Provider<C37631c> provider, Provider<LoginRepository> provider2, Provider<LoyaltyPreferencesStorage> provider3) {
        return new C26352c(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static ServiceStationsLandingPageViewModel m112498c(C37631c cVar, LoginRepository loginRepository, LoyaltyPreferencesStorage loyaltyPreferencesStorage) {
        return new ServiceStationsLandingPageViewModel(cVar, loginRepository, loyaltyPreferencesStorage);
    }

    /* renamed from: b */
    public ServiceStationsLandingPageViewModel get() {
        return m112498c(this.f64387a.get(), this.f64388b.get(), this.f64389c.get());
    }
}
