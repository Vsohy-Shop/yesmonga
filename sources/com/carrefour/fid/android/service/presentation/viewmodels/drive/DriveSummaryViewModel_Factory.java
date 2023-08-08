package com.carrefour.fid.android.service.presentation.viewmodels.drive;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.domain.interactors.basket.C37578j0;
import com.carrefour.fid.android.domain.interactors.service.C37836s;
import com.carrefour.fid.android.service.domain.interactors.ServiceGetFacilityDetailsByAnabelKeyUseCase;
import com.carrefour.fid.android.service.presentation.analytics.drive.DriveSummaryAnalyticsReporter;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class DriveSummaryViewModel_Factory implements C10324h<DriveSummaryViewModel> {
    private final Provider<DriveSummaryAnalyticsReporter> analyticsProvider;
    private final Provider<ServiceGetFacilityDetailsByAnabelKeyUseCase> getFacilityDetailsByAnabelKeyUseCaseProvider;
    private final Provider<C19456p0> savedStateHandleProvider;
    private final Provider<C37836s> setServiceSelectionUseCaseProvider;
    private final Provider<C37578j0> switchFacilityServiceInBasketUseCaseProvider;

    public DriveSummaryViewModel_Factory(Provider<ServiceGetFacilityDetailsByAnabelKeyUseCase> provider, Provider<C37836s> provider2, Provider<C37578j0> provider3, Provider<DriveSummaryAnalyticsReporter> provider4, Provider<C19456p0> provider5) {
        this.getFacilityDetailsByAnabelKeyUseCaseProvider = provider;
        this.setServiceSelectionUseCaseProvider = provider2;
        this.switchFacilityServiceInBasketUseCaseProvider = provider3;
        this.analyticsProvider = provider4;
        this.savedStateHandleProvider = provider5;
    }

    public static DriveSummaryViewModel_Factory create(Provider<ServiceGetFacilityDetailsByAnabelKeyUseCase> provider, Provider<C37836s> provider2, Provider<C37578j0> provider3, Provider<DriveSummaryAnalyticsReporter> provider4, Provider<C19456p0> provider5) {
        return new DriveSummaryViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static DriveSummaryViewModel newInstance(ServiceGetFacilityDetailsByAnabelKeyUseCase serviceGetFacilityDetailsByAnabelKeyUseCase, C37836s sVar, C37578j0 j0Var, DriveSummaryAnalyticsReporter driveSummaryAnalyticsReporter, C19456p0 p0Var) {
        return new DriveSummaryViewModel(serviceGetFacilityDetailsByAnabelKeyUseCase, sVar, j0Var, driveSummaryAnalyticsReporter, p0Var);
    }

    public DriveSummaryViewModel get() {
        return newInstance(this.getFacilityDetailsByAnabelKeyUseCaseProvider.get(), this.setServiceSelectionUseCaseProvider.get(), this.switchFacilityServiceInBasketUseCaseProvider.get(), this.analyticsProvider.get(), this.savedStateHandleProvider.get());
    }
}
