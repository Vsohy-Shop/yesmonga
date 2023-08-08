package com.carrefour.fid.android.storelocator.p048ui.fragments;

import com.carrefour.fid.android.airship.data.datasource.C13747e;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.storelocator.ui.fragments.j */
public final class C28991j implements C10158g<StoreFacilitiesBottomSheetFragment> {

    /* renamed from: a */
    public final Provider<C13747e> f71081a;

    public C28991j(Provider<C13747e> provider) {
        this.f71081a = provider;
    }

    /* renamed from: a */
    public static C10158g<StoreFacilitiesBottomSheetFragment> m119945a(Provider<C13747e> provider) {
        return new C28991j(provider);
    }

    @C10326j("com.carrefour.fid.android.storelocator.ui.fragments.StoreFacilitiesBottomSheetFragment.audienceTrackingManager")
    /* renamed from: b */
    public static void m119946b(StoreFacilitiesBottomSheetFragment storeFacilitiesBottomSheetFragment, C13747e eVar) {
        storeFacilitiesBottomSheetFragment.f71061f = eVar;
    }

    /* renamed from: c */
    public void injectMembers(StoreFacilitiesBottomSheetFragment storeFacilitiesBottomSheetFragment) {
        m119946b(storeFacilitiesBottomSheetFragment, this.f71081a.get());
    }
}
