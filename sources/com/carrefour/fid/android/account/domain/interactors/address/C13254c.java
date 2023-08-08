package com.carrefour.fid.android.account.domain.interactors.address;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.domain.interactors.address.c */
public final class C13254c implements C10324h<UpdateAndCheckUserAddressUseCase> {

    /* renamed from: a */
    public final Provider<AccountRepository> f32601a;

    public C13254c(Provider<AccountRepository> provider) {
        this.f32601a = provider;
    }

    /* renamed from: a */
    public static C13254c m57415a(Provider<AccountRepository> provider) {
        return new C13254c(provider);
    }

    /* renamed from: c */
    public static UpdateAndCheckUserAddressUseCase m57416c(AccountRepository accountRepository) {
        return new UpdateAndCheckUserAddressUseCase(accountRepository);
    }

    /* renamed from: b */
    public UpdateAndCheckUserAddressUseCase get() {
        return m57416c(this.f32601a.get());
    }
}
