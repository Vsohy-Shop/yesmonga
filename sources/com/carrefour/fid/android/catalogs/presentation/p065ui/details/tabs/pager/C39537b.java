package com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.pager;

import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.pager.b */
public final class C39537b implements C10158g<CatalogPagerFragment> {

    /* renamed from: a */
    public final Provider<AppEnvironment> f101069a;

    public C39537b(Provider<AppEnvironment> provider) {
        this.f101069a = provider;
    }

    /* renamed from: a */
    public static C10158g<CatalogPagerFragment> m161850a(Provider<AppEnvironment> provider) {
        return new C39537b(provider);
    }

    @C10326j("com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.pager.CatalogPagerFragment.appEnvironment")
    /* renamed from: b */
    public static void m161851b(CatalogPagerFragment catalogPagerFragment, AppEnvironment appEnvironment) {
        catalogPagerFragment.f101053f = appEnvironment;
    }

    /* renamed from: c */
    public void injectMembers(CatalogPagerFragment catalogPagerFragment) {
        m161851b(catalogPagerFragment, this.f101069a.get());
    }
}
