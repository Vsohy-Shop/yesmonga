package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepOneAdditionalOrderViewModel", mo22502f = "CheckoutStepOneAdditionalOrderViewModel.kt", mo22503i = {}, mo22504l = {419}, mo22505m = "getSlotId", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CheckoutStepOneAdditionalOrderViewModel$getSlotId$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckoutStepOneAdditionalOrderViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStepOneAdditionalOrderViewModel$getSlotId$1(CheckoutStepOneAdditionalOrderViewModel checkoutStepOneAdditionalOrderViewModel, C11045c<? super CheckoutStepOneAdditionalOrderViewModel$getSlotId$1> cVar) {
        super(cVar);
        this.this$0 = checkoutStepOneAdditionalOrderViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo77833G0(this);
    }
}
