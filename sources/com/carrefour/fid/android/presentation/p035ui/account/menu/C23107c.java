package com.carrefour.fid.android.presentation.p035ui.account.menu;

import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.presentation.viewmodels.account.home.C25796a;
import com.carrefour.fid.android.shared.util.C28909d;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.c */
public final class C23107c implements C10158g<AccountMenuFragment> {

    /* renamed from: a */
    public final Provider<C25796a> f58765a;

    /* renamed from: b */
    public final Provider<C28909d> f58766b;

    /* renamed from: c */
    public final Provider<AppPreferencesStorage> f58767c;

    public C23107c(Provider<C25796a> provider, Provider<C28909d> provider2, Provider<AppPreferencesStorage> provider3) {
        this.f58765a = provider;
        this.f58766b = provider2;
        this.f58767c = provider3;
    }

    /* renamed from: a */
    public static C10158g<AccountMenuFragment> m103662a(Provider<C25796a> provider, Provider<C28909d> provider2, Provider<AppPreferencesStorage> provider3) {
        return new C23107c(provider, provider2, provider3);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.account.menu.AccountMenuFragment.accountMenuAnalyticsHandler")
    /* renamed from: b */
    public static void m103663b(AccountMenuFragment accountMenuFragment, C25796a aVar) {
        accountMenuFragment.f58760f = aVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.account.menu.AccountMenuFragment.appPreferencesStorage")
    /* renamed from: c */
    public static void m103664c(AccountMenuFragment accountMenuFragment, AppPreferencesStorage appPreferencesStorage) {
        accountMenuFragment.f58762v = appPreferencesStorage;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.account.menu.AccountMenuFragment.applicationBuildInfo")
    /* renamed from: d */
    public static void m103665d(AccountMenuFragment accountMenuFragment, C28909d dVar) {
        accountMenuFragment.f58761g = dVar;
    }

    /* renamed from: e */
    public void injectMembers(AccountMenuFragment accountMenuFragment) {
        m103663b(accountMenuFragment, this.f58765a.get());
        m103665d(accountMenuFragment, this.f58766b.get());
        m103664c(accountMenuFragment, this.f58767c.get());
    }
}
