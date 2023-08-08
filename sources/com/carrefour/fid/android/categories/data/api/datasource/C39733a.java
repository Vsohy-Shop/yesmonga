package com.carrefour.fid.android.categories.data.api.datasource;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffStoresManagementApi;
import com.carrefour.fid.android.shared.data.parsing.C28646a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.categories.data.api.datasource.a */
public final class C39733a implements C10324h<CategoriesDataSource> {

    /* renamed from: a */
    public final Provider<BffStoresManagementApi> f101382a;

    /* renamed from: b */
    public final Provider<C28646a> f101383b;

    public C39733a(Provider<BffStoresManagementApi> provider, Provider<C28646a> provider2) {
        this.f101382a = provider;
        this.f101383b = provider2;
    }

    /* renamed from: a */
    public static C39733a m162163a(Provider<BffStoresManagementApi> provider, Provider<C28646a> provider2) {
        return new C39733a(provider, provider2);
    }

    /* renamed from: c */
    public static CategoriesDataSource m162164c(BffStoresManagementApi bffStoresManagementApi, C28646a aVar) {
        return new CategoriesDataSource(bffStoresManagementApi, aVar);
    }

    /* renamed from: b */
    public CategoriesDataSource get() {
        return m162164c(this.f101382a.get(), this.f101383b.get());
    }
}
