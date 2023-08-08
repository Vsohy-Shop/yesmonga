package com.carrefour.fid.android.domain.interactors.order;

import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.order.j */
public final class C37734j implements C10324h<IsEligibleToOnSitePaymentUseCase> {

    /* renamed from: a */
    public final Provider<C37807b> f94723a;

    public C37734j(Provider<C37807b> provider) {
        this.f94723a = provider;
    }

    /* renamed from: a */
    public static C37734j m154676a(Provider<C37807b> provider) {
        return new C37734j(provider);
    }

    /* renamed from: c */
    public static IsEligibleToOnSitePaymentUseCase m154677c(C37807b bVar) {
        return new IsEligibleToOnSitePaymentUseCase(bVar);
    }

    /* renamed from: b */
    public IsEligibleToOnSitePaymentUseCase get() {
        return m154677c(this.f94723a.get());
    }
}
