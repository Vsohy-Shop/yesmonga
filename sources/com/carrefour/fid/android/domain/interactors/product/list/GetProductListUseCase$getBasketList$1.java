package com.carrefour.fid.android.domain.interactors.product.list;

import com.carrefour.fid.android.core.types.RequestType;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.product.list.GetProductListUseCase", mo22502f = "GetProductListUseCase.kt", mo22503i = {0, 0}, mo22504l = {89, 92, 94}, mo22505m = "getBasketList-YNEx5aM", mo22506n = {"this", "requestType"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class GetProductListUseCase$getBasketList$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetProductListUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetProductListUseCase$getBasketList$1(GetProductListUseCase getProductListUseCase, C11045c<? super GetProductListUseCase$getBasketList$1> cVar) {
        super(cVar);
        this.this$0 = getProductListUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo115044d((RequestType) null, this);
    }
}
