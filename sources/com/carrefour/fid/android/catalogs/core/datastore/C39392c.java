package com.carrefour.fid.android.catalogs.core.datastore;

import android.content.Context;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext"})
@C10338r
/* renamed from: com.carrefour.fid.android.catalogs.core.datastore.c */
public final class C39392c implements C10324h<CatalogPreferencesStorage> {

    /* renamed from: a */
    public final Provider<Context> f100735a;

    public C39392c(Provider<Context> provider) {
        this.f100735a = provider;
    }

    /* renamed from: a */
    public static C39392c m161424a(Provider<Context> provider) {
        return new C39392c(provider);
    }

    /* renamed from: c */
    public static CatalogPreferencesStorage m161425c(Context context) {
        return new CatalogPreferencesStorage(context);
    }

    /* renamed from: b */
    public CatalogPreferencesStorage get() {
        return m161425c(this.f100735a.get());
    }
}
