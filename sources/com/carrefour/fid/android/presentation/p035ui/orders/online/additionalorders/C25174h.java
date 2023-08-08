package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders;

import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.h */
public final class C25174h implements C10158g<AdditionalOrderFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f62013a;

    public C25174h(Provider<C28796c> provider) {
        this.f62013a = provider;
    }

    /* renamed from: a */
    public static C10158g<AdditionalOrderFragment> m108829a(Provider<C28796c> provider) {
        return new C25174h(provider);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.AdditionalOrderFragment.navigator")
    /* renamed from: c */
    public static void m108830c(AdditionalOrderFragment additionalOrderFragment, C28796c cVar) {
        additionalOrderFragment.f61748f = cVar;
    }

    /* renamed from: b */
    public void injectMembers(AdditionalOrderFragment additionalOrderFragment) {
        m108830c(additionalOrderFragment, this.f62013a.get());
    }
}
