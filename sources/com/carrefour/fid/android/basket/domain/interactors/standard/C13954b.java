package com.carrefour.fid.android.basket.domain.interactors.standard;

import com.carrefour.fid.android.basket.domain.interactors.internal.BasketCheckSelectedServiceAndBasketSynchronicityUseCase;
import com.carrefour.fid.android.domain.interactors.user.C37886i;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.standard.b */
public final class C13954b implements C10324h<StdCheckBasketPermissionsUseCase> {

    /* renamed from: a */
    public final Provider<BasketCheckSelectedServiceAndBasketSynchronicityUseCase> f34064a;

    /* renamed from: b */
    public final Provider<C37886i> f34065b;

    public C13954b(Provider<BasketCheckSelectedServiceAndBasketSynchronicityUseCase> provider, Provider<C37886i> provider2) {
        this.f34064a = provider;
        this.f34065b = provider2;
    }

    /* renamed from: a */
    public static C13954b m59144a(Provider<BasketCheckSelectedServiceAndBasketSynchronicityUseCase> provider, Provider<C37886i> provider2) {
        return new C13954b(provider, provider2);
    }

    /* renamed from: c */
    public static StdCheckBasketPermissionsUseCase m59145c(BasketCheckSelectedServiceAndBasketSynchronicityUseCase basketCheckSelectedServiceAndBasketSynchronicityUseCase, C37886i iVar) {
        return new StdCheckBasketPermissionsUseCase(basketCheckSelectedServiceAndBasketSynchronicityUseCase, iVar);
    }

    /* renamed from: b */
    public StdCheckBasketPermissionsUseCase get() {
        return m59145c(this.f34064a.get(), this.f34065b.get());
    }
}
