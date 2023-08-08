package com.carrefour.fid.android;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.airship.data.datasource.C13747e;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.data.managers.C36555b;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.k0 */
public final class C14030k0 implements C10158g<OneAppApplication> {

    /* renamed from: a */
    public final Provider<C36555b> f34417a;

    /* renamed from: b */
    public final Provider<AppPreferencesStorage> f34418b;

    /* renamed from: c */
    public final Provider<AccountRepository> f34419c;

    /* renamed from: d */
    public final Provider<LoyaltyPreferencesStorage> f34420d;

    /* renamed from: e */
    public final Provider<C13783a> f34421e;

    /* renamed from: f */
    public final Provider<C13747e> f34422f;

    public C14030k0(Provider<C36555b> provider, Provider<AppPreferencesStorage> provider2, Provider<AccountRepository> provider3, Provider<LoyaltyPreferencesStorage> provider4, Provider<C13783a> provider5, Provider<C13747e> provider6) {
        this.f34417a = provider;
        this.f34418b = provider2;
        this.f34419c = provider3;
        this.f34420d = provider4;
        this.f34421e = provider5;
        this.f34422f = provider6;
    }

    /* renamed from: a */
    public static C10158g<OneAppApplication> m60574a(Provider<C36555b> provider, Provider<AppPreferencesStorage> provider2, Provider<AccountRepository> provider3, Provider<LoyaltyPreferencesStorage> provider4, Provider<C13783a> provider5, Provider<C13747e> provider6) {
        return new C14030k0(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @C10326j("com.carrefour.fid.android.OneAppApplication.accountRepository")
    /* renamed from: b */
    public static void m60575b(OneAppApplication oneAppApplication, AccountRepository accountRepository) {
        oneAppApplication.f32249e = accountRepository;
    }

    @C10326j("com.carrefour.fid.android.OneAppApplication.analyticManager")
    /* renamed from: c */
    public static void m60576c(OneAppApplication oneAppApplication, C13783a aVar) {
        oneAppApplication.f32251g = aVar;
    }

    @C10326j("com.carrefour.fid.android.OneAppApplication.appPreferencesStorage")
    /* renamed from: d */
    public static void m60577d(OneAppApplication oneAppApplication, AppPreferencesStorage appPreferencesStorage) {
        oneAppApplication.f32248d = appPreferencesStorage;
    }

    @C10326j("com.carrefour.fid.android.OneAppApplication.audienceTrackingManager")
    /* renamed from: e */
    public static void m60578e(OneAppApplication oneAppApplication, C13747e eVar) {
        oneAppApplication.f32252v = eVar;
    }

    @C10326j("com.carrefour.fid.android.OneAppApplication.loginManager")
    /* renamed from: f */
    public static void m60579f(OneAppApplication oneAppApplication, C36555b bVar) {
        oneAppApplication.f32247c = bVar;
    }

    @C10326j("com.carrefour.fid.android.OneAppApplication.loyaltyPreferencesStorage")
    /* renamed from: g */
    public static void m60580g(OneAppApplication oneAppApplication, LoyaltyPreferencesStorage loyaltyPreferencesStorage) {
        oneAppApplication.f32250f = loyaltyPreferencesStorage;
    }

    /* renamed from: h */
    public void injectMembers(OneAppApplication oneAppApplication) {
        m60579f(oneAppApplication, this.f34417a.get());
        m60577d(oneAppApplication, this.f34418b.get());
        m60575b(oneAppApplication, this.f34419c.get());
        m60580g(oneAppApplication, this.f34420d.get());
        m60576c(oneAppApplication, this.f34421e.get());
        m60578e(oneAppApplication, this.f34422f.get());
    }
}
