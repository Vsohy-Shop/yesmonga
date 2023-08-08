package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.C26016i;
import com.carrefour.fid.android.presentation.viewmodels.confirmation.C26196a;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.v */
public final class C23435v implements C10158g<CheckoutStep4Fragment> {

    /* renamed from: a */
    public final Provider<AppEnvironment> f59277a;

    /* renamed from: b */
    public final Provider<C26016i> f59278b;

    /* renamed from: c */
    public final Provider<C26196a> f59279c;

    /* renamed from: d */
    public final Provider<C37694a> f59280d;

    public C23435v(Provider<AppEnvironment> provider, Provider<C26016i> provider2, Provider<C26196a> provider3, Provider<C37694a> provider4) {
        this.f59277a = provider;
        this.f59278b = provider2;
        this.f59279c = provider3;
        this.f59280d = provider4;
    }

    /* renamed from: a */
    public static C10158g<CheckoutStep4Fragment> m104491a(Provider<AppEnvironment> provider, Provider<C26016i> provider2, Provider<C26196a> provider3, Provider<C37694a> provider4) {
        return new C23435v(provider, provider2, provider3, provider4);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep4Fragment.appEnvironment")
    /* renamed from: b */
    public static void m104492b(CheckoutStep4Fragment checkoutStep4Fragment, AppEnvironment appEnvironment) {
        checkoutStep4Fragment.f59031g = appEnvironment;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep4Fragment.checkoutConfirmationAnalyticsViewModel")
    /* renamed from: c */
    public static void m104493c(CheckoutStep4Fragment checkoutStep4Fragment, C26196a aVar) {
        checkoutStep4Fragment.f59033w = aVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep4Fragment.checkoutStep4AnalyticsViewModel")
    /* renamed from: d */
    public static void m104494d(CheckoutStep4Fragment checkoutStep4Fragment, C26016i iVar) {
        checkoutStep4Fragment.f59032v = iVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep4Fragment.remoteLogUseCase")
    /* renamed from: f */
    public static void m104495f(CheckoutStep4Fragment checkoutStep4Fragment, C37694a aVar) {
        checkoutStep4Fragment.f59034x = aVar;
    }

    /* renamed from: e */
    public void injectMembers(CheckoutStep4Fragment checkoutStep4Fragment) {
        m104492b(checkoutStep4Fragment, this.f59277a.get());
        m104494d(checkoutStep4Fragment, this.f59278b.get());
        m104493c(checkoutStep4Fragment, this.f59279c.get());
        m104495f(checkoutStep4Fragment, this.f59280d.get());
    }
}
