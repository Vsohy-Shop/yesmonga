package com.carrefour.fid.android.domain.interactors.shoppinglist;

import com.carrefour.fid.android.domain.interactors.user.C37886i;
import com.carrefour.fid.android.domain.repositories.ShoppingListRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.shoppinglist.a */
public final class C37846a implements C10324h<AppAddProductToShoppingListUseCase> {

    /* renamed from: a */
    public final Provider<ShoppingListRepository> f94933a;

    /* renamed from: b */
    public final Provider<C37886i> f94934b;

    public C37846a(Provider<ShoppingListRepository> provider, Provider<C37886i> provider2) {
        this.f94933a = provider;
        this.f94934b = provider2;
    }

    /* renamed from: a */
    public static C37846a m155042a(Provider<ShoppingListRepository> provider, Provider<C37886i> provider2) {
        return new C37846a(provider, provider2);
    }

    /* renamed from: c */
    public static AppAddProductToShoppingListUseCase m155043c(ShoppingListRepository shoppingListRepository, C37886i iVar) {
        return new AppAddProductToShoppingListUseCase(shoppingListRepository, iVar);
    }

    /* renamed from: b */
    public AppAddProductToShoppingListUseCase get() {
        return m155043c(this.f94933a.get(), this.f94934b.get());
    }
}
