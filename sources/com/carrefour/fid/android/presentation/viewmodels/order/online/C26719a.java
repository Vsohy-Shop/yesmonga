package com.carrefour.fid.android.presentation.viewmodels.order.online;

import com.carrefour.fid.android.data.repositories.OrderOnlineRepository;
import com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase;
import com.carrefour.fid.android.presentation.p035ui.orders.online.mapper.C25216a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.a */
public final class C26719a implements C10324h<ListProductsOrderedViewModel> {

    /* renamed from: a */
    public final Provider<OrderOnlineRepository> f65201a;

    /* renamed from: b */
    public final Provider<GetOrderOnlineDetailUseCase> f65202b;

    /* renamed from: c */
    public final Provider<C25216a> f65203c;

    public C26719a(Provider<OrderOnlineRepository> provider, Provider<GetOrderOnlineDetailUseCase> provider2, Provider<C25216a> provider3) {
        this.f65201a = provider;
        this.f65202b = provider2;
        this.f65203c = provider3;
    }

    /* renamed from: a */
    public static C26719a m113466a(Provider<OrderOnlineRepository> provider, Provider<GetOrderOnlineDetailUseCase> provider2, Provider<C25216a> provider3) {
        return new C26719a(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static ListProductsOrderedViewModel m113467c(OrderOnlineRepository orderOnlineRepository, GetOrderOnlineDetailUseCase getOrderOnlineDetailUseCase, C25216a aVar) {
        return new ListProductsOrderedViewModel(orderOnlineRepository, getOrderOnlineDetailUseCase, aVar);
    }

    /* renamed from: b */
    public ListProductsOrderedViewModel get() {
        return m113467c(this.f65201a.get(), this.f65202b.get(), this.f65203c.get());
    }
}
