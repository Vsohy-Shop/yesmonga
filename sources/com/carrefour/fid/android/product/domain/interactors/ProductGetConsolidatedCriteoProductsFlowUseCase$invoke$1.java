package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.product.C37758g;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase", mo22502f = "ProductGetConsolidatedCriteoProductsFlowUseCase.kt", mo22503i = {0, 1, 2, 3}, mo22504l = {39, 40, 41, 42}, mo22505m = "invoke", mo22506n = {"this", "this", "this", "this"}, mo22507s = {"L$0", "L$0", "L$0", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ProductGetConsolidatedCriteoProductsFlowUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductGetConsolidatedCriteoProductsFlowUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductGetConsolidatedCriteoProductsFlowUseCase$invoke$1(ProductGetConsolidatedCriteoProductsFlowUseCase productGetConsolidatedCriteoProductsFlowUseCase, C11045c<? super ProductGetConsolidatedCriteoProductsFlowUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = productGetConsolidatedCriteoProductsFlowUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((C37758g.C37759a) null, this);
    }
}
