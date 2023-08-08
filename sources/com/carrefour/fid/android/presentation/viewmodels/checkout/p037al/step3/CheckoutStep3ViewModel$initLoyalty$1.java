package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel", mo22502f = "CheckoutStep3ViewModel.kt", mo22503i = {0, 1, 1, 2, 2, 2}, mo22504l = {175, 179, 184}, mo22505m = "initLoyalty", mo22506n = {"this", "this", "card", "this", "card", "balance"}, mo22507s = {"L$0", "L$0", "L$1", "L$0", "L$1", "D$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step3.CheckoutStep3ViewModel$initLoyalty$1 */
public final class CheckoutStep3ViewModel$initLoyalty$1 extends ContinuationImpl {
    double D$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckoutStep3ViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep3ViewModel$initLoyalty$1(CheckoutStep3ViewModel checkoutStep3ViewModel, C11045c<? super CheckoutStep3ViewModel$initLoyalty$1> cVar) {
        super(cVar);
        this.this$0 = checkoutStep3ViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo75827J0(this);
    }
}
