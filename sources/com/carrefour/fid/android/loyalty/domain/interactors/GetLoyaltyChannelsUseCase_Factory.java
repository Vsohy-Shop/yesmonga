package com.carrefour.fid.android.loyalty.domain.interactors;

import com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class GetLoyaltyChannelsUseCase_Factory implements C10324h<GetLoyaltyChannelsUseCase> {
    private final Provider<LoyaltyRepository> repositoryProvider;

    public GetLoyaltyChannelsUseCase_Factory(Provider<LoyaltyRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static GetLoyaltyChannelsUseCase_Factory create(Provider<LoyaltyRepository> provider) {
        return new GetLoyaltyChannelsUseCase_Factory(provider);
    }

    public static GetLoyaltyChannelsUseCase newInstance(LoyaltyRepository loyaltyRepository) {
        return new GetLoyaltyChannelsUseCase(loyaltyRepository);
    }

    public GetLoyaltyChannelsUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
