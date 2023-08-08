package com.carrefour.fid.android.domain.interactors.product.search;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.data.repositories.RecommendedNeedsRepository;
import com.carrefour.fid.android.domain.interactors.service.C37824l;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.product.search.i */
public final class C37800i implements C10324h<SearchWithListUseCase> {

    /* renamed from: a */
    public final Provider<RecommendedNeedsRepository> f94886a;

    /* renamed from: b */
    public final Provider<C37824l> f94887b;

    /* renamed from: c */
    public final Provider<LoginRepository> f94888c;

    /* renamed from: d */
    public final Provider<LoyaltyPreferencesStorage> f94889d;

    /* renamed from: e */
    public final Provider<AccountRepository> f94890e;

    public C37800i(Provider<RecommendedNeedsRepository> provider, Provider<C37824l> provider2, Provider<LoginRepository> provider3, Provider<LoyaltyPreferencesStorage> provider4, Provider<AccountRepository> provider5) {
        this.f94886a = provider;
        this.f94887b = provider2;
        this.f94888c = provider3;
        this.f94889d = provider4;
        this.f94890e = provider5;
    }

    /* renamed from: a */
    public static C37800i m154947a(Provider<RecommendedNeedsRepository> provider, Provider<C37824l> provider2, Provider<LoginRepository> provider3, Provider<LoyaltyPreferencesStorage> provider4, Provider<AccountRepository> provider5) {
        return new C37800i(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static SearchWithListUseCase m154948c(RecommendedNeedsRepository recommendedNeedsRepository, C37824l lVar, LoginRepository loginRepository, LoyaltyPreferencesStorage loyaltyPreferencesStorage, AccountRepository accountRepository) {
        return new SearchWithListUseCase(recommendedNeedsRepository, lVar, loginRepository, loyaltyPreferencesStorage, accountRepository);
    }

    /* renamed from: b */
    public SearchWithListUseCase get() {
        return m154948c(this.f94886a.get(), this.f94887b.get(), this.f94888c.get(), this.f94889d.get(), this.f94890e.get());
    }
}
