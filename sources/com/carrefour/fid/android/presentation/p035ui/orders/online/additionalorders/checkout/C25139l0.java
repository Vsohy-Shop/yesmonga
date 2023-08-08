package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import com.carrefour.fid.android.shared.util.C28936j;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.l0 */
public final class C25139l0 implements C10158g<CheckoutStepTwoCgvDialogFragment> {

    /* renamed from: a */
    public final Provider<C28936j> f61945a;

    public C25139l0(Provider<C28936j> provider) {
        this.f61945a = provider;
    }

    /* renamed from: a */
    public static C10158g<CheckoutStepTwoCgvDialogFragment> m108763a(Provider<C28936j> provider) {
        return new C25139l0(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutStepTwoCgvDialogFragment.fragmentUtil")
    /* renamed from: b */
    public static void m108764b(CheckoutStepTwoCgvDialogFragment checkoutStepTwoCgvDialogFragment, C28936j jVar) {
        checkoutStepTwoCgvDialogFragment.f61891x = jVar;
    }

    /* renamed from: c */
    public void injectMembers(CheckoutStepTwoCgvDialogFragment checkoutStepTwoCgvDialogFragment) {
        m108764b(checkoutStepTwoCgvDialogFragment, this.f61945a.get());
    }
}
