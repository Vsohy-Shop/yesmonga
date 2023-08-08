package com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi;

import com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelection;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.viewmodels.delivery.mvi.DeliveryServiceSelectionViewModel", mo22502f = "DeliveryServiceSelectionViewModel.kt", mo22503i = {0, 0}, mo22504l = {242, 250}, mo22505m = "fetchAddress", mo22506n = {"this", "intent"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DeliveryServiceSelectionViewModel$fetchAddress$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeliveryServiceSelectionViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeliveryServiceSelectionViewModel$fetchAddress$1(DeliveryServiceSelectionViewModel deliveryServiceSelectionViewModel, C11045c<? super DeliveryServiceSelectionViewModel$fetchAddress$1> cVar) {
        super(cVar);
        this.this$0 = deliveryServiceSelectionViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchAddress((DeliveryServiceSelection.UserAction.ChangeAddress) null, this);
    }
}
