package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import com.CritizrSDK.C21424c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.h */
public final class C25124h implements C10158g<CheckoutConfirmationFragment> {

    /* renamed from: a */
    public final Provider<C21424c> f61924a;

    public C25124h(Provider<C21424c> provider) {
        this.f61924a = provider;
    }

    /* renamed from: a */
    public static C10158g<CheckoutConfirmationFragment> m108718a(Provider<C21424c> provider) {
        return new C25124h(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutConfirmationFragment.critizrSDK")
    /* renamed from: b */
    public static void m108719b(CheckoutConfirmationFragment checkoutConfirmationFragment, C21424c cVar) {
        checkoutConfirmationFragment.f61796f = cVar;
    }

    /* renamed from: c */
    public void injectMembers(CheckoutConfirmationFragment checkoutConfirmationFragment) {
        m108719b(checkoutConfirmationFragment, this.f61924a.get());
    }
}
