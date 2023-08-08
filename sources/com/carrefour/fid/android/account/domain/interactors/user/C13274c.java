package com.carrefour.fid.android.account.domain.interactors.user;

import com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.domain.interactors.user.c */
public final class C13274c implements C10324h<AccountGetUserInfoStoreUseCase> {

    /* renamed from: a */
    public final Provider<LocalAccountDataSource> f32655a;

    public C13274c(Provider<LocalAccountDataSource> provider) {
        this.f32655a = provider;
    }

    /* renamed from: a */
    public static C13274c m57504a(Provider<LocalAccountDataSource> provider) {
        return new C13274c(provider);
    }

    /* renamed from: c */
    public static AccountGetUserInfoStoreUseCase m57505c(LocalAccountDataSource localAccountDataSource) {
        return new AccountGetUserInfoStoreUseCase(localAccountDataSource);
    }

    /* renamed from: b */
    public AccountGetUserInfoStoreUseCase get() {
        return m57505c(this.f32655a.get());
    }
}
