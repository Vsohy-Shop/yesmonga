package com.carrefour.fid.android.presentation.viewmodels.order.offline;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineDetailViewModel", mo22502f = "OrderOfflineDetailViewModel.kt", mo22503i = {0, 0}, mo22504l = {108}, mo22505m = "checkOfflineBillAvailability", mo22506n = {"this", "downloadUrl"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OrderOfflineDetailViewModel$checkOfflineBillAvailability$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OrderOfflineDetailViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderOfflineDetailViewModel$checkOfflineBillAvailability$1(OrderOfflineDetailViewModel orderOfflineDetailViewModel, C11045c<? super OrderOfflineDetailViewModel$checkOfflineBillAvailability$1> cVar) {
        super(cVar);
        this.this$0 = orderOfflineDetailViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo77420h0(this);
    }
}
