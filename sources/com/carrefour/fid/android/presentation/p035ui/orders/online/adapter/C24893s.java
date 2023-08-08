package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import android.view.View;
import com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24881i;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsHeaderModel;

/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.s */
public final /* synthetic */ class C24893s implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C24881i.C24882a f61691a;

    /* renamed from: b */
    public final /* synthetic */ OrdersOnlineDetailsHeaderModel f61692b;

    public /* synthetic */ C24893s(C24881i.C24882a aVar, OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel) {
        this.f61691a = aVar;
        this.f61692b = ordersOnlineDetailsHeaderModel;
    }

    public final void onClick(View view) {
        OrdersOnlineDetailsHeaderViewHolder.m108249t(this.f61691a, this.f61692b, view);
    }
}
