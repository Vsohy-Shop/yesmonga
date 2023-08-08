package com.carrefour.fid.android.checkout.domain.interactors;

import com.carrefour.fid.android.checkout.domain.repositories.PaymentRepository;
import com.carrefour.fid.android.domain.interactors.login.C37693a;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.checkout.domain.interactors.h */
public final class C39863h implements C10324h<GetPspTokenUseCase> {

    /* renamed from: a */
    public final Provider<PaymentRepository> f101685a;

    /* renamed from: b */
    public final Provider<C37878e> f101686b;

    /* renamed from: c */
    public final Provider<C37693a> f101687c;

    public C39863h(Provider<PaymentRepository> provider, Provider<C37878e> provider2, Provider<C37693a> provider3) {
        this.f101685a = provider;
        this.f101686b = provider2;
        this.f101687c = provider3;
    }

    /* renamed from: a */
    public static C39863h m162502a(Provider<PaymentRepository> provider, Provider<C37878e> provider2, Provider<C37693a> provider3) {
        return new C39863h(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static GetPspTokenUseCase m162503c(PaymentRepository paymentRepository, C37878e eVar, C37693a aVar) {
        return new GetPspTokenUseCase(paymentRepository, eVar, aVar);
    }

    /* renamed from: b */
    public GetPspTokenUseCase get() {
        return m162503c(this.f101685a.get(), this.f101686b.get(), this.f101687c.get());
    }
}
