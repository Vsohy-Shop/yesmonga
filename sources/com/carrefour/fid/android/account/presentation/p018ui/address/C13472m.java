package com.carrefour.fid.android.account.presentation.p018ui.address;

import com.carrefour.fid.android.shared.util.C28936j;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.m */
public final class C13472m implements C10158g<VerifyUserAddressFragment> {

    /* renamed from: a */
    public final Provider<C28936j> f32932a;

    public C13472m(Provider<C28936j> provider) {
        this.f32932a = provider;
    }

    /* renamed from: a */
    public static C10158g<VerifyUserAddressFragment> m57940a(Provider<C28936j> provider) {
        return new C13472m(provider);
    }

    @C10326j("com.carrefour.fid.android.account.presentation.ui.address.VerifyUserAddressFragment.fragmentUtil")
    /* renamed from: b */
    public static void m57941b(VerifyUserAddressFragment verifyUserAddressFragment, C28936j jVar) {
        verifyUserAddressFragment.f32851g = jVar;
    }

    /* renamed from: c */
    public void injectMembers(VerifyUserAddressFragment verifyUserAddressFragment) {
        m57941b(verifyUserAddressFragment, this.f32932a.get());
    }
}
