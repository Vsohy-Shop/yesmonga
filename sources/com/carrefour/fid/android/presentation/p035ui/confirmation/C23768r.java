package com.carrefour.fid.android.presentation.p035ui.confirmation;

import com.carrefour.fid.android.presentation.viewmodels.confirmation.C26196a;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.r */
public final class C23768r implements C10158g<CheckoutPaymentErrorFragment> {

    /* renamed from: a */
    public final Provider<C26196a> f59844a;

    public C23768r(Provider<C26196a> provider) {
        this.f59844a = provider;
    }

    /* renamed from: a */
    public static C10158g<CheckoutPaymentErrorFragment> m105396a(Provider<C26196a> provider) {
        return new C23768r(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.confirmation.CheckoutPaymentErrorFragment.checkoutConfirmationAnalyticsViewModel")
    /* renamed from: b */
    public static void m105397b(CheckoutPaymentErrorFragment checkoutPaymentErrorFragment, C26196a aVar) {
        checkoutPaymentErrorFragment.f59808f = aVar;
    }

    /* renamed from: c */
    public void injectMembers(CheckoutPaymentErrorFragment checkoutPaymentErrorFragment) {
        m105397b(checkoutPaymentErrorFragment, this.f59844a.get());
    }
}
