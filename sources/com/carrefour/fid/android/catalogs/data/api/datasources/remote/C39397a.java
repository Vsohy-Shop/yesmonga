package com.carrefour.fid.android.catalogs.data.api.datasources.remote;

import com.carrefour.fid.android.catalogs.data.api.services.C39401a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.catalogs.data.api.datasources.remote.a */
public final class C39397a implements C10324h<CatalogsRemoteDataSource> {

    /* renamed from: a */
    public final Provider<C39401a> f100752a;

    public C39397a(Provider<C39401a> provider) {
        this.f100752a = provider;
    }

    /* renamed from: a */
    public static C39397a m161452a(Provider<C39401a> provider) {
        return new C39397a(provider);
    }

    /* renamed from: c */
    public static CatalogsRemoteDataSource m161453c(C39401a aVar) {
        return new CatalogsRemoteDataSource(aVar);
    }

    /* renamed from: b */
    public CatalogsRemoteDataSource get() {
        return m161453c(this.f100752a.get());
    }
}
