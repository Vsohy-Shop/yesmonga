package com.carrefour.fid.android.presentation.viewmodels.order.refont.view;

import com.carrefour.fid.android.presentation.viewmodels.order.refont.C27028a;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.model.OrdersOnlineItemModel;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OrderOnlineScreenKt$OrdersOnlineItem$1 extends Lambda implements C11300l<SelfCareType, C11079d2> {
    final /* synthetic */ C11300l<C27028a, C11079d2> $actioner;
    final /* synthetic */ OrdersOnlineItemModel $orderModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderOnlineScreenKt$OrdersOnlineItem$1(OrdersOnlineItemModel ordersOnlineItemModel, C11300l<? super C27028a, C11079d2> lVar) {
        super(1);
        this.$orderModel = ordersOnlineItemModel;
        this.$actioner = lVar;
    }

    /* renamed from: a */
    public final void mo78755a(@C12579k SelfCareType selfCareType) {
        Object obj;
        Intrinsics.checkNotNullParameter(selfCareType, "selfCareType");
        SelfCareType selfCareType2 = SelfCareType.ASK_REFUND;
        if (selfCareType == selfCareType2 && Intrinsics.areEqual((Object) this.$orderModel.mo78621A(), (Object) OrderType.Lad.f70288e)) {
            obj = new C27028a.C27039k.C27047b.C27048a(this.$orderModel.mo78621A());
        } else if (selfCareType == selfCareType2) {
            obj = new C27028a.C27039k.C27040a.C27042b(this.$orderModel.mo78621A(), "url");
        } else if (selfCareType == SelfCareType.CHANGE_SLOT) {
            obj = new C27028a.C27039k.C27040a.C27044d(this.$orderModel.mo78650w(), this.$orderModel.mo78621A(), this.$orderModel.mo78645s());
        } else {
            SelfCareType selfCareType3 = SelfCareType.CANCEL_ORDER;
            if (selfCareType == selfCareType3 && Intrinsics.areEqual((Object) this.$orderModel.mo78621A(), (Object) OrderType.Lad.f70288e)) {
                obj = new C27028a.C27039k.C27047b.C27049b(this.$orderModel.mo78621A());
            } else if (selfCareType == selfCareType3) {
                obj = new C27028a.C27039k.C27040a.C27043c(this.$orderModel.mo78650w(), this.$orderModel.mo78621A());
            } else if (selfCareType == SelfCareType.ADD_FORGOTTEN_PRODUCTS) {
                obj = new C27028a.C27039k.C27040a.C27041a(this.$orderModel.mo78650w());
            } else if (selfCareType == SelfCareType.WITHDRAWAL_VOUCHER) {
                obj = new C27028a.C27039k.C27040a.C27046f(this.$orderModel.mo78650w());
            } else if (selfCareType == SelfCareType.FOLLOW_COMMAND) {
                obj = new C27028a.C27039k.C27047b.C27050c("url");
            } else if (selfCareType == SelfCareType.RE_ORDER) {
                obj = new C27028a.C27039k.C27040a.C27045e(this.$orderModel.mo78650w());
            } else {
                obj = C27028a.C27039k.C27051c.f65773a;
            }
        }
        this.$actioner.invoke(obj);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo78755a((SelfCareType) obj);
        return C11079d2.f28267a;
    }
}
