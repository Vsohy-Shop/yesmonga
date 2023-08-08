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
/* renamed from: com.carrefour.fid.android.account.domain.interactors.user.j */
public final class C13281j implements C10324h<UpdateUserEmailUseCase> {

    /* renamed from: a */
    public final Provider<LoginRepository> f32663a;

    /* renamed from: b */
    public final Provider<AccountRepository> f32664b;

    public C13281j(Provider<LoginRepository> provider, Provider<AccountRepository> provider2) {
        this.f32663a = provider;
        this.f32664b = provider2;
    }

    /* renamed from: a */
    public static C13281j m57519a(Provider<LoginRepository> provider, Provider<AccountRepository> provider2) {
        return new C13281j(provider, provider2);
    }

    /* renamed from: c */
    public static UpdateUserEmailUseCase m57520c(LoginRepository loginRepository, AccountRepository accountRepository) {
        return new UpdateUserEmailUseCase(loginRepository, accountRepository);
    }

    /* renamed from: b */
    public UpdateUserEmailUseCase get() {
        return m57520c(this.f32663a.get(), this.f32664b.get());
    }
}
