package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketTypeUseCase;
import com.carrefour.fid.android.domain.interactors.additionalorder.C37541b;
import com.carrefour.fid.android.domain.interactors.user.C37886i;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.o0 */
public final class C13944o0 implements C10324h<BasketSwitchBasketTypeUseCase> {

    /* renamed from: a */
    public final Provider<C37541b> f34031a;

    /* renamed from: b */
    public final Provider<C37886i> f34032b;

    /* renamed from: c */
    public final Provider<UpdateBasketTypeUseCase> f34033c;

    public C13944o0(Provider<C37541b> provider, Provider<C37886i> provider2, Provider<UpdateBasketTypeUseCase> provider3) {
        this.f34031a = provider;
        this.f34032b = provider2;
        this.f34033c = provider3;
    }

    /* renamed from: a */
    public static C13944o0 m59115a(Provider<C37541b> provider, Provider<C37886i> provider2, Provider<UpdateBasketTypeUseCase> provider3) {
        return new C13944o0(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static BasketSwitchBasketTypeUseCase m59116c(C37541b bVar, C37886i iVar, UpdateBasketTypeUseCase updateBasketTypeUseCase) {
        return new BasketSwitchBasketTypeUseCase(bVar, iVar, updateBasketTypeUseCase);
    }

    /* renamed from: b */
    public BasketSwitchBasketTypeUseCase get() {
        return m59116c(this.f34031a.get(), this.f34032b.get(), this.f34033c.get());
    }
}
