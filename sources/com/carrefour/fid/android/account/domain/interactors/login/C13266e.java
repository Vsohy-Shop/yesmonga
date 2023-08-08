package com.carrefour.fid.android.account.domain.interactors.login;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.domain.interactors.login.e */
public final class C13266e implements C10324h<AccountRefreshTokenUseCase> {

    /* renamed from: a */
    public final Provider<LoginRepository> f32625a;

    public C13266e(Provider<LoginRepository> provider) {
        this.f32625a = provider;
    }

    /* renamed from: a */
    public static C13266e m57464a(Provider<LoginRepository> provider) {
        return new C13266e(provider);
    }

    /* renamed from: c */
    public static AccountRefreshTokenUseCase m57465c(LoginRepository loginRepository) {
        return new AccountRefreshTokenUseCase(loginRepository);
    }

    /* renamed from: b */
    public AccountRefreshTokenUseCase get() {
        return m57465c(this.f32625a.get());
    }
}
