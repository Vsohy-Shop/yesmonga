package com.carrefour.fid.android.domain.interactors.product.search;

import com.carrefour.fid.android.data.repositories.SearchHistoryPreferencesRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.product.search.d */
public final class C37795d implements C10324h<GetSearchHistoryUseCase> {

    /* renamed from: a */
    public final Provider<SearchHistoryPreferencesRepository> f94879a;

    public C37795d(Provider<SearchHistoryPreferencesRepository> provider) {
        this.f94879a = provider;
    }

    /* renamed from: a */
    public static C37795d m154934a(Provider<SearchHistoryPreferencesRepository> provider) {
        return new C37795d(provider);
    }

    /* renamed from: c */
    public static GetSearchHistoryUseCase m154935c(SearchHistoryPreferencesRepository searchHistoryPreferencesRepository) {
        return new GetSearchHistoryUseCase(searchHistoryPreferencesRepository);
    }

    /* renamed from: b */
    public GetSearchHistoryUseCase get() {
        return m154935c(this.f94879a.get());
    }
}
