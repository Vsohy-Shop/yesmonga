package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2;

import com.carrefour.fid.android.domain.events.checkout.C37494a;
import com.carrefour.fid.android.domain.interactors.utilities.C37887a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.e */
public final class C26176e implements C10324h<PickupPointsMapViewModel> {

    /* renamed from: a */
    public final Provider<C37887a> f64017a;

    /* renamed from: b */
    public final Provider<C37494a> f64018b;

    public C26176e(Provider<C37887a> provider, Provider<C37494a> provider2) {
        this.f64017a = provider;
        this.f64018b = provider2;
    }

    /* renamed from: a */
    public static C26176e m111886a(Provider<C37887a> provider, Provider<C37494a> provider2) {
        return new C26176e(provider, provider2);
    }

    /* renamed from: c */
    public static PickupPointsMapViewModel m111887c(C37887a aVar, C37494a aVar2) {
        return new PickupPointsMapViewModel(aVar, aVar2);
    }

    /* renamed from: b */
    public PickupPointsMapViewModel get() {
        return m111887c(this.f64017a.get(), this.f64018b.get());
    }
}
