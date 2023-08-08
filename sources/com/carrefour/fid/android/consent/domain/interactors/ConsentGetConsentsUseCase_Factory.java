package com.carrefour.fid.android.consent.domain.interactors;

import com.carrefour.fid.android.consent.domain.repositories.ConsentRepository;
import com.carrefour.fid.android.domain.interactors.loyalty.C37697b;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class ConsentGetConsentsUseCase_Factory implements C10324h<ConsentGetConsentsUseCase> {
    private final Provider<ConsentRepository> consentRepositoryProvider;
    private final Provider<C37697b> getLoyaltyCardNumberUseCaseProvider;
    private final Provider<C37878e> getUserInfoUseCaseProvider;

    public ConsentGetConsentsUseCase_Factory(Provider<ConsentRepository> provider, Provider<C37878e> provider2, Provider<C37697b> provider3) {
        this.consentRepositoryProvider = provider;
        this.getUserInfoUseCaseProvider = provider2;
        this.getLoyaltyCardNumberUseCaseProvider = provider3;
    }

    public static ConsentGetConsentsUseCase_Factory create(Provider<ConsentRepository> provider, Provider<C37878e> provider2, Provider<C37697b> provider3) {
        return new ConsentGetConsentsUseCase_Factory(provider, provider2, provider3);
    }

    public static ConsentGetConsentsUseCase newInstance(ConsentRepository consentRepository, C37878e eVar, C37697b bVar) {
        return new ConsentGetConsentsUseCase(consentRepository, eVar, bVar);
    }

    public ConsentGetConsentsUseCase get() {
        return newInstance(this.consentRepositoryProvider.get(), this.getUserInfoUseCaseProvider.get(), this.getLoyaltyCardNumberUseCaseProvider.get());
    }
}
