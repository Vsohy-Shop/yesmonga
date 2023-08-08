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
/* renamed from: com.carrefour.fid.android.account.domain.interactors.login.b */
public final class C13263b implements C10324h<C13262a> {

    /* renamed from: a */
    public final Provider<LoginRepository> f32622a;

    public C13263b(Provider<LoginRepository> provider) {
        this.f32622a = provider;
    }

    /* renamed from: a */
    public static C13263b m57458a(Provider<LoginRepository> provider) {
        return new C13263b(provider);
    }

    /* renamed from: c */
    public static C13262a m57459c(LoginRepository loginRepository) {
        return new C13262a(loginRepository);
    }

    /* renamed from: b */
    public C13262a get() {
        return m57459c(this.f32622a.get());
    }
}
