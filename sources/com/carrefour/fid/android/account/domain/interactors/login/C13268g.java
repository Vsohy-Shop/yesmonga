package com.carrefour.fid.android.account.domain.interactors.login;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.performance.C38328d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.domain.interactors.login.g */
public final class C13268g implements C10324h<GetLoginUseCase> {

    /* renamed from: a */
    public final Provider<LoginRepository> f32627a;

    /* renamed from: b */
    public final Provider<C38328d> f32628b;

    public C13268g(Provider<LoginRepository> provider, Provider<C38328d> provider2) {
        this.f32627a = provider;
        this.f32628b = provider2;
    }

    /* renamed from: a */
    public static C13268g m57470a(Provider<LoginRepository> provider, Provider<C38328d> provider2) {
        return new C13268g(provider, provider2);
    }

    /* renamed from: c */
    public static GetLoginUseCase m57471c(LoginRepository loginRepository, C38328d dVar) {
        return new GetLoginUseCase(loginRepository, dVar);
    }

    /* renamed from: b */
    public GetLoginUseCase get() {
        return m57471c(this.f32627a.get(), this.f32628b.get());
    }
}
