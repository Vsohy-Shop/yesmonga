package com.carrefour.fid.android.product.domain.interactors;

import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.domain.interactors.e0 */
public final class C27559e0 implements C10324h<ProductUpdateFilterUseCase> {

    /* renamed from: a */
    public final Provider<ProductUpdateFacetUseCase> f66930a;

    public C27559e0(Provider<ProductUpdateFacetUseCase> provider) {
        this.f66930a = provider;
    }

    /* renamed from: a */
    public static C27559e0 m115961a(Provider<ProductUpdateFacetUseCase> provider) {
        return new C27559e0(provider);
    }

    /* renamed from: c */
    public static ProductUpdateFilterUseCase m115962c(ProductUpdateFacetUseCase productUpdateFacetUseCase) {
        return new ProductUpdateFilterUseCase(productUpdateFacetUseCase);
    }

    /* renamed from: b */
    public ProductUpdateFilterUseCase get() {
        return m115962c(this.f66930a.get());
    }
}
