package com.carrefour.fid.android.domain.interactors.checkout;

import com.carrefour.fid.android.domain.interactors.basket.C37578j0;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.domain.interactors.service.C37836s;
import com.carrefour.fid.android.domain.interactors.service.C37841v;
import com.carrefour.fid.android.domain.interactors.store.CheckStoreEligibilityUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.checkout.a */
public final class C37625a implements C10324h<CheckoutCheckDeliveryEligibilityUseCase> {

    /* renamed from: a */
    public final Provider<CheckStoreEligibilityUseCase> f94404a;

    /* renamed from: b */
    public final Provider<C37841v> f94405b;

    /* renamed from: c */
    public final Provider<C37816e> f94406c;

    /* renamed from: d */
    public final Provider<C37836s> f94407d;

    /* renamed from: e */
    public final Provider<C37578j0> f94408e;

    public C37625a(Provider<CheckStoreEligibilityUseCase> provider, Provider<C37841v> provider2, Provider<C37816e> provider3, Provider<C37836s> provider4, Provider<C37578j0> provider5) {
        this.f94404a = provider;
        this.f94405b = provider2;
        this.f94406c = provider3;
        this.f94407d = provider4;
        this.f94408e = provider5;
    }

    /* renamed from: a */
    public static C37625a m154243a(Provider<CheckStoreEligibilityUseCase> provider, Provider<C37841v> provider2, Provider<C37816e> provider3, Provider<C37836s> provider4, Provider<C37578j0> provider5) {
        return new C37625a(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static CheckoutCheckDeliveryEligibilityUseCase m154244c(CheckStoreEligibilityUseCase checkStoreEligibilityUseCase, C37841v vVar, C37816e eVar, C37836s sVar, C37578j0 j0Var) {
        return new CheckoutCheckDeliveryEligibilityUseCase(checkStoreEligibilityUseCase, vVar, eVar, sVar, j0Var);
    }

    /* renamed from: b */
    public CheckoutCheckDeliveryEligibilityUseCase get() {
        return m154244c(this.f94404a.get(), this.f94405b.get(), this.f94406c.get(), this.f94407d.get(), this.f94408e.get());
    }
}
