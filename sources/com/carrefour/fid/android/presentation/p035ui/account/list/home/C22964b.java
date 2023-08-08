package com.carrefour.fid.android.presentation.p035ui.account.list.home;

import com.carrefour.fid.android.presentation.viewmodels.account.list.home.C25807a;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.home.b */
public final class C22964b implements C10158g<AccountListHomeFragment> {

    /* renamed from: a */
    public final Provider<C25807a> f58599a;

    public C22964b(Provider<C25807a> provider) {
        this.f58599a = provider;
    }

    /* renamed from: a */
    public static C10158g<AccountListHomeFragment> m103370a(Provider<C25807a> provider) {
        return new C22964b(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.account.list.home.AccountListHomeFragment.accountListHomeAnalyticsViewModel")
    /* renamed from: b */
    public static void m103371b(AccountListHomeFragment accountListHomeFragment, C25807a aVar) {
        accountListHomeFragment.f58578f = aVar;
    }

    /* renamed from: c */
    public void injectMembers(AccountListHomeFragment accountListHomeFragment) {
        m103371b(accountListHomeFragment, this.f58599a.get());
    }
}
