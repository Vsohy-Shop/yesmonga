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
public final class GetUserChannelsUseCase_Factory implements C10324h<GetUserChannelsUseCase> {
    private final Provider<LoyaltyRepository> repositoryProvider;

    public GetUserChannelsUseCase_Factory(Provider<LoyaltyRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static GetUserChannelsUseCase_Factory create(Provider<LoyaltyRepository> provider) {
        return new GetUserChannelsUseCase_Factory(provider);
    }

    public static GetUserChannelsUseCase newInstance(LoyaltyRepository loyaltyRepository) {
        return new GetUserChannelsUseCase(loyaltyRepository);
    }

    public GetUserChannelsUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
