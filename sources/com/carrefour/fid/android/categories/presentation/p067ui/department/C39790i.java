package com.carrefour.fid.android.categories.presentation.p067ui.department;

import com.carrefour.fid.android.categories.presentation.analytics.C39752a;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28936j;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.i */
public final class C39790i implements C10158g<DepartmentFragment> {

    /* renamed from: a */
    public final Provider<C28936j> f101526a;

    /* renamed from: b */
    public final Provider<C28796c> f101527b;

    /* renamed from: c */
    public final Provider<C39752a> f101528c;

    public C39790i(Provider<C28936j> provider, Provider<C28796c> provider2, Provider<C39752a> provider3) {
        this.f101526a = provider;
        this.f101527b = provider2;
        this.f101528c = provider3;
    }

    /* renamed from: a */
    public static C10158g<DepartmentFragment> m162350a(Provider<C28936j> provider, Provider<C28796c> provider2, Provider<C39752a> provider3) {
        return new C39790i(provider, provider2, provider3);
    }

    @C10326j("com.carrefour.fid.android.categories.presentation.ui.department.DepartmentFragment.departmentsAnalyticsViewModel")
    /* renamed from: b */
    public static void m162351b(DepartmentFragment departmentFragment, C39752a aVar) {
        departmentFragment.f101482v = aVar;
    }

    @C10326j("com.carrefour.fid.android.categories.presentation.ui.department.DepartmentFragment.fragmentUtil")
    /* renamed from: c */
    public static void m162352c(DepartmentFragment departmentFragment, C28936j jVar) {
        departmentFragment.f101480f = jVar;
    }

    @C10326j("com.carrefour.fid.android.categories.presentation.ui.department.DepartmentFragment.navigator")
    /* renamed from: e */
    public static void m162353e(DepartmentFragment departmentFragment, C28796c cVar) {
        departmentFragment.f101481g = cVar;
    }

    /* renamed from: d */
    public void injectMembers(DepartmentFragment departmentFragment) {
        m162352c(departmentFragment, this.f101526a.get());
        m162353e(departmentFragment, this.f101527b.get());
        m162351b(departmentFragment, this.f101528c.get());
    }
}
