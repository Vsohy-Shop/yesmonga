package com.carrefour.fid.android.product.presentation.viewmodel.list;

import com.carrefour.fid.android.domain.interactors.basket.C37588n0;
import com.carrefour.fid.android.domain.interactors.criteo.C37672j;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37680a;
import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37684e;
import com.carrefour.fid.android.domain.interactors.product.C37750b;
import com.carrefour.fid.android.domain.interactors.product.C37802t;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.list.b */
public final class C28200b implements C10324h<PlpViewModel> {

    /* renamed from: a */
    public final Provider<PlpFlowProvider> f68304a;

    /* renamed from: b */
    public final Provider<C37680a> f68305b;

    /* renamed from: c */
    public final Provider<C37684e> f68306c;

    /* renamed from: d */
    public final Provider<C37588n0> f68307d;

    /* renamed from: e */
    public final Provider<C37750b> f68308e;

    /* renamed from: f */
    public final Provider<C37802t> f68309f;

    /* renamed from: g */
    public final Provider<C37672j> f68310g;

    public C28200b(Provider<PlpFlowProvider> provider, Provider<C37680a> provider2, Provider<C37684e> provider3, Provider<C37588n0> provider4, Provider<C37750b> provider5, Provider<C37802t> provider6, Provider<C37672j> provider7) {
        this.f68304a = provider;
        this.f68305b = provider2;
        this.f68306c = provider3;
        this.f68307d = provider4;
        this.f68308e = provider5;
        this.f68309f = provider6;
        this.f68310g = provider7;
    }

    /* renamed from: a */
    public static C28200b m118076a(Provider<PlpFlowProvider> provider, Provider<C37680a> provider2, Provider<C37684e> provider3, Provider<C37588n0> provider4, Provider<C37750b> provider5, Provider<C37802t> provider6, Provider<C37672j> provider7) {
        return new C28200b(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    /* renamed from: c */
    public static PlpViewModel m118077c(PlpFlowProvider plpFlowProvider, C37680a aVar, C37684e eVar, C37588n0 n0Var, C37750b bVar, C37802t tVar, C37672j jVar) {
        return new PlpViewModel(plpFlowProvider, aVar, eVar, n0Var, bVar, tVar, jVar);
    }

    /* renamed from: b */
    public PlpViewModel get() {
        return m118077c(this.f68304a.get(), this.f68305b.get(), this.f68306c.get(), this.f68307d.get(), this.f68308e.get(), this.f68309f.get(), this.f68310g.get());
    }
}
