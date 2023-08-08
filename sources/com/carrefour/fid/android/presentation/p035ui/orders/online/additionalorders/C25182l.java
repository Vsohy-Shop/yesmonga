package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders;

import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.analytics.C24979a;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.l */
public final class C25182l implements C10158g<BasketAdditionalOrderFragment> {

    /* renamed from: a */
    public final Provider<C24979a> f62024a;

    public C25182l(Provider<C24979a> provider) {
        this.f62024a = provider;
    }

    /* renamed from: a */
    public static C10158g<BasketAdditionalOrderFragment> m108856a(Provider<C24979a> provider) {
        return new C25182l(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.BasketAdditionalOrderFragment.basketAdditionalOrderAnalytics")
    /* renamed from: b */
    public static void m108857b(BasketAdditionalOrderFragment basketAdditionalOrderFragment, C24979a aVar) {
        basketAdditionalOrderFragment.f61765f = aVar;
    }

    /* renamed from: c */
    public void injectMembers(BasketAdditionalOrderFragment basketAdditionalOrderFragment) {
        m108857b(basketAdditionalOrderFragment, this.f62024a.get());
    }
}
