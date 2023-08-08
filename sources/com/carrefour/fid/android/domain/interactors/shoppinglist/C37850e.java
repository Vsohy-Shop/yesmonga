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
/* renamed from: com.carrefour.fid.android.domain.interactors.shoppinglist.e */
public final class C37850e implements C10324h<AppRemoveProductFromShoppingListUseCase> {

    /* renamed from: a */
    public final Provider<ShoppingListRepository> f94938a;

    /* renamed from: b */
    public final Provider<C37886i> f94939b;

    public C37850e(Provider<ShoppingListRepository> provider, Provider<C37886i> provider2) {
        this.f94938a = provider;
        this.f94939b = provider2;
    }

    /* renamed from: a */
    public static C37850e m155054a(Provider<ShoppingListRepository> provider, Provider<C37886i> provider2) {
        return new C37850e(provider, provider2);
    }

    /* renamed from: c */
    public static AppRemoveProductFromShoppingListUseCase m155055c(ShoppingListRepository shoppingListRepository, C37886i iVar) {
        return new AppRemoveProductFromShoppingListUseCase(shoppingListRepository, iVar);
    }

    /* renamed from: b */
    public AppRemoveProductFromShoppingListUseCase get() {
        return m155055c(this.f94938a.get(), this.f94939b.get());
    }
}
