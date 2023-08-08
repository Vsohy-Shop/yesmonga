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
/* renamed from: com.carrefour.fid.android.domain.interactors.coupons.d */
public final class C37646d implements C10324h<FetchCouponsUseCase> {

    /* renamed from: a */
    public final Provider<CouponsRepository> f94472a;

    public C37646d(Provider<CouponsRepository> provider) {
        this.f94472a = provider;
    }

    /* renamed from: a */
    public static C37646d m154343a(Provider<CouponsRepository> provider) {
        return new C37646d(provider);
    }

    /* renamed from: c */
    public static FetchCouponsUseCase m154344c(CouponsRepository couponsRepository) {
        return new FetchCouponsUseCase(couponsRepository);
    }

    /* renamed from: b */
    public FetchCouponsUseCase get() {
        return m154344c(this.f94472a.get());
    }
}
