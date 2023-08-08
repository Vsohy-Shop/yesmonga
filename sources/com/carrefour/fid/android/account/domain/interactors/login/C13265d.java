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
/* renamed from: com.carrefour.fid.android.account.domain.interactors.login.d */
public final class C13265d implements C10324h<C13264c> {

    /* renamed from: a */
    public final Provider<LoginRepository> f32624a;

    public C13265d(Provider<LoginRepository> provider) {
        this.f32624a = provider;
    }

    /* renamed from: a */
    public static C13265d m57461a(Provider<LoginRepository> provider) {
        return new C13265d(provider);
    }

    /* renamed from: c */
    public static C13264c m57462c(LoginRepository loginRepository) {
        return new C13264c(loginRepository);
    }

    /* renamed from: b */
    public C13264c get() {
        return m57462c(this.f32624a.get());
    }
}
