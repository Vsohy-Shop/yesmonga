package com.carrefour.fid.android.loyalty.domain.interactors;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.loyalty.domain.interactors.FidelityGetCardFidAndBalanceNonFoodUseCase", mo22502f = "FidelityGetCardFidAndBalanceNonFoodUseCase.kt", mo22503i = {0, 1, 1, 2, 2, 2, 3, 3, 3}, mo22504l = {19, 20, 22, 24}, mo22505m = "invoke-IoAF18A", mo22506n = {"this", "this", "cardNumber", "this", "cardNumber", "hasCardFid", "cardNumber", "hasCardFid", "isCardFidAllowedInStore"}, mo22507s = {"L$0", "L$0", "L$1", "L$0", "L$1", "Z$0", "L$0", "Z$0", "I$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class FidelityGetCardFidAndBalanceNonFoodUseCase$invoke$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FidelityGetCardFidAndBalanceNonFoodUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FidelityGetCardFidAndBalanceNonFoodUseCase$invoke$1(FidelityGetCardFidAndBalanceNonFoodUseCase fidelityGetCardFidAndBalanceNonFoodUseCase, C11045c<? super FidelityGetCardFidAndBalanceNonFoodUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = fidelityGetCardFidAndBalanceNonFoodUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object r2 = this.this$0.m173036invokeIoAF18A(this);
        return r2 == C11063b.m42612h() ? r2 : Result.m38701a(r2);
    }
}
