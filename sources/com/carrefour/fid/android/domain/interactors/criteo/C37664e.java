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
/* renamed from: com.carrefour.fid.android.domain.interactors.criteo.e */
public final class C37664e implements C10324h<CriteoTrackingSyncUseCase> {

    /* renamed from: a */
    public final Provider<CriteoTrackingGateway> f94520a;

    public C37664e(Provider<CriteoTrackingGateway> provider) {
        this.f94520a = provider;
    }

    /* renamed from: a */
    public static C37664e m154405a(Provider<CriteoTrackingGateway> provider) {
        return new C37664e(provider);
    }

    /* renamed from: c */
    public static CriteoTrackingSyncUseCase m154406c(CriteoTrackingGateway criteoTrackingGateway) {
        return new CriteoTrackingSyncUseCase(criteoTrackingGateway);
    }

    /* renamed from: b */
    public CriteoTrackingSyncUseCase get() {
        return m154406c(this.f94520a.get());
    }
}
