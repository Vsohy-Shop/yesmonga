package com.carrefour.fid.android.account.presentation.p018ui.address;

import com.carrefour.fid.android.shared.util.C28936j;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.i */
public final class C13467i implements C10158g<UpdateUserAddressFragment> {

    /* renamed from: a */
    public final Provider<C28936j> f32924a;

    public C13467i(Provider<C28936j> provider) {
        this.f32924a = provider;
    }

    /* renamed from: a */
    public static C10158g<UpdateUserAddressFragment> m57921a(Provider<C28936j> provider) {
        return new C13467i(provider);
    }

    @C10326j("com.carrefour.fid.android.account.presentation.ui.address.UpdateUserAddressFragment.fragmentUtil")
    /* renamed from: b */
    public static void m57922b(UpdateUserAddressFragment updateUserAddressFragment, C28936j jVar) {
        updateUserAddressFragment.f32830x = jVar;
    }

    /* renamed from: c */
    public void injectMembers(UpdateUserAddressFragment updateUserAddressFragment) {
        m57922b(updateUserAddressFragment, this.f32924a.get());
    }
}
