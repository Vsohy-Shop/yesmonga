package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import com.carrefour.fid.android.product.presentation.viewmodel.details.C28123g;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28936j;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.n */
public final class C27898n implements C10158g<NonFoodProductDetailsFragment> {

    /* renamed from: a */
    public final Provider<C28123g> f67550a;

    /* renamed from: b */
    public final Provider<C28796c> f67551b;

    /* renamed from: c */
    public final Provider<C28936j> f67552c;

    public C27898n(Provider<C28123g> provider, Provider<C28796c> provider2, Provider<C28936j> provider3) {
        this.f67550a = provider;
        this.f67551b = provider2;
        this.f67552c = provider3;
    }

    /* renamed from: a */
    public static C10158g<NonFoodProductDetailsFragment> m117048a(Provider<C28123g> provider, Provider<C28796c> provider2, Provider<C28936j> provider3) {
        return new C27898n(provider, provider2, provider3);
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsFragment.analyticsViewModel")
    /* renamed from: b */
    public static void m117049b(NonFoodProductDetailsFragment nonFoodProductDetailsFragment, C28123g gVar) {
        nonFoodProductDetailsFragment.f67442g = gVar;
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsFragment.fragmentUtil")
    /* renamed from: c */
    public static void m117050c(NonFoodProductDetailsFragment nonFoodProductDetailsFragment, C28936j jVar) {
        nonFoodProductDetailsFragment.f67444w = jVar;
    }

    @C10326j("com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsFragment.navigator")
    /* renamed from: e */
    public static void m117051e(NonFoodProductDetailsFragment nonFoodProductDetailsFragment, C28796c cVar) {
        nonFoodProductDetailsFragment.f67443v = cVar;
    }

    /* renamed from: d */
    public void injectMembers(NonFoodProductDetailsFragment nonFoodProductDetailsFragment) {
        m117049b(nonFoodProductDetailsFragment, this.f67550a.get());
        m117051e(nonFoodProductDetailsFragment, this.f67551b.get());
        m117050c(nonFoodProductDetailsFragment, this.f67552c.get());
    }
}
