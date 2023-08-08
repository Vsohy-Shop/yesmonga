package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.account.C37516b;
import com.carrefour.fid.android.domain.interactors.service.C37835r;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.f0 */
public final class C13912f0 implements C10324h<BasketObserveBasketsItemCountUseCase> {

    /* renamed from: a */
    public final Provider<BasketRepository> f33939a;

    /* renamed from: b */
    public final Provider<C37516b> f33940b;

    /* renamed from: c */
    public final Provider<C37835r> f33941c;

    public C13912f0(Provider<BasketRepository> provider, Provider<C37516b> provider2, Provider<C37835r> provider3) {
        this.f33939a = provider;
        this.f33940b = provider2;
        this.f33941c = provider3;
    }

    /* renamed from: a */
    public static C13912f0 m59025a(Provider<BasketRepository> provider, Provider<C37516b> provider2, Provider<C37835r> provider3) {
        return new C13912f0(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static BasketObserveBasketsItemCountUseCase m59026c(BasketRepository basketRepository, C37516b bVar, C37835r rVar) {
        return new BasketObserveBasketsItemCountUseCase(basketRepository, bVar, rVar);
    }

    /* renamed from: b */
    public BasketObserveBasketsItemCountUseCase get() {
        return m59026c(this.f33939a.get(), this.f33940b.get(), this.f33941c.get());
    }
}
