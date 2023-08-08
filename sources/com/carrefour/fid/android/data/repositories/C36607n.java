package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource;
import com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource;
import com.carrefour.fid.android.data.repositories.datasource.memos.MemoRemoteDatasource;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.data.repositories.n */
public final class C36607n implements C10324h<MemoRepository> {

    /* renamed from: a */
    public final Provider<MemoRemoteDatasource> f90502a;

    /* renamed from: b */
    public final Provider<MemoLocalDatasource> f90503b;

    /* renamed from: c */
    public final Provider<MemoDataStoreSource> f90504c;

    public C36607n(Provider<MemoRemoteDatasource> provider, Provider<MemoLocalDatasource> provider2, Provider<MemoDataStoreSource> provider3) {
        this.f90502a = provider;
        this.f90503b = provider2;
        this.f90504c = provider3;
    }

    /* renamed from: a */
    public static C36607n m150201a(Provider<MemoRemoteDatasource> provider, Provider<MemoLocalDatasource> provider2, Provider<MemoDataStoreSource> provider3) {
        return new C36607n(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static MemoRepository m150202c(MemoRemoteDatasource memoRemoteDatasource, MemoLocalDatasource memoLocalDatasource, MemoDataStoreSource memoDataStoreSource) {
        return new MemoRepository(memoRemoteDatasource, memoLocalDatasource, memoDataStoreSource);
    }

    /* renamed from: b */
    public MemoRepository get() {
        return m150202c(this.f90502a.get(), this.f90503b.get(), this.f90504c.get());
    }
}
