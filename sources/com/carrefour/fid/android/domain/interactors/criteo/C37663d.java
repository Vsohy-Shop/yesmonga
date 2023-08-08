package com.carrefour.fid.android.domain.interactors.criteo;

import com.carrefour.fid.android.data.datasource.CriteoTrackingGateway;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.criteo.d */
public final class C37663d implements C10324h<CriteoTrackingCriteoUseCase> {

    /* renamed from: a */
    public final Provider<CriteoTrackingGateway> f94519a;

    public C37663d(Provider<CriteoTrackingGateway> provider) {
        this.f94519a = provider;
    }

    /* renamed from: a */
    public static C37663d m154402a(Provider<CriteoTrackingGateway> provider) {
        return new C37663d(provider);
    }

    /* renamed from: c */
    public static CriteoTrackingCriteoUseCase m154403c(CriteoTrackingGateway criteoTrackingGateway) {
        return new CriteoTrackingCriteoUseCase(criteoTrackingGateway);
    }

    /* renamed from: b */
    public CriteoTrackingCriteoUseCase get() {
        return m154403c(this.f94519a.get());
    }
}
