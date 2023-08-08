package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp;

import com.carrefour.fid.android.data.managers.ClearAppManager;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.d */
public final class C24610d implements C10158g<BlockedCardFragment> {

    /* renamed from: a */
    public final Provider<ClearAppManager> f61161a;

    public C24610d(Provider<ClearAppManager> provider) {
        this.f61161a = provider;
    }

    /* renamed from: a */
    public static C10158g<BlockedCardFragment> m107596a(Provider<ClearAppManager> provider) {
        return new C24610d(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.BlockedCardFragment.clearAppManager")
    /* renamed from: b */
    public static void m107597b(BlockedCardFragment blockedCardFragment, ClearAppManager clearAppManager) {
        blockedCardFragment.f61052f = clearAppManager;
    }

    /* renamed from: c */
    public void injectMembers(BlockedCardFragment blockedCardFragment) {
        m107597b(blockedCardFragment, this.f61161a.get());
    }
}
