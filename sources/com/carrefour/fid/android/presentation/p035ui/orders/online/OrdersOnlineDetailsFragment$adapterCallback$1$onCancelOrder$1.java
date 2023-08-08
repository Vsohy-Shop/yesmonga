package com.carrefour.fid.android.presentation.p035ui.orders.online;

import com.carrefour.fid.android.presentation.viewmodels.order.online.mvi.C27012a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.OrdersOnlineDetailsFragment$adapterCallback$1$onCancelOrder$1 */
public final class OrdersOnlineDetailsFragment$adapterCallback$1$onCancelOrder$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ OrdersOnlineDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrdersOnlineDetailsFragment$adapterCallback$1$onCancelOrder$1(OrdersOnlineDetailsFragment ordersOnlineDetailsFragment) {
        super(0);
        this.this$0 = ordersOnlineDetailsFragment;
    }

    public final void invoke() {
        this.this$0.mo72508f1().sendIntent(C27012a.C27021c.C27022a.f65711a);
    }
}
