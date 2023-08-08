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
/* renamed from: com.carrefour.fid.android.checkout.domain.interactors.a */
public final class C39856a implements C10324h<CheckoutClearSlotUseCase> {

    /* renamed from: a */
    public final Provider<SlotRepository> f101672a;

    public C39856a(Provider<SlotRepository> provider) {
        this.f101672a = provider;
    }

    /* renamed from: a */
    public static C39856a m162481a(Provider<SlotRepository> provider) {
        return new C39856a(provider);
    }

    /* renamed from: c */
    public static CheckoutClearSlotUseCase m162482c(SlotRepository slotRepository) {
        return new CheckoutClearSlotUseCase(slotRepository);
    }

    /* renamed from: b */
    public CheckoutClearSlotUseCase get() {
        return m162482c(this.f101672a.get());
    }
}
