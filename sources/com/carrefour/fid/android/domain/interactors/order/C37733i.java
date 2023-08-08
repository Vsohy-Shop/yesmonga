package com.carrefour.fid.android.domain.interactors.order;

import com.carrefour.fid.android.data.repositories.OrderOnlineRepository;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.performance.C38328d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.order.i */
public final class C37733i implements C10324h<GetOrderOnlineListUseCase> {

    /* renamed from: a */
    public final Provider<OrderOnlineRepository> f94720a;

    /* renamed from: b */
    public final Provider<C37807b> f94721b;

    /* renamed from: c */
    public final Provider<C38328d> f94722c;

    public C37733i(Provider<OrderOnlineRepository> provider, Provider<C37807b> provider2, Provider<C38328d> provider3) {
        this.f94720a = provider;
        this.f94721b = provider2;
        this.f94722c = provider3;
    }

    /* renamed from: a */
    public static C37733i m154673a(Provider<OrderOnlineRepository> provider, Provider<C37807b> provider2, Provider<C38328d> provider3) {
        return new C37733i(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static GetOrderOnlineListUseCase m154674c(OrderOnlineRepository orderOnlineRepository, C37807b bVar, C38328d dVar) {
        return new GetOrderOnlineListUseCase(orderOnlineRepository, bVar, dVar);
    }

    /* renamed from: b */
    public GetOrderOnlineListUseCase get() {
        return m154674c(this.f94720a.get(), this.f94721b.get(), this.f94722c.get());
    }
}
