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
/* renamed from: com.carrefour.fid.android.account.domain.interactors.user.g */
public final class C13278g implements C10324h<C13277f> {

    /* renamed from: a */
    public final Provider<LoginRepository> f32660a;

    public C13278g(Provider<LoginRepository> provider) {
        this.f32660a = provider;
    }

    /* renamed from: a */
    public static C13278g m57513a(Provider<LoginRepository> provider) {
        return new C13278g(provider);
    }

    /* renamed from: c */
    public static C13277f m57514c(LoginRepository loginRepository) {
        return new C13277f(loginRepository);
    }

    /* renamed from: b */
    public C13277f get() {
        return m57514c(this.f32660a.get());
    }
}
