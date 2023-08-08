package com.carrefour.fid.android.presentation.viewmodels.feesback;

import com.carrefour.fid.android.domain.interactors.feedback.C37686a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.MainImmediateDispatcher"})
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.feesback.a */
public final class C26344a implements C10324h<FeedbackViewModel> {

    /* renamed from: a */
    public final Provider<C37686a> f64367a;

    /* renamed from: b */
    public final Provider<CoroutineDispatcher> f64368b;

    public C26344a(Provider<C37686a> provider, Provider<CoroutineDispatcher> provider2) {
        this.f64367a = provider;
        this.f64368b = provider2;
    }

    /* renamed from: a */
    public static C26344a m112442a(Provider<C37686a> provider, Provider<CoroutineDispatcher> provider2) {
        return new C26344a(provider, provider2);
    }

    /* renamed from: c */
    public static FeedbackViewModel m112443c(C37686a aVar, CoroutineDispatcher coroutineDispatcher) {
        return new FeedbackViewModel(aVar, coroutineDispatcher);
    }

    /* renamed from: b */
    public FeedbackViewModel get() {
        return m112443c(this.f64367a.get(), this.f64368b.get());
    }
}
