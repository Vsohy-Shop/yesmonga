package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.al.step2.CheckoutStep2ViewModel", mo22502f = "CheckoutStep2ViewModel.kt", mo22503i = {0, 1, 1, 2, 2}, mo22504l = {183, 184, 186}, mo22505m = "initBasketState", mo22506n = {"this", "this", "syncBasket", "this", "syncBasket"}, mo22507s = {"L$0", "L$0", "L$2", "L$0", "L$2"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step2.CheckoutStep2ViewModel$initBasketState$1 */
public final class CheckoutStep2ViewModel$initBasketState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckoutStep2ViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep2ViewModel$initBasketState$1(CheckoutStep2ViewModel checkoutStep2ViewModel, C11045c<? super CheckoutStep2ViewModel$initBasketState$1> cVar) {
        super(cVar);
        this.this$0 = checkoutStep2ViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo75750E0(this);
    }
}
