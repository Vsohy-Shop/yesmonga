package com.carrefour.fid.android.presentation.p035ui.basketbuilder;

import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.C25948a;
import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.c */
public final class C23212c implements C10158g<BasketBuilderDepartmentFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f58895a;

    /* renamed from: b */
    public final Provider<C25948a> f58896b;

    public C23212c(Provider<C28796c> provider, Provider<C25948a> provider2) {
        this.f58895a = provider;
        this.f58896b = provider2;
    }

    /* renamed from: a */
    public static C10158g<BasketBuilderDepartmentFragment> m103860a(Provider<C28796c> provider, Provider<C25948a> provider2) {
        return new C23212c(provider, provider2);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderDepartmentFragment.analyticsViewModel")
    /* renamed from: b */
    public static void m103861b(BasketBuilderDepartmentFragment basketBuilderDepartmentFragment, C25948a aVar) {
        basketBuilderDepartmentFragment.f58827g = aVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderDepartmentFragment.navigator")
    /* renamed from: d */
    public static void m103862d(BasketBuilderDepartmentFragment basketBuilderDepartmentFragment, C28796c cVar) {
        basketBuilderDepartmentFragment.f58826f = cVar;
    }

    /* renamed from: c */
    public void injectMembers(BasketBuilderDepartmentFragment basketBuilderDepartmentFragment) {
        m103862d(basketBuilderDepartmentFragment, this.f58895a.get());
        m103861b(basketBuilderDepartmentFragment, this.f58896b.get());
    }
}
