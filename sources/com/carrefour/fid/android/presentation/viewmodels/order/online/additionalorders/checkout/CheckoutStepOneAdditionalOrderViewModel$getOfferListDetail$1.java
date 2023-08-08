package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout;

import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import java.util.List;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepOneAdditionalOrderViewModel", mo22502f = "CheckoutStepOneAdditionalOrderViewModel.kt", mo22503i = {0, 0, 1, 1, 2, 2, 3, 4}, mo22504l = {217, 218, 214, 267, 274}, mo22505m = "getOfferListDetail", mo22506n = {"this", "discounts", "this", "discounts", "this", "discounts", "this", "this"}, mo22507s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CheckoutStepOneAdditionalOrderViewModel$getOfferListDetail$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckoutStepOneAdditionalOrderViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStepOneAdditionalOrderViewModel$getOfferListDetail$1(CheckoutStepOneAdditionalOrderViewModel checkoutStepOneAdditionalOrderViewModel, C11045c<? super CheckoutStepOneAdditionalOrderViewModel$getOfferListDetail$1> cVar) {
        super(cVar);
        this.this$0 = checkoutStepOneAdditionalOrderViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo77831E0((List<String>) null, (List<OfferDiscountDomain>) null, this);
    }
}
