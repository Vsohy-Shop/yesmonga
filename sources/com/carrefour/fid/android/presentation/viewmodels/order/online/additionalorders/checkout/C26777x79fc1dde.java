package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout;

import com.carrefour.fid.android.domain.models.BasketDomain;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepOneAdditionalOrderViewModel", mo22502f = "CheckoutStepOneAdditionalOrderViewModel.kt", mo22503i = {0, 0, 0, 0, 1, 1, 1}, mo22504l = {343, 351}, mo22505m = "fillStoreWithLoyaltyBenefits", mo22506n = {"this", "basket", "isLoyaltyTotalAmountZero", "isDrive", "this", "basket", "isDrive"}, mo22507s = {"L$0", "L$1", "Z$0", "I$0", "L$0", "L$1", "I$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepOneAdditionalOrderViewModel$fillStoreWithLoyaltyBenefits$1 */
public final class C26777x79fc1dde extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckoutStepOneAdditionalOrderViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26777x79fc1dde(CheckoutStepOneAdditionalOrderViewModel checkoutStepOneAdditionalOrderViewModel, C11045c<? super C26777x79fc1dde> cVar) {
        super(cVar);
        this.this$0 = checkoutStepOneAdditionalOrderViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo77828B0((BasketDomain) null, this);
    }
}
