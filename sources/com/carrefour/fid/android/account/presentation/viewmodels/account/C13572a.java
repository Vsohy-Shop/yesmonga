package com.carrefour.fid.android.account.presentation.viewmodels.account;

import com.carrefour.fid.android.account.presentation.analytics.C13291e;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.a */
public final class C13572a implements C10324h<AccountInfoViewModel> {

    /* renamed from: a */
    public final Provider<C37878e> f33087a;

    /* renamed from: b */
    public final Provider<C13291e> f33088b;

    public C13572a(Provider<C37878e> provider, Provider<C13291e> provider2) {
        this.f33087a = provider;
        this.f33088b = provider2;
    }

    /* renamed from: a */
    public static C13572a m58191a(Provider<C37878e> provider, Provider<C13291e> provider2) {
        return new C13572a(provider, provider2);
    }

    /* renamed from: c */
    public static AccountInfoViewModel m58192c(C37878e eVar, C13291e eVar2) {
        return new AccountInfoViewModel(eVar, eVar2);
    }

    /* renamed from: b */
    public AccountInfoViewModel get() {
        return m58192c(this.f33087a.get(), this.f33088b.get());
    }
}
