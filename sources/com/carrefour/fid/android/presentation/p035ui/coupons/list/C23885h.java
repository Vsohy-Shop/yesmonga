package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.presentation.p035ui.coupons.analytics.C23787a;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.h */
public final class C23885h implements C10158g<CouponsListFragment> {

    /* renamed from: a */
    public final Provider<C23787a> f60052a;

    /* renamed from: b */
    public final Provider<C38326b> f60053b;

    public C23885h(Provider<C23787a> provider, Provider<C38326b> provider2) {
        this.f60052a = provider;
        this.f60053b = provider2;
    }

    /* renamed from: a */
    public static C10158g<CouponsListFragment> m105700a(Provider<C23787a> provider, Provider<C38326b> provider2) {
        return new C23885h(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment.couponsAnalytics")
    /* renamed from: b */
    public static void m105701b(CouponsListFragment couponsListFragment, C23787a aVar) {
        couponsListFragment.f59945f = aVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListFragment.performance")
    /* renamed from: d */
    public static void m105702d(CouponsListFragment couponsListFragment, C38326b bVar) {
        couponsListFragment.f59946g = bVar;
    }

    /* renamed from: c */
    public void injectMembers(CouponsListFragment couponsListFragment) {
        m105701b(couponsListFragment, this.f60052a.get());
        m105702d(couponsListFragment, this.f60053b.get());
    }
}
