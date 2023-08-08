package com.carrefour.fid.android.domain.interactors.product.search;

import com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.product.search.e */
public final class C37796e implements C10324h<GetSearchWithListHistoryUseCase> {

    /* renamed from: a */
    public final Provider<SearchWithListHistoryPreferencesRepository> f94880a;

    public C37796e(Provider<SearchWithListHistoryPreferencesRepository> provider) {
        this.f94880a = provider;
    }

    /* renamed from: a */
    public static C37796e m154937a(Provider<SearchWithListHistoryPreferencesRepository> provider) {
        return new C37796e(provider);
    }

    /* renamed from: c */
    public static GetSearchWithListHistoryUseCase m154938c(SearchWithListHistoryPreferencesRepository searchWithListHistoryPreferencesRepository) {
        return new GetSearchWithListHistoryUseCase(searchWithListHistoryPreferencesRepository);
    }

    /* renamed from: b */
    public GetSearchWithListHistoryUseCase get() {
        return m154938c(this.f94880a.get());
    }
}
