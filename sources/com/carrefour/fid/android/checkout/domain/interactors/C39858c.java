package com.carrefour.fid.android.checkout.domain.interactors;

import com.carrefour.fid.android.checkout.domain.repositories.SlotRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.checkout.domain.interactors.c */
public final class C39858c implements C10324h<CheckoutGetSlotListUseCase> {

    /* renamed from: a */
    public final Provider<C37566e0> f101674a;

    /* renamed from: b */
    public final Provider<SlotRepository> f101675b;

    public C39858c(Provider<C37566e0> provider, Provider<SlotRepository> provider2) {
        this.f101674a = provider;
        this.f101675b = provider2;
    }

    /* renamed from: a */
    public static C39858c m162487a(Provider<C37566e0> provider, Provider<SlotRepository> provider2) {
        return new C39858c(provider, provider2);
    }

    /* renamed from: c */
    public static CheckoutGetSlotListUseCase m162488c(C37566e0 e0Var, SlotRepository slotRepository) {
        return new CheckoutGetSlotListUseCase(e0Var, slotRepository);
    }

    /* renamed from: b */
    public CheckoutGetSlotListUseCase get() {
        return m162488c(this.f101674a.get(), this.f101675b.get());
    }
}
