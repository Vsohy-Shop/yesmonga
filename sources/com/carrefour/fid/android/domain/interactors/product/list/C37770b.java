package com.carrefour.fid.android.domain.interactors.product.list;

import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.basket.C37584l0;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37681b;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.slot.C37857d;
import com.carrefour.fid.android.domain.repositories.C38201i;
import com.carrefour.fid.android.presentation.models.mapper.C38514l;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.product.list.b */
public final class C37770b implements C10324h<GetProductListUseCase> {

    /* renamed from: a */
    public final Provider<C38201i> f94801a;

    /* renamed from: b */
    public final Provider<C38514l> f94802b;

    /* renamed from: c */
    public final Provider<C37681b> f94803c;

    /* renamed from: d */
    public final Provider<C37584l0> f94804d;

    /* renamed from: e */
    public final Provider<C37566e0> f94805e;

    /* renamed from: f */
    public final Provider<LoginRepository> f94806f;

    /* renamed from: g */
    public final Provider<C37857d> f94807g;

    /* renamed from: h */
    public final Provider<C37823k> f94808h;

    public C37770b(Provider<C38201i> provider, Provider<C38514l> provider2, Provider<C37681b> provider3, Provider<C37584l0> provider4, Provider<C37566e0> provider5, Provider<LoginRepository> provider6, Provider<C37857d> provider7, Provider<C37823k> provider8) {
        this.f94801a = provider;
        this.f94802b = provider2;
        this.f94803c = provider3;
        this.f94804d = provider4;
        this.f94805e = provider5;
        this.f94806f = provider6;
        this.f94807g = provider7;
        this.f94808h = provider8;
    }

    /* renamed from: a */
    public static C37770b m154847a(Provider<C38201i> provider, Provider<C38514l> provider2, Provider<C37681b> provider3, Provider<C37584l0> provider4, Provider<C37566e0> provider5, Provider<LoginRepository> provider6, Provider<C37857d> provider7, Provider<C37823k> provider8) {
        return new C37770b(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    /* renamed from: c */
    public static GetProductListUseCase m154848c(C38201i iVar, C38514l lVar, C37681b bVar, C37584l0 l0Var, C37566e0 e0Var, LoginRepository loginRepository, C37857d dVar, C37823k kVar) {
        return new GetProductListUseCase(iVar, lVar, bVar, l0Var, e0Var, loginRepository, dVar, kVar);
    }

    /* renamed from: b */
    public GetProductListUseCase get() {
        return m154848c(this.f94801a.get(), this.f94802b.get(), this.f94803c.get(), this.f94804d.get(), this.f94805e.get(), this.f94806f.get(), this.f94807g.get(), this.f94808h.get());
    }
}
