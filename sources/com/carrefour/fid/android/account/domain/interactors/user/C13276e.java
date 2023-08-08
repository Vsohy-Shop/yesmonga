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
/* renamed from: com.carrefour.fid.android.account.domain.interactors.user.e */
public final class C13276e implements C10324h<AccountGetUserPhoneUseCase> {

    /* renamed from: a */
    public final Provider<C37878e> f32657a;

    public C13276e(Provider<C37878e> provider) {
        this.f32657a = provider;
    }

    /* renamed from: a */
    public static C13276e m57510a(Provider<C37878e> provider) {
        return new C13276e(provider);
    }

    /* renamed from: c */
    public static AccountGetUserPhoneUseCase m57511c(C37878e eVar) {
        return new AccountGetUserPhoneUseCase(eVar);
    }

    /* renamed from: b */
    public AccountGetUserPhoneUseCase get() {
        return m57511c(this.f32657a.get());
    }
}
