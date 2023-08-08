package com.carrefour.fid.android.utils.initializer;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.airship.data.datasource.C13747e;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37832c;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.shared.p045di.annotation.C28659c;
import com.carrefour.fid.android.tracking.C28994a;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;
import kotlinx.coroutines.C12074o0;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.ApplicationScope"})
/* renamed from: com.carrefour.fid.android.utils.initializer.b */
public final class C22709b implements C10158g<AudienceTrackingInitializer> {

    /* renamed from: a */
    public final Provider<C13747e> f58193a;

    /* renamed from: b */
    public final Provider<C28994a> f58194b;

    /* renamed from: c */
    public final Provider<C37832c> f58195c;

    /* renamed from: d */
    public final Provider<LoginRepository> f58196d;

    /* renamed from: e */
    public final Provider<AccountRepository> f58197e;

    /* renamed from: f */
    public final Provider<LoyaltyPreferencesStorage> f58198f;

    /* renamed from: g */
    public final Provider<C12074o0> f58199g;

    public C22709b(Provider<C13747e> provider, Provider<C28994a> provider2, Provider<C37832c> provider3, Provider<LoginRepository> provider4, Provider<AccountRepository> provider5, Provider<LoyaltyPreferencesStorage> provider6, Provider<C12074o0> provider7) {
        this.f58193a = provider;
        this.f58194b = provider2;
        this.f58195c = provider3;
        this.f58196d = provider4;
        this.f58197e = provider5;
        this.f58198f = provider6;
        this.f58199g = provider7;
    }

    /* renamed from: a */
    public static C10158g<AudienceTrackingInitializer> m102866a(Provider<C13747e> provider, Provider<C28994a> provider2, Provider<C37832c> provider3, Provider<LoginRepository> provider4, Provider<AccountRepository> provider5, Provider<LoyaltyPreferencesStorage> provider6, Provider<C12074o0> provider7) {
        return new C22709b(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @C10326j("com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer.accountRepository")
    /* renamed from: b */
    public static void m102867b(AudienceTrackingInitializer audienceTrackingInitializer, AccountRepository accountRepository) {
        audienceTrackingInitializer.f58181f = accountRepository;
    }

    @C10326j("com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer.audienceTrackingAdapter")
    /* renamed from: c */
    public static void m102868c(AudienceTrackingInitializer audienceTrackingInitializer, C28994a aVar) {
        audienceTrackingInitializer.f58178c = aVar;
    }

    @C10326j("com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer.audienceTrackingManager")
    /* renamed from: d */
    public static void m102869d(AudienceTrackingInitializer audienceTrackingInitializer, C13747e eVar) {
        audienceTrackingInitializer.f58177b = eVar;
    }

    @C28659c
    @C10326j("com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer.coroutineScope")
    /* renamed from: e */
    public static void m102870e(AudienceTrackingInitializer audienceTrackingInitializer, C12074o0 o0Var) {
        audienceTrackingInitializer.f58183h = o0Var;
    }

    @C10326j("com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer.getFavoritePhysicalStoreUseCase")
    /* renamed from: f */
    public static void m102871f(AudienceTrackingInitializer audienceTrackingInitializer, C37832c cVar) {
        audienceTrackingInitializer.f58179d = cVar;
    }

    @C10326j("com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer.loginRepository")
    /* renamed from: g */
    public static void m102872g(AudienceTrackingInitializer audienceTrackingInitializer, LoginRepository loginRepository) {
        audienceTrackingInitializer.f58180e = loginRepository;
    }

    @C10326j("com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer.loyaltyPreferencesStorage")
    /* renamed from: h */
    public static void m102873h(AudienceTrackingInitializer audienceTrackingInitializer, LoyaltyPreferencesStorage loyaltyPreferencesStorage) {
        audienceTrackingInitializer.f58182g = loyaltyPreferencesStorage;
    }

    /* renamed from: i */
    public void injectMembers(AudienceTrackingInitializer audienceTrackingInitializer) {
        m102869d(audienceTrackingInitializer, this.f58193a.get());
        m102868c(audienceTrackingInitializer, this.f58194b.get());
        m102871f(audienceTrackingInitializer, this.f58195c.get());
        m102872g(audienceTrackingInitializer, this.f58196d.get());
        m102867b(audienceTrackingInitializer, this.f58197e.get());
        m102873h(audienceTrackingInitializer, this.f58198f.get());
        m102870e(audienceTrackingInitializer, this.f58199g.get());
    }
}
