package com.carrefour.fid.android.checkout.domain.repositories;

import com.carrefour.fid.android.checkout.data.api.datasources.PaymentDataSource;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.checkout.domain.repositories.a */
public final class C39864a implements C10324h<PaymentRepository> {

    /* renamed from: a */
    public final Provider<PaymentDataSource> f101691a;

    public C39864a(Provider<PaymentDataSource> provider) {
        this.f101691a = provider;
    }

    /* renamed from: a */
    public static C39864a m162516a(Provider<PaymentDataSource> provider) {
        return new C39864a(provider);
    }

    /* renamed from: c */
    public static PaymentRepository m162517c(PaymentDataSource paymentDataSource) {
        return new PaymentRepository(paymentDataSource);
    }

    /* renamed from: b */
    public PaymentRepository get() {
        return m162517c(this.f101691a.get());
    }
}
