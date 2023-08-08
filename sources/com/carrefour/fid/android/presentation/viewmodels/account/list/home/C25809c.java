package com.carrefour.fid.android.presentation.viewmodels.account.list.home;

import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.home.c */
public final class C25809c implements C10324h<AccountListHomeViewModel> {

    /* renamed from: a */
    public final Provider<C37807b> f63216a;

    public C25809c(Provider<C37807b> provider) {
        this.f63216a = provider;
    }

    /* renamed from: a */
    public static C25809c m110689a(Provider<C37807b> provider) {
        return new C25809c(provider);
    }

    /* renamed from: c */
    public static AccountListHomeViewModel m110690c(C37807b bVar) {
        return new AccountListHomeViewModel(bVar);
    }

    /* renamed from: b */
    public AccountListHomeViewModel get() {
        return m110690c(this.f63216a.get());
    }
}
