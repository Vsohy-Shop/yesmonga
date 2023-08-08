package com.carrefour.fid.android.product.presentation.p039ui.details;

import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.m */
public final class C27816m implements C10158g<ProductDetailsFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f67414a;

    public C27816m(Provider<C28796c> provider) {
        this.f67414a = provider;
    }

    /* renamed from: a */
    public static C10158g<ProductDetailsFragment> m116795a(Provider<C28796c> provider) {
        return new C27816m(provider);
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.details.ProductDetailsFragment.navigator")
    /* renamed from: c */
    public static void m116796c(ProductDetailsFragment productDetailsFragment, C28796c cVar) {
        productDetailsFragment.f67286f = cVar;
    }

    /* renamed from: b */
    public void injectMembers(ProductDetailsFragment productDetailsFragment) {
        m116796c(productDetailsFragment, this.f67414a.get());
    }
}
