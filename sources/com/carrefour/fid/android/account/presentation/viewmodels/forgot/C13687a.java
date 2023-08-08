package com.carrefour.fid.android.account.presentation.viewmodels.forgot;

import com.carrefour.fid.android.account.domain.interactors.forgot.ForgotPasswordUseCase;
import com.carrefour.fid.android.account.presentation.analytics.C13298k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.forgot.a */
public final class C13687a implements C10324h<ForgotPasswordViewModel> {

    /* renamed from: a */
    public final Provider<ForgotPasswordUseCase> f33292a;

    /* renamed from: b */
    public final Provider<C13298k> f33293b;

    public C13687a(Provider<ForgotPasswordUseCase> provider, Provider<C13298k> provider2) {
        this.f33292a = provider;
        this.f33293b = provider2;
    }

    /* renamed from: a */
    public static C13687a m58522a(Provider<ForgotPasswordUseCase> provider, Provider<C13298k> provider2) {
        return new C13687a(provider, provider2);
    }

    /* renamed from: c */
    public static ForgotPasswordViewModel m58523c(ForgotPasswordUseCase forgotPasswordUseCase, C13298k kVar) {
        return new ForgotPasswordViewModel(forgotPasswordUseCase, kVar);
    }

    /* renamed from: b */
    public ForgotPasswordViewModel get() {
        return m58523c(this.f33292a.get(), this.f33293b.get());
    }
}
