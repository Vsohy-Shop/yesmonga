package com.carrefour.fid.android.basket.domain.interactors.internal;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.internal.f */
public final class C13925f implements C10324h<C13924e> {

    /* renamed from: a */
    public final Provider<BasketRepository> f33992a;

    public C13925f(Provider<BasketRepository> provider) {
        this.f33992a = provider;
    }

    /* renamed from: a */
    public static C13925f m59063a(Provider<BasketRepository> provider) {
        return new C13925f(provider);
    }

    /* renamed from: c */
    public static C13924e m59064c(BasketRepository basketRepository) {
        return new C13924e(basketRepository);
    }

    /* renamed from: b */
    public C13924e get() {
        return m59064c(this.f33992a.get());
    }
}
