package com.carrefour.fid.android.presentation.viewmodels.gazStation;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.domain.interactors.gazStation.PostTicketCardUseCase;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.gazStation.f */
public final class C26358f implements C10324h<ServiceStationsResultViewModel> {

    /* renamed from: a */
    public final Provider<PostTicketCardUseCase> f64391a;

    /* renamed from: b */
    public final Provider<LoginRepository> f64392b;

    /* renamed from: c */
    public final Provider<LoyaltyPreferencesStorage> f64393c;

    /* renamed from: d */
    public final Provider<AppPreferencesStorage> f64394d;

    public C26358f(Provider<PostTicketCardUseCase> provider, Provider<LoginRepository> provider2, Provider<LoyaltyPreferencesStorage> provider3, Provider<AppPreferencesStorage> provider4) {
        this.f64391a = provider;
        this.f64392b = provider2;
        this.f64393c = provider3;
        this.f64394d = provider4;
    }

    /* renamed from: a */
    public static C26358f m112506a(Provider<PostTicketCardUseCase> provider, Provider<LoginRepository> provider2, Provider<LoyaltyPreferencesStorage> provider3, Provider<AppPreferencesStorage> provider4) {
        return new C26358f(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static ServiceStationsResultViewModel m112507c(PostTicketCardUseCase postTicketCardUseCase, LoginRepository loginRepository, LoyaltyPreferencesStorage loyaltyPreferencesStorage, AppPreferencesStorage appPreferencesStorage) {
        return new ServiceStationsResultViewModel(postTicketCardUseCase, loginRepository, loyaltyPreferencesStorage, appPreferencesStorage);
    }

    /* renamed from: b */
    public ServiceStationsResultViewModel get() {
        return m112507c(this.f64391a.get(), this.f64392b.get(), this.f64393c.get(), this.f64394d.get());
    }
}
