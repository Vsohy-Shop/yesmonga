package com.carrefour.fid.android.presentation.viewmodels.coupons.overlay;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.f */
public final class C26315f implements C10324h<C26314e> {

    /* renamed from: a */
    public final Provider<C13783a> f64324a;

    public C26315f(Provider<C13783a> provider) {
        this.f64324a = provider;
    }

    /* renamed from: a */
    public static C26315f m112358a(Provider<C13783a> provider) {
        return new C26315f(provider);
    }

    /* renamed from: c */
    public static C26314e m112359c(C13783a aVar) {
        return new C26314e(aVar);
    }

    /* renamed from: b */
    public C26314e get() {
        return m112359c(this.f64324a.get());
    }
}
