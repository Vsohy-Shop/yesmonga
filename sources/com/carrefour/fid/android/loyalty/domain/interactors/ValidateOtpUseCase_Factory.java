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
public final class ValidateOtpUseCase_Factory implements C10324h<ValidateOtpUseCase> {
    private final Provider<LoyaltyRepository> repositoryProvider;

    public ValidateOtpUseCase_Factory(Provider<LoyaltyRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static ValidateOtpUseCase_Factory create(Provider<LoyaltyRepository> provider) {
        return new ValidateOtpUseCase_Factory(provider);
    }

    public static ValidateOtpUseCase newInstance(LoyaltyRepository loyaltyRepository) {
        return new ValidateOtpUseCase(loyaltyRepository);
    }

    public ValidateOtpUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
