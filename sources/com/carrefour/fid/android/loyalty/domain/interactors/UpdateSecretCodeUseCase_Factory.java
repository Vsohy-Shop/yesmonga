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
public final class UpdateSecretCodeUseCase_Factory implements C10324h<UpdateSecretCodeUseCase> {
    private final Provider<LoyaltyRepository> repositoryProvider;

    public UpdateSecretCodeUseCase_Factory(Provider<LoyaltyRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static UpdateSecretCodeUseCase_Factory create(Provider<LoyaltyRepository> provider) {
        return new UpdateSecretCodeUseCase_Factory(provider);
    }

    public static UpdateSecretCodeUseCase newInstance(LoyaltyRepository loyaltyRepository) {
        return new UpdateSecretCodeUseCase(loyaltyRepository);
    }

    public UpdateSecretCodeUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
