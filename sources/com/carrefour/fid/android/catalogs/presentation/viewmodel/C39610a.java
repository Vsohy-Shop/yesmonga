package com.carrefour.fid.android.catalogs.presentation.viewmodel;

import com.carrefour.fid.android.catalogs.core.datastore.CatalogPreferencesStorage;
import com.carrefour.fid.android.catalogs.presentation.analytics.C39441d;
import com.carrefour.fid.android.domain.interactors.catalog.C37609a;
import com.carrefour.fid.android.domain.interactors.catalog.C37611c;
import com.carrefour.fid.android.domain.interactors.catalog.C37612d;
import com.carrefour.fid.android.domain.interactors.catalog.C37613e;
import com.carrefour.fid.android.domain.interactors.catalog.C37618i;
import com.carrefour.fid.android.tracking.C28995b;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.a */
public final class C39610a implements C10324h<CatalogDetailsViewModel> {

    /* renamed from: a */
    public final Provider<C37612d> f101206a;

    /* renamed from: b */
    public final Provider<C37613e> f101207b;

    /* renamed from: c */
    public final Provider<C37609a> f101208c;

    /* renamed from: d */
    public final Provider<C37618i> f101209d;

    /* renamed from: e */
    public final Provider<C37611c> f101210e;

    /* renamed from: f */
    public final Provider<C39441d> f101211f;

    /* renamed from: g */
    public final Provider<C28995b> f101212g;

    /* renamed from: h */
    public final Provider<CatalogPreferencesStorage> f101213h;

    public C39610a(Provider<C37612d> provider, Provider<C37613e> provider2, Provider<C37609a> provider3, Provider<C37618i> provider4, Provider<C37611c> provider5, Provider<C39441d> provider6, Provider<C28995b> provider7, Provider<CatalogPreferencesStorage> provider8) {
        this.f101206a = provider;
        this.f101207b = provider2;
        this.f101208c = provider3;
        this.f101209d = provider4;
        this.f101210e = provider5;
        this.f101211f = provider6;
        this.f101212g = provider7;
        this.f101213h = provider8;
    }

    /* renamed from: a */
    public static C39610a m162009a(Provider<C37612d> provider, Provider<C37613e> provider2, Provider<C37609a> provider3, Provider<C37618i> provider4, Provider<C37611c> provider5, Provider<C39441d> provider6, Provider<C28995b> provider7, Provider<CatalogPreferencesStorage> provider8) {
        return new C39610a(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    /* renamed from: c */
    public static CatalogDetailsViewModel m162010c(C37612d dVar, C37613e eVar, C37609a aVar, C37618i iVar, C37611c cVar, C39441d dVar2, C28995b bVar, CatalogPreferencesStorage catalogPreferencesStorage) {
        return new CatalogDetailsViewModel(dVar, eVar, aVar, iVar, cVar, dVar2, bVar, catalogPreferencesStorage);
    }

    /* renamed from: b */
    public CatalogDetailsViewModel get() {
        return m162010c(this.f101206a.get(), this.f101207b.get(), this.f101208c.get(), this.f101209d.get(), this.f101210e.get(), this.f101211f.get(), this.f101212g.get(), this.f101213h.get());
    }
}
