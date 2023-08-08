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
/* renamed from: com.carrefour.fid.android.domain.interactors.product.search.a */
public final class C37792a implements C10324h<AddSearchHistoryUseCase> {

    /* renamed from: a */
    public final Provider<SearchHistoryPreferencesRepository> f94875a;

    public C37792a(Provider<SearchHistoryPreferencesRepository> provider) {
        this.f94875a = provider;
    }

    /* renamed from: a */
    public static C37792a m154925a(Provider<SearchHistoryPreferencesRepository> provider) {
        return new C37792a(provider);
    }

    /* renamed from: c */
    public static AddSearchHistoryUseCase m154926c(SearchHistoryPreferencesRepository searchHistoryPreferencesRepository) {
        return new AddSearchHistoryUseCase(searchHistoryPreferencesRepository);
    }

    /* renamed from: b */
    public AddSearchHistoryUseCase get() {
        return m154926c(this.f94875a.get());
    }
}
