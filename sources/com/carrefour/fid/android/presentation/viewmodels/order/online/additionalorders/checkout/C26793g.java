package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout;

import com.carrefour.fid.android.data.entities.mapper.C36540w0;
import com.carrefour.fid.android.domain.interactors.checkout.ConfirmPaymentUseCase;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C29011n;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.g */
public final class C26793g implements C10324h<CheckoutPaymentViewModel> {

    /* renamed from: a */
    public final Provider<ConfirmPaymentUseCase> f65377a;

    /* renamed from: b */
    public final Provider<C36540w0> f65378b;

    /* renamed from: c */
    public final Provider<C29011n> f65379c;

    public C26793g(Provider<ConfirmPaymentUseCase> provider, Provider<C36540w0> provider2, Provider<C29011n> provider3) {
        this.f65377a = provider;
        this.f65378b = provider2;
        this.f65379c = provider3;
    }

    /* renamed from: a */
    public static C26793g m113776a(Provider<ConfirmPaymentUseCase> provider, Provider<C36540w0> provider2, Provider<C29011n> provider3) {
        return new C26793g(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static CheckoutPaymentViewModel m113777c(ConfirmPaymentUseCase confirmPaymentUseCase, C36540w0 w0Var, C29011n nVar) {
        return new CheckoutPaymentViewModel(confirmPaymentUseCase, w0Var, nVar);
    }

    /* renamed from: b */
    public CheckoutPaymentViewModel get() {
        return m113777c(this.f65377a.get(), this.f65378b.get(), this.f65379c.get());
    }
}
