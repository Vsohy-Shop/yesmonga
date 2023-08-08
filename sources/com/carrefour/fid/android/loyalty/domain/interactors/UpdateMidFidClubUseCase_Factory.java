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
public final class UpdateMidFidClubUseCase_Factory implements C10324h<UpdateMidFidClubUseCase> {
    private final Provider<LoyaltyRepository> repositoryProvider;

    public UpdateMidFidClubUseCase_Factory(Provider<LoyaltyRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static UpdateMidFidClubUseCase_Factory create(Provider<LoyaltyRepository> provider) {
        return new UpdateMidFidClubUseCase_Factory(provider);
    }

    public static UpdateMidFidClubUseCase newInstance(LoyaltyRepository loyaltyRepository) {
        return new UpdateMidFidClubUseCase(loyaltyRepository);
    }

    public UpdateMidFidClubUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
