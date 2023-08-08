package com.carrefour.fid.android.loyalty.data.repositories;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffMidFidApiService;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders;
import com.carrefour.fid.android.loyalty.data.services.MidFidApiService;
import com.carrefour.fid.android.shared.network.C28812h;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class LoyaltyRepository_Factory implements C10324h<LoyaltyRepository> {
    private final Provider<BffMidFidApiService> bffMidFidApiServiceProvider;
    private final Provider<LoyaltyHeaders> loyaltyHeadersProvider;
    private final Provider<LoyaltyPreferencesStorage> loyaltyPreferencesStorageProvider;
    private final Provider<MidFidApiService> midFidApiServiceProvider;
    private final Provider<C28812h> tokenProvider;

    public LoyaltyRepository_Factory(Provider<MidFidApiService> provider, Provider<BffMidFidApiService> provider2, Provider<LoyaltyHeaders> provider3, Provider<LoyaltyPreferencesStorage> provider4, Provider<C28812h> provider5) {
        this.midFidApiServiceProvider = provider;
        this.bffMidFidApiServiceProvider = provider2;
        this.loyaltyHeadersProvider = provider3;
        this.loyaltyPreferencesStorageProvider = provider4;
        this.tokenProvider = provider5;
    }

    public static LoyaltyRepository_Factory create(Provider<MidFidApiService> provider, Provider<BffMidFidApiService> provider2, Provider<LoyaltyHeaders> provider3, Provider<LoyaltyPreferencesStorage> provider4, Provider<C28812h> provider5) {
        return new LoyaltyRepository_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static LoyaltyRepository newInstance(MidFidApiService midFidApiService, BffMidFidApiService bffMidFidApiService, LoyaltyHeaders loyaltyHeaders, LoyaltyPreferencesStorage loyaltyPreferencesStorage, C28812h hVar) {
        return new LoyaltyRepository(midFidApiService, bffMidFidApiService, loyaltyHeaders, loyaltyPreferencesStorage, hVar);
    }

    public LoyaltyRepository get() {
        return newInstance(this.midFidApiServiceProvider.get(), this.bffMidFidApiServiceProvider.get(), this.loyaltyHeadersProvider.get(), this.loyaltyPreferencesStorageProvider.get(), this.tokenProvider.get());
    }
}
