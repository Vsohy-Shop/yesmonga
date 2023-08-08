package com.carrefour.fid.android.account.presentation.p018ui.account;

import com.carrefour.fid.android.shared.util.C28936j;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.account.presentation.ui.account.p */
public final class C13398p implements C10158g<UpdateEmailFragment> {

    /* renamed from: a */
    public final Provider<C28936j> f32810a;

    public C13398p(Provider<C28936j> provider) {
        this.f32810a = provider;
    }

    /* renamed from: a */
    public static C10158g<UpdateEmailFragment> m57771a(Provider<C28936j> provider) {
        return new C13398p(provider);
    }

    @C10326j("com.carrefour.fid.android.account.presentation.ui.account.UpdateEmailFragment.fragmentUtil")
    /* renamed from: b */
    public static void m57772b(UpdateEmailFragment updateEmailFragment, C28936j jVar) {
        updateEmailFragment.f32733g = jVar;
    }

    /* renamed from: c */
    public void injectMembers(UpdateEmailFragment updateEmailFragment) {
        m57772b(updateEmailFragment, this.f32810a.get());
    }
}
