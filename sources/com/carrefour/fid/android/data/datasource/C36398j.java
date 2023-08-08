package com.carrefour.fid.android.data.datasource;

import com.carrefour.fid.android.data.provider.headers.C36581w;
import com.carrefour.fid.android.data.service.C36636o;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.data.datasource.j */
public final class C36398j implements C10324h<ShoppingListDataSource> {

    /* renamed from: a */
    public final Provider<C36636o> f90047a;

    /* renamed from: b */
    public final Provider<C36581w> f90048b;

    public C36398j(Provider<C36636o> provider, Provider<C36581w> provider2) {
        this.f90047a = provider;
        this.f90048b = provider2;
    }

    /* renamed from: a */
    public static C36398j m149326a(Provider<C36636o> provider, Provider<C36581w> provider2) {
        return new C36398j(provider, provider2);
    }

    /* renamed from: c */
    public static ShoppingListDataSource m149327c(C36636o oVar, C36581w wVar) {
        return new ShoppingListDataSource(oVar, wVar);
    }

    /* renamed from: b */
    public ShoppingListDataSource get() {
        return m149327c(this.f90047a.get(), this.f90048b.get());
    }
}
