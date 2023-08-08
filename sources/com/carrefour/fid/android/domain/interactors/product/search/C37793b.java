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
/* renamed from: com.carrefour.fid.android.domain.interactors.product.search.b */
public final class C37793b implements C10324h<ClearSearchHistoryUseCase> {

    /* renamed from: a */
    public final Provider<SearchHistoryPreferencesRepository> f94876a;

    public C37793b(Provider<SearchHistoryPreferencesRepository> provider) {
        this.f94876a = provider;
    }

    /* renamed from: a */
    public static C37793b m154928a(Provider<SearchHistoryPreferencesRepository> provider) {
        return new C37793b(provider);
    }

    /* renamed from: c */
    public static ClearSearchHistoryUseCase m154929c(SearchHistoryPreferencesRepository searchHistoryPreferencesRepository) {
        return new ClearSearchHistoryUseCase(searchHistoryPreferencesRepository);
    }

    /* renamed from: b */
    public ClearSearchHistoryUseCase get() {
        return m154929c(this.f94876a.get());
    }
}
