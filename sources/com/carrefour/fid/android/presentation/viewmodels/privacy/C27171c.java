package com.carrefour.fid.android.presentation.viewmodels.privacy;

import android.content.Context;
import com.carrefour.fid.android.domain.interactors.privacy.PrivacyUseCase;
import com.carrefour.fid.android.presentation.models.mapper.C38507h;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@C10321e
@C10337q({"dagger.hilt.android.qualifiers.ApplicationContext", "com.carrefour.fid.android.shared.di.annotation.MainImmediateDispatcher"})
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.privacy.c */
public final class C27171c implements C10324h<PrivacyViewModel> {

    /* renamed from: a */
    public final Provider<PrivacyUseCase> f66065a;

    /* renamed from: b */
    public final Provider<C38507h> f66066b;

    /* renamed from: c */
    public final Provider<C27169a> f66067c;

    /* renamed from: d */
    public final Provider<Context> f66068d;

    /* renamed from: e */
    public final Provider<CoroutineDispatcher> f66069e;

    public C27171c(Provider<PrivacyUseCase> provider, Provider<C38507h> provider2, Provider<C27169a> provider3, Provider<Context> provider4, Provider<CoroutineDispatcher> provider5) {
        this.f66065a = provider;
        this.f66066b = provider2;
        this.f66067c = provider3;
        this.f66068d = provider4;
        this.f66069e = provider5;
    }

    /* renamed from: a */
    public static C27171c m114762a(Provider<PrivacyUseCase> provider, Provider<C38507h> provider2, Provider<C27169a> provider3, Provider<Context> provider4, Provider<CoroutineDispatcher> provider5) {
        return new C27171c(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static PrivacyViewModel m114763c(PrivacyUseCase privacyUseCase, C38507h hVar, C27169a aVar, Context context, CoroutineDispatcher coroutineDispatcher) {
        return new PrivacyViewModel(privacyUseCase, hVar, aVar, context, coroutineDispatcher);
    }

    /* renamed from: b */
    public PrivacyViewModel get() {
        return m114763c(this.f66065a.get(), this.f66066b.get(), this.f66067c.get(), this.f66068d.get(), this.f66069e.get());
    }
}
