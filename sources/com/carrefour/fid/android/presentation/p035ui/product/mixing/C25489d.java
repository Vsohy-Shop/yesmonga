package com.carrefour.fid.android.presentation.p035ui.product.mixing;

import com.carrefour.fid.android.presentation.viewmodels.product.mixing.C27224a;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.product.mixing.d */
public final class C25489d implements C10158g<MixingProductsBottomSheetDialogFragment> {

    /* renamed from: a */
    public final Provider<C27224a> f62739a;

    public C25489d(Provider<C27224a> provider) {
        this.f62739a = provider;
    }

    /* renamed from: a */
    public static C10158g<MixingProductsBottomSheetDialogFragment> m109982a(Provider<C27224a> provider) {
        return new C25489d(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.product.mixing.MixingProductsBottomSheetDialogFragment.analyticsViewModel")
    /* renamed from: b */
    public static void m109983b(MixingProductsBottomSheetDialogFragment mixingProductsBottomSheetDialogFragment, C27224a aVar) {
        mixingProductsBottomSheetDialogFragment.f62711f = aVar;
    }

    /* renamed from: c */
    public void injectMembers(MixingProductsBottomSheetDialogFragment mixingProductsBottomSheetDialogFragment) {
        m109983b(mixingProductsBottomSheetDialogFragment, this.f62739a.get());
    }
}
