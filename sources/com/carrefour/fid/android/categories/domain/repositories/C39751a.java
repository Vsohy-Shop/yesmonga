package com.carrefour.fid.android.categories.domain.repositories;

import com.carrefour.fid.android.categories.data.api.datasource.CategoriesDataSource;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.categories.domain.repositories.a */
public final class C39751a implements C10324h<CategoriesRepository> {

    /* renamed from: a */
    public final Provider<CategoriesDataSource> f101469a;

    public C39751a(Provider<CategoriesDataSource> provider) {
        this.f101469a = provider;
    }

    /* renamed from: a */
    public static C39751a m162224a(Provider<CategoriesDataSource> provider) {
        return new C39751a(provider);
    }

    /* renamed from: c */
    public static CategoriesRepository m162225c(CategoriesDataSource categoriesDataSource) {
        return new CategoriesRepository(categoriesDataSource);
    }

    /* renamed from: b */
    public CategoriesRepository get() {
        return m162225c(this.f101469a.get());
    }
}
