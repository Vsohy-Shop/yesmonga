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
/* renamed from: com.carrefour.fid.android.checkout.domain.interactors.e */
public final class C39860e implements C10324h<CheckoutGetSlotYieldListUseCase> {

    /* renamed from: a */
    public final Provider<SlotRepository> f101677a;

    public C39860e(Provider<SlotRepository> provider) {
        this.f101677a = provider;
    }

    /* renamed from: a */
    public static C39860e m162493a(Provider<SlotRepository> provider) {
        return new C39860e(provider);
    }

    /* renamed from: c */
    public static CheckoutGetSlotYieldListUseCase m162494c(SlotRepository slotRepository) {
        return new CheckoutGetSlotYieldListUseCase(slotRepository);
    }

    /* renamed from: b */
    public CheckoutGetSlotYieldListUseCase get() {
        return m162494c(this.f101677a.get());
    }
}
