package com.carrefour.fid.android.presentation.viewmodels.order.online;

import com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.C27012a;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineDetailViewModel", mo22502f = "OrderOnlineDetailViewModel.kt", mo22503i = {0, 0, 1, 1, 1}, mo22504l = {41, 47}, mo22505m = "getOrderDetails", mo22506n = {"this", "intent", "this", "intent", "isShiftSlotAvailable"}, mo22507s = {"L$0", "L$1", "L$0", "L$1", "I$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OrderOnlineDetailViewModel$getOrderDetails$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OrderOnlineDetailViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderOnlineDetailViewModel$getOrderDetails$1(OrderOnlineDetailViewModel orderOnlineDetailViewModel, C11045c<? super OrderOnlineDetailViewModel$getOrderDetails$1> cVar) {
        super(cVar);
        this.this$0 = orderOnlineDetailViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo77590g0((C27012a.C27021c.C27023b) null, this);
    }
}
