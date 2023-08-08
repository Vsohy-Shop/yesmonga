package com.carrefour.fid.android.checkout.presentation.viewmodels.slot;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel", mo22502f = "ServiceSlotOmrViewModel.kt", mo22503i = {}, mo22504l = {371}, mo22505m = "isYieldEligible", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ServiceSlotOmrViewModel$isYieldEligible$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ServiceSlotOmrViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceSlotOmrViewModel$isYieldEligible$1(ServiceSlotOmrViewModel serviceSlotOmrViewModel, C11045c<? super ServiceSlotOmrViewModel$isYieldEligible$1> cVar) {
        super(cVar);
        this.this$0 = serviceSlotOmrViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo131718F0(this);
    }
}
