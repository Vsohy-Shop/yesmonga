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
/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.e */
public final class C39782e implements C10158g<DepartmentDetailsFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f101512a;

    /* renamed from: b */
    public final Provider<C39752a> f101513b;

    /* renamed from: c */
    public final Provider<C28936j> f101514c;

    public C39782e(Provider<C28796c> provider, Provider<C39752a> provider2, Provider<C28936j> provider3) {
        this.f101512a = provider;
        this.f101513b = provider2;
        this.f101514c = provider3;
    }

    /* renamed from: a */
    public static C10158g<DepartmentDetailsFragment> m162317a(Provider<C28796c> provider, Provider<C39752a> provider2, Provider<C28936j> provider3) {
        return new C39782e(provider, provider2, provider3);
    }

    @C10326j("com.carrefour.fid.android.categories.presentation.ui.department.DepartmentDetailsFragment.departmentsAnalyticsViewModel")
    /* renamed from: b */
    public static void m162318b(DepartmentDetailsFragment departmentDetailsFragment, C39752a aVar) {
        departmentDetailsFragment.f101476v = aVar;
    }

    @C10326j("com.carrefour.fid.android.categories.presentation.ui.department.DepartmentDetailsFragment.fragmentUtil")
    /* renamed from: c */
    public static void m162319c(DepartmentDetailsFragment departmentDetailsFragment, C28936j jVar) {
        departmentDetailsFragment.f101477w = jVar;
    }

    @C10326j("com.carrefour.fid.android.categories.presentation.ui.department.DepartmentDetailsFragment.navigator")
    /* renamed from: e */
    public static void m162320e(DepartmentDetailsFragment departmentDetailsFragment, C28796c cVar) {
        departmentDetailsFragment.f101475g = cVar;
    }

    /* renamed from: d */
    public void injectMembers(DepartmentDetailsFragment departmentDetailsFragment) {
        m162320e(departmentDetailsFragment, this.f101512a.get());
        m162318b(departmentDetailsFragment, this.f101513b.get());
        m162319c(departmentDetailsFragment, this.f101514c.get());
    }
}
