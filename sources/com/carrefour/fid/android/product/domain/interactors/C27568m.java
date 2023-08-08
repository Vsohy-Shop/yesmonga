package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.product.domain.repositories.FacetRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.domain.interactors.m */
public final class C27568m implements C10324h<C27567l> {

    /* renamed from: a */
    public final Provider<FacetRepository> f66955a;

    public C27568m(Provider<FacetRepository> provider) {
        this.f66955a = provider;
    }

    /* renamed from: a */
    public static C27568m m115985a(Provider<FacetRepository> provider) {
        return new C27568m(provider);
    }

    /* renamed from: c */
    public static C27567l m115986c(FacetRepository facetRepository) {
        return new C27567l(facetRepository);
    }

    /* renamed from: b */
    public C27567l get() {
        return m115986c(this.f66955a.get());
    }
}
