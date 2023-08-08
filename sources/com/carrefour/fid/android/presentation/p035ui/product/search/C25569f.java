package com.carrefour.fid.android.presentation.p035ui.product.search;

import com.carrefour.fid.android.presentation.viewmodels.product.search.C27264a;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.f */
public final class C25569f implements C10158g<AdditionalOrderProductSearchFragment> {

    /* renamed from: a */
    public final Provider<C27264a> f62832a;

    public C25569f(Provider<C27264a> provider) {
        this.f62832a = provider;
    }

    /* renamed from: a */
    public static C10158g<AdditionalOrderProductSearchFragment> m110147a(Provider<C27264a> provider) {
        return new C25569f(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.product.search.AdditionalOrderProductSearchFragment.productSearchAnalyticsViewModel")
    /* renamed from: c */
    public static void m110148c(AdditionalOrderProductSearchFragment additionalOrderProductSearchFragment, C27264a aVar) {
        additionalOrderProductSearchFragment.f62767x = aVar;
    }

    /* renamed from: b */
    public void injectMembers(AdditionalOrderProductSearchFragment additionalOrderProductSearchFragment) {
        m110148c(additionalOrderProductSearchFragment, this.f62832a.get());
    }
}
