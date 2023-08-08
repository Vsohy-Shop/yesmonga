package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.product.GetMixedProductsFlowUseCase;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.interactors.ProductGetMixedProductsFlowUseCase", mo22502f = "ProductGetMixedProductsFlowUseCase.kt", mo22503i = {0, 0}, mo22504l = {32, 34, 33}, mo22505m = "invoke", mo22506n = {"this", "params"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ProductGetMixedProductsFlowUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductGetMixedProductsFlowUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductGetMixedProductsFlowUseCase$invoke$1(ProductGetMixedProductsFlowUseCase productGetMixedProductsFlowUseCase, C11045c<? super ProductGetMixedProductsFlowUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = productGetMixedProductsFlowUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((GetMixedProductsFlowUseCase.Param) null, this);
    }
}
