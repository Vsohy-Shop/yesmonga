package com.carrefour.fid.android.presentation.viewmodels.order.offline;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.order.offline.OrderOfflineListViewModel", mo22502f = "OrderOfflineListViewModel.kt", mo22503i = {0, 0}, mo22504l = {146}, mo22505m = "fetchOfflineOrders", mo22506n = {"this", "isFirstPage"}, mo22507s = {"L$0", "Z$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OrderOfflineListViewModel$fetchOfflineOrders$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OrderOfflineListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderOfflineListViewModel$fetchOfflineOrders$1(OrderOfflineListViewModel orderOfflineListViewModel, C11045c<? super OrderOfflineListViewModel$fetchOfflineOrders$1> cVar) {
        super(cVar);
        this.this$0 = orderOfflineListViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo77498i0(false, this);
    }
}
