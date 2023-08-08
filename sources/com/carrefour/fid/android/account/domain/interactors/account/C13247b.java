package com.carrefour.fid.android.account.domain.interactors.account;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.domain.interactors.account.b */
public final class C13247b implements C10324h<C13246a> {

    /* renamed from: a */
    public final Provider<AccountRepository> f32586a;

    public C13247b(Provider<AccountRepository> provider) {
        this.f32586a = provider;
    }

    /* renamed from: a */
    public static C13247b m57385a(Provider<AccountRepository> provider) {
        return new C13247b(provider);
    }

    /* renamed from: c */
    public static C13246a m57386c(AccountRepository accountRepository) {
        return new C13246a(accountRepository);
    }

    /* renamed from: b */
    public C13246a get() {
        return m57386c(this.f32586a.get());
    }
}
