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
/* renamed from: com.carrefour.fid.android.checkout.domain.interactors.g */
public final class C39862g implements C10324h<CheckoutUpdateSlotLocalStorageUseCase> {

    /* renamed from: a */
    public final Provider<SlotRepository> f101684a;

    public C39862g(Provider<SlotRepository> provider) {
        this.f101684a = provider;
    }

    /* renamed from: a */
    public static C39862g m162499a(Provider<SlotRepository> provider) {
        return new C39862g(provider);
    }

    /* renamed from: c */
    public static CheckoutUpdateSlotLocalStorageUseCase m162500c(SlotRepository slotRepository) {
        return new CheckoutUpdateSlotLocalStorageUseCase(slotRepository);
    }

    /* renamed from: b */
    public CheckoutUpdateSlotLocalStorageUseCase get() {
        return m162500c(this.f101684a.get());
    }
}
