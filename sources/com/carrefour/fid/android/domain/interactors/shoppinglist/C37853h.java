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
/* renamed from: com.carrefour.fid.android.domain.interactors.shoppinglist.h */
public final class C37853h implements C10324h<C37852g> {

    /* renamed from: a */
    public final Provider<ShoppingListRepository> f94946a;

    public C37853h(Provider<ShoppingListRepository> provider) {
        this.f94946a = provider;
    }

    /* renamed from: a */
    public static C37853h m155061a(Provider<ShoppingListRepository> provider) {
        return new C37853h(provider);
    }

    /* renamed from: c */
    public static C37852g m155062c(ShoppingListRepository shoppingListRepository) {
        return new C37852g(shoppingListRepository);
    }

    /* renamed from: b */
    public C37852g get() {
        return m155062c(this.f94946a.get());
    }
}
