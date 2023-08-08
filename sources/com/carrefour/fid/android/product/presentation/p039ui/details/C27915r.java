package com.carrefour.fid.android.product.presentation.p039ui.details;

import com.carrefour.fid.android.shared.util.C28936j;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.r */
public final class C27915r implements C10158g<ProductDetailsImageFragment> {

    /* renamed from: a */
    public final Provider<C28936j> f67577a;

    public C27915r(Provider<C28936j> provider) {
        this.f67577a = provider;
    }

    /* renamed from: a */
    public static C10158g<ProductDetailsImageFragment> m117102a(Provider<C28936j> provider) {
        return new C27915r(provider);
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.details.ProductDetailsImageFragment.fragmentUtil")
    /* renamed from: b */
    public static void m117103b(ProductDetailsImageFragment productDetailsImageFragment, C28936j jVar) {
        productDetailsImageFragment.f67312v = jVar;
    }

    /* renamed from: c */
    public void injectMembers(ProductDetailsImageFragment productDetailsImageFragment) {
        m117103b(productDetailsImageFragment, this.f67577a.get());
    }
}
