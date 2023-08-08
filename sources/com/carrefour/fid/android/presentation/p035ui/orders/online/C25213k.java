package com.carrefour.fid.android.presentation.p035ui.orders.online;

import com.carrefour.fid.android.domain.interactors.service.C37815d;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.presentation.viewmodels.order.online.C26996d;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.k */
public final class C25213k implements C10158g<OrdersOnlineDetailsFragment> {

    /* renamed from: a */
    public final Provider<AppEnvironment> f62097a;

    /* renamed from: b */
    public final Provider<C26996d> f62098b;

    /* renamed from: c */
    public final Provider<C37815d> f62099c;

    /* renamed from: d */
    public final Provider<C37816e> f62100d;

    public C25213k(Provider<AppEnvironment> provider, Provider<C26996d> provider2, Provider<C37815d> provider3, Provider<C37816e> provider4) {
        this.f62097a = provider;
        this.f62098b = provider2;
        this.f62099c = provider3;
        this.f62100d = provider4;
    }

    /* renamed from: a */
    public static C10158g<OrdersOnlineDetailsFragment> m108962a(Provider<AppEnvironment> provider, Provider<C26996d> provider2, Provider<C37815d> provider3, Provider<C37816e> provider4) {
        return new C25213k(provider, provider2, provider3, provider4);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.orders.online.OrdersOnlineDetailsFragment.appEnvironment")
    /* renamed from: b */
    public static void m108963b(OrdersOnlineDetailsFragment ordersOnlineDetailsFragment, AppEnvironment appEnvironment) {
        ordersOnlineDetailsFragment.f61554f = appEnvironment;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.orders.online.OrdersOnlineDetailsFragment.fetchStoreServicesPictosUseCase")
    /* renamed from: c */
    public static void m108964c(OrdersOnlineDetailsFragment ordersOnlineDetailsFragment, C37815d dVar) {
        ordersOnlineDetailsFragment.f61557w = dVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.orders.online.OrdersOnlineDetailsFragment.getStoreByAnabelUseCase")
    /* renamed from: d */
    public static void m108965d(OrdersOnlineDetailsFragment ordersOnlineDetailsFragment, C37816e eVar) {
        ordersOnlineDetailsFragment.f61558x = eVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.orders.online.OrdersOnlineDetailsFragment.orderOnlineDetailAnalyticsViewModel")
    /* renamed from: f */
    public static void m108966f(OrdersOnlineDetailsFragment ordersOnlineDetailsFragment, C26996d dVar) {
        ordersOnlineDetailsFragment.f61555g = dVar;
    }

    /* renamed from: e */
    public void injectMembers(OrdersOnlineDetailsFragment ordersOnlineDetailsFragment) {
        m108963b(ordersOnlineDetailsFragment, this.f62097a.get());
        m108966f(ordersOnlineDetailsFragment, this.f62098b.get());
        m108964c(ordersOnlineDetailsFragment, this.f62099c.get());
        m108965d(ordersOnlineDetailsFragment, this.f62100d.get());
    }
}
