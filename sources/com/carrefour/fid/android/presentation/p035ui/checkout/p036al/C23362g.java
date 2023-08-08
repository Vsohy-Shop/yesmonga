package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.C26007d;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.g */
public final class C23362g implements C10158g<CheckoutStep1FooterFragment> {

    /* renamed from: a */
    public final Provider<C26007d> f59155a;

    public C23362g(Provider<C26007d> provider) {
        this.f59155a = provider;
    }

    /* renamed from: a */
    public static C10158g<CheckoutStep1FooterFragment> m104232a(Provider<C26007d> provider) {
        return new C23362g(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1FooterFragment.analyticsViewModel")
    /* renamed from: b */
    public static void m104233b(CheckoutStep1FooterFragment checkoutStep1FooterFragment, C26007d dVar) {
        checkoutStep1FooterFragment.f58966g = dVar;
    }

    /* renamed from: c */
    public void injectMembers(CheckoutStep1FooterFragment checkoutStep1FooterFragment) {
        m104233b(checkoutStep1FooterFragment, this.f59155a.get());
    }
}
