package com.carrefour.fid.android.presentation.viewmodels.order.refont.viewmodel;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.order.refont.viewmodel.OrderOnlineViewModel$getOnlineOrders$2", mo22502f = "OrderOnlineViewModel.kt", mo22503i = {}, mo22504l = {46}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class OrderOnlineViewModel$getOnlineOrders$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ OrderOnlineViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderOnlineViewModel$getOnlineOrders$2(OrderOnlineViewModel orderOnlineViewModel, C11045c<? super OrderOnlineViewModel$getOnlineOrders$2> cVar) {
        super(2, cVar);
        this.this$0 = orderOnlineViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new OrderOnlineViewModel$getOnlineOrders$2(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            OrderOnlineViewModel orderOnlineViewModel = this.this$0;
            this.label = 1;
            if (OrderOnlineViewModel.m114572l0(orderOnlineViewModel, false, this, 1, (Object) null) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((OrderOnlineViewModel$getOnlineOrders$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
