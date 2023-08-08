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
/* renamed from: com.carrefour.fid.android.domain.interactors.shoppinglist.c */
public final class C37848c implements C10324h<AppObserveShoppingListUseCase> {

    /* renamed from: a */
    public final Provider<ShoppingListRepository> f94936a;

    public C37848c(Provider<ShoppingListRepository> provider) {
        this.f94936a = provider;
    }

    /* renamed from: a */
    public static C37848c m155048a(Provider<ShoppingListRepository> provider) {
        return new C37848c(provider);
    }

    /* renamed from: c */
    public static AppObserveShoppingListUseCase m155049c(ShoppingListRepository shoppingListRepository) {
        return new AppObserveShoppingListUseCase(shoppingListRepository);
    }

    /* renamed from: b */
    public AppObserveShoppingListUseCase get() {
        return m155049c(this.f94936a.get());
    }
}
