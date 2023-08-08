package com.carrefour.fid.android.domain.interactors.checkout;

import com.carrefour.fid.android.data.datasource.PaymentGateway;
import com.carrefour.fid.android.data.entities.mapper.C36459a1;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.checkout.d */
public final class C37628d implements C10324h<ValidatePaymentUseCase> {

    /* renamed from: a */
    public final Provider<PaymentGateway> f94412a;

    /* renamed from: b */
    public final Provider<C36459a1> f94413b;

    public C37628d(Provider<PaymentGateway> provider, Provider<C36459a1> provider2) {
        this.f94412a = provider;
        this.f94413b = provider2;
    }

    /* renamed from: a */
    public static C37628d m154252a(Provider<PaymentGateway> provider, Provider<C36459a1> provider2) {
        return new C37628d(provider, provider2);
    }

    /* renamed from: c */
    public static ValidatePaymentUseCase m154253c(PaymentGateway paymentGateway, C36459a1 a1Var) {
        return new ValidatePaymentUseCase(paymentGateway, a1Var);
    }

    /* renamed from: b */
    public ValidatePaymentUseCase get() {
        return m154253c(this.f94412a.get(), this.f94413b.get());
    }
}
