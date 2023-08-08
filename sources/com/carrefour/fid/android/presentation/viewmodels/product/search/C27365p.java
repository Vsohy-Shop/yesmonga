package com.carrefour.fid.android.presentation.viewmodels.product.search;

import com.carrefour.fid.android.domain.interactors.product.search.SearchWithListRemoteConfigUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.p */
public final class C27365p implements C10324h<ProductSearchWithListResultViewModel> {

    /* renamed from: a */
    public final Provider<SearchWithListRemoteConfigUseCase> f66430a;

    public C27365p(Provider<SearchWithListRemoteConfigUseCase> provider) {
        this.f66430a = provider;
    }

    /* renamed from: a */
    public static C27365p m115352a(Provider<SearchWithListRemoteConfigUseCase> provider) {
        return new C27365p(provider);
    }

    /* renamed from: c */
    public static ProductSearchWithListResultViewModel m115353c(SearchWithListRemoteConfigUseCase searchWithListRemoteConfigUseCase) {
        return new ProductSearchWithListResultViewModel(searchWithListRemoteConfigUseCase);
    }

    /* renamed from: b */
    public ProductSearchWithListResultViewModel get() {
        return m115353c(this.f66430a.get());
    }
}
