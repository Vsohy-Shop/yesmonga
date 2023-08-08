package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.domain.interactors.account.C37517c;
import com.carrefour.fid.android.domain.interactors.basket.C37599t;
import com.carrefour.fid.android.domain.interactors.category.C37620b;
import com.carrefour.fid.android.domain.interactors.service.C37811a;
import com.carrefour.fid.android.domain.interactors.service.C37812b;
import com.carrefour.fid.android.domain.interactors.service.C37817f;
import com.carrefour.fid.android.domain.interactors.service.C37818g;
import com.carrefour.fid.android.domain.interactors.service.C37836s;
import com.carrefour.fid.android.domain.interactors.service.C37841v;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class ServiceSwitchToStandardPromiseUseCase_Factory implements C10324h<ServiceSwitchToStandardPromiseUseCase> {
    private final Provider<C37811a> clearServiceSelectionUseCaseProvider;
    private final Provider<C37812b> fetchDeliveryStoresUseCaseProvider;
    private final Provider<C37517c> getCachedUserInfoUseCaseProvider;
    private final Provider<C37620b> getDrivePromiseUseCaseProvider;
    private final Provider<C37817f> getMirrorDriveServiceUseCaseProvider;
    private final Provider<C37818g> getPromiseUseCaseProvider;
    private final Provider<ServiceGetServiceSelectionUseCase> getServiceSelectionUseCaseProvider;
    private final Provider<C37599t> initBasketUseCaseProvider;
    private final Provider<C37836s> setServiceSelectionUseCaseProvider;
    private final Provider<C37841v> updateStoreServiceUseCaseProvider;

    public ServiceSwitchToStandardPromiseUseCase_Factory(Provider<ServiceGetServiceSelectionUseCase> provider, Provider<C37517c> provider2, Provider<C37812b> provider3, Provider<C37818g> provider4, Provider<C37620b> provider5, Provider<C37817f> provider6, Provider<C37836s> provider7, Provider<C37841v> provider8, Provider<C37599t> provider9, Provider<C37811a> provider10) {
        this.getServiceSelectionUseCaseProvider = provider;
        this.getCachedUserInfoUseCaseProvider = provider2;
        this.fetchDeliveryStoresUseCaseProvider = provider3;
        this.getPromiseUseCaseProvider = provider4;
        this.getDrivePromiseUseCaseProvider = provider5;
        this.getMirrorDriveServiceUseCaseProvider = provider6;
        this.setServiceSelectionUseCaseProvider = provider7;
        this.updateStoreServiceUseCaseProvider = provider8;
        this.initBasketUseCaseProvider = provider9;
        this.clearServiceSelectionUseCaseProvider = provider10;
    }

    public static ServiceSwitchToStandardPromiseUseCase_Factory create(Provider<ServiceGetServiceSelectionUseCase> provider, Provider<C37517c> provider2, Provider<C37812b> provider3, Provider<C37818g> provider4, Provider<C37620b> provider5, Provider<C37817f> provider6, Provider<C37836s> provider7, Provider<C37841v> provider8, Provider<C37599t> provider9, Provider<C37811a> provider10) {
        return new ServiceSwitchToStandardPromiseUseCase_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static ServiceSwitchToStandardPromiseUseCase newInstance(ServiceGetServiceSelectionUseCase serviceGetServiceSelectionUseCase, C37517c cVar, C37812b bVar, C37818g gVar, C37620b bVar2, C37817f fVar, C37836s sVar, C37841v vVar, C37599t tVar, C37811a aVar) {
        return new ServiceSwitchToStandardPromiseUseCase(serviceGetServiceSelectionUseCase, cVar, bVar, gVar, bVar2, fVar, sVar, vVar, tVar, aVar);
    }

    public ServiceSwitchToStandardPromiseUseCase get() {
        return newInstance(this.getServiceSelectionUseCaseProvider.get(), this.getCachedUserInfoUseCaseProvider.get(), this.fetchDeliveryStoresUseCaseProvider.get(), this.getPromiseUseCaseProvider.get(), this.getDrivePromiseUseCaseProvider.get(), this.getMirrorDriveServiceUseCaseProvider.get(), this.setServiceSelectionUseCaseProvider.get(), this.updateStoreServiceUseCaseProvider.get(), this.initBasketUseCaseProvider.get(), this.clearServiceSelectionUseCaseProvider.get());
    }
}
