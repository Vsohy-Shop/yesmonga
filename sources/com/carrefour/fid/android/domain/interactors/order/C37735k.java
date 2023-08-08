package com.carrefour.fid.android.domain.interactors.order;

import com.carrefour.fid.android.presentation.p035ui.orders.online.mapper.C25222e;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.order.k */
public final class C37735k implements C10324h<OrderGetCustomerStatusUseCase> {

    /* renamed from: a */
    public final Provider<GetOrderOnlineListUseCase> f94724a;

    /* renamed from: b */
    public final Provider<C25222e> f94725b;

    public C37735k(Provider<GetOrderOnlineListUseCase> provider, Provider<C25222e> provider2) {
        this.f94724a = provider;
        this.f94725b = provider2;
    }

    /* renamed from: a */
    public static C37735k m154679a(Provider<GetOrderOnlineListUseCase> provider, Provider<C25222e> provider2) {
        return new C37735k(provider, provider2);
    }

    /* renamed from: c */
    public static OrderGetCustomerStatusUseCase m154680c(GetOrderOnlineListUseCase getOrderOnlineListUseCase, C25222e eVar) {
        return new OrderGetCustomerStatusUseCase(getOrderOnlineListUseCase, eVar);
    }

    /* renamed from: b */
    public OrderGetCustomerStatusUseCase get() {
        return m154680c(this.f94724a.get(), this.f94725b.get());
    }
}
