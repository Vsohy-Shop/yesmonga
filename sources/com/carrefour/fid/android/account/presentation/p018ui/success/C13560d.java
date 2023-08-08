package com.carrefour.fid.android.account.presentation.p018ui.success;

import com.carrefour.fid.android.account.presentation.analytics.C13294h;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.tracking.C28994a;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.account.presentation.ui.success.d */
public final class C13560d implements C10158g<AccountUpdateSuccessFragment> {

    /* renamed from: a */
    public final Provider<C13294h> f33051a;

    /* renamed from: b */
    public final Provider<C28994a> f33052b;

    /* renamed from: c */
    public final Provider<C28796c> f33053c;

    public C13560d(Provider<C13294h> provider, Provider<C28994a> provider2, Provider<C28796c> provider3) {
        this.f33051a = provider;
        this.f33052b = provider2;
        this.f33053c = provider3;
    }

    /* renamed from: a */
    public static C10158g<AccountUpdateSuccessFragment> m58129a(Provider<C13294h> provider, Provider<C28994a> provider2, Provider<C28796c> provider3) {
        return new C13560d(provider, provider2, provider3);
    }

    @C10326j("com.carrefour.fid.android.account.presentation.ui.success.AccountUpdateSuccessFragment.analyticsDelegate")
    /* renamed from: b */
    public static void m58130b(AccountUpdateSuccessFragment accountUpdateSuccessFragment, C13294h hVar) {
        accountUpdateSuccessFragment.f33039f = hVar;
    }

    @C10326j("com.carrefour.fid.android.account.presentation.ui.success.AccountUpdateSuccessFragment.audienceTrackingAdapter")
    /* renamed from: c */
    public static void m58131c(AccountUpdateSuccessFragment accountUpdateSuccessFragment, C28994a aVar) {
        accountUpdateSuccessFragment.f33040g = aVar;
    }

    @C10326j("com.carrefour.fid.android.account.presentation.ui.success.AccountUpdateSuccessFragment.navigator")
    /* renamed from: e */
    public static void m58132e(AccountUpdateSuccessFragment accountUpdateSuccessFragment, C28796c cVar) {
        accountUpdateSuccessFragment.f33041v = cVar;
    }

    /* renamed from: d */
    public void injectMembers(AccountUpdateSuccessFragment accountUpdateSuccessFragment) {
        m58130b(accountUpdateSuccessFragment, this.f33051a.get());
        m58131c(accountUpdateSuccessFragment, this.f33052b.get());
        m58132e(accountUpdateSuccessFragment, this.f33053c.get());
    }
}
