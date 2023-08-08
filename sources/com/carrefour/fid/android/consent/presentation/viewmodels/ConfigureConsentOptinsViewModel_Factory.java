package com.carrefour.fid.android.consent.presentation.viewmodels;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.domain.interactors.consent.C37630b;
import com.carrefour.fid.android.domain.interactors.consent.C37631c;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class ConfigureConsentOptinsViewModel_Factory implements C10324h<ConfigureConsentOptinsViewModel> {
    private final Provider<C13783a> analyticsDispatcherProvider;
    private final Provider<C37630b> getRefusedAndMissingConsentsUseCaseProvider;
    private final Provider<C37631c> updateConsentsUseCaseProvider;

    public ConfigureConsentOptinsViewModel_Factory(Provider<C37630b> provider, Provider<C37631c> provider2, Provider<C13783a> provider3) {
        this.getRefusedAndMissingConsentsUseCaseProvider = provider;
        this.updateConsentsUseCaseProvider = provider2;
        this.analyticsDispatcherProvider = provider3;
    }

    public static ConfigureConsentOptinsViewModel_Factory create(Provider<C37630b> provider, Provider<C37631c> provider2, Provider<C13783a> provider3) {
        return new ConfigureConsentOptinsViewModel_Factory(provider, provider2, provider3);
    }

    public static ConfigureConsentOptinsViewModel newInstance(C37630b bVar, C37631c cVar, C13783a aVar) {
        return new ConfigureConsentOptinsViewModel(bVar, cVar, aVar);
    }

    public ConfigureConsentOptinsViewModel get() {
        return newInstance(this.getRefusedAndMissingConsentsUseCaseProvider.get(), this.updateConsentsUseCaseProvider.get(), this.analyticsDispatcherProvider.get());
    }
}
