package com.carrefour.fid.android.checkout.presentation.p071ui;

import com.carrefour.fid.android.shared.util.C28936j;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.c */
public final class C39883c implements C10158g<PaymentMethodFragment> {

    /* renamed from: a */
    public final Provider<AppEnvironment> f101728a;

    /* renamed from: b */
    public final Provider<C28936j> f101729b;

    public C39883c(Provider<AppEnvironment> provider, Provider<C28936j> provider2) {
        this.f101728a = provider;
        this.f101729b = provider2;
    }

    /* renamed from: a */
    public static C10158g<PaymentMethodFragment> m162562a(Provider<AppEnvironment> provider, Provider<C28936j> provider2) {
        return new C39883c(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.checkout.presentation.ui.PaymentMethodFragment.appEnvironment")
    /* renamed from: b */
    public static void m162563b(PaymentMethodFragment paymentMethodFragment, AppEnvironment appEnvironment) {
        paymentMethodFragment.f101700g = appEnvironment;
    }

    @C10326j("com.carrefour.fid.android.checkout.presentation.ui.PaymentMethodFragment.fragmentUtil")
    /* renamed from: c */
    public static void m162564c(PaymentMethodFragment paymentMethodFragment, C28936j jVar) {
        paymentMethodFragment.f101701v = jVar;
    }

    /* renamed from: d */
    public void injectMembers(PaymentMethodFragment paymentMethodFragment) {
        m162563b(paymentMethodFragment, this.f101728a.get());
        m162564c(paymentMethodFragment, this.f101729b.get());
    }
}
