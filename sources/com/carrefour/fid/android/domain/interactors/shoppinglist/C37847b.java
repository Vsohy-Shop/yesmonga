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
/* renamed from: com.carrefour.fid.android.domain.interactors.shoppinglist.b */
public final class C37847b implements C10324h<AppGetShoppingListUseCase> {

    /* renamed from: a */
    public final Provider<ShoppingListRepository> f94935a;

    public C37847b(Provider<ShoppingListRepository> provider) {
        this.f94935a = provider;
    }

    /* renamed from: a */
    public static C37847b m155045a(Provider<ShoppingListRepository> provider) {
        return new C37847b(provider);
    }

    /* renamed from: c */
    public static AppGetShoppingListUseCase m155046c(ShoppingListRepository shoppingListRepository) {
        return new AppGetShoppingListUseCase(shoppingListRepository);
    }

    /* renamed from: b */
    public AppGetShoppingListUseCase get() {
        return m155046c(this.f94935a.get());
    }
}
