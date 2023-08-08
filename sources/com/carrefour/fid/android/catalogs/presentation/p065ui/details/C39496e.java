package com.carrefour.fid.android.catalogs.presentation.p065ui.details;

import com.carrefour.fid.android.shared.util.C28936j;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.e */
public final class C39496e implements C10158g<CatalogDetailsFragment> {

    /* renamed from: a */
    public final Provider<C28936j> f101009a;

    public C39496e(Provider<C28936j> provider) {
        this.f101009a = provider;
    }

    /* renamed from: a */
    public static C10158g<CatalogDetailsFragment> m161778a(Provider<C28936j> provider) {
        return new C39496e(provider);
    }

    @C10326j("com.carrefour.fid.android.catalogs.presentation.ui.details.CatalogDetailsFragment.fragmentUtil")
    /* renamed from: b */
    public static void m161779b(CatalogDetailsFragment catalogDetailsFragment, C28936j jVar) {
        catalogDetailsFragment.f100997v = jVar;
    }

    /* renamed from: c */
    public void injectMembers(CatalogDetailsFragment catalogDetailsFragment) {
        m161779b(catalogDetailsFragment, this.f101009a.get());
    }
}
