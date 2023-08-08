package com.carrefour.fid.android.presentation.p035ui.orders.offline;

import com.carrefour.fid.android.presentation.viewmodels.order.offline.C26681a;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.h */
public final class C24775h implements C10158g<OrdersOfflineDetailsFragment> {

    /* renamed from: a */
    public final Provider<C26681a> f61462a;

    public C24775h(Provider<C26681a> provider) {
        this.f61462a = provider;
    }

    /* renamed from: a */
    public static C10158g<OrdersOfflineDetailsFragment> m107973a(Provider<C26681a> provider) {
        return new C24775h(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.orders.offline.OrdersOfflineDetailsFragment.orderOfflineDetailAnalyticsViewModel")
    /* renamed from: c */
    public static void m107974c(OrdersOfflineDetailsFragment ordersOfflineDetailsFragment, C26681a aVar) {
        ordersOfflineDetailsFragment.f61352f = aVar;
    }

    /* renamed from: b */
    public void injectMembers(OrdersOfflineDetailsFragment ordersOfflineDetailsFragment) {
        m107974c(ordersOfflineDetailsFragment, this.f61462a.get());
    }
}
