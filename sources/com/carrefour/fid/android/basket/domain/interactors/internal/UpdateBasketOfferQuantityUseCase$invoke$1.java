package com.carrefour.fid.android.basket.domain.interactors.internal;

import com.carrefour.fid.android.domain.interactors.basket.C37588n0;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase", mo22502f = "UpdateBasketOfferQuantityUseCase.kt", mo22503i = {0, 0, 1, 1, 1, 2, 2, 2, 3, 4, 4, 4, 5}, mo22504l = {26, 30, 35, 36, 40, 42, 48}, mo22505m = "invoke-gIAlu-s", mo22506n = {"this", "param", "this", "param", "facilityServiceId", "this", "param", "facilityServiceId", "this", "this", "param", "facilityServiceId", "this"}, mo22507s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$0", "L$1", "L$2", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class UpdateBasketOfferQuantityUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdateBasketOfferQuantityUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateBasketOfferQuantityUseCase$invoke$1(UpdateBasketOfferQuantityUseCase updateBasketOfferQuantityUseCase, C11045c<? super UpdateBasketOfferQuantityUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = updateBasketOfferQuantityUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.m172789invokegIAlus((C37588n0.C37589a) null, this);
        return b == C11063b.m42612h() ? b : Result.m38701a(b);
    }
}
