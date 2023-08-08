package com.carrefour.fid.android.data.datasource;

import com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase;
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

@C11067d(mo22501c = "com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway", mo22502f = "NonFoodPaymentGateway.kt", mo22503i = {0, 0, 0, 0, 1, 1, 1, 2, 2, 2}, mo22504l = {52, 47, 56, 65}, mo22505m = "validatePayment-eH_QyT8", mo22506n = {"this", "userLoyaltyAmount", "oneOrderId", "updatedAddress", "this", "userLoyaltyAmount", "updatedAddress", "this", "userLoyaltyAmount", "ordersResponse"}, mo22507s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class NonFoodPaymentGateway$validatePayment$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NonFoodPaymentGateway this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodPaymentGateway$validatePayment$1(NonFoodPaymentGateway nonFoodPaymentGateway, C11045c<? super NonFoodPaymentGateway$validatePayment$1> cVar) {
        super(cVar);
        this.this$0 = nonFoodPaymentGateway;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object e = this.this$0.mo108672e((String) null, (BasketDomain) null, false, false, (StoreService) null, (String) null, (NonFoodValidatePaymentUseCase.C37622a.C37623a) null, this);
        return e == C11063b.m42612h() ? e : Result.m38701a(e);
    }
}
