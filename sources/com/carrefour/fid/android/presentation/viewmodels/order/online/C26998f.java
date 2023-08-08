package com.carrefour.fid.android.presentation.viewmodels.order.online;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.order.CancelOrderOnlineUseCase;
import com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase;
import com.carrefour.fid.android.domain.interactors.slot.ShiftSlotRemoteConfigUseCase;
import com.carrefour.fid.android.presentation.p035ui.orders.online.mapper.C25216a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.f */
public final class C26998f implements C10324h<OrderOnlineDetailViewModel> {

    /* renamed from: a */
    public final Provider<GetOrderOnlineDetailUseCase> f65684a;

    /* renamed from: b */
    public final Provider<CancelOrderOnlineUseCase> f65685b;

    /* renamed from: c */
    public final Provider<C25216a> f65686c;

    /* renamed from: d */
    public final Provider<ShiftSlotRemoteConfigUseCase> f65687d;

    /* renamed from: e */
    public final Provider<LoginRepository> f65688e;

    public C26998f(Provider<GetOrderOnlineDetailUseCase> provider, Provider<CancelOrderOnlineUseCase> provider2, Provider<C25216a> provider3, Provider<ShiftSlotRemoteConfigUseCase> provider4, Provider<LoginRepository> provider5) {
        this.f65684a = provider;
        this.f65685b = provider2;
        this.f65686c = provider3;
        this.f65687d = provider4;
        this.f65688e = provider5;
    }

    /* renamed from: a */
    public static C26998f m114216a(Provider<GetOrderOnlineDetailUseCase> provider, Provider<CancelOrderOnlineUseCase> provider2, Provider<C25216a> provider3, Provider<ShiftSlotRemoteConfigUseCase> provider4, Provider<LoginRepository> provider5) {
        return new C26998f(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static OrderOnlineDetailViewModel m114217c(GetOrderOnlineDetailUseCase getOrderOnlineDetailUseCase, CancelOrderOnlineUseCase cancelOrderOnlineUseCase, C25216a aVar, ShiftSlotRemoteConfigUseCase shiftSlotRemoteConfigUseCase, LoginRepository loginRepository) {
        return new OrderOnlineDetailViewModel(getOrderOnlineDetailUseCase, cancelOrderOnlineUseCase, aVar, shiftSlotRemoteConfigUseCase, loginRepository);
    }

    /* renamed from: b */
    public OrderOnlineDetailViewModel get() {
        return m114217c(this.f65684a.get(), this.f65685b.get(), this.f65686c.get(), this.f65687d.get(), this.f65688e.get());
    }
}
