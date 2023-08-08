package com.carrefour.fid.android.domain.interactors.order;

import com.carrefour.fid.android.data.repositories.OrderOfflineRepository;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.performance.C38328d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.order.g */
public final class C37731g implements C10324h<GetOrderOfflineListUseCase> {

    /* renamed from: a */
    public final Provider<C37816e> f94714a;

    /* renamed from: b */
    public final Provider<OrderOfflineRepository> f94715b;

    /* renamed from: c */
    public final Provider<C37807b> f94716c;

    /* renamed from: d */
    public final Provider<C38328d> f94717d;

    public C37731g(Provider<C37816e> provider, Provider<OrderOfflineRepository> provider2, Provider<C37807b> provider3, Provider<C38328d> provider4) {
        this.f94714a = provider;
        this.f94715b = provider2;
        this.f94716c = provider3;
        this.f94717d = provider4;
    }

    /* renamed from: a */
    public static C37731g m154667a(Provider<C37816e> provider, Provider<OrderOfflineRepository> provider2, Provider<C37807b> provider3, Provider<C38328d> provider4) {
        return new C37731g(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static GetOrderOfflineListUseCase m154668c(C37816e eVar, OrderOfflineRepository orderOfflineRepository, C37807b bVar, C38328d dVar) {
        return new GetOrderOfflineListUseCase(eVar, orderOfflineRepository, bVar, dVar);
    }

    /* renamed from: b */
    public GetOrderOfflineListUseCase get() {
        return m154668c(this.f94714a.get(), this.f94715b.get(), this.f94716c.get(), this.f94717d.get());
    }
}
