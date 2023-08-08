package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28936j;
import com.carrefour.fid.android.tracking.physicalstore.C29018a;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.d */
public final class C25404d implements C10158g<PhysicalStoreFragment> {

    /* renamed from: a */
    public final Provider<C29018a> f62527a;

    /* renamed from: b */
    public final Provider<C28936j> f62528b;

    /* renamed from: c */
    public final Provider<C28796c> f62529c;

    public C25404d(Provider<C29018a> provider, Provider<C28936j> provider2, Provider<C28796c> provider3) {
        this.f62527a = provider;
        this.f62528b = provider2;
        this.f62529c = provider3;
    }

    /* renamed from: a */
    public static C10158g<PhysicalStoreFragment> m109671a(Provider<C29018a> provider, Provider<C28936j> provider2, Provider<C28796c> provider3) {
        return new C25404d(provider, provider2, provider3);
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreFragment.analytics")
    /* renamed from: b */
    public static void m109672b(PhysicalStoreFragment physicalStoreFragment, C29018a aVar) {
        physicalStoreFragment.f62371f = aVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreFragment.fragmentUtil")
    /* renamed from: c */
    public static void m109673c(PhysicalStoreFragment physicalStoreFragment, C28936j jVar) {
        physicalStoreFragment.f62372g = jVar;
    }

    @C10326j("com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreFragment.navigator")
    /* renamed from: e */
    public static void m109674e(PhysicalStoreFragment physicalStoreFragment, C28796c cVar) {
        physicalStoreFragment.f62373v = cVar;
    }

    /* renamed from: d */
    public void injectMembers(PhysicalStoreFragment physicalStoreFragment) {
        m109672b(physicalStoreFragment, this.f62527a.get());
        m109673c(physicalStoreFragment, this.f62528b.get());
        m109674e(physicalStoreFragment, this.f62529c.get());
    }
}
