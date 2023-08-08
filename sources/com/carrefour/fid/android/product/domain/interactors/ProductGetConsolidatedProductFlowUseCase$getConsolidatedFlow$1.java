package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedProductFlowUseCase", mo22502f = "ProductGetConsolidatedProductFlowUseCase.kt", mo22503i = {0, 1, 2}, mo22504l = {38, 39, 40}, mo22505m = "getConsolidatedFlow", mo22506n = {"this", "this", "this"}, mo22507s = {"L$0", "L$0", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ProductGetConsolidatedProductFlowUseCase$getConsolidatedFlow$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductGetConsolidatedProductFlowUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductGetConsolidatedProductFlowUseCase$getConsolidatedFlow$1(ProductGetConsolidatedProductFlowUseCase productGetConsolidatedProductFlowUseCase, C11045c<? super ProductGetConsolidatedProductFlowUseCase$getConsolidatedFlow$1> cVar) {
        super(cVar);
        this.this$0 = productGetConsolidatedProductFlowUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo79972c((C11907e<Result<C38115c>>) null, this);
    }
}
