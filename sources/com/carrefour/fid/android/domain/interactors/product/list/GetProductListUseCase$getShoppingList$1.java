package com.carrefour.fid.android.domain.interactors.product.list;

import com.carrefour.fid.android.core.types.RequestType;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase", mo22502f = "GetProductListUseCase.kt", mo22503i = {}, mo22504l = {106}, mo22505m = "getShoppingList", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class GetProductListUseCase$getShoppingList$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetProductListUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetProductListUseCase$getShoppingList$1(GetProductListUseCase getProductListUseCase, C11045c<? super GetProductListUseCase$getShoppingList$1> cVar) {
        super(cVar);
        this.this$0 = getProductListUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo115046f((RequestType) null, this);
    }
}
