package com.carrefour.fid.android.data.datasource;

import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.datasource.PaymentGateway", mo22502f = "PaymentGateway.kt", mo22503i = {0, 0, 0, 1, 1}, mo22504l = {88, 83, 91}, mo22505m = "createOrderForPayment-bMdYcbs", mo22506n = {"this", "userLoyaltyAmount", "oneOrderId", "this", "userLoyaltyAmount"}, mo22507s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PaymentGateway$createOrderForPayment$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentGateway this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentGateway$createOrderForPayment$1(PaymentGateway paymentGateway, C11045c<? super PaymentGateway$createOrderForPayment$1> cVar) {
        super(cVar);
        this.this$0 = paymentGateway;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.mo108675h((String) null, (BasketDomain) null, false, false, (StoreService) null, (String) null, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
