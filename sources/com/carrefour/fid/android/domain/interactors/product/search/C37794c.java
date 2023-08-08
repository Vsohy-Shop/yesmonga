package com.carrefour.fid.android.domain.interactors.product.search;

import com.carrefour.fid.android.domain.interactors.product.SearchProductSuggestions;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.product.search.c */
public final class C37794c implements C10324h<GetProductSearchSuggestionsUseCase> {

    /* renamed from: a */
    public final Provider<SearchProductSuggestions> f94877a;

    /* renamed from: b */
    public final Provider<C37823k> f94878b;

    public C37794c(Provider<SearchProductSuggestions> provider, Provider<C37823k> provider2) {
        this.f94877a = provider;
        this.f94878b = provider2;
    }

    /* renamed from: a */
    public static C37794c m154931a(Provider<SearchProductSuggestions> provider, Provider<C37823k> provider2) {
        return new C37794c(provider, provider2);
    }

    /* renamed from: c */
    public static GetProductSearchSuggestionsUseCase m154932c(SearchProductSuggestions searchProductSuggestions, C37823k kVar) {
        return new GetProductSearchSuggestionsUseCase(searchProductSuggestions, kVar);
    }

    /* renamed from: b */
    public GetProductSearchSuggestionsUseCase get() {
        return m154932c(this.f94877a.get(), this.f94878b.get());
    }
}
