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
public final class CreateLoyaltyCardFidUseCase_Factory implements C10324h<CreateLoyaltyCardFidUseCase> {
    private final Provider<LoyaltyRepository> repositoryProvider;

    public CreateLoyaltyCardFidUseCase_Factory(Provider<LoyaltyRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static CreateLoyaltyCardFidUseCase_Factory create(Provider<LoyaltyRepository> provider) {
        return new CreateLoyaltyCardFidUseCase_Factory(provider);
    }

    public static CreateLoyaltyCardFidUseCase newInstance(LoyaltyRepository loyaltyRepository) {
        return new CreateLoyaltyCardFidUseCase(loyaltyRepository);
    }

    public CreateLoyaltyCardFidUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
