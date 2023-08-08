package com.carrefour.fid.android.account.presentation.viewmodels.address;

import com.carrefour.fid.android.account.domain.events.C13239a;
import com.carrefour.fid.android.account.domain.interactors.address.UpdateAndCheckUserAddressUseCase;
import com.carrefour.fid.android.account.domain.interactors.address.dqe.GetDQEAddressSuggestionsUseCase;
import com.carrefour.fid.android.account.domain.interactors.address.dqe.GetVerificationDQEAddressUseCase;
import com.carrefour.fid.android.account.presentation.analytics.C13286a0;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.address.d */
public final class C13639d implements C10324h<VerifyUserAddressViewModel> {

    /* renamed from: a */
    public final Provider<C37878e> f33190a;

    /* renamed from: b */
    public final Provider<GetDQEAddressSuggestionsUseCase> f33191b;

    /* renamed from: c */
    public final Provider<GetVerificationDQEAddressUseCase> f33192c;

    /* renamed from: d */
    public final Provider<UpdateAndCheckUserAddressUseCase> f33193d;

    /* renamed from: e */
    public final Provider<C13286a0> f33194e;

    /* renamed from: f */
    public final Provider<C13239a> f33195f;

    public C13639d(Provider<C37878e> provider, Provider<GetDQEAddressSuggestionsUseCase> provider2, Provider<GetVerificationDQEAddressUseCase> provider3, Provider<UpdateAndCheckUserAddressUseCase> provider4, Provider<C13286a0> provider5, Provider<C13239a> provider6) {
        this.f33190a = provider;
        this.f33191b = provider2;
        this.f33192c = provider3;
        this.f33193d = provider4;
        this.f33194e = provider5;
        this.f33195f = provider6;
    }

    /* renamed from: a */
    public static C13639d m58362a(Provider<C37878e> provider, Provider<GetDQEAddressSuggestionsUseCase> provider2, Provider<GetVerificationDQEAddressUseCase> provider3, Provider<UpdateAndCheckUserAddressUseCase> provider4, Provider<C13286a0> provider5, Provider<C13239a> provider6) {
        return new C13639d(provider, provider2, provider3, provider4, provider5, provider6);
    }

    /* renamed from: c */
    public static VerifyUserAddressViewModel m58363c(C37878e eVar, GetDQEAddressSuggestionsUseCase getDQEAddressSuggestionsUseCase, GetVerificationDQEAddressUseCase getVerificationDQEAddressUseCase, UpdateAndCheckUserAddressUseCase updateAndCheckUserAddressUseCase, C13286a0 a0Var, C13239a aVar) {
        return new VerifyUserAddressViewModel(eVar, getDQEAddressSuggestionsUseCase, getVerificationDQEAddressUseCase, updateAndCheckUserAddressUseCase, a0Var, aVar);
    }

    /* renamed from: b */
    public VerifyUserAddressViewModel get() {
        return m58363c(this.f33190a.get(), this.f33191b.get(), this.f33192c.get(), this.f33193d.get(), this.f33194e.get(), this.f33195f.get());
    }
}
