package com.carrefour.fid.android.data.datasource;

import com.carrefour.fid.android.data.entities.mapper.C36531u0;
import com.carrefour.fid.android.data.repositories.PaymentRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.data.datasource.i */
public final class C36397i implements C10324h<PaymentGateway> {

    /* renamed from: a */
    public final Provider<PaymentRepository> f90042a;

    /* renamed from: b */
    public final Provider<C36531u0> f90043b;

    /* renamed from: c */
    public final Provider<C37566e0> f90044c;

    /* renamed from: d */
    public final Provider<C37823k> f90045d;

    /* renamed from: e */
    public final Provider<C37816e> f90046e;

    public C36397i(Provider<PaymentRepository> provider, Provider<C36531u0> provider2, Provider<C37566e0> provider3, Provider<C37823k> provider4, Provider<C37816e> provider5) {
        this.f90042a = provider;
        this.f90043b = provider2;
        this.f90044c = provider3;
        this.f90045d = provider4;
        this.f90046e = provider5;
    }

    /* renamed from: a */
    public static C36397i m149323a(Provider<PaymentRepository> provider, Provider<C36531u0> provider2, Provider<C37566e0> provider3, Provider<C37823k> provider4, Provider<C37816e> provider5) {
        return new C36397i(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static PaymentGateway m149324c(PaymentRepository paymentRepository, C36531u0 u0Var, C37566e0 e0Var, C37823k kVar, C37816e eVar) {
        return new PaymentGateway(paymentRepository, u0Var, e0Var, kVar, eVar);
    }

    /* renamed from: b */
    public PaymentGateway get() {
        return m149324c(this.f90042a.get(), this.f90043b.get(), this.f90044c.get(), this.f90045d.get(), this.f90046e.get());
    }
}
