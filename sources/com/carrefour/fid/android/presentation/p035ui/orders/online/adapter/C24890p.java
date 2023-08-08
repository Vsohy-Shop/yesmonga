package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import android.view.View;
import com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24881i;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsHeaderModel;

/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.p */
public final /* synthetic */ class C24890p implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C24881i.C24882a f61685a;

    /* renamed from: b */
    public final /* synthetic */ OrdersOnlineDetailsHeaderModel f61686b;

    public /* synthetic */ C24890p(C24881i.C24882a aVar, OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel) {
        this.f61685a = aVar;
        this.f61686b = ordersOnlineDetailsHeaderModel;
    }

    public final void onClick(View view) {
        OrdersOnlineDetailsHeaderViewHolder.m108246q(this.f61685a, this.f61686b, view);
    }
}
