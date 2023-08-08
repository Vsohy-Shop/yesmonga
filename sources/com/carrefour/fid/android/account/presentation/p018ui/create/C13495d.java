package com.carrefour.fid.android.account.presentation.p018ui.create;

import com.carrefour.fid.android.account.presentation.analytics.C13300m;
import com.carrefour.fid.android.shared.util.C28909d;
import com.carrefour.fid.android.shared.util.C28936j;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.C10158g;
import dagger.internal.C10321e;
import dagger.internal.C10326j;
import dagger.internal.C10337q;
import javax.inject.Provider;

@C10321e
@C10337q
/* renamed from: com.carrefour.fid.android.account.presentation.ui.create.d */
public final class C13495d implements C10158g<CreateAccountFragment> {

    /* renamed from: a */
    public final Provider<AppEnvironment> f32972a;

    /* renamed from: b */
    public final Provider<C13300m> f32973b;

    /* renamed from: c */
    public final Provider<C28909d> f32974c;

    /* renamed from: d */
    public final Provider<C28936j> f32975d;

    public C13495d(Provider<AppEnvironment> provider, Provider<C13300m> provider2, Provider<C28909d> provider3, Provider<C28936j> provider4) {
        this.f32972a = provider;
        this.f32973b = provider2;
        this.f32974c = provider3;
        this.f32975d = provider4;
    }

    /* renamed from: a */
    public static C10158g<CreateAccountFragment> m58008a(Provider<AppEnvironment> provider, Provider<C13300m> provider2, Provider<C28909d> provider3, Provider<C28936j> provider4) {
        return new C13495d(provider, provider2, provider3, provider4);
    }

    @C10326j("com.carrefour.fid.android.account.presentation.ui.create.CreateAccountFragment.analytics")
    /* renamed from: b */
    public static void m58009b(CreateAccountFragment createAccountFragment, C13300m mVar) {
        createAccountFragment.f32956g = mVar;
    }

    @C10326j("com.carrefour.fid.android.account.presentation.ui.create.CreateAccountFragment.appEnvironment")
    /* renamed from: c */
    public static void m58010c(CreateAccountFragment createAccountFragment, AppEnvironment appEnvironment) {
        createAccountFragment.f32955f = appEnvironment;
    }

    @C10326j("com.carrefour.fid.android.account.presentation.ui.create.CreateAccountFragment.applicationBuildInfo")
    /* renamed from: d */
    public static void m58011d(CreateAccountFragment createAccountFragment, C28909d dVar) {
        createAccountFragment.f32957v = dVar;
    }

    @C10326j("com.carrefour.fid.android.account.presentation.ui.create.CreateAccountFragment.fragmentUtil")
    /* renamed from: e */
    public static void m58012e(CreateAccountFragment createAccountFragment, C28936j jVar) {
        createAccountFragment.f32958w = jVar;
    }

    /* renamed from: f */
    public void injectMembers(CreateAccountFragment createAccountFragment) {
        m58010c(createAccountFragment, this.f32972a.get());
        m58009b(createAccountFragment, this.f32973b.get());
        m58011d(createAccountFragment, this.f32974c.get());
        m58012e(createAccountFragment, this.f32975d.get());
    }
}
