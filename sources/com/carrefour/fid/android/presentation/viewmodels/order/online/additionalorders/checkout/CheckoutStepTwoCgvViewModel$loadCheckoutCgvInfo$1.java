package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoCgvViewModel", mo22502f = "CheckoutStepTwoCgvViewModel.kt", mo22503i = {0}, mo22504l = {28}, mo22505m = "loadCheckoutCgvInfo", mo22506n = {"this"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CheckoutStepTwoCgvViewModel$loadCheckoutCgvInfo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckoutStepTwoCgvViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStepTwoCgvViewModel$loadCheckoutCgvInfo$1(CheckoutStepTwoCgvViewModel checkoutStepTwoCgvViewModel, C11045c<? super CheckoutStepTwoCgvViewModel$loadCheckoutCgvInfo$1> cVar) {
        super(cVar);
        this.this$0 = checkoutStepTwoCgvViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo77881e0(this);
    }
}
