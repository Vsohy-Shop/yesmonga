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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.n */
public final class C13941n implements C10324h<C13939m> {

    /* renamed from: a */
    public final Provider<BasketRepository> f34027a;

    public C13941n(Provider<BasketRepository> provider) {
        this.f34027a = provider;
    }

    /* renamed from: a */
    public static C13941n m59106a(Provider<BasketRepository> provider) {
        return new C13941n(provider);
    }

    /* renamed from: c */
    public static C13939m m59107c(BasketRepository basketRepository) {
        return new C13939m(basketRepository);
    }

    /* renamed from: b */
    public C13939m get() {
        return m59107c(this.f34027a.get());
    }
}
