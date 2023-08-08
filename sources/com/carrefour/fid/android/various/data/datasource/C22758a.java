package com.carrefour.fid.android.various.data.datasource;

import com.carrefour.fid.android.various.domain.repository.C22796c;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.various.data.datasource.a */
public final class C22758a implements C10324h<RemoteConfigDataSource> {

    /* renamed from: a */
    public final Provider<C22796c> f58277a;

    public C22758a(Provider<C22796c> provider) {
        this.f58277a = provider;
    }

    /* renamed from: a */
    public static C22758a m102933a(Provider<C22796c> provider) {
        return new C22758a(provider);
    }

    /* renamed from: c */
    public static RemoteConfigDataSource m102934c(C22796c cVar) {
        return new RemoteConfigDataSource(cVar);
    }

    /* renamed from: b */
    public RemoteConfigDataSource get() {
        return m102934c(this.f58277a.get());
    }
}
