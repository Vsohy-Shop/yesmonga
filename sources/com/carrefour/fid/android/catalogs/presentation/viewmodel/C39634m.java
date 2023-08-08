package com.carrefour.fid.android.catalogs.presentation.viewmodel;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.domain.interactors.catalog.C37614f;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.m */
public final class C39634m implements C10324h<StoreCatalogListViewModel> {

    /* renamed from: a */
    public final Provider<C37614f> f101234a;

    /* renamed from: b */
    public final Provider<C13783a> f101235b;

    public C39634m(Provider<C37614f> provider, Provider<C13783a> provider2) {
        this.f101234a = provider;
        this.f101235b = provider2;
    }

    /* renamed from: a */
    public static C39634m m162045a(Provider<C37614f> provider, Provider<C13783a> provider2) {
        return new C39634m(provider, provider2);
    }

    /* renamed from: c */
    public static StoreCatalogListViewModel m162046c(C37614f fVar, C13783a aVar) {
        return new StoreCatalogListViewModel(fVar, aVar);
    }

    /* renamed from: b */
    public StoreCatalogListViewModel get() {
        return m162046c(this.f101234a.get(), this.f101235b.get());
    }
}
