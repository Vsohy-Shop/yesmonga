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
/* renamed from: com.carrefour.fid.android.account.domain.interactors.address.dqe.a */
public final class C13256a implements C10324h<AccountGetAddressGeolocationUseCase> {

    /* renamed from: a */
    public final Provider<DQEAddressesRepository> f32608a;

    public C13256a(Provider<DQEAddressesRepository> provider) {
        this.f32608a = provider;
    }

    /* renamed from: a */
    public static C13256a m57429a(Provider<DQEAddressesRepository> provider) {
        return new C13256a(provider);
    }

    /* renamed from: c */
    public static AccountGetAddressGeolocationUseCase m57430c(DQEAddressesRepository dQEAddressesRepository) {
        return new AccountGetAddressGeolocationUseCase(dQEAddressesRepository);
    }

    /* renamed from: b */
    public AccountGetAddressGeolocationUseCase get() {
        return m57430c(this.f32608a.get());
    }
}
