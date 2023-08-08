package com.carrefour.fid.android.various.domain.interactor;

import com.carrefour.fid.android.domain.interactors.remoteconfig.C37809c;
import com.carrefour.fid.android.various.domain.repository.AppMessageRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.various.domain.interactor.c */
public final class C22781c implements C10324h<ThirdPartyCheckAppMessageUseCase> {

    /* renamed from: a */
    public final Provider<C37809c> f58339a;

    /* renamed from: b */
    public final Provider<AppMessageRepository> f58340b;

    public C22781c(Provider<C37809c> provider, Provider<AppMessageRepository> provider2) {
        this.f58339a = provider;
        this.f58340b = provider2;
    }

    /* renamed from: a */
    public static C22781c m103012a(Provider<C37809c> provider, Provider<AppMessageRepository> provider2) {
        return new C22781c(provider, provider2);
    }

    /* renamed from: c */
    public static ThirdPartyCheckAppMessageUseCase m103013c(C37809c cVar, AppMessageRepository appMessageRepository) {
        return new ThirdPartyCheckAppMessageUseCase(cVar, appMessageRepository);
    }

    /* renamed from: b */
    public ThirdPartyCheckAppMessageUseCase get() {
        return m103013c(this.f58339a.get(), this.f58340b.get());
    }
}
