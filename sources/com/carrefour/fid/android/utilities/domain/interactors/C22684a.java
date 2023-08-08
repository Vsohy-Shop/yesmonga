package com.carrefour.fid.android.utilities.domain.interactors;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffUtilitiesManagementApi;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.utilities.domain.interactors.a */
public final class C22684a implements C10324h<UtilitiesGetPickupPointsUseCase> {

    /* renamed from: a */
    public final Provider<BffUtilitiesManagementApi> f58102a;

    public C22684a(Provider<BffUtilitiesManagementApi> provider) {
        this.f58102a = provider;
    }

    /* renamed from: a */
    public static C22684a m102726a(Provider<BffUtilitiesManagementApi> provider) {
        return new C22684a(provider);
    }

    /* renamed from: c */
    public static UtilitiesGetPickupPointsUseCase m102727c(BffUtilitiesManagementApi bffUtilitiesManagementApi) {
        return new UtilitiesGetPickupPointsUseCase(bffUtilitiesManagementApi);
    }

    /* renamed from: b */
    public UtilitiesGetPickupPointsUseCase get() {
        return m102727c(this.f58102a.get());
    }
}
