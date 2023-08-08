package com.carrefour.fid.android.catalogs.presentation.viewmodel;

import com.carrefour.fid.android.catalogs.presentation.analytics.C39443f;
import com.carrefour.fid.android.domain.interactors.catalog.C37613e;
import com.carrefour.fid.android.domain.interactors.catalog.C37616h;
import com.carrefour.fid.android.domain.interactors.catalog.C37618i;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.d */
public final class C39616d implements C10324h<CatalogFavoriteProductsViewModel> {

    /* renamed from: a */
    public final Provider<C37613e> f101215a;

    /* renamed from: b */
    public final Provider<C37618i> f101216b;

    /* renamed from: c */
    public final Provider<C37616h> f101217c;

    /* renamed from: d */
    public final Provider<C39443f> f101218d;

    public C39616d(Provider<C37613e> provider, Provider<C37618i> provider2, Provider<C37616h> provider3, Provider<C39443f> provider4) {
        this.f101215a = provider;
        this.f101216b = provider2;
        this.f101217c = provider3;
        this.f101218d = provider4;
    }

    /* renamed from: a */
    public static C39616d m162018a(Provider<C37613e> provider, Provider<C37618i> provider2, Provider<C37616h> provider3, Provider<C39443f> provider4) {
        return new C39616d(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static CatalogFavoriteProductsViewModel m162019c(C37613e eVar, C37618i iVar, C37616h hVar, C39443f fVar) {
        return new CatalogFavoriteProductsViewModel(eVar, iVar, hVar, fVar);
    }

    /* renamed from: b */
    public CatalogFavoriteProductsViewModel get() {
        return m162019c(this.f101215a.get(), this.f101216b.get(), this.f101217c.get(), this.f101218d.get());
    }
}
