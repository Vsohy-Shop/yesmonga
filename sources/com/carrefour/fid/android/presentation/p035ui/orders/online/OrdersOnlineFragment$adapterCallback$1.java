package com.carrefour.fid.android.presentation.p035ui.orders.online;

import android.graphics.drawable.Drawable;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.type.AccountListType;
import com.carrefour.fid.android.presentation.p035ui.orders.C24680g;
import com.carrefour.fid.android.presentation.p035ui.orders.OrdersFragment;
import com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24879h;
import com.carrefour.fid.android.presentation.viewmodels.order.online.OrderOnlineListViewModel;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.OrdersOnlineFragment$adapterCallback$1 */
public final class OrdersOnlineFragment$adapterCallback$1 implements C24879h.C24880a {

    /* renamed from: a */
    public final /* synthetic */ OrdersOnlineFragment f61593a;

    public OrdersOnlineFragment$adapterCallback$1(OrdersOnlineFragment ordersOnlineFragment) {
        this.f61593a = ordersOnlineFragment;
    }

    /* renamed from: a */
    public void mo72570a(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "orderId");
        this.f61593a.mo72547X0().mo78419b();
        this.f61593a.mo72549Z0().sendIntent(new OrderOnlineListViewModel.C26714d.C26717c(str));
    }

    /* renamed from: b */
    public void mo72571b(@C12579k String str) {
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "url");
        String string = this.f61593a.getString(R.string.general_external_link_popup_title);
        String string2 = this.f61593a.getString(R.string.general_external_link_popup_message);
        String string3 = this.f61593a.getString(R.string.yes);
        String string4 = this.f61593a.getString(R.string.general_cancel);
        OrdersOnlineFragment ordersOnlineFragment = this.f61593a;
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…xternal_link_popup_title)");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.gener…ernal_link_popup_message)");
        FragmentKt.m118838z(ordersOnlineFragment, string, string2, string3, new OrdersOnlineFragment$adapterCallback$1$onWebRedirection$1(this.f61593a, str2), string4, false, (C11289a) null, (String) null, (C11289a) null, (C11289a) null, (Drawable) null, 0, 4064, (Object) null);
    }

    /* renamed from: c */
    public void mo72572c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "orderId");
        this.f61593a.mo72547X0().mo78422e();
        OrdersFragment ordersFragment = (OrdersFragment) com.carrefour.fid.android.core.extension.FragmentKt.m148916b(this.f61593a, OrdersFragment.class);
        if (ordersFragment != null) {
            FragmentKt.m118823k(ordersFragment, C24680g.f61288a.mo72133a(str, AccountListType.Order.f89772d));
        }
    }

    /* renamed from: d */
    public void mo72573d() {
        OrdersOnlineFragment ordersOnlineFragment = this.f61593a;
        FragmentExtensionKt.m58765p(ordersOnlineFragment, new OrdersOnlineFragment$adapterCallback$1$onCustomerService$1(ordersOnlineFragment));
    }

    /* renamed from: e */
    public void mo72574e(@C12579k String str, @C12579k OrderType orderType, boolean z) {
        Intrinsics.checkNotNullParameter(str, "orderId");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.f61593a.mo72547X0().mo78423f();
        OrdersFragment ordersFragment = (OrdersFragment) com.carrefour.fid.android.core.extension.FragmentKt.m148916b(this.f61593a, OrdersFragment.class);
        if (ordersFragment != null) {
            FragmentKt.m118823k(ordersFragment, C24680g.f61288a.mo72135d(orderType, str, z));
        }
    }

    /* renamed from: f */
    public void mo72575f(@C12579k String str) {
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "url");
        String string = this.f61593a.getString(R.string.general_information);
        String string2 = this.f61593a.getString(R.string.two_hours_withdrawal_pop_in_order_message);
        String string3 = this.f61593a.getString(R.string.general_see);
        String string4 = this.f61593a.getString(R.string.general_cancel);
        OrdersOnlineFragment ordersOnlineFragment = this.f61593a;
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.general_information)");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.two_h…wal_pop_in_order_message)");
        FragmentKt.m118838z(ordersOnlineFragment, string, string2, string3, new OrdersOnlineFragment$adapterCallback$1$onDisplayOrder$2(this.f61593a, str2), string4, false, (C11289a) null, (String) null, (C11289a) null, (C11289a) null, (Drawable) null, 0, 4064, (Object) null);
    }
}
