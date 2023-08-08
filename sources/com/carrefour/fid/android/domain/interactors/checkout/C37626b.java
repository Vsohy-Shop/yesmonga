package com.carrefour.fid.android.domain.interactors.checkout;

import com.carrefour.fid.android.data.datasource.PaymentGateway;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.checkout.b */
public final class C37626b implements C10324h<ConfirmPaymentUseCase> {

    /* renamed from: a */
    public final Provider<PaymentGateway> f94409a;

    public C37626b(Provider<PaymentGateway> provider) {
        this.f94409a = provider;
    }

    /* renamed from: a */
    public static C37626b m154246a(Provider<PaymentGateway> provider) {
        return new C37626b(provider);
    }

    /* renamed from: c */
    public static ConfirmPaymentUseCase m154247c(PaymentGateway paymentGateway) {
        return new ConfirmPaymentUseCase(paymentGateway);
    }

    /* renamed from: b */
    public ConfirmPaymentUseCase get() {
        return m154247c(this.f94409a.get());
    }
}
