package com.carrefour.fid.android.various.domain.repository;

import com.carrefour.fid.android.various.data.datastore.datatsource.AppMessageDataStore;
import com.google.firebase.remoteconfig.C33563l;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.various.domain.repository.a */
public final class C22794a implements C10324h<AppMessageRepository> {

    /* renamed from: a */
    public final Provider<C33563l> f58357a;

    /* renamed from: b */
    public final Provider<AppMessageDataStore> f58358b;

    public C22794a(Provider<C33563l> provider, Provider<AppMessageDataStore> provider2) {
        this.f58357a = provider;
        this.f58358b = provider2;
    }

    /* renamed from: a */
    public static C22794a m103037a(Provider<C33563l> provider, Provider<AppMessageDataStore> provider2) {
        return new C22794a(provider, provider2);
    }

    /* renamed from: c */
    public static AppMessageRepository m103038c(C33563l lVar, AppMessageDataStore appMessageDataStore) {
        return new AppMessageRepository(lVar, appMessageDataStore);
    }

    /* renamed from: b */
    public AppMessageRepository get() {
        return m103038c(this.f58357a.get(), this.f58358b.get());
    }
}
