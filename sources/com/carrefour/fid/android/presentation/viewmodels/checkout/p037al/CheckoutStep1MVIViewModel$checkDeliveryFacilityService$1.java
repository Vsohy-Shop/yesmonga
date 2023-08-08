package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.C11289a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep1MVIViewModel", mo22502f = "CheckoutStep1MVIViewModel.kt", mo22503i = {0, 1, 1, 2, 3, 3, 4, 4, 5, 6}, mo22504l = {732, 741, 742, 749, 748, 751, 755}, mo22505m = "checkDeliveryFacilityService", mo22506n = {"this", "this", "onCheckDone", "this", "this", "onCheckDone", "this", "onCheckDone", "this", "this"}, mo22507s = {"L$0", "L$0", "L$1", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.CheckoutStep1MVIViewModel$checkDeliveryFacilityService$1 */
public final class CheckoutStep1MVIViewModel$checkDeliveryFacilityService$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CheckoutStep1MVIViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep1MVIViewModel$checkDeliveryFacilityService$1(CheckoutStep1MVIViewModel checkoutStep1MVIViewModel, C11045c<? super CheckoutStep1MVIViewModel$checkDeliveryFacilityService$1> cVar) {
        super(cVar);
        this.this$0 = checkoutStep1MVIViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo75433X0((C11289a<C11079d2>) null, this);
    }
}
