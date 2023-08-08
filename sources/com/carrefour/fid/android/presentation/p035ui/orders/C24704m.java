package com.carrefour.fid.android.presentation.p035ui.orders;

import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.m */
public final class C24704m implements C10158g<OrdersSuccessHandleFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f61341a;

    public C24704m(Provider<C28796c> provider) {
        this.f61341a = provider;
    }

    /* renamed from: a */
    public static C10158g<OrdersSuccessHandleFragment> m107842a(Provider<C28796c> provider) {
        return new C24704m(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.orders.OrdersSuccessHandleFragment.navigator")
    /* renamed from: c */
    public static void m107843c(OrdersSuccessHandleFragment ordersSuccessHandleFragment, C28796c cVar) {
        ordersSuccessHandleFragment.f61272g = cVar;
    }

    /* renamed from: b */
    public void injectMembers(OrdersSuccessHandleFragment ordersSuccessHandleFragment) {
        m107843c(ordersSuccessHandleFragment, this.f61341a.get());
    }
}
