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
/* renamed from: com.carrefour.fid.android.account.domain.interactors.user.k */
public final class C13282k implements C10324h<UpdateUserInfoUseCase> {

    /* renamed from: a */
    public final Provider<AccountRepository> f32665a;

    public C13282k(Provider<AccountRepository> provider) {
        this.f32665a = provider;
    }

    /* renamed from: a */
    public static C13282k m57522a(Provider<AccountRepository> provider) {
        return new C13282k(provider);
    }

    /* renamed from: c */
    public static UpdateUserInfoUseCase m57523c(AccountRepository accountRepository) {
        return new UpdateUserInfoUseCase(accountRepository);
    }

    /* renamed from: b */
    public UpdateUserInfoUseCase get() {
        return m57523c(this.f32665a.get());
    }
}
