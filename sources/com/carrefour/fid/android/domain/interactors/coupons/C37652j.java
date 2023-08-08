package com.carrefour.fid.android.domain.interactors.coupons;

import com.carrefour.fid.android.data.repositories.CouponsRepository;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.coupons.j */
public final class C37652j implements C10324h<UpdateCouponDetailsUseCase> {

    /* renamed from: a */
    public final Provider<CouponsRepository> f94482a;

    /* renamed from: b */
    public final Provider<C37878e> f94483b;

    public C37652j(Provider<CouponsRepository> provider, Provider<C37878e> provider2) {
        this.f94482a = provider;
        this.f94483b = provider2;
    }

    /* renamed from: a */
    public static C37652j m154355a(Provider<CouponsRepository> provider, Provider<C37878e> provider2) {
        return new C37652j(provider, provider2);
    }

    /* renamed from: c */
    public static UpdateCouponDetailsUseCase m154356c(CouponsRepository couponsRepository, C37878e eVar) {
        return new UpdateCouponDetailsUseCase(couponsRepository, eVar);
    }

    /* renamed from: b */
    public UpdateCouponDetailsUseCase get() {
        return m154356c(this.f94482a.get(), this.f94483b.get());
    }
}
