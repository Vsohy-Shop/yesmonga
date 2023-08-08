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
/* renamed from: com.carrefour.fid.android.domain.interactors.coupons.n */
public final class C37658n implements C10324h<UpdateCouponsUseCase> {

    /* renamed from: a */
    public final Provider<C37878e> f94489a;

    /* renamed from: b */
    public final Provider<CouponsRepository> f94490b;

    public C37658n(Provider<C37878e> provider, Provider<CouponsRepository> provider2) {
        this.f94489a = provider;
        this.f94490b = provider2;
    }

    /* renamed from: a */
    public static C37658n m154374a(Provider<C37878e> provider, Provider<CouponsRepository> provider2) {
        return new C37658n(provider, provider2);
    }

    /* renamed from: c */
    public static UpdateCouponsUseCase m154375c(C37878e eVar, CouponsRepository couponsRepository) {
        return new UpdateCouponsUseCase(eVar, couponsRepository);
    }

    /* renamed from: b */
    public UpdateCouponsUseCase get() {
        return m154375c(this.f94489a.get(), this.f94490b.get());
    }
}
