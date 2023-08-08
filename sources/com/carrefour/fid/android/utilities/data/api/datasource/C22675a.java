package com.carrefour.fid.android.utilities.data.api.datasource;

import com.carrefour.fid.android.bff_data_shared.data.api.services.BffUtilitiesManagementApi;
import com.carrefour.fid.android.shared.data.headers.C28642c;
import com.carrefour.fid.android.shared.data.parsing.C28646a;
import com.carrefour.fid.android.utilities.data.provider.C22678a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.utilities.data.api.datasource.a */
public final class C22675a implements C10324h<UtilitiesDataSource> {

    /* renamed from: a */
    public final Provider<BffUtilitiesManagementApi> f58082a;

    /* renamed from: b */
    public final Provider<C28646a> f58083b;

    /* renamed from: c */
    public final Provider<C22678a> f58084c;

    /* renamed from: d */
    public final Provider<C28642c> f58085d;

    public C22675a(Provider<BffUtilitiesManagementApi> provider, Provider<C28646a> provider2, Provider<C22678a> provider3, Provider<C28642c> provider4) {
        this.f58082a = provider;
        this.f58083b = provider2;
        this.f58084c = provider3;
        this.f58085d = provider4;
    }

    /* renamed from: a */
    public static C22675a m102692a(Provider<BffUtilitiesManagementApi> provider, Provider<C28646a> provider2, Provider<C22678a> provider3, Provider<C28642c> provider4) {
        return new C22675a(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static UtilitiesDataSource m102693c(BffUtilitiesManagementApi bffUtilitiesManagementApi, C28646a aVar, C22678a aVar2, C28642c cVar) {
        return new UtilitiesDataSource(bffUtilitiesManagementApi, aVar, aVar2, cVar);
    }

    /* renamed from: b */
    public UtilitiesDataSource get() {
        return m102693c(this.f58082a.get(), this.f58083b.get(), this.f58084c.get(), this.f58085d.get());
    }
}
