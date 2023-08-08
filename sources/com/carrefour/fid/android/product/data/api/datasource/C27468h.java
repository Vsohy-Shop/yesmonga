package com.carrefour.fid.android.product.data.api.datasource;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffProductsManagementApi;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.shared.data.headers.C28642c;
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
/* renamed from: com.carrefour.fid.android.product.data.api.datasource.h */
public final class C27468h implements C10324h<ProductsDataSource> {

    /* renamed from: a */
    public final Provider<BffProductsManagementApi> f66604a;

    /* renamed from: b */
    public final Provider<C28646a> f66605b;

    /* renamed from: c */
    public final Provider<C37823k> f66606c;

    /* renamed from: d */
    public final Provider<C28642c> f66607d;

    /* renamed from: e */
    public final Provider<C28812h> f66608e;

    public C27468h(Provider<BffProductsManagementApi> provider, Provider<C28646a> provider2, Provider<C37823k> provider3, Provider<C28642c> provider4, Provider<C28812h> provider5) {
        this.f66604a = provider;
        this.f66605b = provider2;
        this.f66606c = provider3;
        this.f66607d = provider4;
        this.f66608e = provider5;
    }

    /* renamed from: a */
    public static C27468h m115618a(Provider<BffProductsManagementApi> provider, Provider<C28646a> provider2, Provider<C37823k> provider3, Provider<C28642c> provider4, Provider<C28812h> provider5) {
        return new C27468h(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static ProductsDataSource m115619c(BffProductsManagementApi bffProductsManagementApi, C28646a aVar, C37823k kVar, C28642c cVar, C28812h hVar) {
        return new ProductsDataSource(bffProductsManagementApi, aVar, kVar, cVar, hVar);
    }

    /* renamed from: b */
    public ProductsDataSource get() {
        return m115619c(this.f66604a.get(), this.f66605b.get(), this.f66606c.get(), this.f66607d.get(), this.f66608e.get());
    }
}
