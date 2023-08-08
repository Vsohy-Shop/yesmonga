package com.carrefour.fid.android.basket.domain.interactors.internal;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.basket.C37573h;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.internal.b */
public final class C13921b implements C10324h<CheckSelectedServiceTypeUseCase> {

    /* renamed from: a */
    public final Provider<C13924e> f33984a;

    /* renamed from: b */
    public final Provider<C37566e0> f33985b;

    /* renamed from: c */
    public final Provider<BasketRepository> f33986c;

    /* renamed from: d */
    public final Provider<C37823k> f33987d;

    /* renamed from: e */
    public final Provider<C37573h> f33988e;

    public C13921b(Provider<C13924e> provider, Provider<C37566e0> provider2, Provider<BasketRepository> provider3, Provider<C37823k> provider4, Provider<C37573h> provider5) {
        this.f33984a = provider;
        this.f33985b = provider2;
        this.f33986c = provider3;
        this.f33987d = provider4;
        this.f33988e = provider5;
    }

    /* renamed from: a */
    public static C13921b m59054a(Provider<C13924e> provider, Provider<C37566e0> provider2, Provider<BasketRepository> provider3, Provider<C37823k> provider4, Provider<C37573h> provider5) {
        return new C13921b(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static CheckSelectedServiceTypeUseCase m59055c(C13924e eVar, C37566e0 e0Var, BasketRepository basketRepository, C37823k kVar, C37573h hVar) {
        return new CheckSelectedServiceTypeUseCase(eVar, e0Var, basketRepository, kVar, hVar);
    }

    /* renamed from: b */
    public CheckSelectedServiceTypeUseCase get() {
        return m59055c(this.f33984a.get(), this.f33985b.get(), this.f33986c.get(), this.f33987d.get(), this.f33988e.get());
    }
}
