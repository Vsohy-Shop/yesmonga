package com.carrefour.fid.android.loyalty.domain.interactors;

import com.carrefour.fid.android.loyalty.data.repositories.LinkLoyaltyCardRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class LinkLoyaltyCardUseCase_Factory implements C10324h<LinkLoyaltyCardUseCase> {
    private final Provider<LinkLoyaltyCardRepository> linkLoyaltyCardRepositoryProvider;

    public LinkLoyaltyCardUseCase_Factory(Provider<LinkLoyaltyCardRepository> provider) {
        this.linkLoyaltyCardRepositoryProvider = provider;
    }

    public static LinkLoyaltyCardUseCase_Factory create(Provider<LinkLoyaltyCardRepository> provider) {
        return new LinkLoyaltyCardUseCase_Factory(provider);
    }

    public static LinkLoyaltyCardUseCase newInstance(LinkLoyaltyCardRepository linkLoyaltyCardRepository) {
        return new LinkLoyaltyCardUseCase(linkLoyaltyCardRepository);
    }

    public LinkLoyaltyCardUseCase get() {
        return newInstance(this.linkLoyaltyCardRepositoryProvider.get());
    }
}
