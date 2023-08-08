package com.carrefour.fid.android.account.data.datasource;

import com.carrefour.fid.android.account.data.service.C13209a;
import com.carrefour.fid.android.bff_data_shared.data.api.services.BffCustomersManagementApi;
import com.carrefour.fid.android.shared.network.C28799a;
import com.carrefour.fid.android.shared.network.C28812h;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.data.datasource.c */
public final class C13175c implements C10324h<RemoteAccountDataSource> {

    /* renamed from: a */
    public final Provider<C13209a> f32351a;

    /* renamed from: b */
    public final Provider<C28799a> f32352b;

    /* renamed from: c */
    public final Provider<BffCustomersManagementApi> f32353c;

    /* renamed from: d */
    public final Provider<C28812h> f32354d;

    public C13175c(Provider<C13209a> provider, Provider<C28799a> provider2, Provider<BffCustomersManagementApi> provider3, Provider<C28812h> provider4) {
        this.f32351a = provider;
        this.f32352b = provider2;
        this.f32353c = provider3;
        this.f32354d = provider4;
    }

    /* renamed from: a */
    public static C13175c m57126a(Provider<C13209a> provider, Provider<C28799a> provider2, Provider<BffCustomersManagementApi> provider3, Provider<C28812h> provider4) {
        return new C13175c(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static RemoteAccountDataSource m57127c(C13209a aVar, C28799a aVar2, BffCustomersManagementApi bffCustomersManagementApi, C28812h hVar) {
        return new RemoteAccountDataSource(aVar, aVar2, bffCustomersManagementApi, hVar);
    }

    /* renamed from: b */
    public RemoteAccountDataSource get() {
        return m57127c(this.f32351a.get(), this.f32352b.get(), this.f32353c.get(), this.f32354d.get());
    }
}
