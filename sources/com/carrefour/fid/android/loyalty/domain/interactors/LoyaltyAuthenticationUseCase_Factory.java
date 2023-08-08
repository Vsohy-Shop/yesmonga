package com.carrefour.fid.android.loyalty.domain.interactors;

import com.carrefour.fid.android.loyalty.data.repositories.LoyaltyAuthRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class LoyaltyAuthenticationUseCase_Factory implements C10324h<LoyaltyAuthenticationUseCase> {
    private final Provider<LoyaltyAuthRepository> repositoryProvider;

    public LoyaltyAuthenticationUseCase_Factory(Provider<LoyaltyAuthRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static LoyaltyAuthenticationUseCase_Factory create(Provider<LoyaltyAuthRepository> provider) {
        return new LoyaltyAuthenticationUseCase_Factory(provider);
    }

    public static LoyaltyAuthenticationUseCase newInstance(LoyaltyAuthRepository loyaltyAuthRepository) {
        return new LoyaltyAuthenticationUseCase(loyaltyAuthRepository);
    }

    public LoyaltyAuthenticationUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
