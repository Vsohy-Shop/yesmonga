package com.carrefour.fid.android.account.presentation.viewmodels.account;

import com.carrefour.fid.android.account.domain.interactors.user.UpdateUserPasswordUseCase;
import com.carrefour.fid.android.account.presentation.analytics.C13311x;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.j */
public final class C13590j implements C10324h<UpdateUserPasswordViewModel> {

    /* renamed from: a */
    public final Provider<UpdateUserPasswordUseCase> f33097a;

    /* renamed from: b */
    public final Provider<C13311x> f33098b;

    public C13590j(Provider<UpdateUserPasswordUseCase> provider, Provider<C13311x> provider2) {
        this.f33097a = provider;
        this.f33098b = provider2;
    }

    /* renamed from: a */
    public static C13590j m58218a(Provider<UpdateUserPasswordUseCase> provider, Provider<C13311x> provider2) {
        return new C13590j(provider, provider2);
    }

    /* renamed from: c */
    public static UpdateUserPasswordViewModel m58219c(UpdateUserPasswordUseCase updateUserPasswordUseCase, C13311x xVar) {
        return new UpdateUserPasswordViewModel(updateUserPasswordUseCase, xVar);
    }

    /* renamed from: b */
    public UpdateUserPasswordViewModel get() {
        return m58219c(this.f33097a.get(), this.f33098b.get());
    }
}
