package com.carrefour.fid.android.product.presentation.p039ui.facet;

import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.product.presentation.p039ui.facet.analytics.C27950a;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.c */
public final class C27954c implements C10158g<FacetFragment> {

    /* renamed from: a */
    public final Provider<C27950a> f67788a;

    /* renamed from: b */
    public final Provider<C38326b> f67789b;

    public C27954c(Provider<C27950a> provider, Provider<C38326b> provider2) {
        this.f67788a = provider;
        this.f67789b = provider2;
    }

    /* renamed from: a */
    public static C10158g<FacetFragment> m117333a(Provider<C27950a> provider, Provider<C38326b> provider2) {
        return new C27954c(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.facet.FacetFragment.analytics")
    /* renamed from: b */
    public static void m117334b(FacetFragment facetFragment, C27950a aVar) {
        facetFragment.f67778f = aVar;
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.facet.FacetFragment.performance")
    /* renamed from: d */
    public static void m117335d(FacetFragment facetFragment, C38326b bVar) {
        facetFragment.f67779g = bVar;
    }

    /* renamed from: c */
    public void injectMembers(FacetFragment facetFragment) {
        m117334b(facetFragment, this.f67788a.get());
        m117335d(facetFragment, this.f67789b.get());
    }
}
