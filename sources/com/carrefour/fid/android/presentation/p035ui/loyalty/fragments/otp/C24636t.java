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
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.t */
public final class C24636t implements C10158g<ValidateOtpFragment> {

    /* renamed from: a */
    public final Provider<C24603a> f61218a;

    /* renamed from: b */
    public final Provider<ClearAppManager> f61219b;

    public C24636t(Provider<C24603a> provider, Provider<ClearAppManager> provider2) {
        this.f61218a = provider;
        this.f61219b = provider2;
    }

    /* renamed from: a */
    public static C10158g<ValidateOtpFragment> m107677a(Provider<C24603a> provider, Provider<ClearAppManager> provider2) {
        return new C24636t(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.ValidateOtpFragment.clearAppManager")
    /* renamed from: b */
    public static void m107678b(ValidateOtpFragment validateOtpFragment, ClearAppManager clearAppManager) {
        validateOtpFragment.f61133g = clearAppManager;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.ValidateOtpFragment.otpAnalytics")
    /* renamed from: d */
    public static void m107679d(ValidateOtpFragment validateOtpFragment, C24603a aVar) {
        validateOtpFragment.f61132f = aVar;
    }

    /* renamed from: c */
    public void injectMembers(ValidateOtpFragment validateOtpFragment) {
        m107679d(validateOtpFragment, this.f61218a.get());
        m107678b(validateOtpFragment, this.f61219b.get());
    }
}
