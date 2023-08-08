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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.e0 */
public final class C13910e0 implements C10324h<C13908d0> {

    /* renamed from: a */
    public final Provider<BasketRepository> f33937a;

    public C13910e0(Provider<BasketRepository> provider) {
        this.f33937a = provider;
    }

    /* renamed from: a */
    public static C13910e0 m59019a(Provider<BasketRepository> provider) {
        return new C13910e0(provider);
    }

    /* renamed from: c */
    public static C13908d0 m59020c(BasketRepository basketRepository) {
        return new C13908d0(basketRepository);
    }

    /* renamed from: b */
    public C13908d0 get() {
        return m59020c(this.f33937a.get());
    }
}
