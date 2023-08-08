package com.carrefour.fid.android.presentation.viewmodels.coupons;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.domain.interactors.coupons.C37653k;
import com.carrefour.fid.android.domain.interactors.coupons.GetAvailableCouponsUseCase;
import com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase;
import com.carrefour.fid.android.domain.interactors.coupons.UpdateCouponsUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.e */
public final class C26222e implements C10324h<CouponsListViewModel> {

    /* renamed from: a */
    public final Provider<GetAvailableCouponsUseCase> f64153a;

    /* renamed from: b */
    public final Provider<UpdateCouponsUseCase> f64154b;

    /* renamed from: c */
    public final Provider<C37653k> f64155c;

    /* renamed from: d */
    public final Provider<PrintCouponsUseCase> f64156d;

    /* renamed from: e */
    public final Provider<C19456p0> f64157e;

    public C26222e(Provider<GetAvailableCouponsUseCase> provider, Provider<UpdateCouponsUseCase> provider2, Provider<C37653k> provider3, Provider<PrintCouponsUseCase> provider4, Provider<C19456p0> provider5) {
        this.f64153a = provider;
        this.f64154b = provider2;
        this.f64155c = provider3;
        this.f64156d = provider4;
        this.f64157e = provider5;
    }

    /* renamed from: a */
    public static C26222e m112103a(Provider<GetAvailableCouponsUseCase> provider, Provider<UpdateCouponsUseCase> provider2, Provider<C37653k> provider3, Provider<PrintCouponsUseCase> provider4, Provider<C19456p0> provider5) {
        return new C26222e(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static CouponsListViewModel m112104c(GetAvailableCouponsUseCase getAvailableCouponsUseCase, UpdateCouponsUseCase updateCouponsUseCase, C37653k kVar, PrintCouponsUseCase printCouponsUseCase, C19456p0 p0Var) {
        return new CouponsListViewModel(getAvailableCouponsUseCase, updateCouponsUseCase, kVar, printCouponsUseCase, p0Var);
    }

    /* renamed from: b */
    public CouponsListViewModel get() {
        return m112104c(this.f64153a.get(), this.f64154b.get(), this.f64155c.get(), this.f64156d.get(), this.f64157e.get());
    }
}
