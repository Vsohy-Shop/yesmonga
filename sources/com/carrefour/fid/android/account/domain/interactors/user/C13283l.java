package com.carrefour.fid.android.account.domain.interactors.user;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.domain.interactors.user.l */
public final class C13283l implements C10324h<UpdateUserPasswordUseCase> {

    /* renamed from: a */
    public final Provider<LoginRepository> f32666a;

    /* renamed from: b */
    public final Provider<AccountRepository> f32667b;

    public C13283l(Provider<LoginRepository> provider, Provider<AccountRepository> provider2) {
        this.f32666a = provider;
        this.f32667b = provider2;
    }

    /* renamed from: a */
    public static C13283l m57525a(Provider<LoginRepository> provider, Provider<AccountRepository> provider2) {
        return new C13283l(provider, provider2);
    }

    /* renamed from: c */
    public static UpdateUserPasswordUseCase m57526c(LoginRepository loginRepository, AccountRepository accountRepository) {
        return new UpdateUserPasswordUseCase(loginRepository, accountRepository);
    }

    /* renamed from: b */
    public UpdateUserPasswordUseCase get() {
        return m57526c(this.f32666a.get(), this.f32667b.get());
    }
}
