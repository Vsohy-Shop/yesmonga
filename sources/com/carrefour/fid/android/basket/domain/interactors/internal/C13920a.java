package com.carrefour.fid.android.basket.domain.interactors.internal;

import com.carrefour.fid.android.domain.interactors.service.C37823k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.internal.a */
public final class C13920a implements C10324h<BasketCheckSelectedServiceAndBasketSynchronicityUseCase> {

    /* renamed from: a */
    public final Provider<C37823k> f33981a;

    /* renamed from: b */
    public final Provider<UpdateBasketTypeUseCase> f33982b;

    /* renamed from: c */
    public final Provider<CheckSelectedServiceTypeUseCase> f33983c;

    public C13920a(Provider<C37823k> provider, Provider<UpdateBasketTypeUseCase> provider2, Provider<CheckSelectedServiceTypeUseCase> provider3) {
        this.f33981a = provider;
        this.f33982b = provider2;
        this.f33983c = provider3;
    }

    /* renamed from: a */
    public static C13920a m59051a(Provider<C37823k> provider, Provider<UpdateBasketTypeUseCase> provider2, Provider<CheckSelectedServiceTypeUseCase> provider3) {
        return new C13920a(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static BasketCheckSelectedServiceAndBasketSynchronicityUseCase m59052c(C37823k kVar, UpdateBasketTypeUseCase updateBasketTypeUseCase, CheckSelectedServiceTypeUseCase checkSelectedServiceTypeUseCase) {
        return new BasketCheckSelectedServiceAndBasketSynchronicityUseCase(kVar, updateBasketTypeUseCase, checkSelectedServiceTypeUseCase);
    }

    /* renamed from: b */
    public BasketCheckSelectedServiceAndBasketSynchronicityUseCase get() {
        return m59052c(this.f33981a.get(), this.f33982b.get(), this.f33983c.get());
    }
}
