package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import android.view.View;
import com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24881i;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsHeaderModel;

/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.r */
public final /* synthetic */ class C24892r implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C24881i.C24882a f61689a;

    /* renamed from: b */
    public final /* synthetic */ OrdersOnlineDetailsHeaderModel f61690b;

    public /* synthetic */ C24892r(C24881i.C24882a aVar, OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel) {
        this.f61689a = aVar;
        this.f61690b = ordersOnlineDetailsHeaderModel;
    }

    public final void onClick(View view) {
        OrdersOnlineDetailsHeaderViewHolder.m108248s(this.f61689a, this.f61690b, view);
    }
}
