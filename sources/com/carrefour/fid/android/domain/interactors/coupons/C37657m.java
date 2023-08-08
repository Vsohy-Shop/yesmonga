package com.carrefour.fid.android.domain.interactors.coupons;

import com.carrefour.fid.android.data.repositories.CouponsRepository;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.coupons.m */
public final class C37657m implements C10324h<UpdateCouponListUseCase> {

    /* renamed from: a */
    public final Provider<CouponsRepository> f94488a;

    public C37657m(Provider<CouponsRepository> provider) {
        this.f94488a = provider;
    }

    /* renamed from: a */
    public static C37657m m154371a(Provider<CouponsRepository> provider) {
        return new C37657m(provider);
    }

    /* renamed from: c */
    public static UpdateCouponListUseCase m154372c(CouponsRepository couponsRepository) {
        return new UpdateCouponListUseCase(couponsRepository);
    }

    /* renamed from: b */
    public UpdateCouponListUseCase get() {
        return m154372c(this.f94488a.get());
    }
}
