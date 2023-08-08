package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.product.C37756f;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedAlternativeProductsFlowUseCase", mo22502f = "ProductGetConsolidatedAlternativeProductsFlowUseCase.kt", mo22503i = {}, mo22504l = {28, 27}, mo22505m = "invoke", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ProductGetConsolidatedAlternativeProductsFlowUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductGetConsolidatedAlternativeProductsFlowUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductGetConsolidatedAlternativeProductsFlowUseCase$invoke$1(ProductGetConsolidatedAlternativeProductsFlowUseCase productGetConsolidatedAlternativeProductsFlowUseCase, C11045c<? super ProductGetConsolidatedAlternativeProductsFlowUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = productGetConsolidatedAlternativeProductsFlowUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((C37756f.C37757a) null, this);
    }
}
