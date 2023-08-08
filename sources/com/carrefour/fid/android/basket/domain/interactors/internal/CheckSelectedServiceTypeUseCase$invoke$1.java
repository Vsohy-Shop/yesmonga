package com.carrefour.fid.android.basket.domain.interactors.internal;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.basket.domain.interactors.internal.CheckSelectedServiceTypeUseCase", mo22502f = "CheckSelectedServiceTypeUseCase.kt", mo22503i = {0, 1, 1, 1, 2, 2, 2, 2, 3, 3}, mo22504l = {22, 26, 28, 40, 41}, mo22505m = "invoke-IoAF18A", mo22506n = {"this", "this", "getServiceSelection", "storeServiceType", "this", "getServiceSelection", "storeServiceType", "basketType", "getServiceSelection", "$this$invoke_IoAF18A_u24lambda_u240"}, mo22507s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CheckSelectedServiceTypeUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckSelectedServiceTypeUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckSelectedServiceTypeUseCase$invoke$1(CheckSelectedServiceTypeUseCase checkSelectedServiceTypeUseCase, C11045c<? super CheckSelectedServiceTypeUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = checkSelectedServiceTypeUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object r2 = this.this$0.m172781invokeIoAF18A(this);
        return r2 == C11063b.m42612h() ? r2 : Result.m38701a(r2);
    }
}
