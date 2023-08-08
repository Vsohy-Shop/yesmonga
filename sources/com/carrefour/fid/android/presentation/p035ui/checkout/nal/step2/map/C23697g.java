package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.map;

import android.app.Application;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.analytics.C23614a;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.g */
public final class C23697g implements C10158g<PickupPointsMapFragment> {

    /* renamed from: a */
    public final Provider<Application> f59768a;

    /* renamed from: b */
    public final Provider<C23614a> f59769b;

    public C23697g(Provider<Application> provider, Provider<C23614a> provider2) {
        this.f59768a = provider;
        this.f59769b = provider2;
    }

    /* renamed from: a */
    public static C10158g<PickupPointsMapFragment> m105204a(Provider<Application> provider, Provider<C23614a> provider2) {
        return new C23697g(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointsMapFragment.application")
    /* renamed from: b */
    public static void m105205b(PickupPointsMapFragment pickupPointsMapFragment, Application application) {
        pickupPointsMapFragment.f59752x = application;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.checkout.nal.step2.map.PickupPointsMapFragment.nonFoodCheckoutStep2Analytics")
    /* renamed from: d */
    public static void m105206d(PickupPointsMapFragment pickupPointsMapFragment, C23614a aVar) {
        pickupPointsMapFragment.f59753y = aVar;
    }

    /* renamed from: c */
    public void injectMembers(PickupPointsMapFragment pickupPointsMapFragment) {
        m105205b(pickupPointsMapFragment, this.f59768a.get());
        m105206d(pickupPointsMapFragment, this.f59769b.get());
    }
}
