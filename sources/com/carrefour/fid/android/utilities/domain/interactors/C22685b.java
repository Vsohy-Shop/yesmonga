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
/* renamed from: com.carrefour.fid.android.utilities.domain.interactors.b */
public final class C22685b implements C10324h<UtilitiesGetSecureTokenUseCase> {

    /* renamed from: a */
    public final Provider<BffUtilitiesManagementApi> f58103a;

    public C22685b(Provider<BffUtilitiesManagementApi> provider) {
        this.f58103a = provider;
    }

    /* renamed from: a */
    public static C22685b m102729a(Provider<BffUtilitiesManagementApi> provider) {
        return new C22685b(provider);
    }

    /* renamed from: c */
    public static UtilitiesGetSecureTokenUseCase m102730c(BffUtilitiesManagementApi bffUtilitiesManagementApi) {
        return new UtilitiesGetSecureTokenUseCase(bffUtilitiesManagementApi);
    }

    /* renamed from: b */
    public UtilitiesGetSecureTokenUseCase get() {
        return m102730c(this.f58103a.get());
    }
}
