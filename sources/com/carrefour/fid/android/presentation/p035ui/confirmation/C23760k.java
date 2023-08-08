package com.carrefour.fid.android.presentation.p035ui.confirmation;

import com.CritizrSDK.C21424c;
import com.carrefour.fid.android.presentation.viewmodels.confirmation.C26196a;
import com.google.android.play.core.review.C32121c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.k */
public final class C23760k implements C10158g<CheckoutConfirmationFragment> {

    /* renamed from: a */
    public final Provider<C26196a> f59832a;

    /* renamed from: b */
    public final Provider<C21424c> f59833b;

    /* renamed from: c */
    public final Provider<C32121c> f59834c;

    public C23760k(Provider<C26196a> provider, Provider<C21424c> provider2, Provider<C32121c> provider3) {
        this.f59832a = provider;
        this.f59833b = provider2;
        this.f59834c = provider3;
    }

    /* renamed from: a */
    public static C10158g<CheckoutConfirmationFragment> m105377a(Provider<C26196a> provider, Provider<C21424c> provider2, Provider<C32121c> provider3) {
        return new C23760k(provider, provider2, provider3);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment.checkoutConfirmationAnalyticsViewModel")
    /* renamed from: b */
    public static void m105378b(CheckoutConfirmationFragment checkoutConfirmationFragment, C26196a aVar) {
        checkoutConfirmationFragment.f59779f = aVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment.critizrSDK")
    /* renamed from: c */
    public static void m105379c(CheckoutConfirmationFragment checkoutConfirmationFragment, C21424c cVar) {
        checkoutConfirmationFragment.f59780g = cVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment.reviewManager")
    /* renamed from: e */
    public static void m105380e(CheckoutConfirmationFragment checkoutConfirmationFragment, C32121c cVar) {
        checkoutConfirmationFragment.f59781v = cVar;
    }

    /* renamed from: d */
    public void injectMembers(CheckoutConfirmationFragment checkoutConfirmationFragment) {
        m105378b(checkoutConfirmationFragment, this.f59832a.get());
        m105379c(checkoutConfirmationFragment, this.f59833b.get());
        m105380e(checkoutConfirmationFragment, this.f59834c.get());
    }
}
