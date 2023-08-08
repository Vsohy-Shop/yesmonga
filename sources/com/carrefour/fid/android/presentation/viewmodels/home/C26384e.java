package com.carrefour.fid.android.presentation.viewmodels.home;

import com.carrefour.fid.android.domain.interactors.offer.C37716b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.home.e */
public final class C26384e implements C10324h<HomeOnlineShopDetailsViewModel> {

    /* renamed from: a */
    public final Provider<C37716b> f64524a;

    public C26384e(Provider<C37716b> provider) {
        this.f64524a = provider;
    }

    /* renamed from: a */
    public static C26384e m112729a(Provider<C37716b> provider) {
        return new C26384e(provider);
    }

    /* renamed from: c */
    public static HomeOnlineShopDetailsViewModel m112730c(C37716b bVar) {
        return new HomeOnlineShopDetailsViewModel(bVar);
    }

    /* renamed from: b */
    public HomeOnlineShopDetailsViewModel get() {
        return m112730c(this.f64524a.get());
    }
}
