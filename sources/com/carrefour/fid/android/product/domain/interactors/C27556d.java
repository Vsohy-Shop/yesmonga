package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.product.C37756f;
import com.carrefour.fid.android.domain.interactors.product.C37761i;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r
/* renamed from: com.carrefour.fid.android.product.domain.interactors.d */
public final class C27556d implements C10324h<ProductGetAntiInflationProductsFlowUseCase> {

    /* renamed from: a */
    public final Provider<C37756f> f66919a;

    /* renamed from: b */
    public final Provider<C37761i> f66920b;

    /* renamed from: c */
    public final Provider<C37823k> f66921c;

    public C27556d(Provider<C37756f> provider, Provider<C37761i> provider2, Provider<C37823k> provider3) {
        this.f66919a = provider;
        this.f66920b = provider2;
        this.f66921c = provider3;
    }

    /* renamed from: a */
    public static C27556d m115952a(Provider<C37756f> provider, Provider<C37761i> provider2, Provider<C37823k> provider3) {
        return new C27556d(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static ProductGetAntiInflationProductsFlowUseCase m115953c(C37756f fVar, C37761i iVar, C37823k kVar) {
        return new ProductGetAntiInflationProductsFlowUseCase(fVar, iVar, kVar);
    }

    /* renamed from: b */
    public ProductGetAntiInflationProductsFlowUseCase get() {
        return m115953c(this.f66919a.get(), this.f66920b.get(), this.f66921c.get());
    }
}
