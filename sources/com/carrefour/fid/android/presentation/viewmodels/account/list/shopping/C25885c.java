package com.carrefour.fid.android.presentation.viewmodels.account.list.shopping;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.data.managers.ClearAppManager;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37681b;
import com.carrefour.fid.android.domain.interactors.offer.C37716b;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.c */
public final class C25885c implements C10324h<AccountListShoppingViewModel> {

    /* renamed from: a */
    public final Provider<C37716b> f63368a;

    /* renamed from: b */
    public final Provider<C37681b> f63369b;

    /* renamed from: c */
    public final Provider<C37807b> f63370c;

    /* renamed from: d */
    public final Provider<LoginRepository> f63371d;

    /* renamed from: e */
    public final Provider<ClearAppManager> f63372e;

    public C25885c(Provider<C37716b> provider, Provider<C37681b> provider2, Provider<C37807b> provider3, Provider<LoginRepository> provider4, Provider<ClearAppManager> provider5) {
        this.f63368a = provider;
        this.f63369b = provider2;
        this.f63370c = provider3;
        this.f63371d = provider4;
        this.f63372e = provider5;
    }

    /* renamed from: a */
    public static C25885c m110940a(Provider<C37716b> provider, Provider<C37681b> provider2, Provider<C37807b> provider3, Provider<LoginRepository> provider4, Provider<ClearAppManager> provider5) {
        return new C25885c(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static AccountListShoppingViewModel m110941c(C37716b bVar, C37681b bVar2, C37807b bVar3, LoginRepository loginRepository, ClearAppManager clearAppManager) {
        return new AccountListShoppingViewModel(bVar, bVar2, bVar3, loginRepository, clearAppManager);
    }

    /* renamed from: b */
    public AccountListShoppingViewModel get() {
        return m110941c(this.f63368a.get(), this.f63369b.get(), this.f63370c.get(), this.f63371d.get(), this.f63372e.get());
    }
}
