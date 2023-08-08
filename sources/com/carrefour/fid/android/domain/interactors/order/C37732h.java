package com.carrefour.fid.android.domain.interactors.order;

import com.carrefour.fid.android.data.repositories.OrderOnlineRepository;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.order.h */
public final class C37732h implements C10324h<GetOrderOnlineDetailUseCase> {

    /* renamed from: a */
    public final Provider<C37816e> f94718a;

    /* renamed from: b */
    public final Provider<OrderOnlineRepository> f94719b;

    public C37732h(Provider<C37816e> provider, Provider<OrderOnlineRepository> provider2) {
        this.f94718a = provider;
        this.f94719b = provider2;
    }

    /* renamed from: a */
    public static C37732h m154670a(Provider<C37816e> provider, Provider<OrderOnlineRepository> provider2) {
        return new C37732h(provider, provider2);
    }

    /* renamed from: c */
    public static GetOrderOnlineDetailUseCase m154671c(C37816e eVar, OrderOnlineRepository orderOnlineRepository) {
        return new GetOrderOnlineDetailUseCase(eVar, orderOnlineRepository);
    }

    /* renamed from: b */
    public GetOrderOnlineDetailUseCase get() {
        return m154671c(this.f94718a.get(), this.f94719b.get());
    }
}
