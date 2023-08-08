package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.p */
public final class C25147p implements C10158g<CheckoutPaymentFragment> {

    /* renamed from: a */
    public final Provider<AppEnvironment> f61965a;

    public C25147p(Provider<AppEnvironment> provider) {
        this.f61965a = provider;
    }

    /* renamed from: a */
    public static C10158g<CheckoutPaymentFragment> m108779a(Provider<AppEnvironment> provider) {
        return new C25147p(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutPaymentFragment.appEnvironment")
    /* renamed from: b */
    public static void m108780b(CheckoutPaymentFragment checkoutPaymentFragment, AppEnvironment appEnvironment) {
        checkoutPaymentFragment.f61839v = appEnvironment;
    }

    /* renamed from: c */
    public void injectMembers(CheckoutPaymentFragment checkoutPaymentFragment) {
        m108780b(checkoutPaymentFragment, this.f61965a.get());
    }
}
