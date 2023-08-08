package com.carrefour.fid.android.presentation.viewmodels.account.list.shopping;

import com.carrefour.fid.android.domain.interactors.basket.C37588n0;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37681b;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37684e;
import com.carrefour.fid.android.domain.interactors.product.C37774n;
import com.carrefour.fid.android.domain.interactors.user.C37886i;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.g */
public final class C25892g implements C10324h<ShoppingListViewModel> {

    /* renamed from: a */
    public final Provider<C37681b> f63375a;

    /* renamed from: b */
    public final Provider<C37684e> f63376b;

    /* renamed from: c */
    public final Provider<C37588n0> f63377c;

    /* renamed from: d */
    public final Provider<C37774n> f63378d;

    /* renamed from: e */
    public final Provider<C37886i> f63379e;

    public C25892g(Provider<C37681b> provider, Provider<C37684e> provider2, Provider<C37588n0> provider3, Provider<C37774n> provider4, Provider<C37886i> provider5) {
        this.f63375a = provider;
        this.f63376b = provider2;
        this.f63377c = provider3;
        this.f63378d = provider4;
        this.f63379e = provider5;
    }

    /* renamed from: a */
    public static C25892g m110953a(Provider<C37681b> provider, Provider<C37684e> provider2, Provider<C37588n0> provider3, Provider<C37774n> provider4, Provider<C37886i> provider5) {
        return new C25892g(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static ShoppingListViewModel m110954c(C37681b bVar, C37684e eVar, C37588n0 n0Var, C37774n nVar, C37886i iVar) {
        return new ShoppingListViewModel(bVar, eVar, n0Var, nVar, iVar);
    }

    /* renamed from: b */
    public ShoppingListViewModel get() {
        return m110954c(this.f63375a.get(), this.f63376b.get(), this.f63377c.get(), this.f63378d.get(), this.f63379e.get());
    }
}
