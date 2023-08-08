package com.carrefour.fid.android.presentation.p035ui.orders.offline;

import com.carrefour.fid.android.presentation.viewmodels.order.offline.C26689f;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.l */
public final class C24779l implements C10158g<OrdersOfflineFragment> {

    /* renamed from: a */
    public final Provider<C26689f> f61466a;

    public C24779l(Provider<C26689f> provider) {
        this.f61466a = provider;
    }

    /* renamed from: a */
    public static C10158g<OrdersOfflineFragment> m107978a(Provider<C26689f> provider) {
        return new C24779l(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.orders.offline.OrdersOfflineFragment.orderOfflineListAnalyticsViewModel")
    /* renamed from: c */
    public static void m107979c(OrdersOfflineFragment ordersOfflineFragment, C26689f fVar) {
        ordersOfflineFragment.f61373f = fVar;
    }

    /* renamed from: b */
    public void injectMembers(OrdersOfflineFragment ordersOfflineFragment) {
        m107979c(ordersOfflineFragment, this.f61466a.get());
    }
}
