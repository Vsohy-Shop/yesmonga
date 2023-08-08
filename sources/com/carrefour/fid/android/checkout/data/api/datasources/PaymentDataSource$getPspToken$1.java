package com.carrefour.fid.android.checkout.data.api.datasources;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.checkout.data.api.datasources.PaymentDataSource", mo22502f = "PaymentDataSource.kt", mo22503i = {}, mo22504l = {22}, mo22505m = "getPspToken-BWLJW6A", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PaymentDataSource$getPspToken$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentDataSource$getPspToken$1(PaymentDataSource paymentDataSource, C11045c<? super PaymentDataSource$getPspToken$1> cVar) {
        super(cVar);
        this.this$0 = paymentDataSource;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.mo131223b((String) null, (String) null, (String) null, this);
        return b == C11063b.m42612h() ? b : Result.m38701a(b);
    }
}
