package com.carrefour.fid.android.domain.interactors.order;

import com.carrefour.fid.android.data.repositories.OrderOnlineRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.order.d */
public final class C37728d implements C10324h<CancelOrderOnlineUseCase> {

    /* renamed from: a */
    public final Provider<OrderOnlineRepository> f94710a;

    public C37728d(Provider<OrderOnlineRepository> provider) {
        this.f94710a = provider;
    }

    /* renamed from: a */
    public static C37728d m154658a(Provider<OrderOnlineRepository> provider) {
        return new C37728d(provider);
    }

    /* renamed from: c */
    public static CancelOrderOnlineUseCase m154659c(OrderOnlineRepository orderOnlineRepository) {
        return new CancelOrderOnlineUseCase(orderOnlineRepository);
    }

    /* renamed from: b */
    public CancelOrderOnlineUseCase get() {
        return m154659c(this.f94710a.get());
    }
}
