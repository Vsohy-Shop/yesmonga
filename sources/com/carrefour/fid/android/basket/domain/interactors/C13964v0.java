package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.account.C37516b;
import com.carrefour.fid.android.domain.interactors.basket.C37570g;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.performance.C38328d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.v0 */
public final class C13964v0 implements C10324h<BasketsListUseCase> {

    /* renamed from: a */
    public final Provider<BasketRepository> f34087a;

    /* renamed from: b */
    public final Provider<C37516b> f34088b;

    /* renamed from: c */
    public final Provider<C37823k> f34089c;

    /* renamed from: d */
    public final Provider<C37570g> f34090d;

    /* renamed from: e */
    public final Provider<C38328d> f34091e;

    public C13964v0(Provider<BasketRepository> provider, Provider<C37516b> provider2, Provider<C37823k> provider3, Provider<C37570g> provider4, Provider<C38328d> provider5) {
        this.f34087a = provider;
        this.f34088b = provider2;
        this.f34089c = provider3;
        this.f34090d = provider4;
        this.f34091e = provider5;
    }

    /* renamed from: a */
    public static C13964v0 m59170a(Provider<BasketRepository> provider, Provider<C37516b> provider2, Provider<C37823k> provider3, Provider<C37570g> provider4, Provider<C38328d> provider5) {
        return new C13964v0(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static BasketsListUseCase m59171c(BasketRepository basketRepository, C37516b bVar, C37823k kVar, C37570g gVar, C38328d dVar) {
        return new BasketsListUseCase(basketRepository, bVar, kVar, gVar, dVar);
    }

    /* renamed from: b */
    public BasketsListUseCase get() {
        return m59171c(this.f34087a.get(), this.f34088b.get(), this.f34089c.get(), this.f34090d.get(), this.f34091e.get());
    }
}
