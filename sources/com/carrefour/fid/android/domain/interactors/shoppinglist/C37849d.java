package com.carrefour.fid.android.domain.interactors.shoppinglist;

import com.carrefour.fid.android.domain.repositories.ShoppingListRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.shoppinglist.d */
public final class C37849d implements C10324h<AppRemoveProductFromShoppingListByGtinUseCase> {

    /* renamed from: a */
    public final Provider<ShoppingListRepository> f94937a;

    public C37849d(Provider<ShoppingListRepository> provider) {
        this.f94937a = provider;
    }

    /* renamed from: a */
    public static C37849d m155051a(Provider<ShoppingListRepository> provider) {
        return new C37849d(provider);
    }

    /* renamed from: c */
    public static AppRemoveProductFromShoppingListByGtinUseCase m155052c(ShoppingListRepository shoppingListRepository) {
        return new AppRemoveProductFromShoppingListByGtinUseCase(shoppingListRepository);
    }

    /* renamed from: b */
    public AppRemoveProductFromShoppingListByGtinUseCase get() {
        return m155052c(this.f94937a.get());
    }
}
