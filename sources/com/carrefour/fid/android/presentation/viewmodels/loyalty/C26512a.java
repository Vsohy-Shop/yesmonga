package com.carrefour.fid.android.presentation.viewmodels.loyalty;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.loyalty.a */
public final class C26512a implements C10324h<BaseLoyaltyViewModel> {

    /* renamed from: a */
    public final Provider<LoyaltyPreferencesStorage> f64795a;

    /* renamed from: b */
    public final Provider<LoginRepository> f64796b;

    public C26512a(Provider<LoyaltyPreferencesStorage> provider, Provider<LoginRepository> provider2) {
        this.f64795a = provider;
        this.f64796b = provider2;
    }

    /* renamed from: a */
    public static C26512a m112932a(Provider<LoyaltyPreferencesStorage> provider, Provider<LoginRepository> provider2) {
        return new C26512a(provider, provider2);
    }

    /* renamed from: c */
    public static BaseLoyaltyViewModel m112933c(LoyaltyPreferencesStorage loyaltyPreferencesStorage, LoginRepository loginRepository) {
        return new BaseLoyaltyViewModel(loyaltyPreferencesStorage, loginRepository);
    }

    /* renamed from: b */
    public BaseLoyaltyViewModel get() {
        return m112933c(this.f64795a.get(), this.f64796b.get());
    }
}
