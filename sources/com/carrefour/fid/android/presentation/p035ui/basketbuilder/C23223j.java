package com.carrefour.fid.android.presentation.p035ui.basketbuilder;

import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.C25964k;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.j */
public final class C23223j implements C10158g<BasketBuilderMyListsFragment> {

    /* renamed from: a */
    public final Provider<C25964k> f58908a;

    public C23223j(Provider<C25964k> provider) {
        this.f58908a = provider;
    }

    /* renamed from: a */
    public static C10158g<BasketBuilderMyListsFragment> m103892a(Provider<C25964k> provider) {
        return new C23223j(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderMyListsFragment.analyticsViewModel")
    /* renamed from: b */
    public static void m103893b(BasketBuilderMyListsFragment basketBuilderMyListsFragment, C25964k kVar) {
        basketBuilderMyListsFragment.f58881f = kVar;
    }

    /* renamed from: c */
    public void injectMembers(BasketBuilderMyListsFragment basketBuilderMyListsFragment) {
        m103893b(basketBuilderMyListsFragment, this.f58908a.get());
    }
}
