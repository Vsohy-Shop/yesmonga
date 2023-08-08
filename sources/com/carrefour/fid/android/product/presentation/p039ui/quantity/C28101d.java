package com.carrefour.fid.android.product.presentation.p039ui.quantity;

import com.carrefour.fid.android.product.presentation.analytics.C27631a;
import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.product.presentation.ui.quantity.d */
public final class C28101d implements C10158g<QuantityBackDropFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f68064a;

    /* renamed from: b */
    public final Provider<C27631a> f68065b;

    public C28101d(Provider<C28796c> provider, Provider<C27631a> provider2) {
        this.f68064a = provider;
        this.f68065b = provider2;
    }

    /* renamed from: a */
    public static C10158g<QuantityBackDropFragment> m117652a(Provider<C28796c> provider, Provider<C27631a> provider2) {
        return new C28101d(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.quantity.QuantityBackDropFragment.alternativeProductsBottomSheetAnalytics")
    /* renamed from: b */
    public static void m117653b(QuantityBackDropFragment quantityBackDropFragment, C27631a aVar) {
        quantityBackDropFragment.f68042g = aVar;
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.quantity.QuantityBackDropFragment.navigator")
    /* renamed from: d */
    public static void m117654d(QuantityBackDropFragment quantityBackDropFragment, C28796c cVar) {
        quantityBackDropFragment.f68041f = cVar;
    }

    /* renamed from: c */
    public void injectMembers(QuantityBackDropFragment quantityBackDropFragment) {
        m117654d(quantityBackDropFragment, this.f68064a.get());
        m117653b(quantityBackDropFragment, this.f68065b.get());
    }
}
