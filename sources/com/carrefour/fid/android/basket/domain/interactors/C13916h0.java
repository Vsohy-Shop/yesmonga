package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.h0 */
public final class C13916h0 implements C10324h<C13914g0> {

    /* renamed from: a */
    public final Provider<BasketRepository> f33945a;

    public C13916h0(Provider<BasketRepository> provider) {
        this.f33945a = provider;
    }

    /* renamed from: a */
    public static C13916h0 m59032a(Provider<BasketRepository> provider) {
        return new C13916h0(provider);
    }

    /* renamed from: c */
    public static C13914g0 m59033c(BasketRepository basketRepository) {
        return new C13914g0(basketRepository);
    }

    /* renamed from: b */
    public C13914g0 get() {
        return m59033c(this.f33945a.get());
    }
}
