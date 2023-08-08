package com.carrefour.fid.android.presentation.p035ui.confirmation;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment", mo22502f = "CheckoutConfirmationFragment.kt", mo22503i = {}, mo22504l = {310}, mo22505m = "getConfirmationOrErrorThanks", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$getConfirmationOrErrorThanks$1 */
public final class CheckoutConfirmationFragment$getConfirmationOrErrorThanks$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckoutConfirmationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutConfirmationFragment$getConfirmationOrErrorThanks$1(CheckoutConfirmationFragment checkoutConfirmationFragment, C11045c<? super CheckoutConfirmationFragment$getConfirmationOrErrorThanks$1> cVar) {
        super(cVar);
        this.this$0 = checkoutConfirmationFragment;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo69497E1(this);
    }
}
