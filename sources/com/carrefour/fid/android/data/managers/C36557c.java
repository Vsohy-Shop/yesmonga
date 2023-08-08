package com.carrefour.fid.android.data.managers;

import com.carrefour.fid.android.account.data.datasource.LocalLoginDataSource;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.data.managers.c */
public final class C36557c implements C10324h<C36555b> {

    /* renamed from: a */
    public final Provider<LocalLoginDataSource> f90284a;

    /* renamed from: b */
    public final Provider<LoginRepository> f90285b;

    public C36557c(Provider<LocalLoginDataSource> provider, Provider<LoginRepository> provider2) {
        this.f90284a = provider;
        this.f90285b = provider2;
    }

    /* renamed from: a */
    public static C36557c m149891a(Provider<LocalLoginDataSource> provider, Provider<LoginRepository> provider2) {
        return new C36557c(provider, provider2);
    }

    /* renamed from: c */
    public static C36555b m149892c(LocalLoginDataSource localLoginDataSource, LoginRepository loginRepository) {
        return new C36555b(localLoginDataSource, loginRepository);
    }

    /* renamed from: b */
    public C36555b get() {
        return m149892c(this.f90284a.get(), this.f90285b.get());
    }
}
