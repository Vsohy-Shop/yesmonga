package com.carrefour.fid.android.domain.interactors.order;

import com.carrefour.fid.android.data.repositories.OrderOfflineRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.order.f */
public final class C37730f implements C10324h<GetOrderOfflineDetailUseCase> {

    /* renamed from: a */
    public final Provider<OrderOfflineRepository> f94713a;

    public C37730f(Provider<OrderOfflineRepository> provider) {
        this.f94713a = provider;
    }

    /* renamed from: a */
    public static C37730f m154664a(Provider<OrderOfflineRepository> provider) {
        return new C37730f(provider);
    }

    /* renamed from: c */
    public static GetOrderOfflineDetailUseCase m154665c(OrderOfflineRepository orderOfflineRepository) {
        return new GetOrderOfflineDetailUseCase(orderOfflineRepository);
    }

    /* renamed from: b */
    public GetOrderOfflineDetailUseCase get() {
        return m154665c(this.f94713a.get());
    }
}
