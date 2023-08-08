package com.carrefour.fid.android.various.domain.interactor;

import com.carrefour.fid.android.various.domain.repository.AppMessageRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.various.domain.interactor.b */
public final class C22780b implements C10324h<MarkAppMessageAsReadUseCase> {

    /* renamed from: a */
    public final Provider<AppMessageRepository> f58338a;

    public C22780b(Provider<AppMessageRepository> provider) {
        this.f58338a = provider;
    }

    /* renamed from: a */
    public static C22780b m103009a(Provider<AppMessageRepository> provider) {
        return new C22780b(provider);
    }

    /* renamed from: c */
    public static MarkAppMessageAsReadUseCase m103010c(AppMessageRepository appMessageRepository) {
        return new MarkAppMessageAsReadUseCase(appMessageRepository);
    }

    /* renamed from: b */
    public MarkAppMessageAsReadUseCase get() {
        return m103010c(this.f58338a.get());
    }
}
