package com.carrefour.fid.android.domain.interactors.order;

import com.carrefour.fid.android.domain.interactors.basket.C37569f0;
import com.carrefour.fid.android.domain.interactors.basket.C37575i;
import com.carrefour.fid.android.domain.interactors.basket.C37576i0;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.order.l */
public final class C37736l implements C10324h<PrepareAdditionalOrderBasketUseCase> {

    /* renamed from: a */
    public final Provider<C37575i> f94726a;

    /* renamed from: b */
    public final Provider<C37576i0> f94727b;

    /* renamed from: c */
    public final Provider<C37569f0> f94728c;

    public C37736l(Provider<C37575i> provider, Provider<C37576i0> provider2, Provider<C37569f0> provider3) {
        this.f94726a = provider;
        this.f94727b = provider2;
        this.f94728c = provider3;
    }

    /* renamed from: a */
    public static C37736l m154682a(Provider<C37575i> provider, Provider<C37576i0> provider2, Provider<C37569f0> provider3) {
        return new C37736l(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static PrepareAdditionalOrderBasketUseCase m154683c(C37575i iVar, C37576i0 i0Var, C37569f0 f0Var) {
        return new PrepareAdditionalOrderBasketUseCase(iVar, i0Var, f0Var);
    }

    /* renamed from: b */
    public PrepareAdditionalOrderBasketUseCase get() {
        return m154683c(this.f94726a.get(), this.f94727b.get(), this.f94728c.get());
    }
}
