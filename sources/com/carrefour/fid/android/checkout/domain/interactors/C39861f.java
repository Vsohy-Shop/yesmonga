package com.carrefour.fid.android.checkout.domain.interactors;

import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.user.C37877d;
import com.carrefour.fid.android.domain.interactors.user.C37886i;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.checkout.domain.interactors.f */
public final class C39861f implements C10324h<CheckoutGetSlotsUseCase> {

    /* renamed from: a */
    public final Provider<CheckoutGetSlotListUseCase> f101678a;

    /* renamed from: b */
    public final Provider<CheckoutGetSlotYieldListUseCase> f101679b;

    /* renamed from: c */
    public final Provider<C37877d> f101680c;

    /* renamed from: d */
    public final Provider<C37566e0> f101681d;

    /* renamed from: e */
    public final Provider<C37886i> f101682e;

    /* renamed from: f */
    public final Provider<C37823k> f101683f;

    public C39861f(Provider<CheckoutGetSlotListUseCase> provider, Provider<CheckoutGetSlotYieldListUseCase> provider2, Provider<C37877d> provider3, Provider<C37566e0> provider4, Provider<C37886i> provider5, Provider<C37823k> provider6) {
        this.f101678a = provider;
        this.f101679b = provider2;
        this.f101680c = provider3;
        this.f101681d = provider4;
        this.f101682e = provider5;
        this.f101683f = provider6;
    }

    /* renamed from: a */
    public static C39861f m162496a(Provider<CheckoutGetSlotListUseCase> provider, Provider<CheckoutGetSlotYieldListUseCase> provider2, Provider<C37877d> provider3, Provider<C37566e0> provider4, Provider<C37886i> provider5, Provider<C37823k> provider6) {
        return new C39861f(provider, provider2, provider3, provider4, provider5, provider6);
    }

    /* renamed from: c */
    public static CheckoutGetSlotsUseCase m162497c(CheckoutGetSlotListUseCase checkoutGetSlotListUseCase, CheckoutGetSlotYieldListUseCase checkoutGetSlotYieldListUseCase, C37877d dVar, C37566e0 e0Var, C37886i iVar, C37823k kVar) {
        return new CheckoutGetSlotsUseCase(checkoutGetSlotListUseCase, checkoutGetSlotYieldListUseCase, dVar, e0Var, iVar, kVar);
    }

    /* renamed from: b */
    public CheckoutGetSlotsUseCase get() {
        return m162497c(this.f101678a.get(), this.f101679b.get(), this.f101680c.get(), this.f101681d.get(), this.f101682e.get(), this.f101683f.get());
    }
}
