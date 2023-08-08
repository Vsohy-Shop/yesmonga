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
/* renamed from: com.carrefour.fid.android.account.domain.interactors.address.dqe.b */
public final class C13257b implements C10324h<GetDQEAddressSuggestionsUseCase> {

    /* renamed from: a */
    public final Provider<DQEAddressesRepository> f32609a;

    public C13257b(Provider<DQEAddressesRepository> provider) {
        this.f32609a = provider;
    }

    /* renamed from: a */
    public static C13257b m57432a(Provider<DQEAddressesRepository> provider) {
        return new C13257b(provider);
    }

    /* renamed from: c */
    public static GetDQEAddressSuggestionsUseCase m57433c(DQEAddressesRepository dQEAddressesRepository) {
        return new GetDQEAddressSuggestionsUseCase(dQEAddressesRepository);
    }

    /* renamed from: b */
    public GetDQEAddressSuggestionsUseCase get() {
        return m57433c(this.f32609a.get());
    }
}
