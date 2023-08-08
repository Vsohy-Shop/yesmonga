package com.carrefour.fid.android.presentation.p035ui.basketbuilder;

import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.C25972p;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.l */
public final class C23225l implements C10158g<BasketBuilderSignInBottomSheetFragment> {

    /* renamed from: a */
    public final Provider<C25972p> f58909a;

    public C23225l(Provider<C25972p> provider) {
        this.f58909a = provider;
    }

    /* renamed from: a */
    public static C10158g<BasketBuilderSignInBottomSheetFragment> m103896a(Provider<C25972p> provider) {
        return new C23225l(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderSignInBottomSheetFragment.analyticsViewModel")
    /* renamed from: b */
    public static void m103897b(BasketBuilderSignInBottomSheetFragment basketBuilderSignInBottomSheetFragment, C25972p pVar) {
        basketBuilderSignInBottomSheetFragment.f58889f = pVar;
    }

    /* renamed from: c */
    public void injectMembers(BasketBuilderSignInBottomSheetFragment basketBuilderSignInBottomSheetFragment) {
        m103897b(basketBuilderSignInBottomSheetFragment, this.f58909a.get());
    }
}
