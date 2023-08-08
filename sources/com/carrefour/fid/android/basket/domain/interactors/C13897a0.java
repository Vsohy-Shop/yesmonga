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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.a0 */
public final class C13897a0 implements C10324h<C13968z> {

    /* renamed from: a */
    public final Provider<BasketRepository> f33911a;

    public C13897a0(Provider<BasketRepository> provider) {
        this.f33911a = provider;
    }

    /* renamed from: a */
    public static C13897a0 m58983a(Provider<BasketRepository> provider) {
        return new C13897a0(provider);
    }

    /* renamed from: c */
    public static C13968z m58984c(BasketRepository basketRepository) {
        return new C13968z(basketRepository);
    }

    /* renamed from: b */
    public C13968z get() {
        return m58984c(this.f33911a.get());
    }
}
