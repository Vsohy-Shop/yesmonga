package com.carrefour.fid.android.loyalty.data.repositories;

import com.carrefour.fid.android.account.data.datasource.LocalAccountDataSource;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.loyalty.data.services.LinkLoyaltyCardApiService;
import com.carrefour.fid.android.shared.network.C28799a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
public final class LinkLoyaltyCardRepository_Factory implements C10324h<LinkLoyaltyCardRepository> {
    private final Provider<C28799a> accountHeadersProvider;
    private final Provider<LinkLoyaltyCardApiService> linkLoyaltyCardApiServiceProvider;
    private final Provider<LocalAccountDataSource> localAccountDataSourceProvider;
    private final Provider<LoyaltyPreferencesStorage> loyaltyPreferencesStorageProvider;

    public LinkLoyaltyCardRepository_Factory(Provider<LinkLoyaltyCardApiService> provider, Provider<LocalAccountDataSource> provider2, Provider<C28799a> provider3, Provider<LoyaltyPreferencesStorage> provider4) {
        this.linkLoyaltyCardApiServiceProvider = provider;
        this.localAccountDataSourceProvider = provider2;
        this.accountHeadersProvider = provider3;
        this.loyaltyPreferencesStorageProvider = provider4;
    }

    public static LinkLoyaltyCardRepository_Factory create(Provider<LinkLoyaltyCardApiService> provider, Provider<LocalAccountDataSource> provider2, Provider<C28799a> provider3, Provider<LoyaltyPreferencesStorage> provider4) {
        return new LinkLoyaltyCardRepository_Factory(provider, provider2, provider3, provider4);
    }

    public static LinkLoyaltyCardRepository newInstance(LinkLoyaltyCardApiService linkLoyaltyCardApiService, LocalAccountDataSource localAccountDataSource, C28799a aVar, LoyaltyPreferencesStorage loyaltyPreferencesStorage) {
        return new LinkLoyaltyCardRepository(linkLoyaltyCardApiService, localAccountDataSource, aVar, loyaltyPreferencesStorage);
    }

    public LinkLoyaltyCardRepository get() {
        return newInstance(this.linkLoyaltyCardApiServiceProvider.get(), this.localAccountDataSourceProvider.get(), this.accountHeadersProvider.get(), this.loyaltyPreferencesStorageProvider.get());
    }
}
