package com.carrefour.fid.android.basket.domain.interactors.internal;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37578j0;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.internal.l */
public final class C13931l implements C10324h<UpdateBasketOfferQuantityUseCase> {

    /* renamed from: a */
    public final Provider<C37823k> f34006a;

    /* renamed from: b */
    public final Provider<HandleBasketExceptionUseCase> f34007b;

    /* renamed from: c */
    public final Provider<InitializeBasketUseCase> f34008c;

    /* renamed from: d */
    public final Provider<BasketRepository> f34009d;

    /* renamed from: e */
    public final Provider<C37578j0> f34010e;

    public C13931l(Provider<C37823k> provider, Provider<HandleBasketExceptionUseCase> provider2, Provider<InitializeBasketUseCase> provider3, Provider<BasketRepository> provider4, Provider<C37578j0> provider5) {
        this.f34006a = provider;
        this.f34007b = provider2;
        this.f34008c = provider3;
        this.f34009d = provider4;
        this.f34010e = provider5;
    }

    /* renamed from: a */
    public static C13931l m59081a(Provider<C37823k> provider, Provider<HandleBasketExceptionUseCase> provider2, Provider<InitializeBasketUseCase> provider3, Provider<BasketRepository> provider4, Provider<C37578j0> provider5) {
        return new C13931l(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static UpdateBasketOfferQuantityUseCase m59082c(C37823k kVar, HandleBasketExceptionUseCase handleBasketExceptionUseCase, InitializeBasketUseCase initializeBasketUseCase, BasketRepository basketRepository, C37578j0 j0Var) {
        return new UpdateBasketOfferQuantityUseCase(kVar, handleBasketExceptionUseCase, initializeBasketUseCase, basketRepository, j0Var);
    }

    /* renamed from: b */
    public UpdateBasketOfferQuantityUseCase get() {
        return m59082c(this.f34006a.get(), this.f34007b.get(), this.f34008c.get(), this.f34009d.get(), this.f34010e.get());
    }
}
