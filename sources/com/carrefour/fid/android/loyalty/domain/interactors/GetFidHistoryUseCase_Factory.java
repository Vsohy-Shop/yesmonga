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
public final class GetFidHistoryUseCase_Factory implements C10324h<GetFidHistoryUseCase> {
    private final Provider<LoyaltyRepository> repositoryProvider;

    public GetFidHistoryUseCase_Factory(Provider<LoyaltyRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static GetFidHistoryUseCase_Factory create(Provider<LoyaltyRepository> provider) {
        return new GetFidHistoryUseCase_Factory(provider);
    }

    public static GetFidHistoryUseCase newInstance(LoyaltyRepository loyaltyRepository) {
        return new GetFidHistoryUseCase(loyaltyRepository);
    }

    public GetFidHistoryUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
