package com.carrefour.fid.android.utils;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.domain.interactors.logm.C37695b;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37806a;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.utils.i */
public final class C22707i implements C10324h<ForegroundBackgroundApplicationListener> {

    /* renamed from: a */
    public final Provider<AccountRepository> f58161a;

    /* renamed from: b */
    public final Provider<LoyaltyPreferencesStorage> f58162b;

    /* renamed from: c */
    public final Provider<C37695b> f58163c;

    /* renamed from: d */
    public final Provider<AppPreferencesStorage> f58164d;

    /* renamed from: e */
    public final Provider<C37806a> f58165e;

    public C22707i(Provider<AccountRepository> provider, Provider<LoyaltyPreferencesStorage> provider2, Provider<C37695b> provider3, Provider<AppPreferencesStorage> provider4, Provider<C37806a> provider5) {
        this.f58161a = provider;
        this.f58162b = provider2;
        this.f58163c = provider3;
        this.f58164d = provider4;
        this.f58165e = provider5;
    }

    /* renamed from: a */
    public static C22707i m102804a(Provider<AccountRepository> provider, Provider<LoyaltyPreferencesStorage> provider2, Provider<C37695b> provider3, Provider<AppPreferencesStorage> provider4, Provider<C37806a> provider5) {
        return new C22707i(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static ForegroundBackgroundApplicationListener m102805c(AccountRepository accountRepository, LoyaltyPreferencesStorage loyaltyPreferencesStorage, C37695b bVar, AppPreferencesStorage appPreferencesStorage, C37806a aVar) {
        return new ForegroundBackgroundApplicationListener(accountRepository, loyaltyPreferencesStorage, bVar, appPreferencesStorage, aVar);
    }

    /* renamed from: b */
    public ForegroundBackgroundApplicationListener get() {
        return m102805c(this.f58161a.get(), this.f58162b.get(), this.f58163c.get(), this.f58164d.get(), this.f58165e.get());
    }
}
