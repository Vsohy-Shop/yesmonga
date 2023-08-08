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
/* renamed from: com.carrefour.fid.android.account.domain.interactors.address.a */
public final class C13252a implements C10324h<AccountUpdateUserAddressUseCase> {

    /* renamed from: a */
    public final Provider<AccountRepository> f32599a;

    public C13252a(Provider<AccountRepository> provider) {
        this.f32599a = provider;
    }

    /* renamed from: a */
    public static C13252a m57409a(Provider<AccountRepository> provider) {
        return new C13252a(provider);
    }

    /* renamed from: c */
    public static AccountUpdateUserAddressUseCase m57410c(AccountRepository accountRepository) {
        return new AccountUpdateUserAddressUseCase(accountRepository);
    }

    /* renamed from: b */
    public AccountUpdateUserAddressUseCase get() {
        return m57410c(this.f32599a.get());
    }
}
