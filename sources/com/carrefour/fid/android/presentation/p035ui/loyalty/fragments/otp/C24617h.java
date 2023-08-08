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
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.h */
public final class C24617h implements C10158g<ChannelsFidFragment> {

    /* renamed from: a */
    public final Provider<C24603a> f61171a;

    /* renamed from: b */
    public final Provider<ClearAppManager> f61172b;

    public C24617h(Provider<C24603a> provider, Provider<ClearAppManager> provider2) {
        this.f61171a = provider;
        this.f61172b = provider2;
    }

    /* renamed from: a */
    public static C10158g<ChannelsFidFragment> m107618a(Provider<C24603a> provider, Provider<ClearAppManager> provider2) {
        return new C24617h(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.ChannelsFidFragment.clearAppManager")
    /* renamed from: b */
    public static void m107619b(ChannelsFidFragment channelsFidFragment, ClearAppManager clearAppManager) {
        channelsFidFragment.f61078g = clearAppManager;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.ChannelsFidFragment.otpAnalytics")
    /* renamed from: d */
    public static void m107620d(ChannelsFidFragment channelsFidFragment, C24603a aVar) {
        channelsFidFragment.f61077f = aVar;
    }

    /* renamed from: c */
    public void injectMembers(ChannelsFidFragment channelsFidFragment) {
        m107620d(channelsFidFragment, this.f61171a.get());
        m107619b(channelsFidFragment, this.f61172b.get());
    }
}
