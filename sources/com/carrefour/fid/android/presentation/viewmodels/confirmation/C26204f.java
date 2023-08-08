package com.carrefour.fid.android.presentation.viewmodels.confirmation;

import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.confirmation.f */
public final class C26204f implements C10158g<CheckoutConfirmationViewModel> {

    /* renamed from: a */
    public final Provider<C26196a> f64109a;

    public C26204f(Provider<C26196a> provider) {
        this.f64109a = provider;
    }

    /* renamed from: a */
    public static C10158g<CheckoutConfirmationViewModel> m112030a(Provider<C26196a> provider) {
        return new C26204f(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel.checkoutConfirmationAnalyticsViewModel")
    /* renamed from: b */
    public static void m112031b(CheckoutConfirmationViewModel checkoutConfirmationViewModel, C26196a aVar) {
        checkoutConfirmationViewModel.f64079q = aVar;
    }

    /* renamed from: c */
    public void injectMembers(CheckoutConfirmationViewModel checkoutConfirmationViewModel) {
        m112031b(checkoutConfirmationViewModel, this.f64109a.get());
    }
}
