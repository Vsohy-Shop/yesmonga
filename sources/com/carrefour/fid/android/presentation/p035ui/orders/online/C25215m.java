package com.carrefour.fid.android.presentation.p035ui.orders.online;

import com.carrefour.fid.android.presentation.viewmodels.order.online.C27004i;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.m */
public final class C25215m implements C10158g<OrdersOnlineFragment> {

    /* renamed from: a */
    public final Provider<AppEnvironment> f62101a;

    /* renamed from: b */
    public final Provider<C27004i> f62102b;

    public C25215m(Provider<AppEnvironment> provider, Provider<C27004i> provider2) {
        this.f62101a = provider;
        this.f62102b = provider2;
    }

    /* renamed from: a */
    public static C10158g<OrdersOnlineFragment> m108969a(Provider<AppEnvironment> provider, Provider<C27004i> provider2) {
        return new C25215m(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.orders.online.OrdersOnlineFragment.appEnvironment")
    /* renamed from: b */
    public static void m108970b(OrdersOnlineFragment ordersOnlineFragment, AppEnvironment appEnvironment) {
        ordersOnlineFragment.f61579f = appEnvironment;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.orders.online.OrdersOnlineFragment.orderOnlineListAnalyticsViewModel")
    /* renamed from: d */
    public static void m108971d(OrdersOnlineFragment ordersOnlineFragment, C27004i iVar) {
        ordersOnlineFragment.f61580g = iVar;
    }

    /* renamed from: c */
    public void injectMembers(OrdersOnlineFragment ordersOnlineFragment) {
        m108970b(ordersOnlineFragment, this.f62101a.get());
        m108971d(ordersOnlineFragment, this.f62102b.get());
    }
}
