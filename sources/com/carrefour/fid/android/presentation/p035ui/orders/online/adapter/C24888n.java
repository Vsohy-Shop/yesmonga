package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import android.view.View;
import com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24881i;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsHeaderModel;

/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.n */
public final /* synthetic */ class C24888n implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C24881i.C24882a f61681a;

    /* renamed from: b */
    public final /* synthetic */ OrdersOnlineDetailsHeaderModel f61682b;

    public /* synthetic */ C24888n(C24881i.C24882a aVar, OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel) {
        this.f61681a = aVar;
        this.f61682b = ordersOnlineDetailsHeaderModel;
    }

    public final void onClick(View view) {
        OrdersOnlineDetailsHeaderViewHolder.m108244o(this.f61681a, this.f61682b, view);
    }
}
