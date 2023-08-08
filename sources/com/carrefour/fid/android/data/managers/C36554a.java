package com.carrefour.fid.android.data.managers;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.data.managers.a */
public final class C36554a implements C10324h<ClearAppManager> {

    /* renamed from: a */
    public final Provider<AccountRepository> f90276a;

    /* renamed from: b */
    public final Provider<C36555b> f90277b;

    /* renamed from: c */
    public final Provider<C13783a> f90278c;

    public C36554a(Provider<AccountRepository> provider, Provider<C36555b> provider2, Provider<C13783a> provider3) {
        this.f90276a = provider;
        this.f90277b = provider2;
        this.f90278c = provider3;
    }

    /* renamed from: a */
    public static C36554a m149882a(Provider<AccountRepository> provider, Provider<C36555b> provider2, Provider<C13783a> provider3) {
        return new C36554a(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static ClearAppManager m149883c(AccountRepository accountRepository, C36555b bVar, C13783a aVar) {
        return new ClearAppManager(accountRepository, bVar, aVar);
    }

    /* renamed from: b */
    public ClearAppManager get() {
        return m149883c(this.f90276a.get(), this.f90277b.get(), this.f90278c.get());
    }
}
