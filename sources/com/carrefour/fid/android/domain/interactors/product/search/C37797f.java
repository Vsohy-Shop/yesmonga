package com.carrefour.fid.android.domain.interactors.product.search;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37584l0;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37681b;
import com.carrefour.fid.android.domain.repositories.C38199h;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.product.search.f */
public final class C37797f implements C10324h<LoadSearchWithListAllResultsUseCase> {

    /* renamed from: a */
    public final Provider<C38199h> f94881a;

    /* renamed from: b */
    public final Provider<LoginRepository> f94882b;

    /* renamed from: c */
    public final Provider<C37681b> f94883c;

    /* renamed from: d */
    public final Provider<C37584l0> f94884d;

    public C37797f(Provider<C38199h> provider, Provider<LoginRepository> provider2, Provider<C37681b> provider3, Provider<C37584l0> provider4) {
        this.f94881a = provider;
        this.f94882b = provider2;
        this.f94883c = provider3;
        this.f94884d = provider4;
    }

    /* renamed from: a */
    public static C37797f m154940a(Provider<C38199h> provider, Provider<LoginRepository> provider2, Provider<C37681b> provider3, Provider<C37584l0> provider4) {
        return new C37797f(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static LoadSearchWithListAllResultsUseCase m154941c(C38199h hVar, LoginRepository loginRepository, C37681b bVar, C37584l0 l0Var) {
        return new LoadSearchWithListAllResultsUseCase(hVar, loginRepository, bVar, l0Var);
    }

    /* renamed from: b */
    public LoadSearchWithListAllResultsUseCase get() {
        return m154941c(this.f94881a.get(), this.f94882b.get(), this.f94883c.get(), this.f94884d.get());
    }
}
