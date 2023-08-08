package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.service.C37823k;
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
/* renamed from: com.carrefour.fid.android.product.domain.interactors.d0 */
public final class C27557d0 implements C10324h<ProductUpdateFacetUseCase> {

    /* renamed from: a */
    public final Provider<C37823k> f66922a;

    /* renamed from: b */
    public final Provider<C37857d> f66923b;

    /* renamed from: c */
    public final Provider<FacetRepository> f66924c;

    /* renamed from: d */
    public final Provider<C27567l> f66925d;

    /* renamed from: e */
    public final Provider<C38328d> f66926e;

    public C27557d0(Provider<C37823k> provider, Provider<C37857d> provider2, Provider<FacetRepository> provider3, Provider<C27567l> provider4, Provider<C38328d> provider5) {
        this.f66922a = provider;
        this.f66923b = provider2;
        this.f66924c = provider3;
        this.f66925d = provider4;
        this.f66926e = provider5;
    }

    /* renamed from: a */
    public static C27557d0 m115955a(Provider<C37823k> provider, Provider<C37857d> provider2, Provider<FacetRepository> provider3, Provider<C27567l> provider4, Provider<C38328d> provider5) {
        return new C27557d0(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static ProductUpdateFacetUseCase m115956c(C37823k kVar, C37857d dVar, FacetRepository facetRepository, C27567l lVar, C38328d dVar2) {
        return new ProductUpdateFacetUseCase(kVar, dVar, facetRepository, lVar, dVar2);
    }

    /* renamed from: b */
    public ProductUpdateFacetUseCase get() {
        return m115956c(this.f66922a.get(), this.f66923b.get(), this.f66924c.get(), this.f66925d.get(), this.f66926e.get());
    }
}
