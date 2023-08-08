package com.carrefour.fid.android.checkout.presentation.viewmodels.slot;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotOmrViewModel", mo22502f = "ServiceSlotOmrViewModel.kt", mo22503i = {0, 0, 0}, mo22504l = {143, 162}, mo22505m = "selectIsBookedSlot", mo22506n = {"this", "slotSelected", "isProductThresholdExceeded"}, mo22507s = {"L$0", "L$1", "Z$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ServiceSlotOmrViewModel$selectIsBookedSlot$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ServiceSlotOmrViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceSlotOmrViewModel$selectIsBookedSlot$1(ServiceSlotOmrViewModel serviceSlotOmrViewModel, C11045c<? super ServiceSlotOmrViewModel$selectIsBookedSlot$1> cVar) {
        super(cVar);
        this.this$0 = serviceSlotOmrViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo131722J0((String) null, false, this);
    }
}
