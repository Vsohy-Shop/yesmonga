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
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.t */
public final class C13958t implements C10324h<C13951s> {

    /* renamed from: a */
    public final Provider<BasketRepository> f34076a;

    public C13958t(Provider<BasketRepository> provider) {
        this.f34076a = provider;
    }

    /* renamed from: a */
    public static C13958t m59156a(Provider<BasketRepository> provider) {
        return new C13958t(provider);
    }

    /* renamed from: c */
    public static C13951s m59157c(BasketRepository basketRepository) {
        return new C13951s(basketRepository);
    }

    /* renamed from: b */
    public C13951s get() {
        return m59157c(this.f34076a.get());
    }
}
