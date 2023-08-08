package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders;

import com.carrefour.fid.android.domain.interactors.additionalorder.C37541b;
import com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineDetailUseCase;
import com.carrefour.fid.android.domain.interactors.order.PrepareAdditionalOrderBasketUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.MainImmediateDispatcher"})
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.a */
public final class C26734a implements C10324h<AdditionalOrderBottomSheetViewModel> {

    /* renamed from: a */
    public final Provider<GetOrderOnlineDetailUseCase> f65242a;

    /* renamed from: b */
    public final Provider<C37541b> f65243b;

    /* renamed from: c */
    public final Provider<PrepareAdditionalOrderBasketUseCase> f65244c;

    /* renamed from: d */
    public final Provider<CoroutineDispatcher> f65245d;

    public C26734a(Provider<GetOrderOnlineDetailUseCase> provider, Provider<C37541b> provider2, Provider<PrepareAdditionalOrderBasketUseCase> provider3, Provider<CoroutineDispatcher> provider4) {
        this.f65242a = provider;
        this.f65243b = provider2;
        this.f65244c = provider3;
        this.f65245d = provider4;
    }

    /* renamed from: a */
    public static C26734a m113543a(Provider<GetOrderOnlineDetailUseCase> provider, Provider<C37541b> provider2, Provider<PrepareAdditionalOrderBasketUseCase> provider3, Provider<CoroutineDispatcher> provider4) {
        return new C26734a(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static AdditionalOrderBottomSheetViewModel m113544c(GetOrderOnlineDetailUseCase getOrderOnlineDetailUseCase, C37541b bVar, PrepareAdditionalOrderBasketUseCase prepareAdditionalOrderBasketUseCase, CoroutineDispatcher coroutineDispatcher) {
        return new AdditionalOrderBottomSheetViewModel(getOrderOnlineDetailUseCase, bVar, prepareAdditionalOrderBasketUseCase, coroutineDispatcher);
    }

    /* renamed from: b */
    public AdditionalOrderBottomSheetViewModel get() {
        return m113544c(this.f65242a.get(), this.f65243b.get(), this.f65244c.get(), this.f65245d.get());
    }
}
