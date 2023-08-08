package com.carrefour.fid.android.data.datasource;

import com.carrefour.fid.android.domain.models.basket.Basket;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.datasource.PaymentGateway", mo22502f = "PaymentGateway.kt", mo22503i = {0}, mo22504l = {238, 244}, mo22505m = "getStoreService", mo22506n = {"basket"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PaymentGateway$getStoreService$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentGateway this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentGateway$getStoreService$1(PaymentGateway paymentGateway, C11045c<? super PaymentGateway$getStoreService$1> cVar) {
        super(cVar);
        this.this$0 = paymentGateway;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo108677k((Basket) null, this);
    }
}
