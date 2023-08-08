package com.carrefour.fid.android.product.presentation.viewmodel.facet;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.domain.interactors.product.C37750b;
import com.carrefour.fid.android.product.domain.interactors.C27565j;
import com.carrefour.fid.android.product.domain.interactors.ProductUpdateFacetUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductUpdateFilterUseCase;
import com.carrefour.fid.android.product.domain.interactors.ProductUpdateSortUseCase;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.facet.b */
public final class C28161b implements C10324h<FacetViewModel> {

    /* renamed from: a */
    public final Provider<ProductUpdateSortUseCase> f68209a;

    /* renamed from: b */
    public final Provider<ProductUpdateFilterUseCase> f68210b;

    /* renamed from: c */
    public final Provider<C37750b> f68211c;

    /* renamed from: d */
    public final Provider<C27565j> f68212d;

    /* renamed from: e */
    public final Provider<ProductUpdateFacetUseCase> f68213e;

    /* renamed from: f */
    public final Provider<C19456p0> f68214f;

    public C28161b(Provider<ProductUpdateSortUseCase> provider, Provider<ProductUpdateFilterUseCase> provider2, Provider<C37750b> provider3, Provider<C27565j> provider4, Provider<ProductUpdateFacetUseCase> provider5, Provider<C19456p0> provider6) {
        this.f68209a = provider;
        this.f68210b = provider2;
        this.f68211c = provider3;
        this.f68212d = provider4;
        this.f68213e = provider5;
        this.f68214f = provider6;
    }

    /* renamed from: a */
    public static C28161b m117894a(Provider<ProductUpdateSortUseCase> provider, Provider<ProductUpdateFilterUseCase> provider2, Provider<C37750b> provider3, Provider<C27565j> provider4, Provider<ProductUpdateFacetUseCase> provider5, Provider<C19456p0> provider6) {
        return new C28161b(provider, provider2, provider3, provider4, provider5, provider6);
    }

    /* renamed from: c */
    public static FacetViewModel m117895c(ProductUpdateSortUseCase productUpdateSortUseCase, ProductUpdateFilterUseCase productUpdateFilterUseCase, C37750b bVar, C27565j jVar, ProductUpdateFacetUseCase productUpdateFacetUseCase, C19456p0 p0Var) {
        return new FacetViewModel(productUpdateSortUseCase, productUpdateFilterUseCase, bVar, jVar, productUpdateFacetUseCase, p0Var);
    }

    /* renamed from: b */
    public FacetViewModel get() {
        return m117895c(this.f68209a.get(), this.f68210b.get(), this.f68211c.get(), this.f68212d.get(), this.f68213e.get(), this.f68214f.get());
    }
}
