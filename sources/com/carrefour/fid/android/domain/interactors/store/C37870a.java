package com.carrefour.fid.android.domain.interactors.store;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.bff_data_shared.data.api.services.BffStoresManagementApi;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.store.a */
public final class C37870a implements C10324h<CheckStoreEligibilityUseCase> {

    /* renamed from: a */
    public final Provider<BffStoresManagementApi> f94982a;

    /* renamed from: b */
    public final Provider<AccountRepository> f94983b;

    /* renamed from: c */
    public final Provider<C37823k> f94984c;

    public C37870a(Provider<BffStoresManagementApi> provider, Provider<AccountRepository> provider2, Provider<C37823k> provider3) {
        this.f94982a = provider;
        this.f94983b = provider2;
        this.f94984c = provider3;
    }

    /* renamed from: a */
    public static C37870a m155115a(Provider<BffStoresManagementApi> provider, Provider<AccountRepository> provider2, Provider<C37823k> provider3) {
        return new C37870a(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static CheckStoreEligibilityUseCase m155116c(BffStoresManagementApi bffStoresManagementApi, AccountRepository accountRepository, C37823k kVar) {
        return new CheckStoreEligibilityUseCase(bffStoresManagementApi, accountRepository, kVar);
    }

    /* renamed from: b */
    public CheckStoreEligibilityUseCase get() {
        return m155116c(this.f94982a.get(), this.f94983b.get(), this.f94984c.get());
    }
}
