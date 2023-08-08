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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.h */
public final class C13915h implements C10324h<C13913g> {

    /* renamed from: a */
    public final Provider<BasketRepository> f33944a;

    public C13915h(Provider<BasketRepository> provider) {
        this.f33944a = provider;
    }

    /* renamed from: a */
    public static C13915h m59029a(Provider<BasketRepository> provider) {
        return new C13915h(provider);
    }

    /* renamed from: c */
    public static C13913g m59030c(BasketRepository basketRepository) {
        return new C13913g(basketRepository);
    }

    /* renamed from: b */
    public C13913g get() {
        return m59030c(this.f33944a.get());
    }
}
