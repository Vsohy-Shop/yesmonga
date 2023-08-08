package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.core.paging.C36334b;
import com.carrefour.fid.android.domain.models.product.C38104c;
import com.carrefour.fid.android.domain.models.product.ProductListParam;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C11911i;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.interactors.ProductGetPlpFlowUseCase", mo22502f = "ProductGetPlpFlowUseCase.kt", mo22503i = {0, 0, 0, 0, 1, 1, 1}, mo22504l = {34, 36}, mo22505m = "invoke", mo22506n = {"this", "params", "facetSelection", "pagingEvents", "this", "pagingEvents", "shouldClearCache"}, mo22507s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "Z$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ProductGetPlpFlowUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductGetPlpFlowUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductGetPlpFlowUseCase$invoke$1(ProductGetPlpFlowUseCase productGetPlpFlowUseCase, C11045c<? super ProductGetPlpFlowUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = productGetPlpFlowUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((ProductListParam) null, (C38104c) null, (C11911i<C36334b>) null, this);
    }
}
