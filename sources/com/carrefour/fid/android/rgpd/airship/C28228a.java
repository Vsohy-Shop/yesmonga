package com.carrefour.fid.android.rgpd.airship;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.tracking.C28994a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.rgpd.airship.a */
public final class C28228a implements C10324h<AirshipSettings> {

    /* renamed from: a */
    public final Provider<LoginRepository> f68355a;

    /* renamed from: b */
    public final Provider<C28994a> f68356b;

    /* renamed from: c */
    public final Provider<LoyaltyPreferencesStorage> f68357c;

    public C28228a(Provider<LoginRepository> provider, Provider<C28994a> provider2, Provider<LoyaltyPreferencesStorage> provider3) {
        this.f68355a = provider;
        this.f68356b = provider2;
        this.f68357c = provider3;
    }

    /* renamed from: a */
    public static C28228a m118160a(Provider<LoginRepository> provider, Provider<C28994a> provider2, Provider<LoyaltyPreferencesStorage> provider3) {
        return new C28228a(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static AirshipSettings m118161c(LoginRepository loginRepository, C28994a aVar, LoyaltyPreferencesStorage loyaltyPreferencesStorage) {
        return new AirshipSettings(loginRepository, aVar, loyaltyPreferencesStorage);
    }

    /* renamed from: b */
    public AirshipSettings get() {
        return m118161c(this.f68355a.get(), this.f68356b.get(), this.f68357c.get());
    }
}
