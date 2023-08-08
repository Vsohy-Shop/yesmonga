package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import com.carrefour.fid.android.shared.util.C28936j;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.p */
public final class C23377p implements C10158g<CheckoutStep3CgvFragment> {

    /* renamed from: a */
    public final Provider<C28936j> f59183a;

    public C23377p(Provider<C28936j> provider) {
        this.f59183a = provider;
    }

    /* renamed from: a */
    public static C10158g<CheckoutStep3CgvFragment> m104294a(Provider<C28936j> provider) {
        return new C23377p(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep3CgvFragment.fragmentUtil")
    /* renamed from: b */
    public static void m104295b(CheckoutStep3CgvFragment checkoutStep3CgvFragment, C28936j jVar) {
        checkoutStep3CgvFragment.f59008g = jVar;
    }

    /* renamed from: c */
    public void injectMembers(CheckoutStep3CgvFragment checkoutStep3CgvFragment) {
        m104295b(checkoutStep3CgvFragment, this.f59183a.get());
    }
}
