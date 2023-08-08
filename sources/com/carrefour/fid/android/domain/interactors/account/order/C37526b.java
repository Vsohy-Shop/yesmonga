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
/* renamed from: com.carrefour.fid.android.domain.interactors.account.order.b */
public final class C37526b implements C10324h<GetOnlineOrderByIdUseCase> {

    /* renamed from: a */
    public final Provider<OrderOnlineRepository> f94262a;

    public C37526b(Provider<OrderOnlineRepository> provider) {
        this.f94262a = provider;
    }

    /* renamed from: a */
    public static C37526b m154014a(Provider<OrderOnlineRepository> provider) {
        return new C37526b(provider);
    }

    /* renamed from: c */
    public static GetOnlineOrderByIdUseCase m154015c(OrderOnlineRepository orderOnlineRepository) {
        return new GetOnlineOrderByIdUseCase(orderOnlineRepository);
    }

    /* renamed from: b */
    public GetOnlineOrderByIdUseCase get() {
        return m154015c(this.f94262a.get());
    }
}
