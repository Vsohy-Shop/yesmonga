package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.C26007d;
import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.j */
public final class C23368j implements C10158g<CheckoutStep1Fragment> {

    /* renamed from: a */
    public final Provider<C28796c> f59167a;

    /* renamed from: b */
    public final Provider<C26007d> f59168b;

    public C23368j(Provider<C28796c> provider, Provider<C26007d> provider2) {
        this.f59167a = provider;
        this.f59168b = provider2;
    }

    /* renamed from: a */
    public static C10158g<CheckoutStep1Fragment> m104258a(Provider<C28796c> provider, Provider<C26007d> provider2) {
        return new C23368j(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment.checkoutStep1AnalyticsViewModel")
    /* renamed from: b */
    public static void m104259b(CheckoutStep1Fragment checkoutStep1Fragment, C26007d dVar) {
        checkoutStep1Fragment.f58987z = dVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment.navigator")
    /* renamed from: d */
    public static void m104260d(CheckoutStep1Fragment checkoutStep1Fragment, C28796c cVar) {
        checkoutStep1Fragment.f58981f = cVar;
    }

    /* renamed from: c */
    public void injectMembers(CheckoutStep1Fragment checkoutStep1Fragment) {
        m104260d(checkoutStep1Fragment, this.f59167a.get());
        m104259b(checkoutStep1Fragment, this.f59168b.get());
    }
}
