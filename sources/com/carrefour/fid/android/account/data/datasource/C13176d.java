package com.carrefour.fid.android.account.data.datasource;

import com.carrefour.fid.android.account.data.headers.C13200e;
import com.carrefour.fid.android.account.data.service.C13212c;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.account.data.datasource.d */
public final class C13176d implements C10324h<RemoteLoginDataSource> {

    /* renamed from: a */
    public final Provider<C13212c> f32355a;

    /* renamed from: b */
    public final Provider<C13200e> f32356b;

    public C13176d(Provider<C13212c> provider, Provider<C13200e> provider2) {
        this.f32355a = provider;
        this.f32356b = provider2;
    }

    /* renamed from: a */
    public static C13176d m57129a(Provider<C13212c> provider, Provider<C13200e> provider2) {
        return new C13176d(provider, provider2);
    }

    /* renamed from: c */
    public static RemoteLoginDataSource m57130c(C13212c cVar, C13200e eVar) {
        return new RemoteLoginDataSource(cVar, eVar);
    }

    /* renamed from: b */
    public RemoteLoginDataSource get() {
        return m57130c(this.f32355a.get(), this.f32356b.get());
    }
}
