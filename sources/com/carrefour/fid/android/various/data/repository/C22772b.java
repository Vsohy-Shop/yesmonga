package com.carrefour.fid.android.various.data.repository;

import com.carrefour.fid.android.various.data.datasource.RemoteConfigDataSource;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.various.data.repository.b */
public final class C22772b implements C10324h<RemoteConfigRepositoryImpl> {

    /* renamed from: a */
    public final Provider<RemoteConfigDataSource> f58318a;

    public C22772b(Provider<RemoteConfigDataSource> provider) {
        this.f58318a = provider;
    }

    /* renamed from: a */
    public static C22772b m102981a(Provider<RemoteConfigDataSource> provider) {
        return new C22772b(provider);
    }

    /* renamed from: c */
    public static RemoteConfigRepositoryImpl m102982c(RemoteConfigDataSource remoteConfigDataSource) {
        return new RemoteConfigRepositoryImpl(remoteConfigDataSource);
    }

    /* renamed from: b */
    public RemoteConfigRepositoryImpl get() {
        return m102982c(this.f58318a.get());
    }
}
