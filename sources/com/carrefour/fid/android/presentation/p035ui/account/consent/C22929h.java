package com.carrefour.fid.android.presentation.p035ui.account.consent;

import com.carrefour.fid.android.presentation.viewmodels.account.consent.C25786e;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.h */
public final class C22929h implements C10158g<AccountConsentOptinsTabFragment> {

    /* renamed from: a */
    public final Provider<AppEnvironment> f58524a;

    /* renamed from: b */
    public final Provider<C25786e> f58525b;

    public C22929h(Provider<AppEnvironment> provider, Provider<C25786e> provider2) {
        this.f58524a = provider;
        this.f58525b = provider2;
    }

    /* renamed from: a */
    public static C10158g<AccountConsentOptinsTabFragment> m103278a(Provider<AppEnvironment> provider, Provider<C25786e> provider2) {
        return new C22929h(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.account.consent.AccountConsentOptinsTabFragment.analyticsViewModel")
    /* renamed from: b */
    public static void m103279b(AccountConsentOptinsTabFragment accountConsentOptinsTabFragment, C25786e eVar) {
        accountConsentOptinsTabFragment.f58500v = eVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.account.consent.AccountConsentOptinsTabFragment.environment")
    /* renamed from: c */
    public static void m103280c(AccountConsentOptinsTabFragment accountConsentOptinsTabFragment, AppEnvironment appEnvironment) {
        accountConsentOptinsTabFragment.f58498f = appEnvironment;
    }

    /* renamed from: d */
    public void injectMembers(AccountConsentOptinsTabFragment accountConsentOptinsTabFragment) {
        m103280c(accountConsentOptinsTabFragment, this.f58524a.get());
        m103279b(accountConsentOptinsTabFragment, this.f58525b.get());
    }
}
