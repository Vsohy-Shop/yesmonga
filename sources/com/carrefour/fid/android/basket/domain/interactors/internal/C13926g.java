package com.carrefour.fid.android.basket.domain.interactors.internal;

import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.internal.g */
public final class C13926g implements C10324h<HandleBasketExceptionUseCase> {

    /* renamed from: a */
    public final Provider<HandleBasketExpiredFacilityStoreUseCase> f33993a;

    public C13926g(Provider<HandleBasketExpiredFacilityStoreUseCase> provider) {
        this.f33993a = provider;
    }

    /* renamed from: a */
    public static C13926g m59066a(Provider<HandleBasketExpiredFacilityStoreUseCase> provider) {
        return new C13926g(provider);
    }

    /* renamed from: c */
    public static HandleBasketExceptionUseCase m59067c(HandleBasketExpiredFacilityStoreUseCase handleBasketExpiredFacilityStoreUseCase) {
        return new HandleBasketExceptionUseCase(handleBasketExpiredFacilityStoreUseCase);
    }

    /* renamed from: b */
    public HandleBasketExceptionUseCase get() {
        return m59067c(this.f33993a.get());
    }
}
