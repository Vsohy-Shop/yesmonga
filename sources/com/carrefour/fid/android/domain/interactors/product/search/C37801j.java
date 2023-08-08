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
/* renamed from: com.carrefour.fid.android.domain.interactors.product.search.j */
public final class C37801j implements C10324h<SetSearchWithListHistoryUseCase> {

    /* renamed from: a */
    public final Provider<SearchWithListHistoryPreferencesRepository> f94891a;

    public C37801j(Provider<SearchWithListHistoryPreferencesRepository> provider) {
        this.f94891a = provider;
    }

    /* renamed from: a */
    public static C37801j m154950a(Provider<SearchWithListHistoryPreferencesRepository> provider) {
        return new C37801j(provider);
    }

    /* renamed from: c */
    public static SetSearchWithListHistoryUseCase m154951c(SearchWithListHistoryPreferencesRepository searchWithListHistoryPreferencesRepository) {
        return new SetSearchWithListHistoryUseCase(searchWithListHistoryPreferencesRepository);
    }

    /* renamed from: b */
    public SetSearchWithListHistoryUseCase get() {
        return m154951c(this.f94891a.get());
    }
}
