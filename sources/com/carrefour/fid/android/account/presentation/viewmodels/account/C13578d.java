package com.carrefour.fid.android.account.presentation.viewmodels.account;

import com.carrefour.fid.android.account.domain.interactors.user.UpdateUserEmailUseCase;
import com.carrefour.fid.android.account.presentation.analytics.C13305r;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.d */
public final class C13578d implements C10324h<UpdateUserEmailViewModel> {

    /* renamed from: a */
    public final Provider<UpdateUserEmailUseCase> f33090a;

    /* renamed from: b */
    public final Provider<C13305r> f33091b;

    public C13578d(Provider<UpdateUserEmailUseCase> provider, Provider<C13305r> provider2) {
        this.f33090a = provider;
        this.f33091b = provider2;
    }

    /* renamed from: a */
    public static C13578d m58200a(Provider<UpdateUserEmailUseCase> provider, Provider<C13305r> provider2) {
        return new C13578d(provider, provider2);
    }

    /* renamed from: c */
    public static UpdateUserEmailViewModel m58201c(UpdateUserEmailUseCase updateUserEmailUseCase, C13305r rVar) {
        return new UpdateUserEmailViewModel(updateUserEmailUseCase, rVar);
    }

    /* renamed from: b */
    public UpdateUserEmailViewModel get() {
        return m58201c(this.f33090a.get(), this.f33091b.get());
    }
}
