package com.carrefour.fid.android.account.data.repositories;

import com.carrefour.fid.android.account.data.datasource.LocalLoginDataSource;
import com.carrefour.fid.android.account.data.datasource.RemoteLoginDataSource;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.data.repositories.e */
public final class C13208e implements C10324h<LoginRepository> {

    /* renamed from: a */
    public final Provider<RemoteLoginDataSource> f32390a;

    /* renamed from: b */
    public final Provider<LocalLoginDataSource> f32391b;

    public C13208e(Provider<RemoteLoginDataSource> provider, Provider<LocalLoginDataSource> provider2) {
        this.f32390a = provider;
        this.f32391b = provider2;
    }

    /* renamed from: a */
    public static C13208e m57247a(Provider<RemoteLoginDataSource> provider, Provider<LocalLoginDataSource> provider2) {
        return new C13208e(provider, provider2);
    }

    /* renamed from: c */
    public static LoginRepository m57248c(RemoteLoginDataSource remoteLoginDataSource, LocalLoginDataSource localLoginDataSource) {
        return new LoginRepository(remoteLoginDataSource, localLoginDataSource);
    }

    /* renamed from: b */
    public LoginRepository get() {
        return m57248c(this.f32390a.get(), this.f32391b.get());
    }
}
