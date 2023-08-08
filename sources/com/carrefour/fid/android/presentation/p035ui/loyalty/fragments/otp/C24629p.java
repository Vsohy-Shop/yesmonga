package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp;

import com.carrefour.fid.android.data.managers.ClearAppManager;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.analytics.C24603a;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.p */
public final class C24629p implements C10158g<SecretCodeFragment> {

    /* renamed from: a */
    public final Provider<C24603a> f61206a;

    /* renamed from: b */
    public final Provider<ClearAppManager> f61207b;

    public C24629p(Provider<C24603a> provider, Provider<ClearAppManager> provider2) {
        this.f61206a = provider;
        this.f61207b = provider2;
    }

    /* renamed from: a */
    public static C10158g<SecretCodeFragment> m107651a(Provider<C24603a> provider, Provider<ClearAppManager> provider2) {
        return new C24629p(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.SecretCodeFragment.clearAppManager")
    /* renamed from: b */
    public static void m107652b(SecretCodeFragment secretCodeFragment, ClearAppManager clearAppManager) {
        secretCodeFragment.f61107g = clearAppManager;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.SecretCodeFragment.otpAnalytics")
    /* renamed from: d */
    public static void m107653d(SecretCodeFragment secretCodeFragment, C24603a aVar) {
        secretCodeFragment.f61106f = aVar;
    }

    /* renamed from: c */
    public void injectMembers(SecretCodeFragment secretCodeFragment) {
        m107653d(secretCodeFragment, this.f61206a.get());
        m107652b(secretCodeFragment, this.f61207b.get());
    }
}
