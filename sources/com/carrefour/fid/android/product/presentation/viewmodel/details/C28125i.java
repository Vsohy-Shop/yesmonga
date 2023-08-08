package com.carrefour.fid.android.product.presentation.viewmodel.details;

import com.carrefour.fid.android.domain.interactors.basket.C37588n0;
import com.carrefour.fid.android.domain.interactors.criteo.C37670i;
import com.carrefour.fid.android.domain.interactors.criteo.C37672j;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37680a;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37684e;
import com.carrefour.fid.android.domain.interactors.product.C37758g;
import com.carrefour.fid.android.domain.interactors.product.C37778p;
import com.carrefour.fid.android.domain.interactors.product.GetOldProductFlowUseCase;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.product.presentation.analytics.C27637g;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.details.i */
public final class C28125i implements C10324h<ProductDetailsViewModel> {

    /* renamed from: a */
    public final Provider<C37823k> f68117a;

    /* renamed from: b */
    public final Provider<GetOldProductFlowUseCase> f68118b;

    /* renamed from: c */
    public final Provider<C37778p> f68119c;

    /* renamed from: d */
    public final Provider<C37758g> f68120d;

    /* renamed from: e */
    public final Provider<C37672j> f68121e;

    /* renamed from: f */
    public final Provider<C37670i> f68122f;

    /* renamed from: g */
    public final Provider<C37588n0> f68123g;

    /* renamed from: h */
    public final Provider<C37680a> f68124h;

    /* renamed from: i */
    public final Provider<C37684e> f68125i;

    /* renamed from: j */
    public final Provider<C27637g> f68126j;

    public C28125i(Provider<C37823k> provider, Provider<GetOldProductFlowUseCase> provider2, Provider<C37778p> provider3, Provider<C37758g> provider4, Provider<C37672j> provider5, Provider<C37670i> provider6, Provider<C37588n0> provider7, Provider<C37680a> provider8, Provider<C37684e> provider9, Provider<C27637g> provider10) {
        this.f68117a = provider;
        this.f68118b = provider2;
        this.f68119c = provider3;
        this.f68120d = provider4;
        this.f68121e = provider5;
        this.f68122f = provider6;
        this.f68123g = provider7;
        this.f68124h = provider8;
        this.f68125i = provider9;
        this.f68126j = provider10;
    }

    /* renamed from: a */
    public static C28125i m117755a(Provider<C37823k> provider, Provider<GetOldProductFlowUseCase> provider2, Provider<C37778p> provider3, Provider<C37758g> provider4, Provider<C37672j> provider5, Provider<C37670i> provider6, Provider<C37588n0> provider7, Provider<C37680a> provider8, Provider<C37684e> provider9, Provider<C27637g> provider10) {
        return new C28125i(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    /* renamed from: c */
    public static ProductDetailsViewModel m117756c(C37823k kVar, GetOldProductFlowUseCase getOldProductFlowUseCase, C37778p pVar, C37758g gVar, C37672j jVar, C37670i iVar, C37588n0 n0Var, C37680a aVar, C37684e eVar, C27637g gVar2) {
        return new ProductDetailsViewModel(kVar, getOldProductFlowUseCase, pVar, gVar, jVar, iVar, n0Var, aVar, eVar, gVar2);
    }

    /* renamed from: b */
    public ProductDetailsViewModel get() {
        return m117756c(this.f68117a.get(), this.f68118b.get(), this.f68119c.get(), this.f68120d.get(), this.f68121e.get(), this.f68122f.get(), this.f68123g.get(), this.f68124h.get(), this.f68125i.get(), this.f68126j.get());
    }
}
