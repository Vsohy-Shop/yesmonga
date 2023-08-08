package com.carrefour.fid.android.domain.interactors.order;

import com.carrefour.fid.android.data.repositories.OrderOnlineRepository;
import com.carrefour.fid.android.domain.interactors.user.C37886i;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.order.m */
public final class C37737m implements C10324h<UpdateOrderOnlineUseCase> {

    /* renamed from: a */
    public final Provider<C37886i> f94729a;

    /* renamed from: b */
    public final Provider<OrderOnlineRepository> f94730b;

    public C37737m(Provider<C37886i> provider, Provider<OrderOnlineRepository> provider2) {
        this.f94729a = provider;
        this.f94730b = provider2;
    }

    /* renamed from: a */
    public static C37737m m154685a(Provider<C37886i> provider, Provider<OrderOnlineRepository> provider2) {
        return new C37737m(provider, provider2);
    }

    /* renamed from: c */
    public static UpdateOrderOnlineUseCase m154686c(C37886i iVar, OrderOnlineRepository orderOnlineRepository) {
        return new UpdateOrderOnlineUseCase(iVar, orderOnlineRepository);
    }

    /* renamed from: b */
    public UpdateOrderOnlineUseCase get() {
        return m154686c(this.f94729a.get(), this.f94730b.get());
    }
}
