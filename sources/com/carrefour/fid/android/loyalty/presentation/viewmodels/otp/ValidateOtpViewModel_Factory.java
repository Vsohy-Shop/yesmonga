package com.carrefour.fid.android.loyalty.presentation.viewmodels.otp;

import com.carrefour.fid.android.loyalty.domain.interactors.ValidateOtpUseCase;
import com.carrefour.fid.android.loyalty.presentation.analytics.ValidateOtpAnalyticsDelegate;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class ValidateOtpViewModel_Factory implements C10324h<ValidateOtpViewModel> {
    private final Provider<ValidateOtpAnalyticsDelegate> analyticsProvider;
    private final Provider<ValidateOtpUseCase> validateOtpUseCaseProvider;

    public ValidateOtpViewModel_Factory(Provider<ValidateOtpUseCase> provider, Provider<ValidateOtpAnalyticsDelegate> provider2) {
        this.validateOtpUseCaseProvider = provider;
        this.analyticsProvider = provider2;
    }

    public static ValidateOtpViewModel_Factory create(Provider<ValidateOtpUseCase> provider, Provider<ValidateOtpAnalyticsDelegate> provider2) {
        return new ValidateOtpViewModel_Factory(provider, provider2);
    }

    public static ValidateOtpViewModel newInstance(ValidateOtpUseCase validateOtpUseCase, ValidateOtpAnalyticsDelegate validateOtpAnalyticsDelegate) {
        return new ValidateOtpViewModel(validateOtpUseCase, validateOtpAnalyticsDelegate);
    }

    public ValidateOtpViewModel get() {
        return newInstance(this.validateOtpUseCaseProvider.get(), this.analyticsProvider.get());
    }
}
