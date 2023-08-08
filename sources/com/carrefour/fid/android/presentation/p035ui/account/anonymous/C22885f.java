package com.carrefour.fid.android.presentation.p035ui.account.anonymous;

import com.carrefour.fid.android.presentation.viewmodels.account.anonymous.C25755a;
import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import com.carrefour.fid.android.shared.util.C28909d;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.account.anonymous.f */
public final class C22885f implements C10158g<AccountAnonymousFragment> {

    /* renamed from: a */
    public final Provider<C25755a> f58474a;

    /* renamed from: b */
    public final Provider<C28909d> f58475b;

    /* renamed from: c */
    public final Provider<BaseAppPreferencesStorage> f58476c;

    public C22885f(Provider<C25755a> provider, Provider<C28909d> provider2, Provider<BaseAppPreferencesStorage> provider3) {
        this.f58474a = provider;
        this.f58475b = provider2;
        this.f58476c = provider3;
    }

    /* renamed from: a */
    public static C10158g<AccountAnonymousFragment> m103188a(Provider<C25755a> provider, Provider<C28909d> provider2, Provider<BaseAppPreferencesStorage> provider3) {
        return new C22885f(provider, provider2, provider3);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.account.anonymous.AccountAnonymousFragment.accountAnonymousAnalyticsViewModel")
    /* renamed from: b */
    public static void m103189b(AccountAnonymousFragment accountAnonymousFragment, C25755a aVar) {
        accountAnonymousFragment.f58463f = aVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.account.anonymous.AccountAnonymousFragment.applicationBuildInfo")
    /* renamed from: c */
    public static void m103190c(AccountAnonymousFragment accountAnonymousFragment, C28909d dVar) {
        accountAnonymousFragment.f58464g = dVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.account.anonymous.AccountAnonymousFragment.baseAppPreferencesStorage")
    /* renamed from: d */
    public static void m103191d(AccountAnonymousFragment accountAnonymousFragment, BaseAppPreferencesStorage baseAppPreferencesStorage) {
        accountAnonymousFragment.f58465v = baseAppPreferencesStorage;
    }

    /* renamed from: e */
    public void injectMembers(AccountAnonymousFragment accountAnonymousFragment) {
        m103189b(accountAnonymousFragment, this.f58474a.get());
        m103190c(accountAnonymousFragment, this.f58475b.get());
        m103191d(accountAnonymousFragment, this.f58476c.get());
    }
}
