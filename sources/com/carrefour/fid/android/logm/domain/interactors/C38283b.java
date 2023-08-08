package com.carrefour.fid.android.logm.domain.interactors;

import com.carrefour.fid.android.logm.data.repositories.LoggerRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.logm.domain.interactors.b */
public final class C38283b implements C10324h<LogMSendAllRemoteLogsUseCase> {

    /* renamed from: a */
    public final Provider<LoggerRepository> f96974a;

    public C38283b(Provider<LoggerRepository> provider) {
        this.f96974a = provider;
    }

    /* renamed from: a */
    public static C38283b m158599a(Provider<LoggerRepository> provider) {
        return new C38283b(provider);
    }

    /* renamed from: c */
    public static LogMSendAllRemoteLogsUseCase m158600c(LoggerRepository loggerRepository) {
        return new LogMSendAllRemoteLogsUseCase(loggerRepository);
    }

    /* renamed from: b */
    public LogMSendAllRemoteLogsUseCase get() {
        return m158600c(this.f96974a.get());
    }
}
