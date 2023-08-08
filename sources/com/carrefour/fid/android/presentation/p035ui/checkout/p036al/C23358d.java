package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import com.carrefour.fid.android.data.managers.ClearAppManager;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.d */
public final class C23358d implements C10158g<CheckoutFragment> {

    /* renamed from: a */
    public final Provider<ClearAppManager> f59148a;

    public C23358d(Provider<ClearAppManager> provider) {
        this.f59148a = provider;
    }

    /* renamed from: a */
    public static C10158g<CheckoutFragment> m104228a(Provider<ClearAppManager> provider) {
        return new C23358d(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutFragment.clearAppManager")
    /* renamed from: b */
    public static void m104229b(CheckoutFragment checkoutFragment, ClearAppManager clearAppManager) {
        checkoutFragment.f58956f = clearAppManager;
    }

    /* renamed from: c */
    public void injectMembers(CheckoutFragment checkoutFragment) {
        m104229b(checkoutFragment, this.f59148a.get());
    }
}
