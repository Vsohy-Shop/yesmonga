package com.carrefour.fid.android.domain.interactors.user;

import com.carrefour.fid.android.account.data.datasource.LocalLoginDataSource;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.user.a */
public final class C37873a implements C10324h<AppClearUserDataUseCase> {

    /* renamed from: a */
    public final Provider<AccountRepository> f94994a;

    /* renamed from: b */
    public final Provider<LocalLoginDataSource> f94995b;

    public C37873a(Provider<AccountRepository> provider, Provider<LocalLoginDataSource> provider2) {
        this.f94994a = provider;
        this.f94995b = provider2;
    }

    /* renamed from: a */
    public static C37873a m155126a(Provider<AccountRepository> provider, Provider<LocalLoginDataSource> provider2) {
        return new C37873a(provider, provider2);
    }

    /* renamed from: c */
    public static AppClearUserDataUseCase m155127c(AccountRepository accountRepository, LocalLoginDataSource localLoginDataSource) {
        return new AppClearUserDataUseCase(accountRepository, localLoginDataSource);
    }

    /* renamed from: b */
    public AppClearUserDataUseCase get() {
        return m155127c(this.f94994a.get(), this.f94995b.get());
    }
}
