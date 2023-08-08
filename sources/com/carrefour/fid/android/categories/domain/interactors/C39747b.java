package com.carrefour.fid.android.categories.domain.interactors;

import com.carrefour.fid.android.categories.domain.repositories.CategoriesRepository;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.performance.C38328d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.categories.domain.interactors.b */
public final class C39747b implements C10324h<CategoriesGetCategoriesUseCase> {

    /* renamed from: a */
    public final Provider<CategoriesRepository> f101451a;

    /* renamed from: b */
    public final Provider<C37823k> f101452b;

    /* renamed from: c */
    public final Provider<C38328d> f101453c;

    public C39747b(Provider<CategoriesRepository> provider, Provider<C37823k> provider2, Provider<C38328d> provider3) {
        this.f101451a = provider;
        this.f101452b = provider2;
        this.f101453c = provider3;
    }

    /* renamed from: a */
    public static C39747b m162193a(Provider<CategoriesRepository> provider, Provider<C37823k> provider2, Provider<C38328d> provider3) {
        return new C39747b(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static CategoriesGetCategoriesUseCase m162194c(CategoriesRepository categoriesRepository, C37823k kVar, C38328d dVar) {
        return new CategoriesGetCategoriesUseCase(categoriesRepository, kVar, dVar);
    }

    /* renamed from: b */
    public CategoriesGetCategoriesUseCase get() {
        return m162194c(this.f101451a.get(), this.f101452b.get(), this.f101453c.get());
    }
}
