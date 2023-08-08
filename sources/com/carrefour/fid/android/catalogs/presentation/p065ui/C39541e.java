package com.carrefour.fid.android.catalogs.presentation.p065ui;

import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28936j;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.e */
public final class C39541e implements C10158g<CatalogBuilderFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f101076a;

    /* renamed from: b */
    public final Provider<C28936j> f101077b;

    public C39541e(Provider<C28796c> provider, Provider<C28936j> provider2) {
        this.f101076a = provider;
        this.f101077b = provider2;
    }

    /* renamed from: a */
    public static C10158g<CatalogBuilderFragment> m161854a(Provider<C28796c> provider, Provider<C28936j> provider2) {
        return new C39541e(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.catalogs.presentation.ui.CatalogBuilderFragment.fragmentUtil")
    /* renamed from: b */
    public static void m161855b(CatalogBuilderFragment catalogBuilderFragment, C28936j jVar) {
        catalogBuilderFragment.f100951g = jVar;
    }

    @C10326j("com.carrefour.fid.android.catalogs.presentation.ui.CatalogBuilderFragment.navigator")
    /* renamed from: d */
    public static void m161856d(CatalogBuilderFragment catalogBuilderFragment, C28796c cVar) {
        catalogBuilderFragment.f100950f = cVar;
    }

    /* renamed from: c */
    public void injectMembers(CatalogBuilderFragment catalogBuilderFragment) {
        m161856d(catalogBuilderFragment, this.f101076a.get());
        m161855b(catalogBuilderFragment, this.f101077b.get());
    }
}
