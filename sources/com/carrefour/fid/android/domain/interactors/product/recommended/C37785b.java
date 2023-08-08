package com.carrefour.fid.android.domain.interactors.product.recommended;

import com.carrefour.fid.android.domain.interactors.product.C37755e;
import com.carrefour.fid.android.performance.C38328d;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.domain.interactors.product.recommended.b */
public final class C37785b implements C10324h<RecommendedProductUseCase> {

    /* renamed from: a */
    public final Provider<C37755e> f94834a;

    /* renamed from: b */
    public final Provider<C38328d> f94835b;

    public C37785b(Provider<C37755e> provider, Provider<C38328d> provider2) {
        this.f94834a = provider;
        this.f94835b = provider2;
    }

    /* renamed from: a */
    public static C37785b m154882a(Provider<C37755e> provider, Provider<C38328d> provider2) {
        return new C37785b(provider, provider2);
    }

    /* renamed from: c */
    public static RecommendedProductUseCase m154883c(C37755e eVar, C38328d dVar) {
        return new RecommendedProductUseCase(eVar, dVar);
    }

    /* renamed from: b */
    public RecommendedProductUseCase get() {
        return m154883c(this.f94834a.get(), this.f94835b.get());
    }
}
