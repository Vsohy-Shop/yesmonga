package com.carrefour.fid.android.checkout.presentation.p071ui.slot;

import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28936j;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.slot.k */
public final class C39934k implements C10158g<ServiceSlotOmrFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f101835a;

    /* renamed from: b */
    public final Provider<C28936j> f101836b;

    public C39934k(Provider<C28796c> provider, Provider<C28936j> provider2) {
        this.f101835a = provider;
        this.f101836b = provider2;
    }

    /* renamed from: a */
    public static C10158g<ServiceSlotOmrFragment> m162720a(Provider<C28796c> provider, Provider<C28936j> provider2) {
        return new C39934k(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.checkout.presentation.ui.slot.ServiceSlotOmrFragment.fragmentUtil")
    /* renamed from: b */
    public static void m162721b(ServiceSlotOmrFragment serviceSlotOmrFragment, C28936j jVar) {
        serviceSlotOmrFragment.f101755w = jVar;
    }

    @C10326j("com.carrefour.fid.android.checkout.presentation.ui.slot.ServiceSlotOmrFragment.navigator")
    /* renamed from: d */
    public static void m162722d(ServiceSlotOmrFragment serviceSlotOmrFragment, C28796c cVar) {
        serviceSlotOmrFragment.f101754v = cVar;
    }

    /* renamed from: c */
    public void injectMembers(ServiceSlotOmrFragment serviceSlotOmrFragment) {
        m162722d(serviceSlotOmrFragment, this.f101835a.get());
        m162721b(serviceSlotOmrFragment, this.f101836b.get());
    }
}
