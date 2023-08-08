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
/* renamed from: com.carrefour.fid.android.account.domain.interactors.login.f */
public final class C13267f implements C10324h<AccountRevokeTokenUseCase> {

    /* renamed from: a */
    public final Provider<LoginRepository> f32626a;

    public C13267f(Provider<LoginRepository> provider) {
        this.f32626a = provider;
    }

    /* renamed from: a */
    public static C13267f m57467a(Provider<LoginRepository> provider) {
        return new C13267f(provider);
    }

    /* renamed from: c */
    public static AccountRevokeTokenUseCase m57468c(LoginRepository loginRepository) {
        return new AccountRevokeTokenUseCase(loginRepository);
    }

    /* renamed from: b */
    public AccountRevokeTokenUseCase get() {
        return m57468c(this.f32626a.get());
    }
}
