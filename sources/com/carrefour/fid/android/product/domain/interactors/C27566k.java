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
/* renamed from: com.carrefour.fid.android.product.domain.interactors.k */
public final class C27566k implements C10324h<C27565j> {

    /* renamed from: a */
    public final Provider<FacetRepository> f66953a;

    public C27566k(Provider<FacetRepository> provider) {
        this.f66953a = provider;
    }

    /* renamed from: a */
    public static C27566k m115981a(Provider<FacetRepository> provider) {
        return new C27566k(provider);
    }

    /* renamed from: c */
    public static C27565j m115982c(FacetRepository facetRepository) {
        return new C27565j(facetRepository);
    }

    /* renamed from: b */
    public C27565j get() {
        return m115982c(this.f66953a.get());
    }
}
