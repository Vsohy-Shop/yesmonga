package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout;

import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel", mo22502f = "CheckoutConfirmationViewModel.kt", mo22503i = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, mo22504l = {145, 152, 156, 160, 168, 169}, mo22505m = "processOrderConfirmation", mo22506n = {"this", "initialValues", "this", "initialValues", "isDeliveryStore", "this", "initialValues", "this", "initialValues", "this"}, mo22507s = {"L$0", "L$1", "L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CheckoutConfirmationViewModel$processOrderConfirmation$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckoutConfirmationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutConfirmationViewModel$processOrderConfirmation$1(CheckoutConfirmationViewModel checkoutConfirmationViewModel, C11045c<? super CheckoutConfirmationViewModel$processOrderConfirmation$1> cVar) {
        super(cVar);
        this.this$0 = checkoutConfirmationViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo77708r0((CheckoutConfirmationViewModel.C26752c.C26754b) null, this);
    }
}
