package com.carrefour.fid.android.consent.domain.repositories;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffCustomersManagementApi;
import com.carrefour.fid.android.shared.network.C28812h;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class ConsentRepository_Factory implements C10324h<ConsentRepository> {
    private final Provider<BffCustomersManagementApi> serviceProvider;
    private final Provider<C28812h> tokenProvider;

    public ConsentRepository_Factory(Provider<BffCustomersManagementApi> provider, Provider<C28812h> provider2) {
        this.serviceProvider = provider;
        this.tokenProvider = provider2;
    }

    public static ConsentRepository_Factory create(Provider<BffCustomersManagementApi> provider, Provider<C28812h> provider2) {
        return new ConsentRepository_Factory(provider, provider2);
    }

    public static ConsentRepository newInstance(BffCustomersManagementApi bffCustomersManagementApi, C28812h hVar) {
        return new ConsentRepository(bffCustomersManagementApi, hVar);
    }

    public ConsentRepository get() {
        return newInstance(this.serviceProvider.get(), this.tokenProvider.get());
    }
}
