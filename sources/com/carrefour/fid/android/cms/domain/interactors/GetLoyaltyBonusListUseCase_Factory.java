package com.carrefour.fid.android.cms.domain.interactors;

import com.carrefour.fid.android.cms.domain.repositories.CmsRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class GetLoyaltyBonusListUseCase_Factory implements C10324h<GetLoyaltyBonusListUseCase> {
    private final Provider<CmsRepository> repositoryProvider;

    public GetLoyaltyBonusListUseCase_Factory(Provider<CmsRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static GetLoyaltyBonusListUseCase_Factory create(Provider<CmsRepository> provider) {
        return new GetLoyaltyBonusListUseCase_Factory(provider);
    }

    public static GetLoyaltyBonusListUseCase newInstance(CmsRepository cmsRepository) {
        return new GetLoyaltyBonusListUseCase(cmsRepository);
    }

    public GetLoyaltyBonusListUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
