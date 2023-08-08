package com.carrefour.fid.android.account.domain.interactors.user;

import com.carrefour.fid.android.domain.interactors.user.C37878e;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.domain.interactors.user.b */
public final class C13273b implements C10324h<AccountGetUserAddressUseCase> {

    /* renamed from: a */
    public final Provider<C37878e> f32654a;

    public C13273b(Provider<C37878e> provider) {
        this.f32654a = provider;
    }

    /* renamed from: a */
    public static C13273b m57501a(Provider<C37878e> provider) {
        return new C13273b(provider);
    }

    /* renamed from: c */
    public static AccountGetUserAddressUseCase m57502c(C37878e eVar) {
        return new AccountGetUserAddressUseCase(eVar);
    }

    /* renamed from: b */
    public AccountGetUserAddressUseCase get() {
        return m57502c(this.f32654a.get());
    }
}
