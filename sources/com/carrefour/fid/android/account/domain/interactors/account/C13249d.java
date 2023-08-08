package com.carrefour.fid.android.account.domain.interactors.account;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.domain.interactors.account.d */
public final class C13249d implements C10324h<C13248c> {

    /* renamed from: a */
    public final Provider<LoginRepository> f32588a;

    public C13249d(Provider<LoginRepository> provider) {
        this.f32588a = provider;
    }

    /* renamed from: a */
    public static C13249d m57389a(Provider<LoginRepository> provider) {
        return new C13249d(provider);
    }

    /* renamed from: c */
    public static C13248c m57390c(LoginRepository loginRepository) {
        return new C13248c(loginRepository);
    }

    /* renamed from: b */
    public C13248c get() {
        return m57390c(this.f32588a.get());
    }
}
