package com.carrefour.fid.android.account.domain.interactors.address.dqe;

import com.carrefour.fid.android.account.data.repositories.DQEAddressesRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.domain.interactors.address.dqe.c */
public final class C13258c implements C10324h<GetVerificationDQEAddressUseCase> {

    /* renamed from: a */
    public final Provider<DQEAddressesRepository> f32610a;

    public C13258c(Provider<DQEAddressesRepository> provider) {
        this.f32610a = provider;
    }

    /* renamed from: a */
    public static C13258c m57435a(Provider<DQEAddressesRepository> provider) {
        return new C13258c(provider);
    }

    /* renamed from: c */
    public static GetVerificationDQEAddressUseCase m57436c(DQEAddressesRepository dQEAddressesRepository) {
        return new GetVerificationDQEAddressUseCase(dQEAddressesRepository);
    }

    /* renamed from: b */
    public GetVerificationDQEAddressUseCase get() {
        return m57436c(this.f32610a.get());
    }
}
