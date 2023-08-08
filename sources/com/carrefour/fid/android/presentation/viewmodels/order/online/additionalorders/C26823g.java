package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders;

import android.content.Context;
import com.carrefour.fid.android.domain.interactors.product.search.AddSearchHistoryUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.ClearSearchHistoryUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.GetProductSearchSuggestionsUseCase;
import com.carrefour.fid.android.domain.interactors.product.search.GetSearchHistoryUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext", "com.carrefour.fid.android.shared.di.annotation.MainImmediateDispatcher"})
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.g */
public final class C26823g implements C10324h<AdditionalOrderProductSearchViewModel> {

    /* renamed from: a */
    public final Provider<GetProductSearchSuggestionsUseCase> f65413a;

    /* renamed from: b */
    public final Provider<AddSearchHistoryUseCase> f65414b;

    /* renamed from: c */
    public final Provider<ClearSearchHistoryUseCase> f65415c;

    /* renamed from: d */
    public final Provider<GetSearchHistoryUseCase> f65416d;

    /* renamed from: e */
    public final Provider<Context> f65417e;

    /* renamed from: f */
    public final Provider<CoroutineDispatcher> f65418f;

    public C26823g(Provider<GetProductSearchSuggestionsUseCase> provider, Provider<AddSearchHistoryUseCase> provider2, Provider<ClearSearchHistoryUseCase> provider3, Provider<GetSearchHistoryUseCase> provider4, Provider<Context> provider5, Provider<CoroutineDispatcher> provider6) {
        this.f65413a = provider;
        this.f65414b = provider2;
        this.f65415c = provider3;
        this.f65416d = provider4;
        this.f65417e = provider5;
        this.f65418f = provider6;
    }

    /* renamed from: a */
    public static C26823g m113821a(Provider<GetProductSearchSuggestionsUseCase> provider, Provider<AddSearchHistoryUseCase> provider2, Provider<ClearSearchHistoryUseCase> provider3, Provider<GetSearchHistoryUseCase> provider4, Provider<Context> provider5, Provider<CoroutineDispatcher> provider6) {
        return new C26823g(provider, provider2, provider3, provider4, provider5, provider6);
    }

    /* renamed from: c */
    public static AdditionalOrderProductSearchViewModel m113822c(GetProductSearchSuggestionsUseCase getProductSearchSuggestionsUseCase, AddSearchHistoryUseCase addSearchHistoryUseCase, ClearSearchHistoryUseCase clearSearchHistoryUseCase, GetSearchHistoryUseCase getSearchHistoryUseCase, Context context, CoroutineDispatcher coroutineDispatcher) {
        return new AdditionalOrderProductSearchViewModel(getProductSearchSuggestionsUseCase, addSearchHistoryUseCase, clearSearchHistoryUseCase, getSearchHistoryUseCase, context, coroutineDispatcher);
    }

    /* renamed from: b */
    public AdditionalOrderProductSearchViewModel get() {
        return m113822c(this.f65413a.get(), this.f65414b.get(), this.f65415c.get(), this.f65416d.get(), this.f65417e.get(), this.f65418f.get());
    }
}
