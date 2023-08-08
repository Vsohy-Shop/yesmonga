package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout;

import com.carrefour.fid.android.cms.domain.interactors.GetCheckoutCgvUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@C10321e
@C10337q({"com.carrefour.fid.android.shared.di.annotation.MainImmediateDispatcher"})
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.p */
public final class C26811p implements C10324h<CheckoutStepTwoCgvViewModel> {

    /* renamed from: a */
    public final Provider<GetCheckoutCgvUseCase> f65404a;

    /* renamed from: b */
    public final Provider<CoroutineDispatcher> f65405b;

    public C26811p(Provider<GetCheckoutCgvUseCase> provider, Provider<CoroutineDispatcher> provider2) {
        this.f65404a = provider;
        this.f65405b = provider2;
    }

    /* renamed from: a */
    public static C26811p m113803a(Provider<GetCheckoutCgvUseCase> provider, Provider<CoroutineDispatcher> provider2) {
        return new C26811p(provider, provider2);
    }

    /* renamed from: c */
    public static CheckoutStepTwoCgvViewModel m113804c(GetCheckoutCgvUseCase getCheckoutCgvUseCase, CoroutineDispatcher coroutineDispatcher) {
        return new CheckoutStepTwoCgvViewModel(getCheckoutCgvUseCase, coroutineDispatcher);
    }

    /* renamed from: b */
    public CheckoutStepTwoCgvViewModel get() {
        return m113804c(this.f65404a.get(), this.f65405b.get());
    }
}
