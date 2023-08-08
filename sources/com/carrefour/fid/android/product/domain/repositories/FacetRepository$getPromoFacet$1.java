package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.domain.models.product.C38105d;
import com.carrefour.fid.android.domain.models.product.C38111e;
import java.util.List;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.repositories.FacetRepository", mo22502f = "FacetRepository.kt", mo22503i = {0, 0, 0}, mo22504l = {86}, mo22505m = "getPromoFacet-yxL6bBk$product_release", mo22506n = {"this", "filters", "sorts"}, mo22507s = {"L$0", "L$1", "L$2"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class FacetRepository$getPromoFacet$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FacetRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetRepository$getPromoFacet$1(FacetRepository facetRepository, C11045c<? super FacetRepository$getPromoFacet$1> cVar) {
        super(cVar);
        this.this$0 = facetRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object g = this.this$0.mo80175g((String) null, (String) null, (List<C38105d>) null, (List<C38111e>) null, this);
        return g == C11063b.m42612h() ? g : Result.m38701a(g);
    }
}
