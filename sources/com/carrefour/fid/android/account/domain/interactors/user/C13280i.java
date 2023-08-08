package com.carrefour.fid.android.account.domain.interactors.user;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.domain.interactors.user.i */
public final class C13280i implements C10324h<C13279h> {

    /* renamed from: a */
    public final Provider<LoginRepository> f32662a;

    public C13280i(Provider<LoginRepository> provider) {
        this.f32662a = provider;
    }

    /* renamed from: a */
    public static C13280i m57516a(Provider<LoginRepository> provider) {
        return new C13280i(provider);
    }

    /* renamed from: c */
    public static C13279h m57517c(LoginRepository loginRepository) {
        return new C13279h(loginRepository);
    }

    /* renamed from: b */
    public C13279h get() {
        return m57517c(this.f32662a.get());
    }
}
