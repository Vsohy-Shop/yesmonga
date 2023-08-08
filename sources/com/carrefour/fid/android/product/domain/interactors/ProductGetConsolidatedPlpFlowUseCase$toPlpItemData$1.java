package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.core.paging.C36328a;
import com.carrefour.fid.android.domain.models.product.ProductListParam;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedPlpFlowUseCase", mo22502f = "ProductGetConsolidatedPlpFlowUseCase.kt", mo22503i = {0, 0}, mo22504l = {155}, mo22505m = "toPlpItemData", mo22506n = {"$this$toPlpItemData", "params"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ProductGetConsolidatedPlpFlowUseCase$toPlpItemData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductGetConsolidatedPlpFlowUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductGetConsolidatedPlpFlowUseCase$toPlpItemData$1(ProductGetConsolidatedPlpFlowUseCase productGetConsolidatedPlpFlowUseCase, C11045c<? super ProductGetConsolidatedPlpFlowUseCase$toPlpItemData$1> cVar) {
        super(cVar);
        this.this$0 = productGetConsolidatedPlpFlowUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo79962j((C11907e<C36328a<C38115c>>) null, (ProductListParam) null, this);
    }
}
