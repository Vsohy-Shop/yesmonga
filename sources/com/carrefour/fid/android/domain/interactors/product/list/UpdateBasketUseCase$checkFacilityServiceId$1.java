package com.carrefour.fid.android.domain.interactors.product.list;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase", mo22502f = "UpdateBasketUseCase.kt", mo22503i = {}, mo22504l = {30}, mo22505m = "checkFacilityServiceId-IoAF18A", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class UpdateBasketUseCase$checkFacilityServiceId$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdateBasketUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateBasketUseCase$checkFacilityServiceId$1(UpdateBasketUseCase updateBasketUseCase, C11045c<? super UpdateBasketUseCase$checkFacilityServiceId$1> cVar) {
        super(cVar);
        this.this$0 = updateBasketUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.mo115080b(this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
