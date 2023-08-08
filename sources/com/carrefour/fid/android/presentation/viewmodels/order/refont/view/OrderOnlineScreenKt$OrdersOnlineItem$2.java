package com.carrefour.fid.android.presentation.viewmodels.order.refont.view;

import com.carrefour.fid.android.core.constants.OrderStatus;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.C27028a;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.model.OrdersOnlineItemModel;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OrderOnlineScreenKt$OrdersOnlineItem$2 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C27028a, C11079d2> $actioner;
    final /* synthetic */ OrdersOnlineItemModel $orderModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderOnlineScreenKt$OrdersOnlineItem$2(C11300l<? super C27028a, C11079d2> lVar, OrdersOnlineItemModel ordersOnlineItemModel) {
        super(0);
        this.$actioner = lVar;
        this.$orderModel = ordersOnlineItemModel;
    }

    public final void invoke() {
        boolean z;
        boolean z2;
        C11300l<C27028a, C11079d2> lVar = this.$actioner;
        String w = this.$orderModel.mo78650w();
        OrderType A = this.$orderModel.mo78621A();
        OrderStatus z3 = this.$orderModel.mo78654z();
        boolean z4 = true;
        if (Intrinsics.areEqual((Object) z3, (Object) OrderStatus.Cancelled.f89252e)) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) z3, (Object) OrderStatus.Closed.f89254e);
        }
        if (z) {
            z2 = true;
        } else {
            z2 = Intrinsics.areEqual((Object) z3, (Object) OrderStatus.Delivered.f89256e);
        }
        if (!z2) {
            z4 = Intrinsics.areEqual((Object) z3, (Object) OrderStatus.ReadyToPick.f89262e);
        }
        lVar.invoke(new C27028a.C27034f(w, A, z4));
    }
}
