package com.carrefour.fid.android.presentation.viewmodels.account.list.order;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.data.managers.ClearAppManager;
import com.carrefour.fid.android.domain.interactors.account.order.GetLastOnlineOrderUseCase;
import com.carrefour.fid.android.domain.interactors.account.order.GetOnlineOrderByIdUseCase;
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
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.order.c */
public final class C25861c implements C10324h<AccountListOrderViewModel> {

    /* renamed from: a */
    public final Provider<C37716b> f63315a;

    /* renamed from: b */
    public final Provider<GetLastOnlineOrderUseCase> f63316b;

    /* renamed from: c */
    public final Provider<GetOnlineOrderByIdUseCase> f63317c;

    /* renamed from: d */
    public final Provider<C37807b> f63318d;

    /* renamed from: e */
    public final Provider<LoginRepository> f63319e;

    /* renamed from: f */
    public final Provider<ClearAppManager> f63320f;

    public C25861c(Provider<C37716b> provider, Provider<GetLastOnlineOrderUseCase> provider2, Provider<GetOnlineOrderByIdUseCase> provider3, Provider<C37807b> provider4, Provider<LoginRepository> provider5, Provider<ClearAppManager> provider6) {
        this.f63315a = provider;
        this.f63316b = provider2;
        this.f63317c = provider3;
        this.f63318d = provider4;
        this.f63319e = provider5;
        this.f63320f = provider6;
    }

    /* renamed from: a */
    public static C25861c m110849a(Provider<C37716b> provider, Provider<GetLastOnlineOrderUseCase> provider2, Provider<GetOnlineOrderByIdUseCase> provider3, Provider<C37807b> provider4, Provider<LoginRepository> provider5, Provider<ClearAppManager> provider6) {
        return new C25861c(provider, provider2, provider3, provider4, provider5, provider6);
    }

    /* renamed from: c */
    public static AccountListOrderViewModel m110850c(C37716b bVar, GetLastOnlineOrderUseCase getLastOnlineOrderUseCase, GetOnlineOrderByIdUseCase getOnlineOrderByIdUseCase, C37807b bVar2, LoginRepository loginRepository, ClearAppManager clearAppManager) {
        return new AccountListOrderViewModel(bVar, getLastOnlineOrderUseCase, getOnlineOrderByIdUseCase, bVar2, loginRepository, clearAppManager);
    }

    /* renamed from: b */
    public AccountListOrderViewModel get() {
        return m110850c(this.f63315a.get(), this.f63316b.get(), this.f63317c.get(), this.f63318d.get(), this.f63319e.get(), this.f63320f.get());
    }
}
