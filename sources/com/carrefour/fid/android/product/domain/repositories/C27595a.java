package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.product.domain.repositories.a */
public final class C27595a implements C10324h<AlternativeProductsRepository> {

    /* renamed from: a */
    public final Provider<PlpProductListDataSource> f67058a;

    public C27595a(Provider<PlpProductListDataSource> provider) {
        this.f67058a = provider;
    }

    /* renamed from: a */
    public static C27595a m116156a(Provider<PlpProductListDataSource> provider) {
        return new C27595a(provider);
    }

    /* renamed from: c */
    public static AlternativeProductsRepository m116157c(PlpProductListDataSource plpProductListDataSource) {
        return new AlternativeProductsRepository(plpProductListDataSource);
    }

    /* renamed from: b */
    public AlternativeProductsRepository get() {
        return m116157c(this.f67058a.get());
    }
}
