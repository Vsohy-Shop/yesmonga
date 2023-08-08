package com.carrefour.fid.android.product.data.api.datasource;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi;
import com.carrefour.fid.android.shared.data.parsing.C28646a;
import com.carrefour.fid.android.shared.network.C28812h;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.BffProductsManagementNoTokenInterceptor"})
@C10338r
/* renamed from: com.carrefour.fid.android.product.data.api.datasource.g */
public final class C27467g implements C10324h<PlpProductListDataSource> {

    /* renamed from: a */
    public final Provider<BffProductsManagementApi> f66601a;

    /* renamed from: b */
    public final Provider<C28646a> f66602b;

    /* renamed from: c */
    public final Provider<C28812h> f66603c;

    public C27467g(Provider<BffProductsManagementApi> provider, Provider<C28646a> provider2, Provider<C28812h> provider3) {
        this.f66601a = provider;
        this.f66602b = provider2;
        this.f66603c = provider3;
    }

    /* renamed from: a */
    public static C27467g m115615a(Provider<BffProductsManagementApi> provider, Provider<C28646a> provider2, Provider<C28812h> provider3) {
        return new C27467g(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static PlpProductListDataSource m115616c(BffProductsManagementApi bffProductsManagementApi, C28646a aVar, C28812h hVar) {
        return new PlpProductListDataSource(bffProductsManagementApi, aVar, hVar);
    }

    /* renamed from: b */
    public PlpProductListDataSource get() {
        return m115616c(this.f66601a.get(), this.f66602b.get(), this.f66603c.get());
    }
}
