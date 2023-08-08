package com.carrefour.fid.android.checkout.presentation.viewmodels.slot;

import com.carrefour.fid.android.domain.models.basket.Basket;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel", mo22502f = "ServiceSlotViewModel.kt", mo22503i = {0, 0, 0, 1, 1, 1, 1}, mo22504l = {512, 514}, mo22505m = "sendSlotSelectionAnalytics", mo22506n = {"this", "basket", "isFromHome", "this", "basket", "storeService", "isFromHome"}, mo22507s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "Z$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ServiceSlotViewModel$sendSlotSelectionAnalytics$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ServiceSlotViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceSlotViewModel$sendSlotSelectionAnalytics$1(ServiceSlotViewModel serviceSlotViewModel, C11045c<? super ServiceSlotViewModel$sendSlotSelectionAnalytics$1> cVar) {
        super(cVar);
        this.this$0 = serviceSlotViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo131753T0((Basket) null, false, this);
    }
}
