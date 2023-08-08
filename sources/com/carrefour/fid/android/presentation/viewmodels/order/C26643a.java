package com.carrefour.fid.android.presentation.viewmodels.order;

import com.carrefour.fid.android.data.managers.ClearAppManager;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.a */
public final class C26643a implements C10324h<OrdersViewModel> {

    /* renamed from: a */
    public final Provider<ClearAppManager> f65060a;

    public C26643a(Provider<ClearAppManager> provider) {
        this.f65060a = provider;
    }

    /* renamed from: a */
    public static C26643a m113246a(Provider<ClearAppManager> provider) {
        return new C26643a(provider);
    }

    /* renamed from: c */
    public static OrdersViewModel m113247c(ClearAppManager clearAppManager) {
        return new OrdersViewModel(clearAppManager);
    }

    /* renamed from: b */
    public OrdersViewModel get() {
        return m113247c(this.f65060a.get());
    }
}
