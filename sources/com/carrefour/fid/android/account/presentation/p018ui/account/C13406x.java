package com.carrefour.fid.android.account.presentation.p018ui.account;

import com.carrefour.fid.android.shared.util.C28936j;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.account.presentation.ui.account.x */
public final class C13406x implements C10158g<UpdateUserPasswordFragment> {

    /* renamed from: a */
    public final Provider<C28936j> f32817a;

    public C13406x(Provider<C28936j> provider) {
        this.f32817a = provider;
    }

    /* renamed from: a */
    public static C10158g<UpdateUserPasswordFragment> m57779a(Provider<C28936j> provider) {
        return new C13406x(provider);
    }

    @C10326j("com.carrefour.fid.android.account.presentation.ui.account.UpdateUserPasswordFragment.fragmentUtil")
    /* renamed from: b */
    public static void m57780b(UpdateUserPasswordFragment updateUserPasswordFragment, C28936j jVar) {
        updateUserPasswordFragment.f32759g = jVar;
    }

    /* renamed from: c */
    public void injectMembers(UpdateUserPasswordFragment updateUserPasswordFragment) {
        m57780b(updateUserPasswordFragment, this.f32817a.get());
    }
}
