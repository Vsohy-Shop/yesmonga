package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel", mo22502f = "CheckoutStepTwoAdditionalOderViewModel.kt", mo22503i = {0, 1, 2, 3, 5, 5}, mo22504l = {419, 417, 425, 433, 452, 457}, mo22505m = "getLoyaltyBalance", mo22506n = {"this", "this", "this", "this", "this", "it"}, mo22507s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CheckoutStepTwoAdditionalOderViewModel$getLoyaltyBalance$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckoutStepTwoAdditionalOderViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStepTwoAdditionalOderViewModel$getLoyaltyBalance$1(CheckoutStepTwoAdditionalOderViewModel checkoutStepTwoAdditionalOderViewModel, C11045c<? super CheckoutStepTwoAdditionalOderViewModel$getLoyaltyBalance$1> cVar) {
        super(cVar);
        this.this$0 = checkoutStepTwoAdditionalOderViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo77856B0(this);
    }
}
