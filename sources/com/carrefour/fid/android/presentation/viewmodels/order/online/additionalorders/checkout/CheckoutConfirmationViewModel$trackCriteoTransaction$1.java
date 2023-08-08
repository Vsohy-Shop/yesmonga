package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout;

import com.carrefour.fid.android.domain.models.OrderConfirmationModel;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel", mo22502f = "CheckoutConfirmationViewModel.kt", mo22503i = {0, 0, 1, 1, 2, 2}, mo22504l = {237, 234, 248}, mo22505m = "trackCriteoTransaction", mo22506n = {"this", "orderConfirmationModel", "this", "orderConfirmationModel", "this", "orderConfirmationModel"}, mo22507s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CheckoutConfirmationViewModel$trackCriteoTransaction$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckoutConfirmationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutConfirmationViewModel$trackCriteoTransaction$1(CheckoutConfirmationViewModel checkoutConfirmationViewModel, C11045c<? super CheckoutConfirmationViewModel$trackCriteoTransaction$1> cVar) {
        super(cVar);
        this.this$0 = checkoutConfirmationViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo77711t0((OrderConfirmationModel) null, this);
    }
}
