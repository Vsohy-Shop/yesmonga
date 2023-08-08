package com.carrefour.fid.android.domain.repositories;

import com.carrefour.fid.android.data.datasource.DlvDataSource;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.domain.repositories.b */
public final class C38193b implements C10324h<DlvRepository> {

    /* renamed from: a */
    public final Provider<DlvDataSource> f96769a;

    public C38193b(Provider<DlvDataSource> provider) {
        this.f96769a = provider;
    }

    /* renamed from: a */
    public static C38193b m158406a(Provider<DlvDataSource> provider) {
        return new C38193b(provider);
    }

    /* renamed from: c */
    public static DlvRepository m158407c(DlvDataSource dlvDataSource) {
        return new DlvRepository(dlvDataSource);
    }

    /* renamed from: b */
    public DlvRepository get() {
        return m158407c(this.f96769a.get());
    }
}
