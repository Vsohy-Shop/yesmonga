package com.carrefour.fid.android.account.presentation.viewmodels.account;

import com.carrefour.fid.android.account.domain.interactors.user.UpdateUserInfoUseCase;
import com.carrefour.fid.android.account.presentation.analytics.C13308u;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.g */
public final class C13584g implements C10324h<UpdateUserInfoViewModel> {

    /* renamed from: a */
    public final Provider<C37878e> f33093a;

    /* renamed from: b */
    public final Provider<UpdateUserInfoUseCase> f33094b;

    /* renamed from: c */
    public final Provider<C13308u> f33095c;

    public C13584g(Provider<C37878e> provider, Provider<UpdateUserInfoUseCase> provider2, Provider<C13308u> provider3) {
        this.f33093a = provider;
        this.f33094b = provider2;
        this.f33095c = provider3;
    }

    /* renamed from: a */
    public static C13584g m58209a(Provider<C37878e> provider, Provider<UpdateUserInfoUseCase> provider2, Provider<C13308u> provider3) {
        return new C13584g(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static UpdateUserInfoViewModel m58210c(C37878e eVar, UpdateUserInfoUseCase updateUserInfoUseCase, C13308u uVar) {
        return new UpdateUserInfoViewModel(eVar, updateUserInfoUseCase, uVar);
    }

    /* renamed from: b */
    public UpdateUserInfoViewModel get() {
        return m58210c(this.f33093a.get(), this.f33094b.get(), this.f33095c.get());
    }
}
