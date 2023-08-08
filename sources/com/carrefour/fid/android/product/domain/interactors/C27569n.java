package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.slot.C37857d;
import com.carrefour.fid.android.performance.C38328d;
import com.carrefour.fid.android.product.domain.repositories.FacetRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.domain.interactors.n */
public final class C27569n implements C10324h<ProductGetFacetsFlowUseCase> {

    /* renamed from: a */
    public final Provider<FacetRepository> f66956a;

    /* renamed from: b */
    public final Provider<C37857d> f66957b;

    /* renamed from: c */
    public final Provider<C27567l> f66958c;

    /* renamed from: d */
    public final Provider<C38328d> f66959d;

    public C27569n(Provider<FacetRepository> provider, Provider<C37857d> provider2, Provider<C27567l> provider3, Provider<C38328d> provider4) {
        this.f66956a = provider;
        this.f66957b = provider2;
        this.f66958c = provider3;
        this.f66959d = provider4;
    }

    /* renamed from: a */
    public static C27569n m115988a(Provider<FacetRepository> provider, Provider<C37857d> provider2, Provider<C27567l> provider3, Provider<C38328d> provider4) {
        return new C27569n(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static ProductGetFacetsFlowUseCase m115989c(FacetRepository facetRepository, C37857d dVar, C27567l lVar, C38328d dVar2) {
        return new ProductGetFacetsFlowUseCase(facetRepository, dVar, lVar, dVar2);
    }

    /* renamed from: b */
    public ProductGetFacetsFlowUseCase get() {
        return m115989c(this.f66956a.get(), this.f66957b.get(), this.f66958c.get(), this.f66959d.get());
    }
}
