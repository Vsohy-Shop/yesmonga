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
public final class GetOtpUseCase_Factory implements C10324h<GetOtpUseCase> {
    private final Provider<LoyaltyRepository> repositoryProvider;

    public GetOtpUseCase_Factory(Provider<LoyaltyRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static GetOtpUseCase_Factory create(Provider<LoyaltyRepository> provider) {
        return new GetOtpUseCase_Factory(provider);
    }

    public static GetOtpUseCase newInstance(LoyaltyRepository loyaltyRepository) {
        return new GetOtpUseCase(loyaltyRepository);
    }

    public GetOtpUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
