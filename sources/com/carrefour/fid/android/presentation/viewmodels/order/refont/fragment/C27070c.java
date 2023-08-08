package com.carrefour.fid.android.presentation.viewmodels.order.refont.fragment;

import com.carrefour.fid.android.presentation.viewmodels.order.refont.C27052b;
import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.fragment.c */
public final class C27070c implements C10158g<OrderOnlineFragment> {

    /* renamed from: a */
    public final Provider<C27052b> f65800a;

    /* renamed from: b */
    public final Provider<C28796c> f65801b;

    public C27070c(Provider<C27052b> provider, Provider<C28796c> provider2) {
        this.f65800a = provider;
        this.f65801b = provider2;
    }

    /* renamed from: a */
    public static C10158g<OrderOnlineFragment> m114409a(Provider<C27052b> provider, Provider<C28796c> provider2) {
        return new C27070c(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.presentation.viewmodels.order.refont.fragment.OrderOnlineFragment.analytics")
    /* renamed from: b */
    public static void m114410b(OrderOnlineFragment orderOnlineFragment, C27052b bVar) {
        orderOnlineFragment.f65792f = bVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.viewmodels.order.refont.fragment.OrderOnlineFragment.navigator")
    /* renamed from: d */
    public static void m114411d(OrderOnlineFragment orderOnlineFragment, C28796c cVar) {
        orderOnlineFragment.f65793g = cVar;
    }

    /* renamed from: c */
    public void injectMembers(OrderOnlineFragment orderOnlineFragment) {
        m114410b(orderOnlineFragment, this.f65800a.get());
        m114411d(orderOnlineFragment, this.f65801b.get());
    }
}
