package com.carrefour.fid.android.loyalty.data.repositories;

import com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders;
import com.carrefour.fid.android.loyalty.data.services.ApiMemberCardService;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
public final class MemberCardRepository_Factory implements C10324h<MemberCardRepository> {
    private final Provider<LoyaltyHeaders> loyaltyHeadersProvider;
    private final Provider<ApiMemberCardService> serviceProvider;

    public MemberCardRepository_Factory(Provider<ApiMemberCardService> provider, Provider<LoyaltyHeaders> provider2) {
        this.serviceProvider = provider;
        this.loyaltyHeadersProvider = provider2;
    }

    public static MemberCardRepository_Factory create(Provider<ApiMemberCardService> provider, Provider<LoyaltyHeaders> provider2) {
        return new MemberCardRepository_Factory(provider, provider2);
    }

    public static MemberCardRepository newInstance(ApiMemberCardService apiMemberCardService, LoyaltyHeaders loyaltyHeaders) {
        return new MemberCardRepository(apiMemberCardService, loyaltyHeaders);
    }

    public MemberCardRepository get() {
        return newInstance(this.serviceProvider.get(), this.loyaltyHeadersProvider.get());
    }
}
