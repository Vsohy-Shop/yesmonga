package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.al.step2.CheckoutStep2ViewModel", mo22502f = "CheckoutStep2ViewModel.kt", mo22503i = {0, 1, 1, 2}, mo22504l = {209, 213, 226, 226}, mo22505m = "observeBasket", mo22506n = {"this", "this", "basket", "this"}, mo22507s = {"L$0", "L$0", "L$1", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step2.CheckoutStep2ViewModel$observeBasket$1 */
public final class CheckoutStep2ViewModel$observeBasket$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckoutStep2ViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep2ViewModel$observeBasket$1(CheckoutStep2ViewModel checkoutStep2ViewModel, C11045c<? super CheckoutStep2ViewModel$observeBasket$1> cVar) {
        super(cVar);
        this.this$0 = checkoutStep2ViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo75754I0(this);
    }
}
