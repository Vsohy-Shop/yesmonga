package com.carrefour.fid.android.presentation.viewmodels.account.consent;

import com.carrefour.fid.android.domain.interactors.consent.C37629a;
import com.carrefour.fid.android.domain.interactors.consent.C37631c;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.loyalty.domain.interactors.FidelityHasCardFidUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.C12074o0;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.ApplicationScope"})
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.consent.b */
public final class C25780b implements C10324h<AccountConsentOptinsTabViewModel> {

    /* renamed from: a */
    public final Provider<C37629a> f63145a;

    /* renamed from: b */
    public final Provider<C37631c> f63146b;

    /* renamed from: c */
    public final Provider<C37878e> f63147c;

    /* renamed from: d */
    public final Provider<FidelityHasCardFidUseCase> f63148d;

    /* renamed from: e */
    public final Provider<C12074o0> f63149e;

    /* renamed from: f */
    public final Provider<C25786e> f63150f;

    public C25780b(Provider<C37629a> provider, Provider<C37631c> provider2, Provider<C37878e> provider3, Provider<FidelityHasCardFidUseCase> provider4, Provider<C12074o0> provider5, Provider<C25786e> provider6) {
        this.f63145a = provider;
        this.f63146b = provider2;
        this.f63147c = provider3;
        this.f63148d = provider4;
        this.f63149e = provider5;
        this.f63150f = provider6;
    }

    /* renamed from: a */
    public static C25780b m110583a(Provider<C37629a> provider, Provider<C37631c> provider2, Provider<C37878e> provider3, Provider<FidelityHasCardFidUseCase> provider4, Provider<C12074o0> provider5, Provider<C25786e> provider6) {
        return new C25780b(provider, provider2, provider3, provider4, provider5, provider6);
    }

    /* renamed from: c */
    public static AccountConsentOptinsTabViewModel m110584c(C37629a aVar, C37631c cVar, C37878e eVar, FidelityHasCardFidUseCase fidelityHasCardFidUseCase, C12074o0 o0Var, C25786e eVar2) {
        return new AccountConsentOptinsTabViewModel(aVar, cVar, eVar, fidelityHasCardFidUseCase, o0Var, eVar2);
    }

    /* renamed from: b */
    public AccountConsentOptinsTabViewModel get() {
        return m110584c(this.f63145a.get(), this.f63146b.get(), this.f63147c.get(), this.f63148d.get(), this.f63149e.get(), this.f63150f.get());
    }
}
