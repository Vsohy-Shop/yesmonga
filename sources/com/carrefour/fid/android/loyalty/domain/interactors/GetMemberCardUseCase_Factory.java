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
public final class GetMemberCardUseCase_Factory implements C10324h<GetMemberCardUseCase> {
    private final Provider<MemberCardRepository> memberCardRepositoryProvider;

    public GetMemberCardUseCase_Factory(Provider<MemberCardRepository> provider) {
        this.memberCardRepositoryProvider = provider;
    }

    public static GetMemberCardUseCase_Factory create(Provider<MemberCardRepository> provider) {
        return new GetMemberCardUseCase_Factory(provider);
    }

    public static GetMemberCardUseCase newInstance(MemberCardRepository memberCardRepository) {
        return new GetMemberCardUseCase(memberCardRepository);
    }

    public GetMemberCardUseCase get() {
        return newInstance(this.memberCardRepositoryProvider.get());
    }
}
