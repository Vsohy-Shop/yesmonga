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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.q */
public final class C13947q implements C10324h<C13945p> {

    /* renamed from: a */
    public final Provider<BasketRepository> f34037a;

    public C13947q(Provider<BasketRepository> provider) {
        this.f34037a = provider;
    }

    /* renamed from: a */
    public static C13947q m59122a(Provider<BasketRepository> provider) {
        return new C13947q(provider);
    }

    /* renamed from: c */
    public static C13945p m59123c(BasketRepository basketRepository) {
        return new C13945p(basketRepository);
    }

    /* renamed from: b */
    public C13945p get() {
        return m59123c(this.f34037a.get());
    }
}
