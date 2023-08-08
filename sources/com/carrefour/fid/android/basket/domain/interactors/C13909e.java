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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.e */
public final class C13909e implements C10324h<C13907d> {

    /* renamed from: a */
    public final Provider<BasketRepository> f33936a;

    public C13909e(Provider<BasketRepository> provider) {
        this.f33936a = provider;
    }

    /* renamed from: a */
    public static C13909e m59016a(Provider<BasketRepository> provider) {
        return new C13909e(provider);
    }

    /* renamed from: c */
    public static C13907d m59017c(BasketRepository basketRepository) {
        return new C13907d(basketRepository);
    }

    /* renamed from: b */
    public C13907d get() {
        return m59017c(this.f33936a.get());
    }
}
