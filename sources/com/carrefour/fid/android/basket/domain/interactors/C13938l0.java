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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.l0 */
public final class C13938l0 implements C10324h<C13936k0> {

    /* renamed from: a */
    public final Provider<BasketRepository> f34022a;

    public C13938l0(Provider<BasketRepository> provider) {
        this.f34022a = provider;
    }

    /* renamed from: a */
    public static C13938l0 m59099a(Provider<BasketRepository> provider) {
        return new C13938l0(provider);
    }

    /* renamed from: c */
    public static C13936k0 m59100c(BasketRepository basketRepository) {
        return new C13936k0(basketRepository);
    }

    /* renamed from: b */
    public C13936k0 get() {
        return m59100c(this.f34022a.get());
    }
}
