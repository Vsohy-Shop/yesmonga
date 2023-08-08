package com.carrefour.fid.android.presentation.p035ui.account.consent;

import com.carrefour.fid.android.presentation.trackers.account.C38531a;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.account.consent.f */
public final class C22927f implements C10158g<AccountConsentDataTabFragment> {

    /* renamed from: a */
    public final Provider<AppEnvironment> f58522a;

    /* renamed from: b */
    public final Provider<C38531a> f58523b;

    public C22927f(Provider<AppEnvironment> provider, Provider<C38531a> provider2) {
        this.f58522a = provider;
        this.f58523b = provider2;
    }

    /* renamed from: a */
    public static C10158g<AccountConsentDataTabFragment> m103273a(Provider<AppEnvironment> provider, Provider<C38531a> provider2) {
        return new C22927f(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.account.consent.AccountConsentDataTabFragment.environment")
    /* renamed from: b */
    public static void m103274b(AccountConsentDataTabFragment accountConsentDataTabFragment, AppEnvironment appEnvironment) {
        accountConsentDataTabFragment.f58488f = appEnvironment;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.account.consent.AccountConsentDataTabFragment.tracker")
    /* renamed from: d */
    public static void m103275d(AccountConsentDataTabFragment accountConsentDataTabFragment, C38531a aVar) {
        accountConsentDataTabFragment.f58491w = aVar;
    }

    /* renamed from: c */
    public void injectMembers(AccountConsentDataTabFragment accountConsentDataTabFragment) {
        m103274b(accountConsentDataTabFragment, this.f58522a.get());
        m103275d(accountConsentDataTabFragment, this.f58523b.get());
    }
}
