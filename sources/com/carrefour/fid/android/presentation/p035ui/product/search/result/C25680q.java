package com.carrefour.fid.android.presentation.p035ui.product.search.result;

import com.carrefour.fid.android.presentation.viewmodels.product.search.C27280k;
import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.result.q */
public final class C25680q implements C10158g<ProductSearchWithListRecommendationResultsFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f62971a;

    /* renamed from: b */
    public final Provider<C27280k> f62972b;

    public C25680q(Provider<C28796c> provider, Provider<C27280k> provider2) {
        this.f62971a = provider;
        this.f62972b = provider2;
    }

    /* renamed from: a */
    public static C10158g<ProductSearchWithListRecommendationResultsFragment> m110334a(Provider<C28796c> provider, Provider<C27280k> provider2) {
        return new C25680q(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.product.search.result.ProductSearchWithListRecommendationResultsFragment.analyticsViewModel")
    /* renamed from: b */
    public static void m110335b(ProductSearchWithListRecommendationResultsFragment productSearchWithListRecommendationResultsFragment, C27280k kVar) {
        productSearchWithListRecommendationResultsFragment.f62901v = kVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.product.search.result.ProductSearchWithListRecommendationResultsFragment.navigator")
    /* renamed from: d */
    public static void m110336d(ProductSearchWithListRecommendationResultsFragment productSearchWithListRecommendationResultsFragment, C28796c cVar) {
        productSearchWithListRecommendationResultsFragment.f62900g = cVar;
    }

    /* renamed from: c */
    public void injectMembers(ProductSearchWithListRecommendationResultsFragment productSearchWithListRecommendationResultsFragment) {
        m110336d(productSearchWithListRecommendationResultsFragment, this.f62971a.get());
        m110335b(productSearchWithListRecommendationResultsFragment, this.f62972b.get());
    }
}
