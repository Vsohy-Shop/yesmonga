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
/* renamed from: com.carrefour.fid.android.checkout.domain.interactors.d */
public final class C39859d implements C10324h<CheckoutGetSlotStoreUseCase> {

    /* renamed from: a */
    public final Provider<SlotRepository> f101676a;

    public C39859d(Provider<SlotRepository> provider) {
        this.f101676a = provider;
    }

    /* renamed from: a */
    public static C39859d m162490a(Provider<SlotRepository> provider) {
        return new C39859d(provider);
    }

    /* renamed from: c */
    public static CheckoutGetSlotStoreUseCase m162491c(SlotRepository slotRepository) {
        return new CheckoutGetSlotStoreUseCase(slotRepository);
    }

    /* renamed from: b */
    public CheckoutGetSlotStoreUseCase get() {
        return m162491c(this.f101676a.get());
    }
}
