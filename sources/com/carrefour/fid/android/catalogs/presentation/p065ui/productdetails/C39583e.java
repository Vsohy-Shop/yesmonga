package com.carrefour.fid.android.catalogs.presentation.p065ui.productdetails;

import com.carrefour.fid.android.shared.util.C28936j;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.productdetails.e */
public final class C39583e implements C10158g<CatalogProductDetailsFragment> {

    /* renamed from: a */
    public final Provider<C28936j> f101132a;

    public C39583e(Provider<C28936j> provider) {
        this.f101132a = provider;
    }

    /* renamed from: a */
    public static C10158g<CatalogProductDetailsFragment> m161920a(Provider<C28936j> provider) {
        return new C39583e(provider);
    }

    @C10326j("com.carrefour.fid.android.catalogs.presentation.ui.productdetails.CatalogProductDetailsFragment.fragmentUtil")
    /* renamed from: b */
    public static void m161921b(CatalogProductDetailsFragment catalogProductDetailsFragment, C28936j jVar) {
        catalogProductDetailsFragment.f101120w = jVar;
    }

    /* renamed from: c */
    public void injectMembers(CatalogProductDetailsFragment catalogProductDetailsFragment) {
        m161921b(catalogProductDetailsFragment, this.f101132a.get());
    }
}
