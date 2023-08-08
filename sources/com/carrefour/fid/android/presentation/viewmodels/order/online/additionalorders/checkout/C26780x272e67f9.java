package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout;

import com.carrefour.fid.android.domain.models.account.UserCards;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel", mo22502f = "CheckoutStepTwoAdditionalOderViewModel.kt", mo22503i = {0}, mo22504l = {471}, mo22505m = "getLoyaltyCardNumberFromCache", mo22506n = {"userCards"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel$getLoyaltyCardNumberFromCache$1 */
public final class C26780x272e67f9 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckoutStepTwoAdditionalOderViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26780x272e67f9(CheckoutStepTwoAdditionalOderViewModel checkoutStepTwoAdditionalOderViewModel, C11045c<? super C26780x272e67f9> cVar) {
        super(cVar);
        this.this$0 = checkoutStepTwoAdditionalOderViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo77858D0((UserCards) null, this);
    }
}
