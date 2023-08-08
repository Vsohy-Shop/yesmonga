package com.carrefour.fid.android.data.datasource;

import com.carrefour.fid.android.core.type.ValidatePaymentType;
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

@C11067d(mo22501c = "com.carrefour.fid.android.data.datasource.PaymentGateway", mo22502f = "PaymentGateway.kt", mo22503i = {}, mo22504l = {48, 58}, mo22505m = "validatePayment-bMdYcbs", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PaymentGateway$validatePayment$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentGateway this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentGateway$validatePayment$1(PaymentGateway paymentGateway, C11045c<? super PaymentGateway$validatePayment$1> cVar) {
        super(cVar);
        this.this$0 = paymentGateway;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object n = this.this$0.mo108680n((ValidatePaymentType) null, (BasketDomain) null, false, false, (StoreService) null, (String) null, this);
        return n == C11063b.m42612h() ? n : Result.m38701a(n);
    }
}
