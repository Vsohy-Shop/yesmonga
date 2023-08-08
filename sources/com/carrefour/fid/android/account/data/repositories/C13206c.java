package com.carrefour.fid.android.account.data.repositories;

import com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource;
import com.carrefour.fid.android.account.data.datasource.RemoteAccountDataSource;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.data.repositories.c */
public final class C13206c implements C10324h<AccountRepository> {

    /* renamed from: a */
    public final Provider<LocalAccountDataSource> f32386a;

    /* renamed from: b */
    public final Provider<RemoteAccountDataSource> f32387b;

    public C13206c(Provider<LocalAccountDataSource> provider, Provider<RemoteAccountDataSource> provider2) {
        this.f32386a = provider;
        this.f32387b = provider2;
    }

    /* renamed from: a */
    public static C13206c m57241a(Provider<LocalAccountDataSource> provider, Provider<RemoteAccountDataSource> provider2) {
        return new C13206c(provider, provider2);
    }

    /* renamed from: c */
    public static AccountRepository m57242c(LocalAccountDataSource localAccountDataSource, RemoteAccountDataSource remoteAccountDataSource) {
        return new AccountRepository(localAccountDataSource, remoteAccountDataSource);
    }

    /* renamed from: b */
    public AccountRepository get() {
        return m57242c(this.f32386a.get(), this.f32387b.get());
    }
}
