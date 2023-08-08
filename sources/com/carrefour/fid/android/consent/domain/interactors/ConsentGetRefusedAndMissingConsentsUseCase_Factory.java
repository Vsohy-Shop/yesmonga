package com.carrefour.fid.android.consent.domain.interactors;

import com.carrefour.fid.android.domain.interactors.consent.C37629a;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class ConsentGetRefusedAndMissingConsentsUseCase_Factory implements C10324h<ConsentGetRefusedAndMissingConsentsUseCase> {
    private final Provider<C37629a> getConsentsUseCaseProvider;
    private final Provider<C37878e> getUserInfoUseCaseProvider;

    public ConsentGetRefusedAndMissingConsentsUseCase_Factory(Provider<C37629a> provider, Provider<C37878e> provider2) {
        this.getConsentsUseCaseProvider = provider;
        this.getUserInfoUseCaseProvider = provider2;
    }

    public static ConsentGetRefusedAndMissingConsentsUseCase_Factory create(Provider<C37629a> provider, Provider<C37878e> provider2) {
        return new ConsentGetRefusedAndMissingConsentsUseCase_Factory(provider, provider2);
    }

    public static ConsentGetRefusedAndMissingConsentsUseCase newInstance(C37629a aVar, C37878e eVar) {
        return new ConsentGetRefusedAndMissingConsentsUseCase(aVar, eVar);
    }

    public ConsentGetRefusedAndMissingConsentsUseCase get() {
        return newInstance(this.getConsentsUseCaseProvider.get(), this.getUserInfoUseCaseProvider.get());
    }
}
