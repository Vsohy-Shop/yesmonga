package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al;

import com.carrefour.fid.android.cms.domain.interactors.GetCheckoutCgvUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.a */
public final class C26001a implements C10324h<CheckoutCgvViewModel> {

    /* renamed from: a */
    public final Provider<GetCheckoutCgvUseCase> f63568a;

    public C26001a(Provider<GetCheckoutCgvUseCase> provider) {
        this.f63568a = provider;
    }

    /* renamed from: a */
    public static C26001a m111304a(Provider<GetCheckoutCgvUseCase> provider) {
        return new C26001a(provider);
    }

    /* renamed from: c */
    public static CheckoutCgvViewModel m111305c(GetCheckoutCgvUseCase getCheckoutCgvUseCase) {
        return new CheckoutCgvViewModel(getCheckoutCgvUseCase);
    }

    /* renamed from: b */
    public CheckoutCgvViewModel get() {
        return m111305c(this.f63568a.get());
    }
}
