package com.carrefour.fid.android.presentation.viewmodels.order.refont.viewmodel;

import com.carrefour.fid.android.domain.interactors.order.CancelOrderOnlineUseCase;
import com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.mapper.C27073c;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.viewmodel.b */
public final class C27095b implements C10324h<OrderOnlineViewModel> {

    /* renamed from: a */
    public final Provider<GetOrderOnlineListUseCase> f65900a;

    /* renamed from: b */
    public final Provider<C27073c> f65901b;

    /* renamed from: c */
    public final Provider<CancelOrderOnlineUseCase> f65902c;

    public C27095b(Provider<GetOrderOnlineListUseCase> provider, Provider<C27073c> provider2, Provider<CancelOrderOnlineUseCase> provider3) {
        this.f65900a = provider;
        this.f65901b = provider2;
        this.f65902c = provider3;
    }

    /* renamed from: a */
    public static C27095b m114581a(Provider<GetOrderOnlineListUseCase> provider, Provider<C27073c> provider2, Provider<CancelOrderOnlineUseCase> provider3) {
        return new C27095b(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static OrderOnlineViewModel m114582c(GetOrderOnlineListUseCase getOrderOnlineListUseCase, C27073c cVar, CancelOrderOnlineUseCase cancelOrderOnlineUseCase) {
        return new OrderOnlineViewModel(getOrderOnlineListUseCase, cVar, cancelOrderOnlineUseCase);
    }

    /* renamed from: b */
    public OrderOnlineViewModel get() {
        return m114582c(this.f65900a.get(), this.f65901b.get(), this.f65902c.get());
    }
}
