package com.carrefour.fid.android.account.domain.interactors.user;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.domain.interactors.user.d */
public final class C13275d implements C10324h<AccountGetUserInfoUseCase> {

    /* renamed from: a */
    public final Provider<AccountRepository> f32656a;

    public C13275d(Provider<AccountRepository> provider) {
        this.f32656a = provider;
    }

    /* renamed from: a */
    public static C13275d m57507a(Provider<AccountRepository> provider) {
        return new C13275d(provider);
    }

    /* renamed from: c */
    public static AccountGetUserInfoUseCase m57508c(AccountRepository accountRepository) {
        return new AccountGetUserInfoUseCase(accountRepository);
    }

    /* renamed from: b */
    public AccountGetUserInfoUseCase get() {
        return m57508c(this.f32656a.get());
    }
}
