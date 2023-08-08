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
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.h */
public final class C23080h implements C10158g<ShoppingListFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f58746a;

    /* renamed from: b */
    public final Provider<C25882a> f58747b;

    public C23080h(Provider<C28796c> provider, Provider<C25882a> provider2) {
        this.f58746a = provider;
        this.f58747b = provider2;
    }

    /* renamed from: a */
    public static C10158g<ShoppingListFragment> m103617a(Provider<C28796c> provider, Provider<C25882a> provider2) {
        return new C23080h(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListFragment.accountListShoppingAnalytics")
    /* renamed from: b */
    public static void m103618b(ShoppingListFragment shoppingListFragment, C25882a aVar) {
        shoppingListFragment.f58693g = aVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListFragment.navigator")
    /* renamed from: d */
    public static void m103619d(ShoppingListFragment shoppingListFragment, C28796c cVar) {
        shoppingListFragment.f58692f = cVar;
    }

    /* renamed from: c */
    public void injectMembers(ShoppingListFragment shoppingListFragment) {
        m103619d(shoppingListFragment, this.f58746a.get());
        m103618b(shoppingListFragment, this.f58747b.get());
    }
}
