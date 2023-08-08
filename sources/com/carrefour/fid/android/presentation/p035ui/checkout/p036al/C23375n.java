package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import com.carrefour.fid.android.shared.util.C28936j;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.n */
public final class C23375n implements C10158g<CheckoutStep2Fragment> {

    /* renamed from: a */
    public final Provider<C28936j> f59182a;

    public C23375n(Provider<C28936j> provider) {
        this.f59182a = provider;
    }

    /* renamed from: a */
    public static C10158g<CheckoutStep2Fragment> m104290a(Provider<C28936j> provider) {
        return new C23375n(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep2Fragment.fragmentUtil")
    /* renamed from: b */
    public static void m104291b(CheckoutStep2Fragment checkoutStep2Fragment, C28936j jVar) {
        checkoutStep2Fragment.f59003f = jVar;
    }

    /* renamed from: c */
    public void injectMembers(CheckoutStep2Fragment checkoutStep2Fragment) {
        m104291b(checkoutStep2Fragment, this.f59182a.get());
    }
}
