package com.carrefour.fid.android.domain.repositories;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.data.datasource.ShoppingListDataSource;
import com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.C12074o0;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.RepositoryScope"})
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.domain.repositories.m */
public final class C38206m implements C10324h<ShoppingListRepository> {

    /* renamed from: a */
    public final Provider<ShoppingListDataSource> f96770a;

    /* renamed from: b */
    public final Provider<LoginRepository> f96771b;

    /* renamed from: c */
    public final Provider<PlpProductListDataSource> f96772c;

    /* renamed from: d */
    public final Provider<C12074o0> f96773d;

    public C38206m(Provider<ShoppingListDataSource> provider, Provider<LoginRepository> provider2, Provider<PlpProductListDataSource> provider3, Provider<C12074o0> provider4) {
        this.f96770a = provider;
        this.f96771b = provider2;
        this.f96772c = provider3;
        this.f96773d = provider4;
    }

    /* renamed from: a */
    public static C38206m m158437a(Provider<ShoppingListDataSource> provider, Provider<LoginRepository> provider2, Provider<PlpProductListDataSource> provider3, Provider<C12074o0> provider4) {
        return new C38206m(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static ShoppingListRepository m158438c(ShoppingListDataSource shoppingListDataSource, LoginRepository loginRepository, PlpProductListDataSource plpProductListDataSource, C12074o0 o0Var) {
        return new ShoppingListRepository(shoppingListDataSource, loginRepository, plpProductListDataSource, o0Var);
    }

    /* renamed from: b */
    public ShoppingListRepository get() {
        return m158438c(this.f96770a.get(), this.f96771b.get(), this.f96772c.get(), this.f96773d.get());
    }
}
