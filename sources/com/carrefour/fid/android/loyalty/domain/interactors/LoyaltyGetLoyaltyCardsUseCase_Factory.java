package com.carrefour.fid.android.loyalty.domain.interactors;

import com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
public final class LoyaltyGetLoyaltyCardsUseCase_Factory implements C10324h<LoyaltyGetLoyaltyCardsUseCase> {
    private final Provider<MemberCardRepository> memberCardRepositoryProvider;

    public LoyaltyGetLoyaltyCardsUseCase_Factory(Provider<MemberCardRepository> provider) {
        this.memberCardRepositoryProvider = provider;
    }

    public static LoyaltyGetLoyaltyCardsUseCase_Factory create(Provider<MemberCardRepository> provider) {
        return new LoyaltyGetLoyaltyCardsUseCase_Factory(provider);
    }

    public static LoyaltyGetLoyaltyCardsUseCase newInstance(MemberCardRepository memberCardRepository) {
        return new LoyaltyGetLoyaltyCardsUseCase(memberCardRepository);
    }

    public LoyaltyGetLoyaltyCardsUseCase get() {
        return newInstance(this.memberCardRepositoryProvider.get());
    }
}
