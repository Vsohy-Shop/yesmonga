package com.carrefour.fid.android.catalogs.data.api.datasources;

import com.carrefour.fid.android.catalogs.data.api.services.C39401a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.catalogs.data.api.datasources.a */
public final class C39394a implements C10324h<CatalogsDataSource> {

    /* renamed from: a */
    public final Provider<C39401a> f100750a;

    public C39394a(Provider<C39401a> provider) {
        this.f100750a = provider;
    }

    /* renamed from: a */
    public static C39394a m161437a(Provider<C39401a> provider) {
        return new C39394a(provider);
    }

    /* renamed from: c */
    public static CatalogsDataSource m161438c(C39401a aVar) {
        return new CatalogsDataSource(aVar);
    }

    /* renamed from: b */
    public CatalogsDataSource get() {
        return m161438c(this.f100750a.get());
    }
}
