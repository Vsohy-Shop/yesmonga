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
public final class ActivateLoyaltyCardFidUseCase_Factory implements C10324h<ActivateLoyaltyCardFidUseCase> {
    private final Provider<LoyaltyRepository> repositoryProvider;

    public ActivateLoyaltyCardFidUseCase_Factory(Provider<LoyaltyRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static ActivateLoyaltyCardFidUseCase_Factory create(Provider<LoyaltyRepository> provider) {
        return new ActivateLoyaltyCardFidUseCase_Factory(provider);
    }

    public static ActivateLoyaltyCardFidUseCase newInstance(LoyaltyRepository loyaltyRepository) {
        return new ActivateLoyaltyCardFidUseCase(loyaltyRepository);
    }

    public ActivateLoyaltyCardFidUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
