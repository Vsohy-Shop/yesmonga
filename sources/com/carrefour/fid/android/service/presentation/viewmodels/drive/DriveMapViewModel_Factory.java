package com.carrefour.fid.android.service.presentation.viewmodels.drive;

import com.carrefour.fid.android.domain.events.account.C37493a;
import com.carrefour.fid.android.domain.interactors.basket.C37578j0;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.domain.interactors.service.C37836s;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.service.domain.interactors.FetchDriveUseCase;
import com.carrefour.fid.android.service.presentation.analytics.drive.DriveMapAnalyticsReporter;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class DriveMapViewModel_Factory implements C10324h<DriveMapViewModel> {
    private final Provider<DriveMapAnalyticsReporter> analyticsProvider;
    private final Provider<FetchDriveUseCase> fetchDriveUseCaseProvider;
    private final Provider<C37816e> getFacilityDetailsByAnabelKeyUseCaseProvider;
    private final Provider<C37878e> getUserInfoUseCaseProvider;
    private final Provider<C37836s> setServiceSelectionUseCaseProvider;
    private final Provider<C37578j0> switchFacilityServiceInBasketUseCaseProvider;
    private final Provider<C37493a> tunnelInputProvider;

    public DriveMapViewModel_Factory(Provider<FetchDriveUseCase> provider, Provider<C37878e> provider2, Provider<C37493a> provider3, Provider<C37816e> provider4, Provider<C37836s> provider5, Provider<C37578j0> provider6, Provider<DriveMapAnalyticsReporter> provider7) {
        this.fetchDriveUseCaseProvider = provider;
        this.getUserInfoUseCaseProvider = provider2;
        this.tunnelInputProvider = provider3;
        this.getFacilityDetailsByAnabelKeyUseCaseProvider = provider4;
        this.setServiceSelectionUseCaseProvider = provider5;
        this.switchFacilityServiceInBasketUseCaseProvider = provider6;
        this.analyticsProvider = provider7;
    }

    public static DriveMapViewModel_Factory create(Provider<FetchDriveUseCase> provider, Provider<C37878e> provider2, Provider<C37493a> provider3, Provider<C37816e> provider4, Provider<C37836s> provider5, Provider<C37578j0> provider6, Provider<DriveMapAnalyticsReporter> provider7) {
        return new DriveMapViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static DriveMapViewModel newInstance(FetchDriveUseCase fetchDriveUseCase, C37878e eVar, C37493a aVar, C37816e eVar2, C37836s sVar, C37578j0 j0Var, DriveMapAnalyticsReporter driveMapAnalyticsReporter) {
        return new DriveMapViewModel(fetchDriveUseCase, eVar, aVar, eVar2, sVar, j0Var, driveMapAnalyticsReporter);
    }

    public DriveMapViewModel get() {
        return newInstance(this.fetchDriveUseCaseProvider.get(), this.getUserInfoUseCaseProvider.get(), this.tunnelInputProvider.get(), this.getFacilityDetailsByAnabelKeyUseCaseProvider.get(), this.setServiceSelectionUseCaseProvider.get(), this.switchFacilityServiceInBasketUseCaseProvider.get(), this.analyticsProvider.get());
    }
}
