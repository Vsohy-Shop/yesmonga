package com.carrefour.fid.android.product.domain.interactors;

import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.domain.interactors.f0 */
public final class C27561f0 implements C10324h<ProductUpdateSortUseCase> {

    /* renamed from: a */
    public final Provider<ProductUpdateFacetUseCase> f66935a;

    public C27561f0(Provider<ProductUpdateFacetUseCase> provider) {
        this.f66935a = provider;
    }

    /* renamed from: a */
    public static C27561f0 m115967a(Provider<ProductUpdateFacetUseCase> provider) {
        return new C27561f0(provider);
    }

    /* renamed from: c */
    public static ProductUpdateSortUseCase m115968c(ProductUpdateFacetUseCase productUpdateFacetUseCase) {
        return new ProductUpdateSortUseCase(productUpdateFacetUseCase);
    }

    /* renamed from: b */
    public ProductUpdateSortUseCase get() {
        return m115968c(this.f66935a.get());
    }
}
