package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist;

import com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.analytics.C23456a;
import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.f */
public final class C23473f implements C10158g<CheckoutBasketsListFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f59342a;

    /* renamed from: b */
    public final Provider<C23456a> f59343b;

    public C23473f(Provider<C28796c> provider, Provider<C23456a> provider2) {
        this.f59342a = provider;
        this.f59343b = provider2;
    }

    /* renamed from: a */
    public static C10158g<CheckoutBasketsListFragment> m104579a(Provider<C28796c> provider, Provider<C23456a> provider2) {
        return new C23473f(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListFragment.analytics")
    /* renamed from: b */
    public static void m104580b(CheckoutBasketsListFragment checkoutBasketsListFragment, C23456a aVar) {
        checkoutBasketsListFragment.f59307g = aVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListFragment.navigator")
    /* renamed from: d */
    public static void m104581d(CheckoutBasketsListFragment checkoutBasketsListFragment, C28796c cVar) {
        checkoutBasketsListFragment.f59306f = cVar;
    }

    /* renamed from: c */
    public void injectMembers(CheckoutBasketsListFragment checkoutBasketsListFragment) {
        m104581d(checkoutBasketsListFragment, this.f59342a.get());
        m104580b(checkoutBasketsListFragment, this.f59343b.get());
    }
}
