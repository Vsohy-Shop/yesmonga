package com.carrefour.fid.android.checkout.domain.interactors;

import com.carrefour.fid.android.checkout.domain.repositories.SlotRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.checkout.domain.interactors.b */
public final class C39857b implements C10324h<CheckoutGetSlotExpressUseCase> {

    /* renamed from: a */
    public final Provider<SlotRepository> f101673a;

    public C39857b(Provider<SlotRepository> provider) {
        this.f101673a = provider;
    }

    /* renamed from: a */
    public static C39857b m162484a(Provider<SlotRepository> provider) {
        return new C39857b(provider);
    }

    /* renamed from: c */
    public static CheckoutGetSlotExpressUseCase m162485c(SlotRepository slotRepository) {
        return new CheckoutGetSlotExpressUseCase(slotRepository);
    }

    /* renamed from: b */
    public CheckoutGetSlotExpressUseCase get() {
        return m162485c(this.f101673a.get());
    }
}
