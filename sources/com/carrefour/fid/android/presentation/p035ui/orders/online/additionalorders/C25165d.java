package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders;

import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.d */
public final class C25165d implements C10158g<AdditionalOrderDepartmentFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f62000a;

    public C25165d(Provider<C28796c> provider) {
        this.f62000a = provider;
    }

    /* renamed from: a */
    public static C10158g<AdditionalOrderDepartmentFragment> m108798a(Provider<C28796c> provider) {
        return new C25165d(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.AdditionalOrderDepartmentFragment.navigator")
    /* renamed from: c */
    public static void m108799c(AdditionalOrderDepartmentFragment additionalOrderDepartmentFragment, C28796c cVar) {
        additionalOrderDepartmentFragment.f61729f = cVar;
    }

    /* renamed from: b */
    public void injectMembers(AdditionalOrderDepartmentFragment additionalOrderDepartmentFragment) {
        m108799c(additionalOrderDepartmentFragment, this.f62000a.get());
    }
}
