package com.carrefour.fid.android.loyalty.data.repositories;

import com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders;
import com.carrefour.fid.android.loyalty.data.services.IamAuthLoyaltyApiService;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class LoyaltyAuthRepository_Factory implements C10324h<LoyaltyAuthRepository> {
    private final Provider<LoyaltyHeaders> loyaltyHeadersProvider;
    private final Provider<IamAuthLoyaltyApiService> serviceProvider;

    public LoyaltyAuthRepository_Factory(Provider<IamAuthLoyaltyApiService> provider, Provider<LoyaltyHeaders> provider2) {
        this.serviceProvider = provider;
        this.loyaltyHeadersProvider = provider2;
    }

    public static LoyaltyAuthRepository_Factory create(Provider<IamAuthLoyaltyApiService> provider, Provider<LoyaltyHeaders> provider2) {
        return new LoyaltyAuthRepository_Factory(provider, provider2);
    }

    public static LoyaltyAuthRepository newInstance(IamAuthLoyaltyApiService iamAuthLoyaltyApiService, LoyaltyHeaders loyaltyHeaders) {
        return new LoyaltyAuthRepository(iamAuthLoyaltyApiService, loyaltyHeaders);
    }

    public LoyaltyAuthRepository get() {
        return newInstance(this.serviceProvider.get(), this.loyaltyHeadersProvider.get());
    }
}
