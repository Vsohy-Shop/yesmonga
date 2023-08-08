package com.carrefour.fid.android.catalogs.presentation.viewmodel;

import com.carrefour.fid.android.catalogs.presentation.analytics.C39446h;
import com.carrefour.fid.android.domain.interactors.catalog.C37609a;
import com.carrefour.fid.android.domain.interactors.catalog.C37613e;
import com.carrefour.fid.android.domain.interactors.catalog.C37618i;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.g */
public final class C39622g implements C10324h<CatalogProductDetailsViewModel> {

    /* renamed from: a */
    public final Provider<C37613e> f101220a;

    /* renamed from: b */
    public final Provider<C37609a> f101221b;

    /* renamed from: c */
    public final Provider<C37618i> f101222c;

    /* renamed from: d */
    public final Provider<C39446h> f101223d;

    public C39622g(Provider<C37613e> provider, Provider<C37609a> provider2, Provider<C37618i> provider3, Provider<C39446h> provider4) {
        this.f101220a = provider;
        this.f101221b = provider2;
        this.f101222c = provider3;
        this.f101223d = provider4;
    }

    /* renamed from: a */
    public static C39622g m162027a(Provider<C37613e> provider, Provider<C37609a> provider2, Provider<C37618i> provider3, Provider<C39446h> provider4) {
        return new C39622g(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static CatalogProductDetailsViewModel m162028c(C37613e eVar, C37609a aVar, C37618i iVar, C39446h hVar) {
        return new CatalogProductDetailsViewModel(eVar, aVar, iVar, hVar);
    }

    /* renamed from: b */
    public CatalogProductDetailsViewModel get() {
        return m162028c(this.f101220a.get(), this.f101221b.get(), this.f101222c.get(), this.f101223d.get());
    }
}
