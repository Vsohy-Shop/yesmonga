package com.carrefour.fid.android.account.data.repositories;

import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.data.repositories.b */
public final class C13205b implements C10324h<C13204a> {

    /* renamed from: a */
    public final Provider<LoginRepository> f32385a;

    public C13205b(Provider<LoginRepository> provider) {
        this.f32385a = provider;
    }

    /* renamed from: a */
    public static C13205b m57238a(Provider<LoginRepository> provider) {
        return new C13205b(provider);
    }

    /* renamed from: c */
    public static C13204a m57239c(LoginRepository loginRepository) {
        return new C13204a(loginRepository);
    }

    /* renamed from: b */
    public C13204a get() {
        return m57239c(this.f32385a.get());
    }
}
