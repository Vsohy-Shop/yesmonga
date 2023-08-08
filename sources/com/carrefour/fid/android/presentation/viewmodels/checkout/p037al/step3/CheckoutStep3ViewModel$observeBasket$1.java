package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel", mo22502f = "CheckoutStep3ViewModel.kt", mo22503i = {0}, mo22504l = {207, 207}, mo22505m = "observeBasket", mo22506n = {"this"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$observeBasket$1 */
public final class CheckoutStep3ViewModel$observeBasket$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckoutStep3ViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep3ViewModel$observeBasket$1(CheckoutStep3ViewModel checkoutStep3ViewModel, C11045c<? super CheckoutStep3ViewModel$observeBasket$1> cVar) {
        super(cVar);
        this.this$0 = checkoutStep3ViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo75831N0(this);
    }
}
