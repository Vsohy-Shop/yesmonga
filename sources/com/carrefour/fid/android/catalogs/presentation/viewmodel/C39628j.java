package com.carrefour.fid.android.catalogs.presentation.viewmodel;

import com.carrefour.fid.android.catalogs.presentation.analytics.C39438b;
import com.carrefour.fid.android.domain.interactors.catalog.C37611c;
import com.carrefour.fid.android.domain.interactors.catalog.C37614f;
import com.carrefour.fid.android.domain.interactors.catalog.C37615g;
import com.carrefour.fid.android.domain.interactors.criteo.C37672j;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37832c;
import com.carrefour.fid.android.tracking.C28994a;
import com.carrefour.fid.android.tracking.C28995b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.j */
public final class C39628j implements C10324h<CatalogsBuilderViewModel> {

    /* renamed from: a */
    public final Provider<C37832c> f101225a;

    /* renamed from: b */
    public final Provider<C37614f> f101226b;

    /* renamed from: c */
    public final Provider<C37615g> f101227c;

    /* renamed from: d */
    public final Provider<C37611c> f101228d;

    /* renamed from: e */
    public final Provider<C39438b> f101229e;

    /* renamed from: f */
    public final Provider<C28995b> f101230f;

    /* renamed from: g */
    public final Provider<C28994a> f101231g;

    /* renamed from: h */
    public final Provider<C37672j> f101232h;

    public C39628j(Provider<C37832c> provider, Provider<C37614f> provider2, Provider<C37615g> provider3, Provider<C37611c> provider4, Provider<C39438b> provider5, Provider<C28995b> provider6, Provider<C28994a> provider7, Provider<C37672j> provider8) {
        this.f101225a = provider;
        this.f101226b = provider2;
        this.f101227c = provider3;
        this.f101228d = provider4;
        this.f101229e = provider5;
        this.f101230f = provider6;
        this.f101231g = provider7;
        this.f101232h = provider8;
    }

    /* renamed from: a */
    public static C39628j m162036a(Provider<C37832c> provider, Provider<C37614f> provider2, Provider<C37615g> provider3, Provider<C37611c> provider4, Provider<C39438b> provider5, Provider<C28995b> provider6, Provider<C28994a> provider7, Provider<C37672j> provider8) {
        return new C39628j(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    /* renamed from: c */
    public static CatalogsBuilderViewModel m162037c(C37832c cVar, C37614f fVar, C37615g gVar, C37611c cVar2, C39438b bVar, C28995b bVar2, C28994a aVar, C37672j jVar) {
        return new CatalogsBuilderViewModel(cVar, fVar, gVar, cVar2, bVar, bVar2, aVar, jVar);
    }

    /* renamed from: b */
    public CatalogsBuilderViewModel get() {
        return m162037c(this.f101225a.get(), this.f101226b.get(), this.f101227c.get(), this.f101228d.get(), this.f101229e.get(), this.f101230f.get(), this.f101231g.get(), this.f101232h.get());
    }
}
