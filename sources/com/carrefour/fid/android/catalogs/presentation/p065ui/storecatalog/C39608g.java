package com.carrefour.fid.android.catalogs.presentation.p065ui.storecatalog;

import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.storecatalog.g */
public final class C39608g implements C10158g<StoreCatalogListFragment> {

    /* renamed from: a */
    public final Provider<AppEnvironment> f101178a;

    public C39608g(Provider<AppEnvironment> provider) {
        this.f101178a = provider;
    }

    /* renamed from: a */
    public static C10158g<StoreCatalogListFragment> m161961a(Provider<AppEnvironment> provider) {
        return new C39608g(provider);
    }

    @C10326j("com.carrefour.fid.android.catalogs.presentation.ui.storecatalog.StoreCatalogListFragment.appEnvironment")
    /* renamed from: b */
    public static void m161962b(StoreCatalogListFragment storeCatalogListFragment, AppEnvironment appEnvironment) {
        storeCatalogListFragment.f101142g = appEnvironment;
    }

    /* renamed from: c */
    public void injectMembers(StoreCatalogListFragment storeCatalogListFragment) {
        m161962b(storeCatalogListFragment, this.f101178a.get());
    }
}
