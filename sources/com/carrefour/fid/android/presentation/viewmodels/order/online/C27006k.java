package com.carrefour.fid.android.presentation.viewmodels.order.online;

import com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase;
import com.carrefour.fid.android.presentation.p035ui.orders.online.mapper.C25222e;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.MainImmediateDispatcher"})
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.k */
public final class C27006k implements C10324h<OrderOnlineListViewModel> {

    /* renamed from: a */
    public final Provider<GetOrderOnlineListUseCase> f65693a;

    /* renamed from: b */
    public final Provider<C25222e> f65694b;

    /* renamed from: c */
    public final Provider<CoroutineDispatcher> f65695c;

    public C27006k(Provider<GetOrderOnlineListUseCase> provider, Provider<C25222e> provider2, Provider<CoroutineDispatcher> provider3) {
        this.f65693a = provider;
        this.f65694b = provider2;
        this.f65695c = provider3;
    }

    /* renamed from: a */
    public static C27006k m114236a(Provider<GetOrderOnlineListUseCase> provider, Provider<C25222e> provider2, Provider<CoroutineDispatcher> provider3) {
        return new C27006k(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static OrderOnlineListViewModel m114237c(GetOrderOnlineListUseCase getOrderOnlineListUseCase, C25222e eVar, CoroutineDispatcher coroutineDispatcher) {
        return new OrderOnlineListViewModel(getOrderOnlineListUseCase, eVar, coroutineDispatcher);
    }

    /* renamed from: b */
    public OrderOnlineListViewModel get() {
        return m114237c(this.f65693a.get(), this.f65694b.get(), this.f65695c.get());
    }
}
