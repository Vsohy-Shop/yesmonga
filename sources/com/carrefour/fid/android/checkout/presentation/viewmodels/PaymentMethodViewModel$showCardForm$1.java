package com.carrefour.fid.android.checkout.presentation.viewmodels;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.checkout.presentation.viewmodels.PaymentMethodViewModel", mo22502f = "PaymentMethodViewModel.kt", mo22503i = {0}, mo22504l = {18}, mo22505m = "showCardForm", mo22506n = {"this"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PaymentMethodViewModel$showCardForm$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentMethodViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodViewModel$showCardForm$1(PaymentMethodViewModel paymentMethodViewModel, C11045c<? super PaymentMethodViewModel$showCardForm$1> cVar) {
        super(cVar);
        this.this$0 = paymentMethodViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo131698f0(this);
    }
}
