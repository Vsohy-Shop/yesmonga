package com.carrefour.fid.android.cms.domain.interactors;

import com.carrefour.fid.android.cms.domain.repositories.DeliveryRateRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class CmsGetDeliveryRateUseCase_Factory implements C10324h<CmsGetDeliveryRateUseCase> {
    private final Provider<DeliveryRateRepository> repositoryProvider;

    public CmsGetDeliveryRateUseCase_Factory(Provider<DeliveryRateRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static CmsGetDeliveryRateUseCase_Factory create(Provider<DeliveryRateRepository> provider) {
        return new CmsGetDeliveryRateUseCase_Factory(provider);
    }

    public static CmsGetDeliveryRateUseCase newInstance(DeliveryRateRepository deliveryRateRepository) {
        return new CmsGetDeliveryRateUseCase(deliveryRateRepository);
    }

    public CmsGetDeliveryRateUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
