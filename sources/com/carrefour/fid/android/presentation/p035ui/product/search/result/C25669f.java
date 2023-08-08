package com.carrefour.fid.android.presentation.p035ui.product.search.result;

import com.carrefour.fid.android.presentation.viewmodels.product.list.C27180a;
import com.carrefour.fid.android.product.presentation.analytics.PlpProductAnalytics;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28936j;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.result.f */
public final class C25669f implements C10158g<AdditionalOrderSearchResultFragment> {

    /* renamed from: a */
    public final Provider<C27180a> f62942a;

    /* renamed from: b */
    public final Provider<C28796c> f62943b;

    /* renamed from: c */
    public final Provider<C28936j> f62944c;

    /* renamed from: d */
    public final Provider<PlpProductAnalytics> f62945d;

    public C25669f(Provider<C27180a> provider, Provider<C28796c> provider2, Provider<C28936j> provider3, Provider<PlpProductAnalytics> provider4) {
        this.f62942a = provider;
        this.f62943b = provider2;
        this.f62944c = provider3;
        this.f62945d = provider4;
    }

    /* renamed from: a */
    public static C10158g<AdditionalOrderSearchResultFragment> m110322a(Provider<C27180a> provider, Provider<C28796c> provider2, Provider<C28936j> provider3, Provider<PlpProductAnalytics> provider4) {
        return new C25669f(provider, provider2, provider3, provider4);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.product.search.result.AdditionalOrderSearchResultFragment.fragmentUtil")
    /* renamed from: b */
    public static void m110323b(AdditionalOrderSearchResultFragment additionalOrderSearchResultFragment, C28936j jVar) {
        additionalOrderSearchResultFragment.f62873y = jVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.product.search.result.AdditionalOrderSearchResultFragment.navigator")
    /* renamed from: d */
    public static void m110324d(AdditionalOrderSearchResultFragment additionalOrderSearchResultFragment, C28796c cVar) {
        additionalOrderSearchResultFragment.f62872x = cVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.product.search.result.AdditionalOrderSearchResultFragment.plpProductAnalytics")
    /* renamed from: e */
    public static void m110325e(AdditionalOrderSearchResultFragment additionalOrderSearchResultFragment, PlpProductAnalytics plpProductAnalytics) {
        additionalOrderSearchResultFragment.f62874z = plpProductAnalytics;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.product.search.result.AdditionalOrderSearchResultFragment.productListAnalyticsViewModel")
    /* renamed from: f */
    public static void m110326f(AdditionalOrderSearchResultFragment additionalOrderSearchResultFragment, C27180a aVar) {
        additionalOrderSearchResultFragment.f62871w = aVar;
    }

    /* renamed from: c */
    public void injectMembers(AdditionalOrderSearchResultFragment additionalOrderSearchResultFragment) {
        m110326f(additionalOrderSearchResultFragment, this.f62942a.get());
        m110324d(additionalOrderSearchResultFragment, this.f62943b.get());
        m110323b(additionalOrderSearchResultFragment, this.f62944c.get());
        m110325e(additionalOrderSearchResultFragment, this.f62945d.get());
    }
}
