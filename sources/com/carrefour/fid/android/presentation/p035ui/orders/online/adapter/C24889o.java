package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import android.view.View;
import com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24881i;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailsHeaderModel;

/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.o */
public final /* synthetic */ class C24889o implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C24881i.C24882a f61683a;

    /* renamed from: b */
    public final /* synthetic */ OrdersOnlineDetailsHeaderModel f61684b;

    public /* synthetic */ C24889o(C24881i.C24882a aVar, OrdersOnlineDetailsHeaderModel ordersOnlineDetailsHeaderModel) {
        this.f61683a = aVar;
        this.f61684b = ordersOnlineDetailsHeaderModel;
    }

    public final void onClick(View view) {
        OrdersOnlineDetailsHeaderViewHolder.m108245p(this.f61683a, this.f61684b, view);
    }
}
