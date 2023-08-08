package com.carrefour.fid.android.presentation.p035ui.orders.online;

import android.os.Bundle;
import com.carrefour.fid.android.core.constants.C36178i;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "a", "()Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.OrdersOnlineDetailsFragment$orderType$2 */
public final class OrdersOnlineDetailsFragment$orderType$2 extends Lambda implements C11289a<OrderType> {
    final /* synthetic */ OrdersOnlineDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrdersOnlineDetailsFragment$orderType$2(OrdersOnlineDetailsFragment ordersOnlineDetailsFragment) {
        super(0);
        this.this$0 = ordersOnlineDetailsFragment;
    }

    @C12579k
    /* renamed from: a */
    public final OrderType invoke() {
        Bundle arguments = this.this$0.getArguments();
        OrderType orderType = null;
        OrderType orderType2 = arguments != null ? (OrderType) arguments.getParcelable(C36178i.f89309d) : null;
        if (orderType2 instanceof OrderType) {
            orderType = orderType2;
        }
        return orderType == null ? OrderType.Unknown.f70294e : orderType;
    }
}
