package com.carrefour.fid.android.account.presentation.p018ui.account;

import com.carrefour.fid.android.shared.util.C28936j;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.account.presentation.ui.account.h */
public final class C13388h implements C10158g<AccountInfoFragment> {

    /* renamed from: a */
    public final Provider<C28936j> f32782a;

    public C13388h(Provider<C28936j> provider) {
        this.f32782a = provider;
    }

    /* renamed from: a */
    public static C10158g<AccountInfoFragment> m57757a(Provider<C28936j> provider) {
        return new C13388h(provider);
    }

    @C10326j("com.carrefour.fid.android.account.presentation.ui.account.AccountInfoFragment.fragmentUtil")
    /* renamed from: b */
    public static void m57758b(AccountInfoFragment accountInfoFragment, C28936j jVar) {
        accountInfoFragment.f32722g = jVar;
    }

    /* renamed from: c */
    public void injectMembers(AccountInfoFragment accountInfoFragment) {
        m57758b(accountInfoFragment, this.f32782a.get());
    }
}
