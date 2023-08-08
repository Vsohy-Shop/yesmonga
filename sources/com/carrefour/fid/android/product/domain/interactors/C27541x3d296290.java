package com.carrefour.fid.android.product.domain.interactors;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.interactors.ProductGetProductChannelTypesUseCase", mo22502f = "ProductGetProductChannelTypesUseCase.kt", mo22503i = {0, 0}, mo22504l = {18, 23}, mo22505m = "getProductChannelTypesByGtin-Uu2huJk", mo22506n = {"this", "gtin"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.domain.interactors.ProductGetProductChannelTypesUseCase$getProductChannelTypesByGtin$1 */
public final class C27541x3d296290 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductGetProductChannelTypesUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27541x3d296290(ProductGetProductChannelTypesUseCase productGetProductChannelTypesUseCase, C11045c<? super C27541x3d296290> cVar) {
        super(cVar);
        this.this$0 = productGetProductChannelTypesUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.mo79986a((String) null, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
