package com.carrefour.fid.android.domain.interactors.account.user;

import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.account.user.b */
public final class C37535b implements C10324h<AccountGetUserUuidUseCase> {

    /* renamed from: a */
    public final Provider<BaseAppPreferencesStorage> f94287a;

    public C37535b(Provider<BaseAppPreferencesStorage> provider) {
        this.f94287a = provider;
    }

    /* renamed from: a */
    public static C37535b m154046a(Provider<BaseAppPreferencesStorage> provider) {
        return new C37535b(provider);
    }

    /* renamed from: c */
    public static AccountGetUserUuidUseCase m154047c(BaseAppPreferencesStorage baseAppPreferencesStorage) {
        return new AccountGetUserUuidUseCase(baseAppPreferencesStorage);
    }

    /* renamed from: b */
    public AccountGetUserUuidUseCase get() {
        return m154047c(this.f94287a.get());
    }
}
