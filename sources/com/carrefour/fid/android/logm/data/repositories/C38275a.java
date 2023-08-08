package com.carrefour.fid.android.logm.data.repositories;

import com.carrefour.fid.android.logm.data.datasource.LogMDataSource;
import com.carrefour.fid.android.shared.util.C28909d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@C10321e
@C10337q
@C10338r("javax.inject.Singleton")
/* renamed from: com.carrefour.fid.android.logm.data.repositories.a */
public final class C38275a implements C10324h<LoggerRepository> {

    /* renamed from: a */
    public final Provider<LogMDataSource> f96959a;

    /* renamed from: b */
    public final Provider<CoroutineDispatcher> f96960b;

    /* renamed from: c */
    public final Provider<C28909d> f96961c;

    public C38275a(Provider<LogMDataSource> provider, Provider<CoroutineDispatcher> provider2, Provider<C28909d> provider3) {
        this.f96959a = provider;
        this.f96960b = provider2;
        this.f96961c = provider3;
    }

    /* renamed from: a */
    public static C38275a m158581a(Provider<LogMDataSource> provider, Provider<CoroutineDispatcher> provider2, Provider<C28909d> provider3) {
        return new C38275a(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static LoggerRepository m158582c(LogMDataSource logMDataSource, CoroutineDispatcher coroutineDispatcher, C28909d dVar) {
        return new LoggerRepository(logMDataSource, coroutineDispatcher, dVar);
    }

    /* renamed from: b */
    public LoggerRepository get() {
        return m158582c(this.f96959a.get(), this.f96960b.get(), this.f96961c.get());
    }
}
