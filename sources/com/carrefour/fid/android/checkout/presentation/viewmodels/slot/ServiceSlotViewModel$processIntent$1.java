package com.carrefour.fid.android.checkout.presentation.viewmodels.slot;

import com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.C39964a;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.checkout.presentation.viewmodels.slot.ServiceSlotViewModel", mo22502f = "ServiceSlotViewModel.kt", mo22503i = {0}, mo22504l = {94, 92, 102}, mo22505m = "processIntent", mo22506n = {"intent"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ServiceSlotViewModel$processIntent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ServiceSlotViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceSlotViewModel$processIntent$1(ServiceSlotViewModel serviceSlotViewModel, C11045c<? super ServiceSlotViewModel$processIntent$1> cVar) {
        super(cVar);
        this.this$0 = serviceSlotViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.processIntent((C39964a.C39977d) null, this);
    }
}
