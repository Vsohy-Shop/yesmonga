package com.carrefour.fid.android.presentation.viewmodels.product.search;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.product.search.AddSearchHistoryUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.ClearSearchHistoryUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.GetProductSearchSuggestionsUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.GetSearchHistoryUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.SearchWithListRemoteConfigUseCase;
import com.carrefour.fid.android.scan.core.datastore.ScanPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.c */
public final class C27266c implements C10324h<ProductSearchViewModel> {

    /* renamed from: a */
    public final Provider<GetProductSearchSuggestionsUseCase> f66246a;

    /* renamed from: b */
    public final Provider<AddSearchHistoryUseCase> f66247b;

    /* renamed from: c */
    public final Provider<ClearSearchHistoryUseCase> f66248c;

    /* renamed from: d */
    public final Provider<GetSearchHistoryUseCase> f66249d;

    /* renamed from: e */
    public final Provider<SearchWithListRemoteConfigUseCase> f66250e;

    /* renamed from: f */
    public final Provider<LoginRepository> f66251f;

    /* renamed from: g */
    public final Provider<ScanPreferencesStorage> f66252g;

    public C27266c(Provider<GetProductSearchSuggestionsUseCase> provider, Provider<AddSearchHistoryUseCase> provider2, Provider<ClearSearchHistoryUseCase> provider3, Provider<GetSearchHistoryUseCase> provider4, Provider<SearchWithListRemoteConfigUseCase> provider5, Provider<LoginRepository> provider6, Provider<ScanPreferencesStorage> provider7) {
        this.f66246a = provider;
        this.f66247b = provider2;
        this.f66248c = provider3;
        this.f66249d = provider4;
        this.f66250e = provider5;
        this.f66251f = provider6;
        this.f66252g = provider7;
    }

    /* renamed from: a */
    public static C27266c m115070a(Provider<GetProductSearchSuggestionsUseCase> provider, Provider<AddSearchHistoryUseCase> provider2, Provider<ClearSearchHistoryUseCase> provider3, Provider<GetSearchHistoryUseCase> provider4, Provider<SearchWithListRemoteConfigUseCase> provider5, Provider<LoginRepository> provider6, Provider<ScanPreferencesStorage> provider7) {
        return new C27266c(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    /* renamed from: c */
    public static ProductSearchViewModel m115071c(GetProductSearchSuggestionsUseCase getProductSearchSuggestionsUseCase, AddSearchHistoryUseCase addSearchHistoryUseCase, ClearSearchHistoryUseCase clearSearchHistoryUseCase, GetSearchHistoryUseCase getSearchHistoryUseCase, SearchWithListRemoteConfigUseCase searchWithListRemoteConfigUseCase, LoginRepository loginRepository, ScanPreferencesStorage scanPreferencesStorage) {
        return new ProductSearchViewModel(getProductSearchSuggestionsUseCase, addSearchHistoryUseCase, clearSearchHistoryUseCase, getSearchHistoryUseCase, searchWithListRemoteConfigUseCase, loginRepository, scanPreferencesStorage);
    }

    /* renamed from: b */
    public ProductSearchViewModel get() {
        return m115071c(this.f66246a.get(), this.f66247b.get(), this.f66248c.get(), this.f66249d.get(), this.f66250e.get(), this.f66251f.get(), this.f66252g.get());
    }
}
