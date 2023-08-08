package com.carrefour.fid.android.domain.interactors.account.order;

import com.carrefour.fid.android.data.repositories.OrderOnlineRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.account.order.a */
public final class C37525a implements C10324h<GetLastOnlineOrderUseCase> {

    /* renamed from: a */
    public final Provider<OrderOnlineRepository> f94261a;

    public C37525a(Provider<OrderOnlineRepository> provider) {
        this.f94261a = provider;
    }

    /* renamed from: a */
    public static C37525a m154011a(Provider<OrderOnlineRepository> provider) {
        return new C37525a(provider);
    }

    /* renamed from: c */
    public static GetLastOnlineOrderUseCase m154012c(OrderOnlineRepository orderOnlineRepository) {
        return new GetLastOnlineOrderUseCase(orderOnlineRepository);
    }

    /* renamed from: b */
    public GetLastOnlineOrderUseCase get() {
        return m154012c(this.f94261a.get());
    }
}
