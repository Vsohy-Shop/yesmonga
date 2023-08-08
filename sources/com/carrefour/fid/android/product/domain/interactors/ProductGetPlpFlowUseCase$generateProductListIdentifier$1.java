package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.models.product.C38104c;
import com.carrefour.fid.android.domain.models.product.ProductListParam;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.interactors.ProductGetPlpFlowUseCase", mo22502f = "ProductGetPlpFlowUseCase.kt", mo22503i = {0, 0}, mo22504l = {46}, mo22505m = "generateProductListIdentifier", mo22506n = {"params", "facetSelection"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ProductGetPlpFlowUseCase$generateProductListIdentifier$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductGetPlpFlowUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductGetPlpFlowUseCase$generateProductListIdentifier$1(ProductGetPlpFlowUseCase productGetPlpFlowUseCase, C11045c<? super ProductGetPlpFlowUseCase$generateProductListIdentifier$1> cVar) {
        super(cVar);
        this.this$0 = productGetPlpFlowUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo79984b((ProductListParam) null, (C38104c) null, this);
    }
}
