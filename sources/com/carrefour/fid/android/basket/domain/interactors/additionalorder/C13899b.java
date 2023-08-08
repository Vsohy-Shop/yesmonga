package com.carrefour.fid.android.basket.domain.interactors.additionalorder;

import com.carrefour.fid.android.basket.domain.interactors.internal.FetchBasketUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.basket.domain.interactors.additionalorder.b */
public final class C13899b implements C10324h<AdditionalOrderRetrieveBasketUseCase> {

    /* renamed from: a */
    public final Provider<CheckAdditionalOrderPermissionUseCase> f33922a;

    /* renamed from: b */
    public final Provider<FetchBasketUseCase> f33923b;

    public C13899b(Provider<CheckAdditionalOrderPermissionUseCase> provider, Provider<FetchBasketUseCase> provider2) {
        this.f33922a = provider;
        this.f33923b = provider2;
    }

    /* renamed from: a */
    public static C13899b m58990a(Provider<CheckAdditionalOrderPermissionUseCase> provider, Provider<FetchBasketUseCase> provider2) {
        return new C13899b(provider, provider2);
    }

    /* renamed from: c */
    public static AdditionalOrderRetrieveBasketUseCase m58991c(CheckAdditionalOrderPermissionUseCase checkAdditionalOrderPermissionUseCase, FetchBasketUseCase fetchBasketUseCase) {
        return new AdditionalOrderRetrieveBasketUseCase(checkAdditionalOrderPermissionUseCase, fetchBasketUseCase);
    }

    /* renamed from: b */
    public AdditionalOrderRetrieveBasketUseCase get() {
        return m58991c(this.f33922a.get(), this.f33923b.get());
    }
}
