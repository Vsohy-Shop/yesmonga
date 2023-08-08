package com.carrefour.fid.android.utilities.domain.repositories;

import com.carrefour.fid.android.utilities.data.api.datasource.UtilitiesDataSource;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.utilities.domain.repositories.a */
public final class C22695a implements C10324h<UtilitiesRepository> {

    /* renamed from: a */
    public final Provider<UtilitiesDataSource> f58131a;

    public C22695a(Provider<UtilitiesDataSource> provider) {
        this.f58131a = provider;
    }

    /* renamed from: a */
    public static C22695a m102754a(Provider<UtilitiesDataSource> provider) {
        return new C22695a(provider);
    }

    /* renamed from: c */
    public static UtilitiesRepository m102755c(UtilitiesDataSource utilitiesDataSource) {
        return new UtilitiesRepository(utilitiesDataSource);
    }

    /* renamed from: b */
    public UtilitiesRepository get() {
        return m102755c(this.f58131a.get());
    }
}
