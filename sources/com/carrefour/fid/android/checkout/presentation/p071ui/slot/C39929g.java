package com.carrefour.fid.android.checkout.presentation.p071ui.slot;

import com.carrefour.fid.android.checkout.presentation.analytics.C39866a;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28936j;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.g */
public final class C39929g implements C10158g<ServiceSlotFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f101822a;

    /* renamed from: b */
    public final Provider<C28936j> f101823b;

    /* renamed from: c */
    public final Provider<C39866a> f101824c;

    public C39929g(Provider<C28796c> provider, Provider<C28936j> provider2, Provider<C39866a> provider3) {
        this.f101822a = provider;
        this.f101823b = provider2;
        this.f101824c = provider3;
    }

    /* renamed from: a */
    public static C10158g<ServiceSlotFragment> m162693a(Provider<C28796c> provider, Provider<C28936j> provider2, Provider<C39866a> provider3) {
        return new C39929g(provider, provider2, provider3);
    }

    @C10326j("com.carrefour.fid.android.checkout.presentation.ui.slot.ServiceSlotFragment.analytics")
    /* renamed from: b */
    public static void m162694b(ServiceSlotFragment serviceSlotFragment, C39866a aVar) {
        serviceSlotFragment.f101738x = aVar;
    }

    @C10326j("com.carrefour.fid.android.checkout.presentation.ui.slot.ServiceSlotFragment.fragmentUtil")
    /* renamed from: c */
    public static void m162695c(ServiceSlotFragment serviceSlotFragment, C28936j jVar) {
        serviceSlotFragment.f101737w = jVar;
    }

    @C10326j("com.carrefour.fid.android.checkout.presentation.ui.slot.ServiceSlotFragment.navigator")
    /* renamed from: e */
    public static void m162696e(ServiceSlotFragment serviceSlotFragment, C28796c cVar) {
        serviceSlotFragment.f101736v = cVar;
    }

    /* renamed from: d */
    public void injectMembers(ServiceSlotFragment serviceSlotFragment) {
        m162696e(serviceSlotFragment, this.f101822a.get());
        m162695c(serviceSlotFragment, this.f101823b.get());
        m162694b(serviceSlotFragment, this.f101824c.get());
    }
}
