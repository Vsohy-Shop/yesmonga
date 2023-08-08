package com.carrefour.fid.android.account.presentation.p018ui.signin;

import com.carrefour.fid.android.shared.navigation.C28796c;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.account.presentation.ui.signin.d */
public final class C13549d implements C10158g<SignInFragment> {

    /* renamed from: a */
    public final Provider<C28796c> f33038a;

    public C13549d(Provider<C28796c> provider) {
        this.f33038a = provider;
    }

    /* renamed from: a */
    public static C10158g<SignInFragment> m58092a(Provider<C28796c> provider) {
        return new C13549d(provider);
    }

    @C10326j("com.carrefour.fid.android.account.presentation.ui.signin.SignInFragment.navigator")
    /* renamed from: c */
    public static void m58093c(SignInFragment signInFragment, C28796c cVar) {
        signInFragment.f33014g = cVar;
    }

    /* renamed from: b */
    public void injectMembers(SignInFragment signInFragment) {
        m58093c(signInFragment, this.f33038a.get());
    }
}
