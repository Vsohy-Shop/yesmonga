package com.carrefour.fid.android.logm.domain.interactors;

import com.carrefour.fid.android.logm.C38243b;
import com.carrefour.fid.android.logm.data.repositories.LoggerRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.logm.domain.interactors.a */
public final class C38282a implements C10324h<LogMLogToLogMUseCase> {

    /* renamed from: a */
    public final Provider<LoggerRepository> f96972a;

    /* renamed from: b */
    public final Provider<C38243b> f96973b;

    public C38282a(Provider<LoggerRepository> provider, Provider<C38243b> provider2) {
        this.f96972a = provider;
        this.f96973b = provider2;
    }

    /* renamed from: a */
    public static C38282a m158596a(Provider<LoggerRepository> provider, Provider<C38243b> provider2) {
        return new C38282a(provider, provider2);
    }

    /* renamed from: c */
    public static LogMLogToLogMUseCase m158597c(LoggerRepository loggerRepository, C38243b bVar) {
        return new LogMLogToLogMUseCase(loggerRepository, bVar);
    }

    /* renamed from: b */
    public LogMLogToLogMUseCase get() {
        return m158597c(this.f96972a.get(), this.f96973b.get());
    }
}
