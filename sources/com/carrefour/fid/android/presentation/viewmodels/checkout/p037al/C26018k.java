package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al;

import com.carrefour.fid.android.data.entities.mapper.C36540w0;
import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.interactors.checkout.ConfirmPaymentUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.k */
public final class C26018k implements C10324h<CheckoutStep4ViewModel> {

    /* renamed from: a */
    public final Provider<ConfirmPaymentUseCase> f63610a;

    /* renamed from: b */
    public final Provider<C36540w0> f63611b;

    /* renamed from: c */
    public final Provider<C37569f0> f63612c;

    public C26018k(Provider<ConfirmPaymentUseCase> provider, Provider<C36540w0> provider2, Provider<C37569f0> provider3) {
        this.f63610a = provider;
        this.f63611b = provider2;
        this.f63612c = provider3;
    }

    /* renamed from: a */
    public static C26018k m111357a(Provider<ConfirmPaymentUseCase> provider, Provider<C36540w0> provider2, Provider<C37569f0> provider3) {
        return new C26018k(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static CheckoutStep4ViewModel m111358c(ConfirmPaymentUseCase confirmPaymentUseCase, C36540w0 w0Var, C37569f0 f0Var) {
        return new CheckoutStep4ViewModel(confirmPaymentUseCase, w0Var, f0Var);
    }

    /* renamed from: b */
    public CheckoutStep4ViewModel get() {
        return m111358c(this.f63610a.get(), this.f63611b.get(), this.f63612c.get());
    }
}
