package com.carrefour.fid.android.presentation.p035ui.notification;

import com.carrefour.fid.android.presentation.viewmodels.notification.C26628a;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.notification.d */
public final class C24652d implements C10158g<SubscribeToNewsNotificationFragment> {

    /* renamed from: a */
    public final Provider<C26628a> f61238a;

    public C24652d(Provider<C26628a> provider) {
        this.f61238a = provider;
    }

    /* renamed from: a */
    public static C10158g<SubscribeToNewsNotificationFragment> m107701a(Provider<C26628a> provider) {
        return new C24652d(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.notification.SubscribeToNewsNotificationFragment.analyticsViewModel")
    /* renamed from: b */
    public static void m107702b(SubscribeToNewsNotificationFragment subscribeToNewsNotificationFragment, C26628a aVar) {
        subscribeToNewsNotificationFragment.f61230g = aVar;
    }

    /* renamed from: c */
    public void injectMembers(SubscribeToNewsNotificationFragment subscribeToNewsNotificationFragment) {
        m107702b(subscribeToNewsNotificationFragment, this.f61238a.get());
    }
}
