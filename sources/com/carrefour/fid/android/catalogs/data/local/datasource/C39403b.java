package com.carrefour.fid.android.catalogs.data.local.datasource;

import android.content.Context;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.catalogs.data.local.datasource.b */
public final class C39403b implements C10324h<CatalogsLocalDataSource> {

    /* renamed from: a */
    public final Provider<Context> f100779a;

    public C39403b(Provider<Context> provider) {
        this.f100779a = provider;
    }

    /* renamed from: a */
    public static C39403b m161505a(Provider<Context> provider) {
        return new C39403b(provider);
    }

    /* renamed from: c */
    public static CatalogsLocalDataSource m161506c(Context context) {
        return new CatalogsLocalDataSource(context);
    }

    /* renamed from: b */
    public CatalogsLocalDataSource get() {
        return m161506c(this.f100779a.get());
    }
}
