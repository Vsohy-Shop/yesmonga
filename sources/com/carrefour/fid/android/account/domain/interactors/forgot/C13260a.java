package com.carrefour.fid.android.account.domain.interactors.forgot;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.domain.interactors.forgot.a */
public final class C13260a implements C10324h<ForgotPasswordUseCase> {

    /* renamed from: a */
    public final Provider<AccountRepository> f32613a;

    public C13260a(Provider<AccountRepository> provider) {
        this.f32613a = provider;
    }

    /* renamed from: a */
    public static C13260a m57447a(Provider<AccountRepository> provider) {
        return new C13260a(provider);
    }

    /* renamed from: c */
    public static ForgotPasswordUseCase m57448c(AccountRepository accountRepository) {
        return new ForgotPasswordUseCase(accountRepository);
    }

    /* renamed from: b */
    public ForgotPasswordUseCase get() {
        return m57448c(this.f32613a.get());
    }
}
