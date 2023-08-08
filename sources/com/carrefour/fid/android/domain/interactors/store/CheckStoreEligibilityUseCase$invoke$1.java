package com.carrefour.fid.android.domain.interactors.store;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.store.CheckStoreEligibilityUseCase", mo22502f = "CheckStoreEligibilityUseCase.kt", mo22503i = {0, 1, 1, 2, 2, 3}, mo22504l = {25, 29, 36, 33}, mo22505m = "invoke-IoAF18A", mo22506n = {"this", "this", "deliveryAddress", "this", "deliveryAddress", "this"}, mo22507s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CheckStoreEligibilityUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckStoreEligibilityUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckStoreEligibilityUseCase$invoke$1(CheckStoreEligibilityUseCase checkStoreEligibilityUseCase, C11045c<? super CheckStoreEligibilityUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = checkStoreEligibilityUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object r2 = this.this$0.m173011invokeIoAF18A(this);
        return r2 == C11063b.m42612h() ? r2 : Result.m38701a(r2);
    }
}
