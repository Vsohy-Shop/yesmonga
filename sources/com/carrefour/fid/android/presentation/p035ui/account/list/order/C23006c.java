package com.carrefour.fid.android.presentation.p035ui.account.list.order;

import com.carrefour.fid.android.presentation.viewmodels.account.list.order.C25858a;
import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.order.c */
public final class C23006c implements C10158g<AccountListOrderFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f58652a;

    /* renamed from: b */
    public final Provider<C25858a> f58653b;

    public C23006c(Provider<C28796c> provider, Provider<C25858a> provider2) {
        this.f58652a = provider;
        this.f58653b = provider2;
    }

    /* renamed from: a */
    public static C10158g<AccountListOrderFragment> m103459a(Provider<C28796c> provider, Provider<C25858a> provider2) {
        return new C23006c(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment.accountListOrderAnalyticsViewModel")
    /* renamed from: b */
    public static void m103460b(AccountListOrderFragment accountListOrderFragment, C25858a aVar) {
        accountListOrderFragment.f58637g = aVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment.navigator")
    /* renamed from: d */
    public static void m103461d(AccountListOrderFragment accountListOrderFragment, C28796c cVar) {
        accountListOrderFragment.f58636f = cVar;
    }

    /* renamed from: c */
    public void injectMembers(AccountListOrderFragment accountListOrderFragment) {
        m103461d(accountListOrderFragment, this.f58652a.get());
        m103460b(accountListOrderFragment, this.f58653b.get());
    }
}
