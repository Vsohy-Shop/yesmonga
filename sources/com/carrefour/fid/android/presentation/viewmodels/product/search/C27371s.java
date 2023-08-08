package com.carrefour.fid.android.presentation.viewmodels.product.search;

import com.carrefour.fid.android.domain.interactors.product.search.GetSearchWithListHistoryUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.SearchWithListUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.SetSearchWithListHistoryUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.s */
public final class C27371s implements C10324h<ProductSearchWithListViewModel> {

    /* renamed from: a */
    public final Provider<GetSearchWithListHistoryUseCase> f66432a;

    /* renamed from: b */
    public final Provider<SetSearchWithListHistoryUseCase> f66433b;

    /* renamed from: c */
    public final Provider<SearchWithListUseCase> f66434c;

    public C27371s(Provider<GetSearchWithListHistoryUseCase> provider, Provider<SetSearchWithListHistoryUseCase> provider2, Provider<SearchWithListUseCase> provider3) {
        this.f66432a = provider;
        this.f66433b = provider2;
        this.f66434c = provider3;
    }

    /* renamed from: a */
    public static C27371s m115361a(Provider<GetSearchWithListHistoryUseCase> provider, Provider<SetSearchWithListHistoryUseCase> provider2, Provider<SearchWithListUseCase> provider3) {
        return new C27371s(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static ProductSearchWithListViewModel m115362c(GetSearchWithListHistoryUseCase getSearchWithListHistoryUseCase, SetSearchWithListHistoryUseCase setSearchWithListHistoryUseCase, SearchWithListUseCase searchWithListUseCase) {
        return new ProductSearchWithListViewModel(getSearchWithListHistoryUseCase, setSearchWithListHistoryUseCase, searchWithListUseCase);
    }

    /* renamed from: b */
    public ProductSearchWithListViewModel get() {
        return m115362c(this.f66432a.get(), this.f66433b.get(), this.f66434c.get());
    }
}
