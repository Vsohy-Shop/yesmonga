package com.carrefour.fid.android.consent.domain.interactors;

import com.carrefour.fid.android.consent.domain.repositories.ConsentRepository;
import com.carrefour.fid.android.domain.interactors.account.C37518d;
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
public final class ConsentUpdateConsentsUseCase_Factory implements C10324h<ConsentUpdateConsentsUseCase> {
    private final Provider<ConsentRepository> consentRepositoryProvider;
    private final Provider<C37697b> getLoyaltyCardNumberUseCaseProvider;
    private final Provider<C37878e> getUserInfoUseCaseProvider;
    private final Provider<C37518d> getUserUidIamUseCaseProvider;

    public ConsentUpdateConsentsUseCase_Factory(Provider<ConsentRepository> provider, Provider<C37878e> provider2, Provider<C37518d> provider3, Provider<C37697b> provider4) {
        this.consentRepositoryProvider = provider;
        this.getUserInfoUseCaseProvider = provider2;
        this.getUserUidIamUseCaseProvider = provider3;
        this.getLoyaltyCardNumberUseCaseProvider = provider4;
    }

    public static ConsentUpdateConsentsUseCase_Factory create(Provider<ConsentRepository> provider, Provider<C37878e> provider2, Provider<C37518d> provider3, Provider<C37697b> provider4) {
        return new ConsentUpdateConsentsUseCase_Factory(provider, provider2, provider3, provider4);
    }

    public static ConsentUpdateConsentsUseCase newInstance(ConsentRepository consentRepository, C37878e eVar, C37518d dVar, C37697b bVar) {
        return new ConsentUpdateConsentsUseCase(consentRepository, eVar, dVar, bVar);
    }

    public ConsentUpdateConsentsUseCase get() {
        return newInstance(this.consentRepositoryProvider.get(), this.getUserInfoUseCaseProvider.get(), this.getUserUidIamUseCaseProvider.get(), this.getLoyaltyCardNumberUseCaseProvider.get());
    }
}
