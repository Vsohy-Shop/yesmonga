package com.carrefour.fid.android.account.presentation.p018ui.account;

import com.carrefour.fid.android.shared.util.C28936j;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.account.presentation.ui.account.u */
public final class C13403u implements C10158g<UpdateUserInfoFragment> {

    /* renamed from: a */
    public final Provider<C28936j> f32814a;

    public C13403u(Provider<C28936j> provider) {
        this.f32814a = provider;
    }

    /* renamed from: a */
    public static C10158g<UpdateUserInfoFragment> m57775a(Provider<C28936j> provider) {
        return new C13403u(provider);
    }

    @C10326j("com.carrefour.fid.android.account.presentation.ui.account.UpdateUserInfoFragment.fragmentUtil")
    /* renamed from: b */
    public static void m57776b(UpdateUserInfoFragment updateUserInfoFragment, C28936j jVar) {
        updateUserInfoFragment.f32744g = jVar;
    }

    /* renamed from: c */
    public void injectMembers(UpdateUserInfoFragment updateUserInfoFragment) {
        m57776b(updateUserInfoFragment, this.f32814a.get());
    }
}
