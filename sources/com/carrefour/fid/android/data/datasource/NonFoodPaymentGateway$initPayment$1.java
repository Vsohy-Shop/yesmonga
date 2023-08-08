package com.carrefour.fid.android.data.datasource;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway", mo22502f = "NonFoodPaymentGateway.kt", mo22503i = {0, 0}, mo22504l = {77, 85}, mo22505m = "initPayment-0E7RQCE", mo22506n = {"this", "userLoyaltyAmount"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class NonFoodPaymentGateway$initPayment$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NonFoodPaymentGateway this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodPaymentGateway$initPayment$1(NonFoodPaymentGateway nonFoodPaymentGateway, C11045c<? super NonFoodPaymentGateway$initPayment$1> cVar) {
        super(cVar);
        this.this$0 = nonFoodPaymentGateway;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.mo108670c((String) null, (String) null, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
