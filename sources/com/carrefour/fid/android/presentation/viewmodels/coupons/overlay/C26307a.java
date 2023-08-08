package com.carrefour.fid.android.presentation.viewmodels.coupons.overlay;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponDetailsUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.a */
public final class C26307a implements C10324h<OverlayCouponDetailsBottomSheetViewModel> {

    /* renamed from: a */
    public final Provider<UpdateCouponDetailsUseCase> f64317a;

    /* renamed from: b */
    public final Provider<C19456p0> f64318b;

    public C26307a(Provider<UpdateCouponDetailsUseCase> provider, Provider<C19456p0> provider2) {
        this.f64317a = provider;
        this.f64318b = provider2;
    }

    /* renamed from: a */
    public static C26307a m112336a(Provider<UpdateCouponDetailsUseCase> provider, Provider<C19456p0> provider2) {
        return new C26307a(provider, provider2);
    }

    /* renamed from: c */
    public static OverlayCouponDetailsBottomSheetViewModel m112337c(UpdateCouponDetailsUseCase updateCouponDetailsUseCase, C19456p0 p0Var) {
        return new OverlayCouponDetailsBottomSheetViewModel(updateCouponDetailsUseCase, p0Var);
    }

    /* renamed from: b */
    public OverlayCouponDetailsBottomSheetViewModel get() {
        return m112337c(this.f64317a.get(), this.f64318b.get());
    }
}
