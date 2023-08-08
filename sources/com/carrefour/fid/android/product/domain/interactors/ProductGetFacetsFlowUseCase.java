package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.product.C37773m;
import com.carrefour.fid.android.domain.interactors.slot.C37857d;
import com.carrefour.fid.android.domain.models.product.Facet;
import com.carrefour.fid.android.domain.models.product.ProductListParam;
import com.carrefour.fid.android.performance.C38328d;
import com.carrefour.fid.android.product.domain.repositories.FacetRepository;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ProductGetFacetsFlowUseCase implements C37773m {
    @C12579k

    /* renamed from: a */
    public final FacetRepository f66859a;
    @C12579k

    /* renamed from: b */
    public final C37857d f66860b;
    @C12579k

    /* renamed from: c */
    public final C27567l f66861c;
    @C12579k

    /* renamed from: d */
    public final C38328d f66862d;

    @Inject
    public ProductGetFacetsFlowUseCase(@C12579k FacetRepository facetRepository, @C12579k C37857d dVar, @C12579k C27567l lVar, @C12579k C38328d dVar2) {
        Intrinsics.checkNotNullParameter(facetRepository, "facetRepository");
        Intrinsics.checkNotNullParameter(dVar, "getSlotSliceUseCase");
        Intrinsics.checkNotNullParameter(lVar, "productGetFacetFlowUseCase");
        Intrinsics.checkNotNullParameter(dVar2, "performance");
        this.f66859a = facetRepository;
        this.f66860b = dVar;
        this.f66861c = lVar;
        this.f66862d = dVar2;
    }

    @C12580l
    /* renamed from: e */
    public Object invoke(@C12579k ProductListParam productListParam, @C12579k C11045c<? super C11907e<Result<Facet>>> cVar) {
        return C11909g.m47376J0(new ProductGetFacetsFlowUseCase$invoke$2(this, productListParam, (C11045c<? super ProductGetFacetsFlowUseCase$invoke$2>) null));
    }
}
