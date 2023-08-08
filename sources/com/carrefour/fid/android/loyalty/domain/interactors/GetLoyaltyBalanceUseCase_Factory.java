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
public final class GetLoyaltyBalanceUseCase_Factory implements C10324h<GetLoyaltyBalanceUseCase> {
    private final Provider<LoyaltyRepository> repositoryProvider;

    public GetLoyaltyBalanceUseCase_Factory(Provider<LoyaltyRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static GetLoyaltyBalanceUseCase_Factory create(Provider<LoyaltyRepository> provider) {
        return new GetLoyaltyBalanceUseCase_Factory(provider);
    }

    public static GetLoyaltyBalanceUseCase newInstance(LoyaltyRepository loyaltyRepository) {
        return new GetLoyaltyBalanceUseCase(loyaltyRepository);
    }

    public GetLoyaltyBalanceUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
