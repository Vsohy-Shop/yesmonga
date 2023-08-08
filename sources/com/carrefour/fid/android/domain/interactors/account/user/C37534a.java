package com.carrefour.fid.android.domain.interactors.account.user;

import com.carrefour.fid.android.domain.interactors.user.C37878e;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.account.user.a */
public final class C37534a implements C10324h<AccountGetUserInfoWithCardTypeUseCase> {

    /* renamed from: a */
    public final Provider<C37878e> f94286a;

    public C37534a(Provider<C37878e> provider) {
        this.f94286a = provider;
    }

    /* renamed from: a */
    public static C37534a m154043a(Provider<C37878e> provider) {
        return new C37534a(provider);
    }

    /* renamed from: c */
    public static AccountGetUserInfoWithCardTypeUseCase m154044c(C37878e eVar) {
        return new AccountGetUserInfoWithCardTypeUseCase(eVar);
    }

    /* renamed from: b */
    public AccountGetUserInfoWithCardTypeUseCase get() {
        return m154044c(this.f94286a.get());
    }
}
