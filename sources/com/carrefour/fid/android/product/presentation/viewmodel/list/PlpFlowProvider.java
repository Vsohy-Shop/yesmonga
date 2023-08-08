package com.carrefour.fid.android.product.presentation.viewmodel.list;

import com.carrefour.fid.android.core.paging.C36328a;
import com.carrefour.fid.android.core.paging.C36334b;
import com.carrefour.fid.android.domain.interactors.product.C37760h;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.models.C38184v;
import com.carrefour.fid.android.product.domain.interactors.C27567l;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11911i;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class PlpFlowProvider {
    @C12579k

    /* renamed from: a */
    public final C37823k f68217a;
    @C12579k

    /* renamed from: b */
    public final C37760h f68218b;
    @C12579k

    /* renamed from: c */
    public final C27567l f68219c;
    @C12580l

    /* renamed from: d */
    public ProductListSource f68220d;

    @Inject
    public PlpFlowProvider(@C12579k C37823k kVar, @C12579k C37760h hVar, @C12579k C27567l lVar) {
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(hVar, "getConsolidatedPlpFlowUseCase");
        Intrinsics.checkNotNullParameter(lVar, "productGetFacetFlowUseCase");
        this.f68217a = kVar;
        this.f68218b = hVar;
        this.f68219c = lVar;
    }

    @C12579k
    /* renamed from: d */
    public final ProductListSource mo81907d() {
        ProductListSource productListSource = this.f68220d;
        if (productListSource != null) {
            return productListSource;
        }
        throw new IllegalStateException("currentProductListParam should be set at this point");
    }

    @C12580l
    /* renamed from: e */
    public final Object mo81908e(@C12579k ProductListSource productListSource, @C12579k C11911i<C36334b> iVar, @C12579k C11045c<? super C11907e<? extends C36328a<? extends C38184v>>> cVar) {
        return PlpFlowProviderKt.m117913d(this.f68217a, new PlpFlowProvider$getProductFlow$2(productListSource, this, iVar, (C11045c<? super PlpFlowProvider$getProductFlow$2>) null), cVar);
    }
}
