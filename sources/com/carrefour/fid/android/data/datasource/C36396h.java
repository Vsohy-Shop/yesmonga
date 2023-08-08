package com.carrefour.fid.android.data.datasource;

import com.carrefour.fid.android.data.repositories.PaymentRepository;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.data.datasource.h */
public final class C36396h implements C10324h<NonFoodPaymentGateway> {

    /* renamed from: a */
    public final Provider<PaymentRepository> f90040a;

    /* renamed from: b */
    public final Provider<C37823k> f90041b;

    public C36396h(Provider<PaymentRepository> provider, Provider<C37823k> provider2) {
        this.f90040a = provider;
        this.f90041b = provider2;
    }

    /* renamed from: a */
    public static C36396h m149320a(Provider<PaymentRepository> provider, Provider<C37823k> provider2) {
        return new C36396h(provider, provider2);
    }

    /* renamed from: c */
    public static NonFoodPaymentGateway m149321c(PaymentRepository paymentRepository, C37823k kVar) {
        return new NonFoodPaymentGateway(paymentRepository, kVar);
    }

    /* renamed from: b */
    public NonFoodPaymentGateway get() {
        return m149321c(this.f90040a.get(), this.f90041b.get());
    }
}
