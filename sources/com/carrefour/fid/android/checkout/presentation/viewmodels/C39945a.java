package com.carrefour.fid.android.checkout.presentation.viewmodels;

import com.carrefour.fid.android.checkout.domain.interactors.GetPspTokenUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.a */
public final class C39945a implements C10324h<PaymentMethodViewModel> {

    /* renamed from: a */
    public final Provider<GetPspTokenUseCase> f101857a;

    public C39945a(Provider<GetPspTokenUseCase> provider) {
        this.f101857a = provider;
    }

    /* renamed from: a */
    public static C39945a m162753a(Provider<GetPspTokenUseCase> provider) {
        return new C39945a(provider);
    }

    /* renamed from: c */
    public static PaymentMethodViewModel m162754c(GetPspTokenUseCase getPspTokenUseCase) {
        return new PaymentMethodViewModel(getPspTokenUseCase);
    }

    /* renamed from: b */
    public PaymentMethodViewModel get() {
        return m162754c(this.f101857a.get());
    }
}
