package com.carrefour.fid.android.presentation.p035ui.basketbuilder;

import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.C25956f;
import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.h */
public final class C23221h implements C10158g<BasketBuilderFrequentPurchasesFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f58906a;

    /* renamed from: b */
    public final Provider<C25956f> f58907b;

    public C23221h(Provider<C28796c> provider, Provider<C25956f> provider2) {
        this.f58906a = provider;
        this.f58907b = provider2;
    }

    /* renamed from: a */
    public static C10158g<BasketBuilderFrequentPurchasesFragment> m103887a(Provider<C28796c> provider, Provider<C25956f> provider2) {
        return new C23221h(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFrequentPurchasesFragment.analyticsViewModel")
    /* renamed from: b */
    public static void m103888b(BasketBuilderFrequentPurchasesFragment basketBuilderFrequentPurchasesFragment, C25956f fVar) {
        basketBuilderFrequentPurchasesFragment.f58864v = fVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFrequentPurchasesFragment.navigator")
    /* renamed from: d */
    public static void m103889d(BasketBuilderFrequentPurchasesFragment basketBuilderFrequentPurchasesFragment, C28796c cVar) {
        basketBuilderFrequentPurchasesFragment.f58863g = cVar;
    }

    /* renamed from: c */
    public void injectMembers(BasketBuilderFrequentPurchasesFragment basketBuilderFrequentPurchasesFragment) {
        m103889d(basketBuilderFrequentPurchasesFragment, this.f58906a.get());
        m103888b(basketBuilderFrequentPurchasesFragment, this.f58907b.get());
    }
}
