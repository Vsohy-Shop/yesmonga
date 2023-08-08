package com.carrefour.fid.android.presentation.viewmodels.confirmation;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel", mo22502f = "CheckoutConfirmationViewModel.kt", mo22503i = {}, mo22504l = {102}, mo22505m = "getStoreDistance", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CheckoutConfirmationViewModel$getStoreDistance$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckoutConfirmationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutConfirmationViewModel$getStoreDistance$1(CheckoutConfirmationViewModel checkoutConfirmationViewModel, C11045c<? super CheckoutConfirmationViewModel$getStoreDistance$1> cVar) {
        super(cVar);
        this.this$0 = checkoutConfirmationViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo76181C0(this);
    }
}
