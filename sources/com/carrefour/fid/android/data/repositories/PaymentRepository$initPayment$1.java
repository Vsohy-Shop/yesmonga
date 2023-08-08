package com.carrefour.fid.android.data.repositories;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.PaymentRepository", mo22502f = "PaymentRepository.kt", mo22503i = {}, mo22504l = {219}, mo22505m = "initPayment-BWLJW6A", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PaymentRepository$initPayment$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentRepository$initPayment$1(PaymentRepository paymentRepository, C11045c<? super PaymentRepository$initPayment$1> cVar) {
        super(cVar);
        this.this$0 = paymentRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object p = this.this$0.mo111549p((String) null, (String) null, (String) null, this);
        return p == C11063b.m42612h() ? p : Result.m38701a(p);
    }
}
