package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders;

import com.carrefour.fid.android.domain.interactors.basket.C37576i0;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.p */
public final class C26985p implements C10324h<BasketAdditionalOrderViewModel> {

    /* renamed from: a */
    public final Provider<C37576i0> f65678a;

    public C26985p(Provider<C37576i0> provider) {
        this.f65678a = provider;
    }

    /* renamed from: a */
    public static C26985p m114182a(Provider<C37576i0> provider) {
        return new C26985p(provider);
    }

    /* renamed from: c */
    public static BasketAdditionalOrderViewModel m114183c(C37576i0 i0Var) {
        return new BasketAdditionalOrderViewModel(i0Var);
    }

    /* renamed from: b */
    public BasketAdditionalOrderViewModel get() {
        return m114183c(this.f65678a.get());
    }
}
