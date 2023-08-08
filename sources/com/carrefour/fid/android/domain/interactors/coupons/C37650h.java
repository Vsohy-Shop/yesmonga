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
/* renamed from: com.carrefour.fid.android.domain.interactors.coupons.h */
public final class C37650h implements C10324h<PrintCouponsUseCase> {

    /* renamed from: a */
    public final Provider<C37878e> f94480a;

    /* renamed from: b */
    public final Provider<CouponsRepository> f94481b;

    public C37650h(Provider<C37878e> provider, Provider<CouponsRepository> provider2) {
        this.f94480a = provider;
        this.f94481b = provider2;
    }

    /* renamed from: a */
    public static C37650h m154352a(Provider<C37878e> provider, Provider<CouponsRepository> provider2) {
        return new C37650h(provider, provider2);
    }

    /* renamed from: c */
    public static PrintCouponsUseCase m154353c(C37878e eVar, CouponsRepository couponsRepository) {
        return new PrintCouponsUseCase(eVar, couponsRepository);
    }

    /* renamed from: b */
    public PrintCouponsUseCase get() {
        return m154353c(this.f94480a.get(), this.f94481b.get());
    }
}
