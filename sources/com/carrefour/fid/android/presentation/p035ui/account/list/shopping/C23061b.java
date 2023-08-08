package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.C25882a;
import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.b */
public final class C23061b implements C10158g<AccountListShoppingFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f58697a;

    /* renamed from: b */
    public final Provider<C25882a> f58698b;

    public C23061b(Provider<C28796c> provider, Provider<C25882a> provider2) {
        this.f58697a = provider;
        this.f58698b = provider2;
    }

    /* renamed from: a */
    public static C10158g<AccountListShoppingFragment> m103553a(Provider<C28796c> provider, Provider<C25882a> provider2) {
        return new C23061b(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.account.list.shopping.AccountListShoppingFragment.accountListShoppingAnalyticsViewModel")
    /* renamed from: b */
    public static void m103554b(AccountListShoppingFragment accountListShoppingFragment, C25882a aVar) {
        accountListShoppingFragment.f58665w = aVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.account.list.shopping.AccountListShoppingFragment.navigator")
    /* renamed from: d */
    public static void m103555d(AccountListShoppingFragment accountListShoppingFragment, C28796c cVar) {
        accountListShoppingFragment.f58664v = cVar;
    }

    /* renamed from: c */
    public void injectMembers(AccountListShoppingFragment accountListShoppingFragment) {
        m103555d(accountListShoppingFragment, this.f58697a.get());
        m103554b(accountListShoppingFragment, this.f58698b.get());
    }
}
