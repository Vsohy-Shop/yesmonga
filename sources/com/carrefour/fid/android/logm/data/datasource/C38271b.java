package com.carrefour.fid.android.logm.data.datasource;

import com.carrefour.fid.android.logm.data.service.C38276a;
import com.carrefour.fid.android.shared.app.C28443a;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.logm.data.datasource.b */
public final class C38271b implements C10324h<LogMDataSource> {

    /* renamed from: a */
    public final Provider<C38276a> f96943a;

    /* renamed from: b */
    public final Provider<C28443a> f96944b;

    public C38271b(Provider<C38276a> provider, Provider<C28443a> provider2) {
        this.f96943a = provider;
        this.f96944b = provider2;
    }

    /* renamed from: a */
    public static C38271b m158550a(Provider<C38276a> provider, Provider<C28443a> provider2) {
        return new C38271b(provider, provider2);
    }

    /* renamed from: c */
    public static LogMDataSource m158551c(C38276a aVar, C28443a aVar2) {
        return new LogMDataSource(aVar, aVar2);
    }

    /* renamed from: b */
    public LogMDataSource get() {
        return m158551c(this.f96943a.get(), this.f96944b.get());
    }
}
