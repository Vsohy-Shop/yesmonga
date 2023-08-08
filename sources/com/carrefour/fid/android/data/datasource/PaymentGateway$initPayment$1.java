package com.carrefour.fid.android.data.datasource;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.datasource.PaymentGateway", mo22502f = "PaymentGateway.kt", mo22503i = {0, 0}, mo22504l = {103, 111}, mo22505m = "initPayment-0E7RQCE", mo22506n = {"this", "userLoyaltyAmount"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PaymentGateway$initPayment$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentGateway this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentGateway$initPayment$1(PaymentGateway paymentGateway, C11045c<? super PaymentGateway$initPayment$1> cVar) {
        super(cVar);
        this.this$0 = paymentGateway;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object d = this.this$0.mo108678l((String) null, (String) null, this);
        return d == C11063b.m42612h() ? d : Result.m38701a(d);
    }
}
