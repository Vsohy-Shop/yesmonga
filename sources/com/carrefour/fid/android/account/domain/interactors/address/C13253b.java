package com.carrefour.fid.android.account.domain.interactors.address;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.domain.interactors.address.b */
public final class C13253b implements C10324h<UpdateAccountAddressUseCase> {

    /* renamed from: a */
    public final Provider<AccountRepository> f32600a;

    public C13253b(Provider<AccountRepository> provider) {
        this.f32600a = provider;
    }

    /* renamed from: a */
    public static C13253b m57412a(Provider<AccountRepository> provider) {
        return new C13253b(provider);
    }

    /* renamed from: c */
    public static UpdateAccountAddressUseCase m57413c(AccountRepository accountRepository) {
        return new UpdateAccountAddressUseCase(accountRepository);
    }

    /* renamed from: b */
    public UpdateAccountAddressUseCase get() {
        return m57413c(this.f32600a.get());
    }
}
