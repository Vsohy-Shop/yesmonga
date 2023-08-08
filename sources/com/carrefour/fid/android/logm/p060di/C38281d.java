package com.carrefour.fid.android.logm.p060di;

import com.carrefour.fid.android.logm.data.datasource.LogMDataSource;
import com.carrefour.fid.android.logm.data.repositories.LoggerRepository;
import com.carrefour.fid.android.shared.util.C28909d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.logm.di.d */
public final class C38281d implements C10324h<LoggerRepository> {

    /* renamed from: a */
    public final Provider<LogMDataSource> f96967a;

    /* renamed from: b */
    public final Provider<C28909d> f96968b;

    public C38281d(Provider<LogMDataSource> provider, Provider<C28909d> provider2) {
        this.f96967a = provider;
        this.f96968b = provider2;
    }

    /* renamed from: a */
    public static C38281d m158592a(Provider<LogMDataSource> provider, Provider<C28909d> provider2) {
        return new C38281d(provider, provider2);
    }

    /* renamed from: c */
    public static LoggerRepository m158593c(LogMDataSource logMDataSource, C28909d dVar) {
        return (LoggerRepository) C10335o.m38554f(C38278b.f96962a.mo119876b(logMDataSource, dVar));
    }

    /* renamed from: b */
    public LoggerRepository get() {
        return m158593c(this.f96967a.get(), this.f96968b.get());
    }
}
