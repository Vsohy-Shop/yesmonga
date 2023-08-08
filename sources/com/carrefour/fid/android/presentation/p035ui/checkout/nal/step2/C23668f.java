package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2;

import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.analytics.C23614a;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.analytics.C24603a;
import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.f */
public final class C23668f implements C10158g<NonFoodCheckoutStep2Fragment> {

    /* renamed from: a */
    public final Provider<C28796c> f59720a;

    /* renamed from: b */
    public final Provider<C23614a> f59721b;

    /* renamed from: c */
    public final Provider<C24603a> f59722c;

    public C23668f(Provider<C28796c> provider, Provider<C23614a> provider2, Provider<C24603a> provider3) {
        this.f59720a = provider;
        this.f59721b = provider2;
        this.f59722c = provider3;
    }

    /* renamed from: a */
    public static C10158g<NonFoodCheckoutStep2Fragment> m105124a(Provider<C28796c> provider, Provider<C23614a> provider2, Provider<C24603a> provider3) {
        return new C23668f(provider, provider2, provider3);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2Fragment.analytics")
    /* renamed from: b */
    public static void m105125b(NonFoodCheckoutStep2Fragment nonFoodCheckoutStep2Fragment, C23614a aVar) {
        nonFoodCheckoutStep2Fragment.f59556g = aVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2Fragment.navigator")
    /* renamed from: d */
    public static void m105126d(NonFoodCheckoutStep2Fragment nonFoodCheckoutStep2Fragment, C28796c cVar) {
        nonFoodCheckoutStep2Fragment.f59555f = cVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2Fragment.otpAnalytics")
    /* renamed from: e */
    public static void m105127e(NonFoodCheckoutStep2Fragment nonFoodCheckoutStep2Fragment, C24603a aVar) {
        nonFoodCheckoutStep2Fragment.f59557v = aVar;
    }

    /* renamed from: c */
    public void injectMembers(NonFoodCheckoutStep2Fragment nonFoodCheckoutStep2Fragment) {
        m105126d(nonFoodCheckoutStep2Fragment, this.f59720a.get());
        m105125b(nonFoodCheckoutStep2Fragment, this.f59721b.get());
        m105127e(nonFoodCheckoutStep2Fragment, this.f59722c.get());
    }
}
