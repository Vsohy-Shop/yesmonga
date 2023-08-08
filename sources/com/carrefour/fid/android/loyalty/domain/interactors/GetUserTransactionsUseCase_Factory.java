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
public final class GetUserTransactionsUseCase_Factory implements C10324h<GetUserTransactionsUseCase> {
    private final Provider<LoyaltyRepository> repositoryProvider;

    public GetUserTransactionsUseCase_Factory(Provider<LoyaltyRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static GetUserTransactionsUseCase_Factory create(Provider<LoyaltyRepository> provider) {
        return new GetUserTransactionsUseCase_Factory(provider);
    }

    public static GetUserTransactionsUseCase newInstance(LoyaltyRepository loyaltyRepository) {
        return new GetUserTransactionsUseCase(loyaltyRepository);
    }

    public GetUserTransactionsUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
