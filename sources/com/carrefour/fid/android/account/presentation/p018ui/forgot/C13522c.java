package com.carrefour.fid.android.account.presentation.p018ui.forgot;

import com.carrefour.fid.android.shared.util.C28936j;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.account.presentation.ui.forgot.c */
public final class C13522c implements C10158g<ForgotPasswordFragment> {

    /* renamed from: a */
    public final Provider<C28936j> f33007a;

    public C13522c(Provider<C28936j> provider) {
        this.f33007a = provider;
    }

    /* renamed from: a */
    public static C10158g<ForgotPasswordFragment> m58048a(Provider<C28936j> provider) {
        return new C13522c(provider);
    }

    @C10326j("com.carrefour.fid.android.account.presentation.ui.forgot.ForgotPasswordFragment.fragmentUtil")
    /* renamed from: b */
    public static void m58049b(ForgotPasswordFragment forgotPasswordFragment, C28936j jVar) {
        forgotPasswordFragment.f32982g = jVar;
    }

    /* renamed from: c */
    public void injectMembers(ForgotPasswordFragment forgotPasswordFragment) {
        m58049b(forgotPasswordFragment, this.f33007a.get());
    }
}
