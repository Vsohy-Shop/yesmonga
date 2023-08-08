package com.carrefour.fid.android.account.domain.interactors.user;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.IoDispatcher"})
@C10338r
/* renamed from: com.carrefour.fid.android.account.domain.interactors.user.a */
public final class C13272a implements C10324h<AccountClearCachedUserInfoUseCase> {

    /* renamed from: a */
    public final Provider<LoginRepository> f32651a;

    /* renamed from: b */
    public final Provider<AccountRepository> f32652b;

    /* renamed from: c */
    public final Provider<CoroutineDispatcher> f32653c;

    public C13272a(Provider<LoginRepository> provider, Provider<AccountRepository> provider2, Provider<CoroutineDispatcher> provider3) {
        this.f32651a = provider;
        this.f32652b = provider2;
        this.f32653c = provider3;
    }

    /* renamed from: a */
    public static C13272a m57498a(Provider<LoginRepository> provider, Provider<AccountRepository> provider2, Provider<CoroutineDispatcher> provider3) {
        return new C13272a(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static AccountClearCachedUserInfoUseCase m57499c(LoginRepository loginRepository, AccountRepository accountRepository, CoroutineDispatcher coroutineDispatcher) {
        return new AccountClearCachedUserInfoUseCase(loginRepository, accountRepository, coroutineDispatcher);
    }

    /* renamed from: b */
    public AccountClearCachedUserInfoUseCase get() {
        return m57499c(this.f32651a.get(), this.f32652b.get(), this.f32653c.get());
    }
}
