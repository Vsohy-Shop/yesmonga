package com.carrefour.fid.android.presentation.p035ui.account.list.memo;

import com.carrefour.fid.android.presentation.viewmodels.account.list.memo.C25835a;
import com.carrefour.fid.android.presentation.viewmodels.product.search.C27280k;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.memo.d */
public final class C22984d implements C10158g<MemoListFragment> {

    /* renamed from: a */
    public final Provider<C25835a> f58629a;

    /* renamed from: b */
    public final Provider<C27280k> f58630b;

    public C22984d(Provider<C25835a> provider, Provider<C27280k> provider2) {
        this.f58629a = provider;
        this.f58630b = provider2;
    }

    /* renamed from: a */
    public static C10158g<MemoListFragment> m103403a(Provider<C25835a> provider, Provider<C27280k> provider2) {
        return new C22984d(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.account.list.memo.MemoListFragment.accountListStoreMemoAnalyticsViewModel")
    /* renamed from: b */
    public static void m103404b(MemoListFragment memoListFragment, C25835a aVar) {
        memoListFragment.f58608f = aVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.account.list.memo.MemoListFragment.productSearchWithListRecommendationResultsAnalyticsViewModel")
    /* renamed from: d */
    public static void m103405d(MemoListFragment memoListFragment, C27280k kVar) {
        memoListFragment.f58609g = kVar;
    }

    /* renamed from: c */
    public void injectMembers(MemoListFragment memoListFragment) {
        m103404b(memoListFragment, this.f58629a.get());
        m103405d(memoListFragment, this.f58630b.get());
    }
}
